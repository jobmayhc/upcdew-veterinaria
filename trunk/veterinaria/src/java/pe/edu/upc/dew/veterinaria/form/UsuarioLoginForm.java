package pe.edu.upc.dew.veterinaria.form;

import org.apache.struts.action.ActionForm;

public class UsuarioLoginForm extends ActionForm {
   
    private String txtUsuario;
    private String txtPassword;
    
    public String getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(String txtPassword) {
        this.txtPassword = txtPassword;
    }

   public String getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(String txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

}
