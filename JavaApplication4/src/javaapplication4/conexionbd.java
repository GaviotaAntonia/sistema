
package javaapplication4;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

public class conexionbd {
    
    public static Connection getConnection()
    {
        Connection connection = null;
        String bdName = "dbdistribuida";
        String user = "sa";
        String pass = "awdx123";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionBD = "jdbc:sqlserver://DESKTOP-AHM3DOT//SQLEXPRESS;databaseName="+bdName+";user="+user+";password="+pass+";";
            connection = DriverManager.getConnection(connectionBD);
            
        }catch (ClassNotFoundException e)
        {
            System.out.println("Error: "+e.getMessage());
        }catch (SQLException e)
        {
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        
        return connection;
        
    }
    
    public static void main(String[] args)
    {
        if(conexionbd.getConnection()!=null)
        {
            System.out.println("Conexion exitosa");
        }
    }
    
}
