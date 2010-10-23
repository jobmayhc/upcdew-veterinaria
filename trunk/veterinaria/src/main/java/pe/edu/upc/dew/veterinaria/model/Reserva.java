package pe.edu.upc.dew.veterinaria.model;

import java.util.Date;

public class Reserva {

    private Cliente cliente;
    public Reserva(){
        this.cliente = new Cliente();
    }

    private int codigo;
    private String nroreserva;
    private String fecha;
    private Double subtotal;
    private Double igv;
    private Double total;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public String getNroreserva() {
        return nroreserva;
    }

    public void setNroreserva(String nroreserva) {
        this.nroreserva = nroreserva;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}
