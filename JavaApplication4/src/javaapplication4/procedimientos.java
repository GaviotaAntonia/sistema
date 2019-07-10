package javaapplication4;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class procedimientos {
    
    public static void sexo(String a, String b)throws SQLException
    {
        CallableStatement entrada = conexionsql.getConnection().prepareCall("(call sexo(?,?))");
        entrada.setString(1, a);
        entrada.setString(2, b);
        entrada.execute();
    }
    
}
