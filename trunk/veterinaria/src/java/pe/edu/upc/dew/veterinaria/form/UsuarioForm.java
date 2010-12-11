package pe.edu.upc.dew.veterinaria.form;

import org.apache.struts.action.ActionForm;

public class UsuarioForm extends ActionForm {
   
    private String txtUsuario;
    private String txtPassword;
    private String txtPasswordConfirmar;
    private String txtNombre;
    private String txtApePaterno;
    private String txtApeMaterno;
    private String txtDireccion;
    private String txtTelefono;
    private String txtMail;

    public String getTxtApeMaterno() {
        return txtApeMaterno;
    }

    public void setTxtApeMaterno(String txtApeMaterno) {
        this.txtApeMaterno = txtApeMaterno;
    }

    public String getTxtApePaterno() {
        return txtApePaterno;
    }

    public void setTxtApePaterno(String txtApePaterno) {
        this.txtApePaterno = txtApePaterno;
    }

    public String getTxtDireccion() {
        return txtDireccion;
    }

    public void setTxtDireccion(String txtDireccion) {
        this.txtDireccion = txtDireccion;
    }

    public String getTxtMail() {
        return txtMail;
    }

    public void setTxtMail(String txtMail) {
        this.txtMail = txtMail;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtPassword() {
        return txtPassword;
    }

    public void setTxtPassword(String txtPassword) {
        this.txtPassword = txtPassword;
    }

    public String getTxtPasswordConfirmar() {
        return txtPasswordConfirmar;
    }

    public void setTxtPasswordConfirmar(String txtPasswordConfirmar) {
        this.txtPasswordConfirmar = txtPasswordConfirmar;
    }

    public String getTxtTelefono() {
        return txtTelefono;
    }

    public void setTxtTelefono(String txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public String getTxtUsuario() {
        return txtUsuario;
    }

    public void setTxtUsuario(String txtUsuario) {
        this.txtUsuario = txtUsuario;
    }

}
