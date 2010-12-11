package pe.edu.upc.dew.veterinaria.controller;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//import pe.edu.upc.dew.veterinaria.model.Servicio;
import java.util.List;
import pe.edu.upc.dew.veterinaria.service.ServicioServiceImpl;

public class ServicioServlet extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServicioServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServicioServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            */
        } finally { 
           // out.close();
        }
    } 

   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String servicio = request.getParameter("servicio");
        String precioCosto = request.getParameter("precioCosto");
        String precioVenta = request.getParameter("precioVenta");
        String estado = request.getParameter("estado");
        String option = request.getParameter("option");
        HttpSession session = request.getSession();
        //List<Servi> listaservicios = (List<Servicio>) session.getAttribute("servicios");
        //ServicioServiceImpl servicioService = new ServicioServiceImpl(listaservicios);

         // if (option.equals("2")) {
         //   if (servicioService.Actualizar(servicio, precioCosto, precioVenta, estado)) {
         //   }
       // } else {

//            if (servicioService.Registrar(servicio, precioCosto, precioVenta, estado)) {
  //          }
    //    }

      //  List<Servicio> servicios = servicioService.ObtenerTodos();
       // session.setAttribute("servicios", servicio);

//        request.getRequestDispatcher("listadoServicios.jsp").forward(request, response);
   }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       // processRequest(request, response);

        String option = request.getParameter("option");

        if (option.equals("2")) {
            String servicio = request.getParameter("servicio");
            HttpSession session = request.getSession();
          //  List<Servicio> listaservicios = (List<Servicio>) session.getAttribute("servicios");
//            ServicioServiceImpl servicioService = new ServicioServiceImpl(listaservicios);
  //          Servicio servicioo = servicioService.ObtenerUno(servicio);
   //         request.setAttribute("servicio", servicio);
        }
        request.getRequestDispatcher("mantenimientoServicio.jsp").forward(request, response);

    }

    

    } 
 
