
package pe.edu.upc.dew.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

public class ReservaDetalle {

    private Reserva reserva;
    private List<Producto> producto;
    public ReservaDetalle(){
        this.reserva = new Reserva();
        this.producto = new ArrayList<Producto>();
       
    }
    
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Producto> getProducto() {
        return producto;
    }

    public void setProducto(List<Producto> producto) {
        this.producto = producto;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    
    


}
