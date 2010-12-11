package pe.edu.upc.dew.veterinaria.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Producto;
import pe.edu.upc.dew.veterinaria.utils.USqlMapLoader;

public class ProductoDAO {

    private SqlMapClient sqlMap;
    public ProductoDAO() throws IOException {
        sqlMap = USqlMapLoader.getSqlMapClient();
    }

    public List<Producto> ProductoListar(Producto oProducto) throws SQLException {
        List<Producto> list;
        list = sqlMap.queryForList("ProductosListar", oProducto);
        return list;
    }

    public void ProductoInsertar(Producto oProducto) throws SQLException {
        sqlMap.insert("ProductoInsertar", oProducto);
    }

    public void ProductoUpdate(Producto oProducto) throws SQLException {
        sqlMap.update("ProductoUpdate", oProducto);
    }

   

}
