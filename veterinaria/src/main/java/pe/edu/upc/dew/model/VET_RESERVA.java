package pe.edu.upc.dew.model;

import java.util.Date;

public class VET_RESERVA {

    private String RES_CODIGO;
    private String RES_NRO_RESERVA;
    private Date RES_FECHA;
    private Double RES_SUB_TOTAL;
    private Double RES_IGV;
    private Double RES_TOTAL;
    private VET_CLIENTE objVET_CLIENTE;

    public String getRES_CODIGO() {
        return RES_CODIGO;
    }

    public void setRES_CODIGO(String RES_CODIGO) {
        this.RES_CODIGO = RES_CODIGO;
    }

    public Date getRES_FECHA() {
        return RES_FECHA;
    }

    public void setRES_FECHA(Date RES_FECHA) {
        this.RES_FECHA = RES_FECHA;
    }

    public Double getRES_IGV() {
        return RES_IGV;
    }

    public void setRES_IGV(Double RES_IGV) {
        this.RES_IGV = RES_IGV;
    }

    public String getRES_NRO_RESERVA() {
        return RES_NRO_RESERVA;
    }

    public void setRES_NRO_RESERVA(String RES_NRO_RESERVA) {
        this.RES_NRO_RESERVA = RES_NRO_RESERVA;
    }

    public Double getRES_SUB_TOTAL() {
        return RES_SUB_TOTAL;
    }

    public void setRES_SUB_TOTAL(Double RES_SUB_TOTAL) {
        this.RES_SUB_TOTAL = RES_SUB_TOTAL;
    }

    public Double getRES_TOTAL() {
        return RES_TOTAL;
    }

    public void setRES_TOTAL(Double RES_TOTAL) {
        this.RES_TOTAL = RES_TOTAL;
    }

    public VET_CLIENTE getObjVET_CLIENTE() {
        return objVET_CLIENTE;
    }

    public void setObjVET_CLIENTE(VET_CLIENTE objVET_CLIENTE) {
        this.objVET_CLIENTE = objVET_CLIENTE;
    }
    
}
