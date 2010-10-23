// JScript File
function cargarMisCompras(codigo, nombre, precio){

    //alert(codigo);
    document.frmServicios.txtCodigo.value = codigo;
    document.frmServicios.txtNombre.value = nombre;
    document.frmServicios.txtPrecio.value = precio;
    document.frmServicios.action = '/Reserva';
    document.frmServicios.submit();


}

