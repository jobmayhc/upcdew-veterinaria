/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.veterinaria.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Servicio;


public class ServicioServiceImpl implements ServicioService{

    List<Servicio> servicios;
    
//    public ServicioServiceImpl(List<Servicio> servicios) {
//        //throw new UnsupportedOperationException("Not yet implemented");
//    }

     public ServicioServiceImpl(List<Servicio> listaservicios) {
        if (listaservicios != null) {
            servicios = listaservicios;
        } else {
            servicios = new ArrayList<Servicio>();
        }

    }

     public ServicioServiceImpl() {
    }
    public Boolean Registrar(String servicio, String precioCosto, String precioVenta, String estado) {
        
        Servicio servicioo = new Servicio();

        servicioo.setServicio(estado);
        servicioo.setPrecioCosto(precioCosto);
        servicioo.setPrecioVenta(precioVenta);
        servicioo.setEstado(estado);
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

     public List<Servicio> ObtenerTodos() {


        if (servicios.size() == 0) {

            servicios.add(new Servicio("Corte de pelo", "25.00", "35.00", "Activo"));
            servicios.add(new Servicio("Baño de mascota", "50.00", "55.00", "Activo"));
            servicios.add(new Servicio("Cirugia", "150.00", "1855.00", "Activo"));
            
        }
        return (List<Servicio>) servicios;
        }

     
     public Servicio ObtenerUno(String servicio) {
        Servicio servicioo = null;
        for (Servicio servicios : this.servicios) {
            if (servicios.getServicio().equals(servicios)) {
                servicioo = servicios;
                break;
            }
        }
       return servicioo;
    }
     


     }