package pe.edu.upc.dew.model;

public class VET_RESERVA_DETALLE {

    private VET_RESERVA vet_reserva;
    private VET_PRODUCTO vet_producto;
    private Integer res_cantidad;

    public Integer getRes_cantidad() {
        return res_cantidad;
    }

    public void setRes_cantidad(Integer res_cantidad) {
        this.res_cantidad = res_cantidad;
    }

    public VET_PRODUCTO getVet_producto() {
        return vet_producto;
    }

    public void setVet_producto(VET_PRODUCTO vet_producto) {
        this.vet_producto = vet_producto;
    }

    public VET_RESERVA getVet_reserva() {
        return vet_reserva;
    }

    public void setVet_reserva(VET_RESERVA vet_reserva) {
        this.vet_reserva = vet_reserva;
    }

}
