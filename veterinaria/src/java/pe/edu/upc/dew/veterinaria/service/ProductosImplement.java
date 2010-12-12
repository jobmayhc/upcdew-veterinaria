
package pe.edu.upc.dew.veterinaria.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Producto;
import pe.edu.upc.dew.veterinaria.dao.ProductoDAO;

public class ProductosImplement {

    public List<Producto> ProductosListar(Producto oProducto){
        List<Producto> ProductosList = null;
        try {
            ProductoDAO oProductoDAO = new ProductoDAO();
            ProductosList = oProductoDAO.ProductoListar(oProducto);

        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ProductosList;
    }

    
     public boolean ProductoInsertar(Producto oProducto){
     boolean exito = false;
     try {
         
            ProductoDAO oProductoDAO = new ProductoDAO();
            oProductoDAO.ProductoInsertar(oProducto);
            
            exito = true;
            
        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exito;
    }

     public boolean ProductoUpdate(Producto oProducto){
     boolean exito = false;
     try {

            ProductoDAO oProductoDAO = new ProductoDAO();
            oProductoDAO.ProductoUpdate(oProducto);

            exito = true;

        } catch (IOException e) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exito;
    }


     /*
   public static void main (String ar []) throws ParseException{
        ProductosImplement oProductosImplement = new ProductosImplement();
        Producto oProducto = new Producto();
         List<Producto> list = oProductosImplement.ProductosListar(oProducto);
         System.out.println(list.size());
         for (Producto e : list) {
            System.out.println(e.getNombre());
        }
   }*/
/*
    public static void main (String ar []) throws ParseException{
            ProductosImplement oProductosImplement = new ProductosImplement();
            Producto oProducto = new Producto();

            oProducto.setNombre("Corte de Unias");
            oProducto.setDescripcion("Corte de unias.");
            oProducto.setPrecio("25");
            oProductosImplement.ProductosInsertar(oProducto);
 
            Producto oProductos = new Producto();

            List<Producto> list = oProductosImplement.ProductosListar(oProductos);
            System.out.println(list.size());

             for (Producto e : list) {
                System.out.println(e.getNombre());
            }
   }
*/
/*
    public static void main (String ar []) throws ParseException{
            ProductosImplement oProductosImplement = new ProductosImplement();
            Producto oProducto = new Producto();

            oProducto.setCodigo(6);
            oProducto.setNombre("Corte de Unas");
            oProducto.setDescripcion("Corte de unas.");
            oProducto.setPrecio("85");

            oProductosImplement.ProductoUpdate(oProducto);

            Producto oProductos = new Producto();
            List<Producto> list = oProductosImplement.ProductosListar(oProductos);
            System.out.println(list.size());

             for (Producto e : list) {
                System.out.println(e.getNombre());
            }
        }
 */
 }
