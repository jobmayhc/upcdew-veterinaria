
package pe.edu.upc.dew.veterinaria.model;

public class Cliente {

    private Usuario usuario;
    public Cliente(){
        this.usuario = new Usuario();
    }
    private String codigo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFlagvip() {
        return flagvip;
    }

    public void setFlagvip(String flagvip) {
        this.flagvip = flagvip;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    private String flagvip;
    
}
