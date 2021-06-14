
package proyectofinal;

import clases.BD;
import java.sql.SQLException;

public class Inicio {
   BD objConn = new BD();
    
    public Inicio() throws ClassNotFoundException, SQLException {       
        new presentacion(objConn).setVisible(true);
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        new Inicio();
    }
}