package javaapplication4;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class conexion {
    Connection con=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdistribuida","root","awdx1234,.-");
            System.out.println("conexion exitosa");
            JOptionPane.showMessageDialog(null,"conexion exitosa");
        } 
        catch (ClassNotFoundException| SQLException e) 
        {
            System.out.println("error de conexion"+e);
            JOptionPane.showMessageDialog(null,"error"+e);
        }
     return con;
    }
}
