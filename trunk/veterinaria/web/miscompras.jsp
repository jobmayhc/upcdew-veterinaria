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
	<div id="wrapper">
	    <table style="width:800px" border ="0">
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
		</table>

		<table style="width:800px" border ="0">
		    <tr class="listaHeader">
		        <td style="width:80px">Eliminar</td>
		        <td style="width:320px"><span>Servicio Elegido</span></td>
		        <td style="width:120px"><span>Precio</span></td>
		        <td style="width:120px"><span>Impuesto</span></td>
		        <td style="width:120px"><span>Sub Total</span></td>
		    </tr>

                      <%

    System.out.println(request.getAttribute("lstReserva"));
    if(request.getAttribute("lstReserva") != null){
     List<Producto> l = (List<Producto>)request.getAttribute("lstReserva");

   for(int x=0; x<l.size(); x++){
       Producto oProducto = new Producto();
        oProducto = l.get(x);

%>
                     <tr class="listaRow">
		        <td style="width:80px">Eliminar</td>
		        <td style="width:320px"><span><%=oProducto.getCodigo()%> - <%=oProducto.getNombre()%></span></td>
		        <td style="width:120px"><span><%=oProducto.getPrecio()%></span></td>
		        <td style="width:120px"><span><%=oProducto.getI()%></span></td>
		        <td style="width:120px"><span></span></td>
		    </tr>

                    <% } }%>

		</table>

	</div>
	<div id="footer">																																																																																																																																																																																																																																																																																																																		<div class="inner_copy"><a href="http://www.beautifullife.info/"></a><a href="http://www.grungemagazine.com/"></a></div>
		<ul>
			<li><a href="index.jsp">Inicio</a>|</li>
			<li><a href="reservaservicios.jsp">Servicios</a>|</li>
			<li><a href="consultar.html">Consultar</a>|</li>
			<li><a href="">Galeria</a>|</li>
			<li><a href="">Contacto</a></li>
		</ul>
		<p>Copyright &copy;. All right reserved. </p>
	</div>
    
</body>
</html>
