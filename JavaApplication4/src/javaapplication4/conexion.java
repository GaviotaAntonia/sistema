package javaapplication4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Icon;

public class conexion {
    Connection con=null;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdistribuida","root","");
           // System.out.println("conexion exitosa");
           JOptionPane.showMessageDialog(null, "Conexion Exitosa", "Conexion Exitosa",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("C:\\Users\\Alejandro\\Desktop\\ING.HERRRA\\iconosBD\\listo.png"));
        } 
        catch (ClassNotFoundException| SQLException e) 
        {
            System.out.println("error de conexion"+e);
            JOptionPane.showMessageDialog(null,"error"+e);
        }
     return con;
    }
}
