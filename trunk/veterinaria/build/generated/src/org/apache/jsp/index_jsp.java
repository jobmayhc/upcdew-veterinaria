package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>.:: Veterinaria PetShop</title>\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1251\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"cmn/style/upc_main.css\" />\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("        <form action=\"login.do\" id=\"UsuarioLoginForm\" method=\"post\">\r\n");
      out.write("      <div id=\"header\"><img src=\"cmn/img/big_photo.jpg\" alt=\"\" width=\"967\" height=\"302\" />\r\n");
      out.write("\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<div class=\"block\">\r\n");
      out.write("\t\t\t<img src=\"cmn/img/pic.jpg\" alt=\"\" width=\"85\" height=\"93\" /><img src=\"cmn/img/title.jpg\" alt=\"\" width=\"191\" height=\"23\" /><br />\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <table width=\"230\" border=\"0\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td style=\"width:40px;\"><span class=\"login\">Usuario</span></td>\r\n");
      out.write("                  <td style=\"width:120px;\">\r\n");
      out.write("                    <input type=\"text\" name=\"txtUsuario\" style=\"width:100px;\" class=\"txt\" />\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td style=\"width:40px;\"><span class=\"login\" >Contrase&ntilde;a</span></td>\r\n");
      out.write("                  <td style=\"width:120px;\">\r\n");
      out.write("                    <input type=\"password\" name=\"txtPassword\" style=\"width:100px;\" class=\"txt\" />\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td colspan=\"2\" align=\"center\">\r\n");
      out.write("                    <input name=\"btnAceptar\" type=\"submit\" id=\"btnAceptar\" value=\"Aceptar\" class=\"btn\" style=\"height:22px;\"/>\r\n");
      out.write("\r\n");
      out.write("                  </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td colspan=\"2\"><a href=\"vet_usuario.jsp\" class=\"visited\">Registrese</a></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t  <br />\r\n");
      out.write("\t\t\t  <br />\r\n");
      out.write("\t\t\t  <br />\r\n");
      out.write("\t\t\t  <br />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t<a href=\"#\"></a>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t  <div id=\"left\">\r\n");
      out.write("\t    <p>&nbsp;</p>\r\n");
      out.write("\t    <p><br />\r\n");
      out.write("        </p>\r\n");
      out.write("\t    <p class=\"style1\">El objetivo central del selecto plantel profesional de la Clinica Veterinaria Aristocat es la  defensa, proteccion y bienestar de los animales  de compania.</p>\r\n");
      out.write("\t\t\t<p class=\"style1\">Nuestro compromiso inquebrantable se basa en el esfuerzo indesmayable de mantener altos standares  medicos en la prevencion y tratamiento de los multiples problemas que afectan a las mascotas.</p>\r\n");
      out.write("\t\t\t<p class=\"style1\">Nuestro deber es  preservar  la salud  de los &quot;pequenos o grandes seres&quot; que llegan a los hogares para formar parte de las familias.</p>\r\n");
      out.write("\t\t\t<p class=\"style1\">Debemos tener presente que se trata de seres vivos con sentimientos y emociones que pueden padecer muchas enfermedades al igual que los seres humanos;  por lo que tanto el  personal  medico y administrativo, asi como la infraestructura de la  &quot;Clinica Veterinaria Aristocat&quot;, esta preparada para  afrontar los retos de la Medicina Veterinaria actual. </p>\r\n");
      out.write("\t\t\t<p><span class=\"style1\">La Clinica Veterinaria Aristocat esta dirigida por dos destacados medicos veterinarios con amplia experiencia nacional e internacional</span>.</p>\r\n");
      out.write("\t\t\t<p><br>\r\n");
      out.write("\t\t      <a href=\"#\"></a>\t  </p>\r\n");
      out.write("\t  </div>\r\n");
      out.write("\t\t<div id=\"right\">\r\n");
      out.write("\t\t  <div>\r\n");
      out.write("\t\t    <img src=\"cmn/img/title3.gif\" alt=\"\" width=\"379\" height=\"35\" /><br />\r\n");
      out.write("\t\t\t\t<span class=\"date\">23 Octubre </span>\r\n");
      out.write("\t\t\t    <p>A partir de los seis u ocho anos llega la vejez de nuestro perro y a los diez si nuestro amigo es un gato. A estas edades es conveniente hacerles un chequeo, cambiarles la dieta de mantenimiento a una especifica para su edad o problema, notaremos que pierde vista, su oido es menos agudo, su boca tiende a oler mal, sus huesos empeoran... No permitir que esto nos parezca normal, la vejez sera mas feliz si lo cuidamos mas, no permitiremos que engorde, cuidamos su corazon y retrasamos el desgaste de sus huesos.</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<img src=\"cmn/img/title4.gif\" alt=\"\" width=\"379\" height=\"33\" /><br />\r\n");
      out.write("\t\t\t\t<div class=\"photos\">\r\n");
      out.write("\t\t\t\t\t<img src=\"cmn/img/photo1.jpg\" alt=\"\" width=\"133\" height=\"127\" />\r\n");
      out.write("\t\t\t\t\t<img src=\"cmn/img/photo2.jpg\" alt=\"\" width=\"132\" height=\"127\" />\r\n");
      out.write("\t\t\t\t\t<img src=\"cmn/img/photo3.jpg\" alt=\"\" width=\"132\" height=\"127\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"inner_copy\"><a href=\"http://www.beautifullife.info/\">beautiful</a><a href=\"http://www.grungemagazine.com/\">grunge</a></div>\r\n");
      out.write("\t\t<ul>    <li><a href=\"index.jsp\">Inicio </a>|</li>\r\n");
      out.write("\t\t\t<li><a href=\"vet_forma_pago.jsp\">Servicios</a>|</li>\r\n");
      out.write("\t\t\t<li><a href=\"vet_usuario.jsp\">Registrese</a>|</li>\r\n");
      out.write("\t\t\t<li><a href=\"vet_servicio.jsp\">Registrar Servicio</a>|</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<p>Copyright &copy;. All rights reserved. </p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
