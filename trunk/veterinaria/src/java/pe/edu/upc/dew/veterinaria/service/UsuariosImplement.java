
package pe.edu.upc.dew.veterinaria.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.dao.UsuarioDAO;

public class UsuariosImplement {

    public List<Usuario> UsuariosListar(Usuario oUsuario){
        List<Usuario> UsuariosList = null;
        try {
            UsuarioDAO oUsuarioDAO = new UsuarioDAO();
            UsuariosList = oUsuarioDAO.UsuarioListar(oUsuario);

        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return UsuariosList;
    }
    
    public List<Usuario> ObtenerDatosUsuario(Usuario oUsuario){
        List<Usuario> UsuarioList = null;
        try {
            UsuarioDAO oUsuarioDAO = new UsuarioDAO();
            UsuarioList = oUsuarioDAO.ObtenerDatosUsuario(oUsuario);
        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return UsuarioList;
    }


    public List<Usuario> UsuarioValida(Usuario oUsuario){
        List<Usuario> UsuarioList = null;
        try {
            UsuarioDAO oUsuarioDAO = new UsuarioDAO();
            UsuarioList = oUsuarioDAO.ObtenerDatosUsuario(oUsuario);
        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return UsuarioList;
    }

    public boolean UsuarioInsertar(Usuario oUsuario){
     boolean exito = false;
     try {
          UsuarioDAO oUsuarioDAO = new UsuarioDAO();
          oUsuarioDAO.UsuarioInsertar(oUsuario);
          exito = true;
        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exito;
    }

     public boolean UsuarioUpdate(Usuario oUsuario){
     boolean exito = false;
     try {

            UsuarioDAO oUsuarioDAO = new UsuarioDAO();
            oUsuarioDAO.UsuarioUpdate(oUsuario);

            exito = true;

        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exito;
    }

    /*
   public static void main (String ar []) throws ParseException{
        UsuariosImplement oUsuariosImplement = new UsuariosImplement();
        Usuario oUsuario = new Usuario();
         List<Usuario> list = oUsuariosImplement.UsuariosListar(oUsuario);
         System.out.println(list.size());
         for (Usuario e : list) {
            System.out.println(e.getNombre());
        }
   }*/

    /*
    public static void main (String ar []) throws ParseException{
        UsuariosImplement oUsuariosImplement = new UsuariosImplement();
        Usuario oUsuario = new Usuario();

        oUsuario.setUsuario("PRUEBA");
        oUsuario.setPassword("admin");
        oUsuario.setNombre("Daniel");
        oUsuario.setApepaterno("La Torre");
        oUsuario.setApematerno("Lopez");
        oUsuario.setDireccion("Urb. La Cruceta Block 73 - Dpto.202");
        oUsuario.setTelefono("975536719");
        oUsuario.setEmail("latorre.daniel@gmail.com");
        
        oUsuariosImplement.UsuarioInsertar(oUsuario);

        Usuario oUsuarios = new Usuario();

        List<Usuario> list = oUsuariosImplement.UsuariosListar(oUsuarios);
        System.out.println(list.size());

         for (Usuario e : list) {
            System.out.println(e.getUsuario() + " " + e.getNombre() + " " + e.getApepaterno());
        }
   }
*/
/*    public static void main (String ar []) throws ParseException{
            UsuariosImplement oUsuariosImplement = new UsuariosImplement();
            Usuario oUsuario = new Usuario();

            oUsuario.setCodigo(6);
            oUsuario.setNombre("Corte de Unas");
            oUsuario.setDescripcion("Corte de unas.");
            oUsuario.setPrecio("85");

            oUsuariosImplement.UsuarioUpdate(oUsuario);

            Usuario oUsuarios = new Usuario();
            List<Usuario> list = oUsuariosImplement.UsuariosListar(oUsuarios);
            System.out.println(list.size());

             for (Usuario e : list) {
                System.out.println(e.getNombre());
            }
        }
 
 */
    }
