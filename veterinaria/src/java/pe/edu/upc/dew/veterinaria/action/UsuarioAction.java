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

//public class UsuarioAction extends DispatchAction{
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

        UsuariosImplement oUsuariosImplement = new UsuariosImplement();
        List<Usuario> lstUsuario = new ArrayList<Usuario>();

        lstUsuario = oUsuariosImplement.UsuarioValida(oUsuario);

        if(lstUsuario != null){
                 request.setAttribute("usuariologin", oUsuario);
                 return mapping.findForward("loginOK");
            }
        else
            {
                return mapping.findForward("loginNuevo");
            }        
    }
}
