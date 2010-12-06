<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

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

        <script language="javascript" type="text/javascript">
        function ValidaUsuario(){
            var ValidaCampo;

            ValidaCampo = txtNombre.value;
            if (ValidaCampo == ''){
                alert('Nombre es requerido, ingrese un valor apropidado.');
                txtNombre.focus();
                return;
            }
            ValidaCampo = txtPrecio.value;
            if (ValidaCampo == ''){
                alert('Precio es requerido, ingrese un valor apropidado.');
                txtPrecio.focus();
                return;
            }
        }

    </script>

    </head>

    <body>
																																																																																																																																																																									<div class="inner_copy"><a href="http://www.beautifullife.info/">beautiful</a><a href="http://www.grungemagazine.com/">grunge</a></div>
	<div id="header">
	    <img src="cmn/img/header_bg.jpg" alt="Registro de Usuario" width="967" height="55" />
        <div class="inner_copy"></div>
    </div>
    <br />
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
                    Registro de Servicios
                </span>
            </td>
            <td style="width:10px"></td>
        </tr>
    </table>

        <table style="width:100%;" cellpadding="2" cellspacing="2" border="0">
        <tr>
            <td style="width:100%; height:20px;" colspan="7"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblNombre" class="lblFrm" style="width:80px;">Nombre</span>
            </td>
            <td style="width:250px">
                <input id="txtNombre" type="text" class="txtupper" style="width:200px;" />
                <span id="valNombre" style="color:red">*</span>
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >

            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblDescripcion" class="lblFrm" style="width:80px;">Descripcion</span>
            </td>
            <td style="width:250px">
                <input id="txtDescripcion" type="text" class="txt" style="width:200px;" />
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >

            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
        </tr>

        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblPrecio" style="width:80px;">Precio</span>
            </td>
            <td style="width:250px">
                <input id="txtPrecio" type="text" class="txtupper" style="width:200px;" />
                <span id="valPrecios" style="color:red">*</span>
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >

            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblImagen" style="width:80px;">Img a Mostrar</span>
            </td>
            <td style="width:250px">
                <input id="fileupload" type="file" class="txt" style="width:200px; height:22px;" />
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >

            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">

            </td>
            <td style="width:250px">

            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >

            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">

            </td>
            <td style="width:250px">

            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >

            </td>
            <td style="width:250px">
            </td>
            <td style="width:10px"></td>
        </tr>
        <tr>
            <td style="width:100%; height:30px;" colspan="7"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">

            </td>
            <td style="width:250px" align="center" ></td>
            <td style="width:5px"></td>
            <td style="width:90px" class="" >
                <input id="btnRegistrar" type="submit" value="Registrar" class="btn" style="width:89px; height:25px;" onclick="ValidaUsuario();"/>
            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
        </tr>


    </table>


    </div>

	<div id="footer">																																																																																																																																																																											<div class="inner_copy"><a href="http://www.beautifullife.info/">beautiful</a><a href="http://www.grungemagazine.com/">grunge</a></div>
		<ul>
			<li><a href="index.jsp">Inicio </a>|</li>
			<li><a href="reservaservicios.jsp">Servicios</a>|</li>
			<li><a href="consultar.html">Consultar</a>|</li>
			<li><a href="">Galeria</a>|</li>
		    <li><a href="">Contacto</a></li>
		</ul>
		<p>Copyright &copy;. All rights reserved. </p>
	</div>
</body>


</html>
