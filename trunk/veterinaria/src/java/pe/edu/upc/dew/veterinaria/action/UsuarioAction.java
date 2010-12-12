package pe.edu.upc.dew.veterinaria.action;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.form.UsuarioForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.action.ActionForm;
import pe.edu.upc.dew.veterinaria.service.UsuariosImplement;

public class UsuarioAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        UsuarioForm oUsuarioForm = (UsuarioForm) form;

        System.out.println("usuario=" + oUsuarioForm.getTxtUsuario());
        System.out.println("password=" + oUsuarioForm.getTxtPassword());

        Usuario oUsuario = new Usuario();

        oUsuario.setUsuario(oUsuarioForm.getTxtUsuario().toUpperCase());
        oUsuario.setPassword(oUsuarioForm.getTxtPassword());
        oUsuario.setNombre(oUsuarioForm.getTxtNombre());
        oUsuario.setApepaterno(oUsuarioForm.getTxtApePaterno());
        oUsuario.setApematerno(oUsuarioForm.getTxtApeMaterno());
        oUsuario.setDireccion(oUsuarioForm.getTxtDireccion());
        oUsuario.setTelefono(oUsuarioForm.getTxtTelefono());
        oUsuario.setEmail(oUsuarioForm.getTxtMail());
        oUsuario.setFlagestado("A");

        UsuariosImplement oUsuariosImplement = new UsuariosImplement();
        oUsuariosImplement.UsuarioInsertar(oUsuario);
        
        request.setAttribute("usuario", oUsuario);
        return mapping.findForward("registrarUsuario");
        
    }
}
