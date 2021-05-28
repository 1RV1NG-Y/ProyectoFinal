
package clases;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class BD {
    public Statement stmt = null;
    public ResultSet rs= null;
    public Connection conn = null;
    
    public BD() throws ClassNotFoundException, SQLException{
    Class.forName("com.mysql.jdbc.Drive");
    String coneccion = "jdbc:mysql://localhost/hotel?user=root&password=";
    conn = DriverManager.getConnection(coneccion);
    }
}
