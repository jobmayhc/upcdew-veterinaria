package pe.edu.upc.dew.veterinaria.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.service.UsuarioService;
import pe.edu.upc.dew.veterinaria.service.UsuarioServiceImpl;


public class LoginServlet extends HttpServlet {
   // private String email;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        
//        System.out.println("LoginServlet.doPost");
//        String username = req.getParameter("username");
//        String password = req.getParameter("password");
//        System.out.println(username + " " + password);
//        req.getRequestDispatcher("registrarusuario.jsp").forward(req, resp);

        String email = request.getParameter("email");
        String password = request.getParameter("password");


        //llamar al model
        UsuarioService usuarioService = new UsuarioServiceImpl();
        Usuario usuario = usuarioService.login(email, password);

        HttpSession session = request.getSession();
        session.setAttribute("usuario", usuario);

        request.getRequestDispatcher("reservaservicios.jsp").forward(request, response);
        
    }


}
