package pe.edu.upc.dew.veterinaria.utils;

import java.io.IOException;
import java.io.Reader;
import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

/**
 * Clase SqlMapLoader.
 */
public class USqlMapLoader {

    /* Instancia de SqlMapLoader*/
    private static USqlMapLoader instancia;
    private Reader reader = null;
    private static String IBATIS_XML_CONFIG_FILE = "com/pe/mapping/sql-map-config.xml";

    /**
     * Resumen.
     * Constructor Genérico.
     * @throws IOException
     */
    public USqlMapLoader() throws IOException {
        String resource = IBATIS_XML_CONFIG_FILE;
        reader = Resources.getResourceAsReader(resource);
            }

    /**
     * Metodo para obtener la instancia
     * @return SqlMapLoader.
     * @throws IOException
     */
    public static USqlMapLoader getInstance() throws IOException {
        if (instancia == null) {
            return new USqlMapLoader();
        }
        return instancia;
    }

    /**
     * Metodo para obtener  SqlMapClient
     * @return SqlMapClient.
     * @throws IOException
     */
    public static SqlMapClient getSqlMapClient() throws IOException {
        USqlMapLoader sqlLoader = null;
        sqlLoader = getInstance();
        return sqlLoader.getSqlMap();
    }

    /**
     * Metodo para obtener  SqlMapClient
     * @return SqlMapClient.
     */
    public SqlMapClient getSqlMap() {
        return SqlMapClientBuilder.buildSqlMapClient(reader);
    }
}

