package pe.edu.upc.dew.veterinaria.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.edu.upc.dew.veterinaria.model.Producto;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.service.UsuarioService;
import pe.edu.upc.dew.veterinaria.service.UsuarioServiceImpl;
import pe.edu.upc.dew.veterinaria.service.ReservaService;
import pe.edu.upc.dew.veterinaria.service.ReservaServiceImpl;

public class ReservaServlet extends HttpServlet {
   // private String email;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        ReservaServiceImpl oReservaService = new ReservaServiceImpl();

        System.out.println("ReservaServlet.doPost");
        String codigo = request.getParameter("txtCodigo");
        String nombre = request.getParameter("txtNombre");

        System.out.println(codigo);
        System.out.println(nombre);

        String precio = request.getParameter("txtPrecio");

        double igv=0.19;
        Double pre = Double.parseDouble(precio);
        igv = igv*pre;
        //precio;

        Producto oProducto = new Producto();
        //oProducto.setCodigo(codigo);
        oProducto.setNombre(nombre);
        oProducto.setPrecio(Double.parseDouble(precio));
        
        //Categoriaa oCategoria = new Categoria();
        //Stringa catcodigo = request.getParameter("catcodigo");
        //String catnombre = request.getParameter("catnombre");

        //oCategoria.setCodigo(catcodigo);
        //oCategoria.setNombre(catnombre);

        //oProducto.setCategoria(oCategoria);      

        List<Producto> lstReserva = new ArrayList<Producto>();
        lstReserva.add(oProducto);

        request.setAttribute("lstReserva",lstReserva);
        request.getRequestDispatcher("miscompras.jsp").forward(request, response);
        
    }

}
