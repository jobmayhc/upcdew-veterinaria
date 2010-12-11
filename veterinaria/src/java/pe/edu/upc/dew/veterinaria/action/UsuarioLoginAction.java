package pe.edu.upc.dew.veterinaria.action;

import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.form.UsuarioLoginForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.action.ActionForm;
import pe.edu.upc.dew.veterinaria.service.UsuariosImplement;

//public class UsuarioAction extends DispatchAction{
public class UsuarioLoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        
        UsuarioLoginForm oUsuarioForm = (UsuarioLoginForm) form;

        System.out.println("usuario=" + oUsuarioForm.getTxtUsuario());
        System.out.println("password=" + oUsuarioForm.getTxtPassword());

        Usuario oUsuario = new Usuario();

        oUsuario.setUsuario(oUsuarioForm.getTxtUsuario().toUpperCase());
        oUsuario.setPassword(oUsuarioForm.getTxtPassword());

        UsuariosImplement oUsuariosImplement = new UsuariosImplement();
        oUsuariosImplement.UsuarioValida(oUsuario);

        request.setAttribute("usuario", oUsuario);

        return mapping.findForward("registrarUsuario");

    }
}
