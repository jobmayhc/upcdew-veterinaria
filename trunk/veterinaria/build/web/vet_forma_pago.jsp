<%@page import ="java.util.*, pe.edu.upc.dew.veterinaria.model.*"%>
<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
    <title>: Veterinaria PetShop</title>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1251" />
    <link rel="stylesheet" type="text/css" href="cmn/style/upc_main.css" />
    
    </head>
<body>

    <div id="header">
    <img src="cmn/img/big_photo.jpg" alt="" width="967" height="302" />
    </div>
	<br />

        <form action="formapago.do" method="post">

	<div id="wrapper">
	    <table style="width:800px" border ="0">
                <tr style="height: 25px;">
		        <td style="width:10%"></td>
		        <td style="width:15%"><span>Forma de Pago</span></td>
		        <td style="width:15%"><span>
                                <select id="optFormaPago" style="height: 22px;">
                        <option>Contra Entrega</option>
                        <option>Deposito Cta. Cte.</option>
                    </select>
                </span></td>
		        <td style="width:15%"><span></span></td>
		    </tr>
                    <tr style="height: 25px;">
                        <td colspan="4"></td>
                    </tr>
                    <tr style="height: 25px;">
                        <td style="width:10%"></td>
                        <td style="width:30%" colspan="2">

                            <input id="btnRegistrar" name="btnFormaPago" type="submit" class="btn"
                       style="width:150px; height:25px;" value="Forma de Pago"/>

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
