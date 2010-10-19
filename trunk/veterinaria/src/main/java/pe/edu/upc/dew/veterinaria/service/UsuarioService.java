/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.veterinaria.service;

import pe.edu.upc.dew.veterinaria.model.Usuario;

/**
 *
 * @author alumno
 */
public interface UsuarioService {
    
    public Usuario login (String email, String password);

}
