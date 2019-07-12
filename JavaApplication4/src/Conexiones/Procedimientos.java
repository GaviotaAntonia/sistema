
package Conexiones;
import javaapplication4.conexionsql1;
import java.sql.SQLException;
import java.sql.CallableStatement;
import javaapplication4.conexionsql;
public class Procedimientos {
    public static void entradadedatos(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call entradamateria(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    public static void Eliminarmateria(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call Eliminarmateria(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
     public static void buscamateria(int a)throws SQLException{
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call buscarmateria(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }

    

}
