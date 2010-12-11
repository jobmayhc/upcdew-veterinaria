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

public class ReservaGeneradaAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping,
            ActionForm form, HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        String codigo = request.getParameter("txtCodigo");
        String nombre = request.getParameter("txtNombre");
        String descripcion = request.getParameter("txtDescripcion");
        //System.out.println(codigo);
        //System.out.println(nombre);
        String precio = request.getParameter("txtPrecio");


        Producto oServicio = new Producto();

        oServicio.setCodigo(Long.parseLong(codigo));
        oServicio.setNombre(nombre);
        oServicio.setDescripcion(descripcion);
        oServicio.setPrecio(Double.parseDouble(precio));

        List<Producto> oServicioList = new ArrayList<Producto>();
        oServicioList.add(oServicio);

        request.setAttribute("reservaGeneradaLista", oServicioList);
        return mapping.findForward("reservaGenerada");

    }

}
