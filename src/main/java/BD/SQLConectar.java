
package BD;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLConectar {
     Connection SQLConexion;
     
     public  SQLConectar(){
         //ruta de Base de datos
         String host = "localHost";
         String puerto = "3306";
         String nameDB = "restaurantesausalito";
         
         //Accerder a la bd
         String usuario = "root";
         String pass = "";
        //
        String driver ="com.mysql.cj.jdbc.Driver";
        //
        String databaseURL =  "jdbc:mysql://"+host+":"+puerto+"/"+nameDB+"?useSSL=false";
        
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
