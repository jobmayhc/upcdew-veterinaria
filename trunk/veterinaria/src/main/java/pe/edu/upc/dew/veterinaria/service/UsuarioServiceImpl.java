/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.veterinaria.service;

import pe.edu.upc.dew.veterinaria.model.Rol;
import pe.edu.upc.dew.veterinaria.model.Usuario;

/**
 *
 * @author alumno
 */
public class UsuarioServiceImpl implements UsuarioService {

    public Usuario login(String email, String password) {
        //throw new UnsupportedOperationException("Not supported yet.");
    Usuario usuario = new Usuario();
    usuario.setEmail("salvatierra@upc.edu.pe");
    usuario.setPassword("1234");
    usuario.setNombres("Carlos");
    usuario.setApellidos("Salvatierra");

    usuario.getRoles().add(new Rol("admin"));
    usuario.getRoles().add(new Rol("operador"));

    return usuario;

    }

}
