package pe.edu.upc.dew.veterinaria.form;

import org.apache.struts.action.ActionForm;

public class ReservaGeneradaForm extends ActionForm{

    private String txtCodigo;
    private String txtNombre;
    private String txtDescripcion;
    private String txtPrecio;

    public String getTxtCodigo() {
        return txtCodigo;
    }

    public void setTxtCodigo(String txtCodigo) {
        this.txtCodigo = txtCodigo;
    }

    public String getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(String txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public String getTxtNombre() {
        return txtNombre;
    }

    public void setTxtNombre(String txtNombre) {
        this.txtNombre = txtNombre;
    }

    public String getTxtPrecio() {
        return txtPrecio;
    }

    public void setTxtPrecio(String txtPrecio) {
        this.txtPrecio = txtPrecio;
    }

}
