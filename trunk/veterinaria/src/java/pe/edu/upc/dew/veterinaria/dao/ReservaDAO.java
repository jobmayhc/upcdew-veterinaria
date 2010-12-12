package pe.edu.upc.dew.veterinaria.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Producto;
import pe.edu.upc.dew.veterinaria.model.Reserva;
import pe.edu.upc.dew.veterinaria.utils.USqlMapLoader;

public class ReservaDAO {

    private SqlMapClient sqlMap;
    public ReservaDAO() throws IOException {
        sqlMap = USqlMapLoader.getSqlMapClient();
    }

    public void ReservaInsertar(Reserva oReserva) throws SQLException {
        sqlMap.insert("ReservaInsertar", oReserva);
    }

}
