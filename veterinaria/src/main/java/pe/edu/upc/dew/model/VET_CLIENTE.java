
package pe.edu.upc.dew.model;

public class VET_CLIENTE {

    private String CLI_CODIGO;
    private String CLI_FLAG_VIP;
    private VET_USUARIO objVET_USUARIO;

    public String getCLI_CODIGO() {
        return CLI_CODIGO;
    }

    public void setCLI_CODIGO(String CLI_CODIGO) {
        this.CLI_CODIGO = CLI_CODIGO;
    }

    public String getCLI_FLAG_VIP() {
        return CLI_FLAG_VIP;
    }

    public void setCLI_FLAG_VIP(String CLI_FLAG_VIP) {
        this.CLI_FLAG_VIP = CLI_FLAG_VIP;
    }

    public VET_USUARIO getObjVET_USUARIO() {
        return objVET_USUARIO;
    }

    public void setObjVET_USUARIO(VET_USUARIO objVET_USUARIO) {
        this.objVET_USUARIO = objVET_USUARIO;
    }
   
   
}