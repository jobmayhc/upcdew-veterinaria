package pe.edu.upc.dew.veterinaria.action;

import pe.edu.upc.dew.veterinaria.model.Producto;
import pe.edu.upc.dew.veterinaria.form.ServicioForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.action.ActionForm;
import pe.edu.upc.dew.veterinaria.service.ProductosImplement;

public class ServicioAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        ServicioForm oServicioForm = (ServicioForm) form;

        Producto oServicio = new Producto();

        oServicio.setNombre(oServicioForm.getTxtNombre().toUpperCase());
        oServicio.setDescripcion(oServicioForm.getTxtDescripcion().toUpperCase());

        Double precio;
        precio = Double.parseDouble(oServicioForm.getTxtPrecio());
        oServicio.setPrecio(precio);

        ProductosImplement oServicioImplement = new ProductosImplement();
        oServicioImplement.ProductoInsertar(oServicio);

        request.setAttribute("servicio", oServicio);
        return mapping.findForward("registrarServicio");

    }

}
