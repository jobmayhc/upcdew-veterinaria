package pe.edu.upc.dew.veterinaria.action;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Producto;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;

import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import org.apache.struts.action.ActionForm;
import pe.edu.upc.dew.veterinaria.service.ProductosImplement;

public class ReservaAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        Producto oServicio = new Producto();
        List<Producto> oServicioList = new ArrayList<Producto>();

        ProductosImplement oServicioImplement = new ProductosImplement();
        oServicioList = oServicioImplement.ProductosListar(oServicio);

        request.setAttribute("servicioLista", oServicioList);
        return mapping.findForward("listarServicio");

    }

}
