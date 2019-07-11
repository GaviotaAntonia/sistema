package javaapplication4;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class procedimientos {
    
    public static void EliminarArticulo(int a)throws SQLException
    {
        CallableStatement entrada = conexionsql.getConnection().prepareCall("{call EntradaArticulo(?)}");
        entrada.setInt(1, a);
        entrada.execute();
    }
    
}
