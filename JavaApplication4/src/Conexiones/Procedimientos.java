
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
        public static void EntradaCertificado(String a,String b) throws SQLException{
        CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaCertificado(?,?)}");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
        public static void EntradaEstado(String a,String b) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaEstado(?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.execute();
        }
        public static void EntradaSalon(String a,String b) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaSalon(?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.execute();
        }
        public static void EntradaTurno(String a,String b,String c,String d) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaTurno(?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.execute();
        }
        public static void EntradaColonia(String a,String b,String c,String d) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaColonia(?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.execute();
        }
        public static void EntradaCalendario(String a,String b,String c,String d,String e) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaCalendario(?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
            entrada.execute();
        }
        public static void EntradaDirector(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaDirector(?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
            entrada.setString(6, f);
            entrada.setString(7, g);
            entrada.setString(8, h);
            entrada.setString(9, i);
            entrada.setString(10, j);
            entrada.setString(11, k);
            entrada.setString(12, l);
            entrada.setString(13, m);
            entrada.execute();
        }        
        public static void EntradaCede(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call EntradaCede(?,?,?,?,?,?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
            entrada.setString(6, f);
            entrada.setString(7, g);
            entrada.setString(8, h);
            entrada.setString(9, i);
            entrada.setString(10, j);
            entrada.execute();
        }
        public static void entradausuario(String a,String b,String c,String d,String e,String f,String g) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call entradausuario(?,?,?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
            entrada.setString(6, f);
            entrada.setString(7, g);
            entrada.execute();
        }
        public static void entradahorario(String a,String b,String c,String d,String e) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call entradahorario(?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
            entrada.execute();
        }
        public static void fhorario(String a,String b,String c,String d,String e) throws SQLException{
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call fhorario(?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
            entrada.execute();
        }
        public static void entradadocente(String a,String b,String c,String d,String e,String f,String g, String h, String i,String j,String k,String l,String m, String n) throws SQLException  {
            CallableStatement entrada=conexionsql1.getConexion().prepareCall("{call entradadocente(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            entrada.setString(1, a);
            entrada.setString(2, b);
            entrada.setString(3, c);
            entrada.setString(4, d);
            entrada.setString(5, e);
             entrada.setString(6, f);
            entrada.setString(7, g);
            entrada.setString(8, h);
            entrada.setString(9, i);
             entrada.setString(10, j);
            entrada.setString(11, k);
            entrada.setString(12, l);
            entrada.setString(13, m);
            entrada.setString(14, n);
            entrada.execute();
        }
        public static void GrabarAlumno(String a,String b,String c,String d, String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q) throws SQLException{
            CallableStatement entrada1=conexionsql1.getConexion().prepareCall("{call GrabarAlumno(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            entrada1.setString(1, a);
            entrada1.setString(2, b);
            entrada1.setString(3, c);
            entrada1.setString(4, d); 
            entrada1.setString(5, e);
            entrada1.setString(6, f);
            entrada1.setString(7, g);
            entrada1.setString(8, h);
            entrada1.setString(9, i);
            entrada1.setString(10, j);
            entrada1.setString(11, k);
            entrada1.setString(12, l);
            entrada1.setString(13, m);
             entrada1.setString(14, n);
            entrada1.setString(15, o);
            entrada1.setString(16, p);
            entrada1.setString(17, q);
            entrada1.execute();
        }
               
    /*---- Buscar ----*/
    
        public static void buscamateria(int a)throws SQLException{
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call buscarmateria(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
    
        public static void BuscarMes(int a)throws SQLException{
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarMes(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
    
        public static void BuscarDia(int a)throws SQLException{
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarDia(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
    
        public static void BuscarSexo(int a)throws SQLException{
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
    
        public static void BuscarCertificado(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarCertificado(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarEstado(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarEstado(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarSalon(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarSalon(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarTurno(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarTurno(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarColonia(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarColonia(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarCalendario(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarCalendario(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarDirector(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarDirector(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void BuscarCede(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call BuscarCede(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
     public static void Buscaralum(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call Buscaralum(?)}");
            entrada.setInt(1, a);
            
            entrada.execute();
        }
     public static void buscarusua(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call buscarusua(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
         public static void buscarhorario(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call buscarhorario(?)}");
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
    
        public static void EliminarCertificado(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarCertificado(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
    
        public static void EliminarEstado(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarEstado(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void EliminarSalon(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarSalon(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void EliminarTurno(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarTurno(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void EliminarColonia(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarColonia(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }

        public static void EliminarCalendario(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarCalendario(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void EliminarDirector(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarDirector(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
        public static void EliminarCede(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call EliminarCede(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }

    
        public static void eliminarhorario(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call eliminarhorario(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
             public static void eliminaalumno(int a)throws SQLException
        {
            CallableStatement entrada = conexionsql1.getConexion().prepareCall("{call eliminaalumno(?)}");
            entrada.setInt(1, a);
            entrada.execute();
        }
        
}
