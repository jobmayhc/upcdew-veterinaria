/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upc.dew.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alumno
 */
public class Usuario {

    private String email;
    private String password;
    private String nombres;
    private String apellidos;
    private List<Rol> roles;


    public Usuario(){
        this.roles = new ArrayList<Rol>();
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public void setUsername(String string) {
//        throw new UnsupportedOperationException("Not yet implemented");
//    }

    
    
    

}
