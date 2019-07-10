
package javaapplication4;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class conexionsql {
    
    public static Connection getConnection()
    {
        Connection connection = null;
        String bdName = "dbdistribuida";
        String user = "sa";
        String pass = "awdx123";
        
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connections = "jdbc:sqlserver://DESKTOP-AHM3DOT\\SQLEXPRESS;databaseName="+bdName+";user="+user+";password="+pass+";";
            connection = DriverManager.getConnection(connections);
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
        if(conexionsql.getConnection()!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        }
    }
    
}
