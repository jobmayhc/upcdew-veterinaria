/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.veterinaria.model;

/**
 *
 * @author Administrador
 */
public class Servicio {

    private String servicio;
    private String precioCosto;
    private String precioVenta;
    private String estado;

public Servicio(String servicio, String precioCosto, String precioVenta, String estado) {

        this.servicio = servicio;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;

        this.estado = estado;

    }

    public Servicio() {
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(String precioCosto) {
        this.precioCosto = precioCosto;
    }

    public String getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(String precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    

}
