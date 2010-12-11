
package pe.edu.upc.dew.veterinaria.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Producto;
import pe.edu.upc.dew.veterinaria.model.Reserva;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.model.ReservaDetalle ;

public class ReservaServiceImpl implements ReservaService {
    
public List<ReservaDetalle> listarReserva (ReservaDetalle reserva ){

    List<ReservaDetalle> oListReserva = new ArrayList<ReservaDetalle>();
    List<Producto> oListProducto = new ArrayList<Producto>();
    ReservaDetalle oReservaDetalle = new ReservaDetalle();
    Reserva oReserva = new Reserva();
    Producto oProducto = new Producto();

    oReserva.setCodigo(55);
    oProducto.setNombre("PROD");
    oListProducto.add(oProducto);

    oReservaDetalle.setCantidad(9);
    oReservaDetalle.setReserva(oReserva);
    oReservaDetalle.setListproducto(oListProducto);

    Usuario usuario = new Usuario();
    usuario.setEmail("CSalvatierra");
    usuario.setPassword("1234");
//    usuario.setNombres("Carlos");
  //  usuario.setApellidos("Salvatierra");

//    usuario.getRoles().add(new Rol("admin"));
//    usuario.getRoles().add(new Rol("operador"));

    return oListReserva;

    }


public List<Producto> listaProducto (Producto oProducto, List<Producto> lstProducto ){

    if(lstProducto == null){
        lstProducto = new ArrayList<Producto>();
    }
    lstProducto.add(oProducto);
    return lstProducto;
}

}
