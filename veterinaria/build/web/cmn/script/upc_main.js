function cargarMisCompras(codigo, nombre, precio, descripcion){
    //alert(codigo + " " + nombre + " " + precio + " " + descripcion);
    document.forms[0].txtCodigo.value = codigo;
    document.forms[0].txtNombre.value = nombre;
    document.forms[0].txtPrecio.value = precio;
    document.forms[0].txtDescripcion.value = descripcion;
    //document.forms[0].action = '/reservagenerada.do';
    document.forms[0].submit();
    
}

