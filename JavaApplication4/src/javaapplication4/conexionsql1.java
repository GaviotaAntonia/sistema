package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class conexionsql1 
{

    static Connection contacto = null;
    public static String usuario;
    public static String contraseña;
    public static boolean status = false;

    public static Connection getConexion() 
    {
        String url = "jdbc:sqlserver://DESKTOP-AHM3DOT\\SQLEXPRESS:1433;databaseName=dbdistribuida";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer  la conexion... revisar Driver" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
           System.out.println("1");
        }
        try 
        {
            contacto = DriverManager.getConnection(url, conexionsql1.usuario, conexionsql1.contraseña);
            status = true;
            System.out.print("2");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
           System.out.println("3");
        }
        return contacto;
    }
    
    public static void setcuenta (String usuario, String contraseña)
    {
        conexionsql1.usuario = usuario;
        conexionsql1.contraseña = contraseña;
    }
    
    public static boolean getstatus()
    {
        return status;
    }
      public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara=con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),
            "Error de Conexion",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
   