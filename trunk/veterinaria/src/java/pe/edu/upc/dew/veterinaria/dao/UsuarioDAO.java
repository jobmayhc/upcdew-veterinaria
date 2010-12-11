package pe.edu.upc.dew.veterinaria.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import pe.edu.upc.dew.veterinaria.model.Usuario;
import pe.edu.upc.dew.veterinaria.utils.USqlMapLoader;

public class UsuarioDAO {

    private SqlMapClient sqlMap;
    public UsuarioDAO() throws IOException {
        sqlMap = USqlMapLoader.getSqlMapClient();
    }

    public List<Usuario> ObtenerDatosUsuario(Usuario oUsuario) throws SQLException {
        List<Usuario> list;
        list = sqlMap.queryForList("UsuarioObtenerDatos", oUsuario);
        return list;
    }

    public List<Usuario> UsuarioValida(Usuario oUsuario) throws SQLException {
        List<Usuario> list;
        list = sqlMap.queryForList("UsuarioValida", oUsuario);
        return list;
    }

    public List<Usuario> UsuarioListar(Usuario oUsuario) throws SQLException {
        List<Usuario> list;
        list = sqlMap.queryForList("UsuariosListar", oUsuario);
        return list;
    }

    public void UsuarioInsertar(Usuario oUsuario) throws SQLException {
        sqlMap.insert("UsuarioInsertar", oUsuario);
    }

    public void UsuarioUpdate(Usuario oUsuario) throws SQLException {
        sqlMap.update("UsuarioUpdate", oUsuario);
    }

}
