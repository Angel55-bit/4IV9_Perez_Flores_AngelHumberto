import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = ""
    private static final String USER = ""
    private static final String PASSWORD = ""

    public static Connection getConexion(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbv.Driver");
            con = DriverManager
        }
    }
}