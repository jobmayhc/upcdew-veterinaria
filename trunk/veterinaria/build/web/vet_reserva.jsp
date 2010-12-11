<%@page import ="java.util.*, pe.edu.upc.dew.veterinaria.model.*"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <title>.:: Veterinaria PetShop</title>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251" />
    <link rel="stylesheet" type="text/css" href="cmn/style/upc_main.css" />
    <script type="text/javascript" language="javascript" src="cmn/script/upc_main.js"></script>

    </head>
    <body>

    <form action="reserva.do" name="ReservaForm" method="post">

        <input type="hidden" name="txtCodigo"/>
        <input type="hidden" name="txtNombre"/>
        <input type="hidden" name="txtDescripcion"/>
        <input type="hidden" name="txtPrecio"/>


        <div id="header">
            <p><img src="cmn/img/big_photo.jpg" alt="" width="967" height="302" /></p>
        </div>
        <!--    Bienvenido ${usuario.nombres} ${usuario.apellidos} -->
        <div id="wrapper">
            <table style="width:100%;" cellpadding="2" cellspacing="2" align="center" border="0" >
            <tr>
                <td style="width:100%; height: 15px;" colspan="7"></td>
            </tr>
            <tr>
                <td style="width:100%; height: 15px;" colspan="7" align="right">
                    
                </td>
            </tr>
            <tr class="listaHeader">
                <td style="width:2%"></td>
                <td style="width:5%" align="center">
                    <span>Id</span>
                </td>
                <td style="width:10%" align="center">
                    <span id="lblReservar" name="lblReservar">Reservar</span>
                </td>
                <td style="width:30%" align="center">
                    <span id="lblNombre" name="lblNombre">Nombre</span>
                </td>
                <td style="width:10%" align="center">
                    <span id="lblPrecio" name="lblPrecio">Precio</span>
                </td>
                <td style="width:45%" align="center">
                    <span id="lblDescripcion" name="lblDescripcion">Descripcion</span>
                </td>
                <td style="width:2%"></td>
            </tr>
            <%
                System.out.println(request.getAttribute("servicioLista"));
                if(request.getAttribute("servicioLista") != null){
                    List<Producto> oServicioList = (List<Producto>)request.getAttribute("servicioLista");

                   for(int i=0; i<oServicioList.size(); i++){
                       Producto oServicio = new Producto();
                        oServicio = oServicioList.get(i);
            %>
            <tr class="">
                <td style="width:2%"></td>
                <td style="width:5%" align="center">
                    <span><%=oServicio.getCodigo()%></span>
                </td>
                <td style="width:10%; cursor:hand; " align="center">
            <img src="cmn/img/img_carrito.gif" alt="Reservar Servicio" width="48" height="40"
                 onclick="cargarMisCompras(<%=oServicio.getCodigo()%>, '<%=oServicio.getNombre()%>', <%=oServicio.getPrecio()%>, '<%=oServicio.getDescripcion()%>') " />
                </td>
                <td style="width:30%" align="left">
                    <span><%=oServicio.getNombre()%></span>
                </td>
                <td style="width:10%" align="center">
                    <span><%=oServicio.getPrecio()%></span>
                </td>
                <td style="width:45%" align="left">
                    <span><%=oServicio.getDescripcion()%></span>
                </td>
                <td style="width:2%"></td>
            </tr>

             <% } }%>

        </table>

	</div>

                 </form>
	<div id="footer">																																																																																																																																																																																																																																																																																																																		<div class="inner_copy"><a href="http://www.beautifullife.info/"></a><a href="http://www.grungemagazine.com/"></a></div>
		<ul>    <li><a href="index.jsp">Inicio </a>|</li>
			<li><a href="vet_forma_pago.jsp">Servicios</a>|</li>
			<li><a href="vet_usuario.jsp">Registrese</a>|</li>
			<li><a href="vet_servicio.jsp">Registrar Servicio</a>|</li>
		</ul>
		<p>Copyright &copy;. All right reserved. </p>
	</div>







    </body>



</html>
