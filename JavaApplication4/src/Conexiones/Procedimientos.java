
package Conexiones;
import javaapplication4.conexionsql1;
import java.sql.SQLException;
import java.sql.CallableStatement;
import javaapplication4.conexionsql;
public class Procedimientos {
    
    /*---- Agregar ----*/
    
    public static void entradadedatos(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call entradamateria(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    public static void EntradaMes(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaMes(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    public static void EntradaDia(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaDia(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    public static void EntradaSexo(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaSexo(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    public static void EntradaGrupo(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaGrupo(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
    /*---- Buscar ----*/
    
    public static void buscamateria(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call buscarmateria(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarMes(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarMes(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarDia(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarDia(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarSexo(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarSexo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void BuscarGrupo(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarGrupo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    /*---- Eliminar ----*/
    
    public static void Eliminarmateria(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call Eliminarmateria(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarMes(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarMes(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarDia(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarDia(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }

    public static void EliminarSexo(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarSexo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
    public static void EliminarGrupo(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarGrupo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
}
