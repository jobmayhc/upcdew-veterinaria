
<%@page import="java.util.*" session="true" %>
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
            
            ValidaCampo = document.forms[0].txtUsuario.value;
            //alert(ValidaCampo);
            if (ValidaCampo == ''){
                alert('Usuario es requerido, ingrese un valor apropidado.');
                document.forms[0].txtUsuario.focus();
                return false;
            }
            
            ValidaCampo = document.forms[0].txtPassword.value;
            //alert(ValidaCampo);
            if (ValidaCampo == ''){
                alert('Password es requerido, ingrese un valor apropidado.');
                document.forms[0].txtPassword.focus();
                return false;
            }

            ValidaCampo = document.forms[0].txtPasswordConfirmar.value;
            //alert(ValidaCampo);
            if (ValidaCampo == ''){
                alert('Confirmar Password es requerido, ingrese un valor apropidado.');
                document.forms[0].txtPasswordConfirmar.focus();
                return false;
            }

            if (document.forms[0].txtPassword.value != document.forms[0].txtPasswordConfirmar.value){
                document.forms[0].txtPassword.value = '';
                document.forms[0].txtPasswordConfirmar.value = '';
                alert('El Password y su Confirmación deben ser iguales.');
                return false;
            }

            ValidaCampo = document.forms[0].txtNombre.value;
            //alert(ValidaCampo);
            if (ValidaCampo == ''){
                alert('Nombre es requerido, ingrese un valor apropidado.');
                document.forms[0].txtNombre.focus();
                return false;
            }
            ValidaCampo = document.forms[0].txtApePaterno.value;
            //alert(ValidaCampo);
            if (ValidaCampo == ''){
                alert('Apellido Paterno es requerido, ingrese un valor apropidado.');
                document.forms[0].txtApePaterno.focus();
                return false;
            }
            ValidaCampo = document.forms[0].txtMail.value;
            //alert(ValidaCampo);
            if (ValidaCampo == ''){
                alert('Mail es requerido, ingrese un valor apropidado.');
                document.forms[0].txtMail.focus();
                return false;
            }
            return true;
        }

        function LimpiarObjetos(){
            document.forms[0].txtUsuario.value = '';
            document.forms[0].txtPassword.value = '';
            document.forms[0].txtPasswordConfirmar.value = '';
            document.forms[0].txtNombre.value = '';
            document.forms[0].txtApePaterno.value = '';
            document.forms[0].txtMail.value = '';
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
    <form action="usuario.do" id="UsuarioForm" method="post">

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
            <td style="width:100%; height:20px;" colspan="7"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblUsuario" class="lblFrm" style="width:80px;">Usuario</span>
            </td>
            <td style="width:250px">
                <input id="txtUsuario" name="txtUsuario" type="text" class="txtupper" style="width:200px;" />
                <span id="valUsuario" style="color:red">*</span>
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >
                <span id="lblNombre" style="width:80px;">Nombre</span>
            </td>
            <td style="width:250px">
                <input id="txtNombre" name="txtNombre" type="text" class="txtupper" style="width:200px;" />
                <span id="ValNombre" style="color:red">*</span>
            </td>
            <td style="width:10px"></td>
        </tr>
        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblPassword" class="lblFrm" style="width:80px;">Password</span>
            </td>
            <td style="width:250px">
                <input id="txtPassword" name="txtPassword" type="password" class="txt" style="width:200px;" />
                <span id="valPassword" style="color:red">*</span>
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >
                <span id="lblApePaterno" style="width:80px;">Ape. Paterno</span>
            </td>
            <td style="width:250px">
                <input id="txtApePaterno" name="txtApePaterno" type="text" class="txtupper" style="width:200px;" />
                <span id="valApePaterno" style="color:red">*</span>
            </td>
            <td style="width:10px"></td>
        </tr>

        <tr>
            <td style="width:30px">
            </td>
            <td style="width:90px" class="lblFrm">
                <span id="lblPasswordConfirmar" class="lblFrm" style="width:80px;">Confirmar Pwd</span>
            </td>
            <td style="width:250px">
                <input id="txtPasswordConfirmar" name="txtPasswordConfirmar" type="password" class="txt" style="width:200px;" />
                <span id="valPasswordConfirmar" style="color:red">*</span>
            </td>
            <td style="width:5px"></td>
            <td style="width:90px" class="lblFrm" >
                <span id="lblApeMaterno" style="width:80px;">Ape. Materno</span>
            </td>
            <td style="width:250px">
                <input id="txtApeMaterno" name="txtApeMaterno" type="text" class="txtupper" style="width:200px;" />
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
                <span id="lblDireccion" style="width:80px;">Direccion</span>
            </td>
            <td style="width:250px">
                <input id="txtDireccion" name="txtDireccion" type="text" class="txtupper" style="width:200px;" />
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
                <span id="lblTelefono" style="width:80px;">Telefono</span>
            </td>
            <td style="width:250px">
                <input id="txtTelefono" name="txtTelefono" type="text" class="txtupper" style="width:200px;" />
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
                <span id="lblMail" style="width:80px;">E-Mail</span>
            </td>
            <td style="width:250px">
                <input id="txtMail" name="txtMail" type="text" class="txtupper" style="width:200px;" />
                <span id="valApeMaterno" style="color:red">*</span>
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
                <input id="btnRegistrar" name="btnRegistrar" type="submit" class="btn"
                       style="width:89px; height:25px;" value="Registrar"
                   onclick="ValidaUsuario();"/>
            </td>
            <td style="width:250px">

            </td>
            <td style="width:10px"></td>
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
		<p>Copyright &copy;. All rights reserved. </p>
	</div>
</body>
</html>
