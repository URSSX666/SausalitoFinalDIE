
package BD;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
   Connection SQLConexion;
     
     public  conexion(){
         //ruta de Base de datos
         String host = "localhost";
        String puerto = "3306";
        String nameDB = "restaurantesausalito";
        
         //Accerder a la bd
         String usuario = "root";
         String pass = "";
        //
        
        String driver = "com.mysql.cj.jdbc.Driver";
        
        //Url conexion
        String databaseURL = "jdbc:mysql://" + host + ":" + puerto + "/" + nameDB + "?useSSL=false&serverTimezone=UTC";
        
        try {
             Class.forName(driver);
             SQLConexion = DriverManager.getConnection(databaseURL,usuario,pass);
            } catch (Exception e) {
        }
         
}
     public Connection getConectarDB(){
     return SQLConexion;
     }
}