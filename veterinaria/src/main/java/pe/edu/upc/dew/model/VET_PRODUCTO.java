package pe.edu.upc.dew.model;

public class VET_PRODUCTO {

    private String PRO_CODIGO;
    private String PRO_NOMBRE;
    private String PRO_DESCRIPCION;
    private Double PRO_PRECIO;
    private VET_CATEGORIA objVET_CATEGORIA;

    public String getPRO_CODIGO() {
        return PRO_CODIGO;
    }

    public void setPRO_CODIGO(String PRO_CODIGO) {
        this.PRO_CODIGO = PRO_CODIGO;
    }

    public String getPRO_DESCRIPCION() {
        return PRO_DESCRIPCION;
    }

    public void setPRO_DESCRIPCION(String PRO_DESCRIPCION) {
        this.PRO_DESCRIPCION = PRO_DESCRIPCION;
    }

    public String getPRO_NOMBRE() {
        return PRO_NOMBRE;
    }

    public void setPRO_NOMBRE(String PRO_NOMBRE) {
        this.PRO_NOMBRE = PRO_NOMBRE;
    }

    public Double getPRO_PRECIO() {
        return PRO_PRECIO;
    }

    public void setPRO_PRECIO(Double PRO_PRECIO) {
        this.PRO_PRECIO = PRO_PRECIO;
    }

    public VET_CATEGORIA getObjVET_CATEGORIA() {
        return objVET_CATEGORIA;
    }

    public void setObjVET_CATEGORIA(VET_CATEGORIA objVET_CATEGORIA) {
        this.objVET_CATEGORIA = objVET_CATEGORIA;
    }

}
