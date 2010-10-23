<%-- 
    Document   : reservaservicios
    Created on : 21/09/2010, 07:21:06 PM
    Author     : Daniel
--%>

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

    <form name="frmServicios" method="post" action="ReservaServlet" >
         <input type="hidden" name="txtCodigo">
        <input type="hidden" name="txtNombre">
        <input type="hidden" name="txtPrecio">
        
        <div id="header">
            <p><img src="cmn/img/big_photo.jpg" alt="" width="967" height="302" /></p>
        </div>
            <h1>Bienvenido ${usuario.nombres} ${usuario.apellidos}</h1>
            <div id="wrapper">

		<table style="width:100%" border ="0">
		    <tr>
		        <td style="width:15%"></td>
		        <td style="width:20%">
                    <img src="cmn/servicios/serv_apariamiento.jpg" alt="Apariamiento" style="cursor:hand;" onclick="cargarMisCompras('001', 'Apariamiento', '70.00')" />
		        </td>
		        <td style="width:5%"></td>
		        <td style="width:20%">
		            <img src="cmn/servicios/serv_odontologia.jpg" alt="Odontologia" style="cursor:hand;" onclick="cargarMisCompras('002', 'Odontologia', '35.00')" />
		        </td>
		        <td style="width:5%"></td>
		        <td style="width:20%">
		            <img src="cmn/servicios/serv_cortepelo.jpg" alt="CortePelo" style="cursor:hand;" onclick="cargarMisCompras('003', 'Corte de Pelo', '30.00')" />
		        </td>
		        <td style="width:15%"></td>
		    </tr>
		    <tr>
		        <td style="width:15%"></td>
		        <td style="width:20%"><span>S/70.00</span></td>
		        <td style="width:5%"></td>
		        <td style="width:20%"><span>S/35.00</span></td>
		        <td style="width:5%"></td>
                <td style="width:20%"><span>S/30.00</span></td>
                <td style="width:15%"></td>
		    </tr>
		    <tr>
		        <td style="width:15%"></td>
		        <td style="width:20%"><span>Apariamiento</span></td>
		        <td style="width:5%"></td>
		        <td style="width:20%"><span>Odontologia</span></td>
		        <td style="width:5%"></td>
                <td style="width:20%"><span>Corte de Pelo</span></td>
                <td style="width:15%"></td>
		    </tr>


		</table>

	</div>
	<div id="footer">																																																																																																																																																																																																																																																																																																																		<div class="inner_copy"><a href="http://www.beautifullife.info/"></a><a href="http://www.grungemagazine.com/"></a></div>
		<ul>
			<li><a href="index.jsp">Inicio </a>|</li>
			<li><a href="reservaservicios.jsp">Servicios</a>|</li>
			<li><a href="consultar.html">Consultar</a>|</li>
			<li><a href="">Galeria</a>|</li>
			<li><a href="">Contacto</a>|</li>
		</ul>
		<p>Copyright &copy;. All rights reserved. </p>
	</div>

    </form>

    </body>



</html>
