package pe.edu.upc.dew.veterinaria.service;
import pe.edu.upc.dew.veterinaria.model.Usuario;

public class UsuarioServiceImpl implements UsuarioService {

    public Usuario login(String email, String password) {
        //throw new UnsupportedOperationException("Not supported yet.");
    Usuario usuario = new Usuario();
    usuario.setEmail("salvatierra@upc.edu.pe");
    usuario.setPassword("1234");
    //usuario.setNombres("Carlos");
    //usuario.setApellidos("Salvatierra");

    

    return usuario;

    }

}
