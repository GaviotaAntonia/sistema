package javaapplication4;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexionsql1 {

    static Connection contacto = null;

    public static Connection getConexion() {
        String url = "jdbc:sqlserver://DESKTOP-AHM3DOT\\SQLEXPRESS:1433;databaseName=dbdistribuida";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se pudo establecer  la conexion... revisar Driver" + e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
            System.out.println("1");
        }
        try 
        {
            contacto = DriverManager.getConnection(url, "sa", "awdx123");
            System.out.println(contacto);
            
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            System.out.println("3");
        }
        return contacto;
    }
    
   }