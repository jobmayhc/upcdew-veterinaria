
package pe.edu.upc.dew.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

public class ReservaDetalle {

    private Reserva reserva;
    private List<Producto> listproducto;
    public ReservaDetalle(){
        this.reserva = new Reserva();
        this.listproducto = new ArrayList<Producto>();
    }

    public List<Producto> getListproducto() {
        return listproducto;
    }

    public void setListproducto(List<Producto> listproducto) {
        this.listproducto = listproducto;
    }
    
    private int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
