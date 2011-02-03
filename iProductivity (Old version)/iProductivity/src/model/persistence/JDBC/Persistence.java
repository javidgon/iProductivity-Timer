// Clase "Persistencia" dentro del modelo de MVC en JAVA.
package model.persistence.JDBC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Persistence {

    private static String url = "jdbc:mysql://localhost/iProductivity";
    private static String usuario = "root";
    private static String password = "";
    private static Connection con = null;

    public static Connection createConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = (Connection) DriverManager.getConnection(url, usuario, password);
            } catch (InstantiationException ex) {
                Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }

   public static void closeConnection(){
       if(con!=null){
            try {
                con.close();
                con = null;
            } catch (SQLException ex) {
                Logger.getLogger(Persistence.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
   }

}
