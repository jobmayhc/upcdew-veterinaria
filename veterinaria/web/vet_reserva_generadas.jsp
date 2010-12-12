<%@page import="org.apache.taglibs.standard.lang.jpath.expression.RoundFunction"%>
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

    <div id="header">
    <img src="cmn/img/big_photo.jpg" alt="" width="967" height="302" />
    </div>
	<br />

        <form action="reservagenerada.do" name="reservaGeneradaForm" method="post">

	<div id="wrapper">
	    <!--table style="width:800px" border ="0">
		    <tr>
		        <td style="width:10%"></td>
		        <td style="width:15%"><span>Forma de Pago</span></td>
		        <td style="width:15%"><span>
                    <select id="optFormaPago">
                        <option>Contra Entrega</option>
                        <option>Deposito Cta. Cte.</option>
                    </select>
                </span></td>
		        <td style="width:15%"><span></span></td>
		    </tr>
		</table-->

                <table style="width:800px" border ="0" align="center">
		    <tr class="listaHeader">
                        <td style="width:80px" align="center">Eliminar</td>
		        <td style="width:320px" align="center"><span>Servicio Elegido</span></td>
		        <td style="width:120px" align="center"><span>Precio</span></td>
		        <td style="width:120px" align="center"><span>Impuesto</span></td>
		        <td style="width:120px" align="center"><span>Sub Total</span></td>
		    </tr>

                      <%

    System.out.println(request.getAttribute("reservaGeneradaLista"));
    if(request.getAttribute("reservaGeneradaLista") != null){
     List<Producto> l = (List<Producto>)request.getAttribute("reservaGeneradaLista");
     
     session.setAttribute("listaServiciosReservados", l);

   for(int x=0; x<l.size(); x++){
       Producto oProducto = new Producto();
        oProducto = l.get(x);

%>
<tr style="height: 23px;" class="tblBloq">
		        <td style="width:80px" align="center">Eliminar</td>
		        <td style="width:320px"><span><%=oProducto.getCodigo()%> - <%=oProducto.getNombre()%></span></td>
		        <td style="width:120px" align="center"><span><%=Math.round(oProducto.getPrecio())%></span></td>
                        <td style="width:120px" align="center"><span><%=Math.round((oProducto.getPrecio()*0.19)) %></span></td>
		        <td style="width:120px" align="center"><span><%=Math.round(oProducto.getPrecio()*0.19 + oProducto.getPrecio())%></span></td>
		    </tr>

                    <% } }%>

		</table>


                <table
                    <tr style="height: 50px;">
                        <td colspan="4"></td>
                    </tr>
                    <tr style="height: 25px;" align="right">
                        <td style="width:10%"></td>
                        <td style="width:30%" colspan="2">

                            <input id="btnReservar" name="btnReservar" type="submit" class="btn"
                       style="width:150px; height:25px;" value="Reservar"/>

                        </td>
		        <td style="width:15%"></td>
		    </tr>
		</table>

	</div>

     </form>


	<div id="footer">																																																																																																																																																																																																																																																																																																																		<div class="inner_copy"><a href="http://www.beautifullife.info/"></a><a href="http://www.grungemagazine.com/"></a></div>
		<ul>    <li><a href="index.jsp">Inicio </a>|</li>
			<li><a href="vet_forma_pago.jsp">Servicios</a>|</li>
			<li><a href="vet_usuario.jsp">Registrese</a>|</li>
			<li><a href="vet_servicio.jsp">Registrar Servicio</a>|</li>
		</ul>
		<p>Copyright &copy;. All rights reserved. </p>
	</div>

</body>
</html>
