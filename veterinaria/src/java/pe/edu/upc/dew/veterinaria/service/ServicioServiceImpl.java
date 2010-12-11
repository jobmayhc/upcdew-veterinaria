package pe.edu.upc.dew.veterinaria.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Producto;


public class ServicioServiceImpl implements ServicioService{

    List<Producto> servicios;
    
//    public ServicioServiceImpl(List<Servicio> servicios) {
//        //throw new UnsupportedOperationException("Not yet implemented");
//    }

     public ServicioServiceImpl(List<Producto> listaservicios) {
        if (listaservicios != null) {
            servicios = listaservicios;
        } else {
            servicios = new ArrayList<Producto>();
        }

    }

     public ServicioServiceImpl() {
    }
    public Boolean Registrar(String servicio, String precioCosto, String precioVenta, String estado) {
        
        Producto servicioo = new Producto();

        //servicioo.setServicio(estado);
        //servicioo.setPrecioCosto(precioCosto);
        //servicioo.setPrecioVenta(precioVenta);
       // servicioo.setEstado(estado);
        servicios.add(servicioo);
        return true;
    }

    public Boolean Actualizar(String servicio, String precioCosto, String precioVenta, String estado) {

//        Servicio servicioo = ObtenerUno(servicio);
//        servicioo.setServicio(servicio);
//        servicioo.setPrecioCosto(precioCosto);
//        servicioo.setPrecioVenta(precioVenta);
//        servicioo.setEstado(estado);
//        
        return true;
    }

     public List<Producto> ObtenerTodos() {


        if (servicios.size() == 0) {

            //servicios.add(new Producto("Corte de pelo", "25.00", "35.00", "Activo"));
            ///servicios.add(new Producto("Ba�o de mascota", "50.00", "55.00", "Activo"));
            //servicios.add(new Producto("Cirugia", "150.00", "1855.00", "Activo"));
            
        }
        return (List<Producto>) servicios;
        }

     
     /*public Servicio ObtenerUno(String servicio) {
        Servicio servicioo = null;
        for (Servicio servicios : this.servicios) {
            if (servicios.getServicio().equals(servicios)) {
                servicioo = servicios;
                break;
            }
        }
       return servicioo;
    }*/
     


     }