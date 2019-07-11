
package Conexiones;
import javaapplication4.conexionsql1;
import java.sql.SQLException;
import java.sql.CallableStatement;
public class Procedimientos {
    public static void entradadedatos(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call entradamateria(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    public static void eliminarmateria(int a)throws SQLException{
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarArticulo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    

}
