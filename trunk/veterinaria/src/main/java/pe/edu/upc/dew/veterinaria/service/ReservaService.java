package pe.edu.upc.dew.veterinaria.service;

import java.util.List;
import pe.edu.upc.dew.veterinaria.model.ReservaDetalle;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.model.Producto;

public interface ReservaService {
    
    public List<ReservaDetalle> listarReserva (ReservaDetalle reserva );

    public List<Producto> listaProducto (Producto oProducto, List<Producto> lstProducto );
    
}
