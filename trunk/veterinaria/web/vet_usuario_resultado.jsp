<%@page import="pe.edu.upc.dew.veterinaria.model.Usuario"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<% Usuario usuario = request.getAttribute("usuario") != null ? (Usuario)request.getAttribute("usuario") : null;%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="cmn/style/upc_main.css" />
        <title>.:: Veterinaria PetShop</title>  
        <style type="text/css">
            <!--
            .style10 {font-size: 12px}
            #Layer1 {
                    position:absolute;
                    width:209px;
                    height:70px;
                    z-index:1;
                    left: 159px;
                    top: -8px;
            }
            .style11 {font-size: 36px}
            -->
        </style>

    </head>
<body>
																																																																																																																																																																									<div class="inner_copy"><a href="http://www.beautifullife.info/">beautiful</a><a href="http://www.grungemagazine.com/">grunge</a></div>
    <div id="header">
        <img src="cmn/img/header_bg.jpg" alt="Registro de Usuario" width="967" height="55" />
    <div class="inner_copy"></div>
    </div>
    <br />
    <form action="datosUsuario.do" method="post">

    <div id="divUsuario" style="BORDER-RIGHT: #e0e0d0 2px solid; BORDER-TOP: #e0e0d0 2px solid;
                    BORDER-LEFT: #e0e0d0 2px solid; WIDTH: 100%; BORDER-BOTTOM: #e0e0d0 2px solid;
                    HEIGHT: 370px; vertical-align:middle;">

    <table style="width:100%;" cellpadding="2" cellspacing="2" border="0">
        <tr>
            <td style="width:100%; height:15px;" colspan="7"></td>
        </tr>
        <tr >
            <td style="width:30px">
            </td>
            <td style="width:635px; height:25px;" class="tblBloq">
                <span id="lblTitulo" class="titBloqs" >
                    Registro de Usuarios
                </span>
            </td>
            <td style="width:10px"></td>
        </tr>
    </table>



    <table style="width:100%;" cellpadding="2" cellspacing="2" border="0">
        <tr>
            <td style="width:100%; height:20px;" colspan="2"></td>
        </tr>
        <tr>
            <td style="width:3%">
            </td>
            <td style="width:97%" class="">
                <span id="lblUsuario" class="" style="width:100%;">Estimado Usuario: </span>
            </td>
        </tr>
        <tr>
            <td style="width:100%; height: 10px; " colspan="2">
            </td>
        </tr>
        <tr class="">
            <td style="width:3%">
            </td>
            <td style="width:97%">
                <b><%=usuario.getNombre()%>&nbsp;<%=usuario.getApepaterno()%>&nbsp;<%=usuario.getApematerno()%></b>
            </td>
        </tr>

         <tr>
            <td style="width:100%; height: 10px; " colspan="2">
            </td>
        </tr>
        <tr>
            <td style="width:3%">
            </td>
            <td style="width:97%">
                <span id="lblResultado" class="lblFrm" style="width:100%;">Su registro ha sido realizado satisfactoriamente.</span>
            </td>
        </tr>



    </table>

    </div>
    </form>

	<div id="footer">																																																																																																																																																																											<div class="inner_copy"><a href="http://www.beautifullife.info/">beautiful</a><a href="http://www.grungemagazine.com/">grunge</a></div>
		<ul>    <li><a href="index.jsp">Inicio </a>|</li>
			<li><a href="vet_forma_pago.jsp">Servicios</a>|</li>
			<li><a href="vet_usuario.jsp">Registrese</a>|</li>
			<li><a href="vet_servicio.jsp">Registrar Servicio</a>|</li>
		</ul>
		<p>Copyright &copy;. All right reserved. </p>
	</div>
</body>
</html>
