/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.veterinaria.service;

/**
 *
 * @author Administrador
 */

import pe.edu.upc.dew.veterinaria.model.Producto;

public interface ServicioService {

    public Boolean Registrar(String servicio,String precioCosto,String precioVenta, String estado);

}
