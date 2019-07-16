package javaapplication4;
import Conexiones.Procedimientos;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication4.formahorarioclase.res;
import static javaapplication4.materia.res;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public final class alumno extends javax.swing.JFrame {
    static ResultSet res;
    int coun;

    public alumno() {
        initComponents();  
        cargarcol();
        cargarsex();
        cargarsta();
        cargarcer();
        cargardet();
        cargarcede();
        this.setTitle("Alumno");
        this.setLocale(null);
        this.setLocationRelativeTo(null);
          
    }
   @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("iconos/zorrito.png"));
        return retValue;
    }
    
    
     public void cargarcede(){
           try
            {
                Connection con=null; 
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select nombre_cede from cede;");
                cmdcede.removeAllItems();
                while(rs.next())
                {
                    cmdcede.addItem(rs.getString(1));
                    traeridcedee();
                }
                rs.close();
                con.close();
            }catch (ClassNotFoundException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            public void traeridcedee(){
            try {
         Connection con=null;
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from cede where nombre_cede='"+this.cmdcede.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField19.setText(String.valueOf(rs.getInt("id_cede")));
     } catch (Exception e) {
     } 
       }
     
     
     public void cargardet(){
           try
            {
                Connection con=null;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select id_detalle from detalle_horario;");
                cmbdeta.removeAllItems();
                while(rs.next())
                {
                    cmbdeta.addItem(rs.getString(1));
                    traeriddet();
                }
                rs.close();
                con.close();
            }catch (ClassNotFoundException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            public void traeriddet(){
            try {
         Connection con=null;
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from detalle_horario where id_detalle='"+this.cmbdeta.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField18.setText(String.valueOf(rs.getInt("id_detalle")));
     } catch (Exception e) {
     } 
       }
     
     
     public void cargarcer(){
           try
            {
                Connection con=null;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select certificado from tipo_certificado;");
                cmbcert.removeAllItems();
                while(rs.next())
                {
                    cmbcert.addItem(rs.getString(1));
                    traeridcet();
                }
                rs.close();
                con.close();
            }catch (ClassNotFoundException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            public void traeridcet(){
            try {
         Connection con=null;
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from tipo_certificado where certificado='"+this.cmbcert.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField17.setText(String.valueOf(rs.getInt("id_certificado")));
     } catch (Exception e) {
     } 
       }
     
     
     public void cargarsta(){
           try
            {
                Connection con=null;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select status from status;");
                cmbsta.removeAllItems();
                while(rs.next())
                {
                    cmbsta.addItem(rs.getString(1));
                    traeridsta();
                }
                rs.close();
                con.close();
            }catch (ClassNotFoundException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            public void traeridsta(){
            try {
         Connection con=null; Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from status where status='"+this.cmbsta.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField15.setText(String.valueOf(rs.getInt("id_status")));
     } catch (Exception e) {
     } 
       }
     
     public void cargarsex(){
           try
            {
                Connection con=null; 
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select sexo from sexo;");
                cmbsex.removeAllItems();
                while(rs.next())
                {
                    cmbsex.addItem(rs.getString(1));
                    traeridsex();
                }
                rs.close();
                con.close();
            }catch (ClassNotFoundException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            public void traeridsex(){
            try {
         Connection con=null;
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from sexo where sexo='"+this.cmbsex.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField10.setText(String.valueOf(rs.getInt("id_sexo")));
     } catch (Exception e) {
     } 
       }
            
            
     public void cargarcol(){
           try
            {
                Connection con=null;
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select colonia from colonia;");
                cmbcolonia.removeAllItems();
                while(rs.next())
                {
                    cmbcolonia.addItem(rs.getString(1));
                    traeridcol();
                }
                rs.close();
                con.close();
            }catch (ClassNotFoundException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }catch (SQLException ex)
            {
                Logger.getLogger(prueba_combo.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
            public void traeridcol(){
            try {
         Connection con=null;
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from colonia where colonia='"+this.cmbcolonia.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField5.setText(String.valueOf(rs.getInt("id_colonia")));
                this.jTextField8.setText(String.valueOf(rs.getInt("codigo_postal")));
     } catch (Exception e) {
     } 
       }
     
     
   public void nuevo(){
     jTextField1.setText("");    
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");    
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");    
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");    
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField17.setText("");    
        jTextField18.setText("");
        jTextField19.setText("");
       
        jTextField1.requestFocusInWindow();}
   public void grabar(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    String cadena="jdbc:mysql://localhost/dbdistribuida?user=root&password=";
    Connection con =DriverManager.getConnection(cadena);
    PreparedStatement stmt=null;
    String matricula=jTextField1.getText();
    String nombre=jTextField2.getText();
    String apellidopat=jTextField3.getText();
    String apellidomat=jTextField4.getText();
    String id_colonia=jTextField5.getText();
    String calle=jTextField6.getText();
    String numero=jTextField7.getText();
    String codigopostal=jTextField8.getText();
    String correoelectronico=jTextField9.getText();
    String id_sexo=jTextField10.getText();
    String edad=jTextField11.getText();
    String curp=jTextField12.getText();
    String foto_archivo=jTextField13.getText();
    String boleta=jTextField14.getText();
    String id_status=jTextField15.getText();
    String id_certificacion=jTextField17.getText();
    String id_detalle=jTextField18.getText();
    String id_cede=jTextField19.getText();
    
    
    String sql="insert into alumno values(";
    sql+=matricula+","+"\""+nombre+"\",";
    sql+="\""+apellidopat+"\","+"\""+apellidomat+"\",";
    sql+=id_colonia+","+"\""+calle+"\",";
    sql+=numero+","+"\""+codigopostal+"\",";
    sql+="\""+correoelectronico+"\","+"\""+id_sexo+"\",";
    sql+=edad+","+"\""+curp+"\",";
    sql+=foto_archivo+","+"\""+boleta+"\",";
    sql+=id_certificacion+",";
    sql+=id_detalle+","+"\""+id_cede+"\")";
    stmt=con.prepareStatement(sql);
    int sw=stmt.executeUpdate();
    if(sw!=0){ 
                    
           JOptionPane.showMessageDialog(null, "Registro dado de alta", "Registro de alta con exito!",JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/listoagrega.png"));
    nuevo();
    }
}
catch(ClassNotFoundException e){
    JOptionPane.showMessageDialog(null, e);
}
catch(SQLException e1){
    JOptionPane.showMessageDialog(null, e1);
}
catch(Exception e2){
    JOptionPane.showMessageDialog(null, e2);
}
         }
   public void modificar(){

      try{ 
          Class.forName("com.mysql.jdbc.Driver");
      String cadena = "jdbc:mysql://localhost/dbdistribuida?user=root&password=";
      Connection con; PreparedStatement stmt;  
             con = DriverManager.getConnection (cadena);
      String matricula=jTextField1.getText();
    String nombre=jTextField2.getText();
    String apellidopat=jTextField3.getText();
    String apellidomat=jTextField4.getText();
    String id_colonia=jTextField5.getText();
    String calle=jTextField6.getText();
    String numero=jTextField7.getText();
    String codigopostal=jTextField8.getText();
    String correoelectronico=jTextField9.getText();
    String id_sexo=jTextField10.getText();
    String edad=jTextField11.getText();
    String curp=jTextField12.getText();
    String foto_archivo=jTextField13.getText();
    String boleta=jTextField14.getText();
    String id_status=jTextField15.getText();
    String id_certificacion=jTextField17.getText();
    String id_detalle=jTextField18.getText();
    String id_cede=jTextField19.getText();
 
      String sql= " update alumno set ";   
      sql += "nombre= "+  "\""+nombre+ "\",";
      sql += "apellidopat= "+  "\""+apellidopat+ "\",";
      sql += "apellidomat= "+  "\""+apellidomat+ "\",";
      sql += "id_colonia= "+  "\""+id_colonia+ "\",";
      sql += "calle= "+  "\""+calle+ "\",";
      sql += "numero= "+  "\""+numero+ "\",";
      sql += "codigopostal= "+  "\""+codigopostal+ "\",";
      sql += "correoelectronico= "+  "\""+correoelectronico+ "\",";
      sql += "id_sexo= "+  "\""+id_sexo+ "\",";
      sql += "edad= "+  "\""+edad+ "\",";
      sql += "curp= "+  "\""+curp+ "\",";
      sql += "foto_archivo= "+  "\""+foto_archivo+ "\",";
      sql += "boleta= "+  "\""+boleta+ "\",";
      sql += "id_status= "+  "\""+id_status+ "\",";
      sql += "id_certificacion= "+  "\""+id_certificacion+ "\",";
      sql += "id_detalle= "+  "\""+id_detalle+ "\",";
      sql += "id_cede= " +"\""+ id_cede + "\"" + " where matricula=" + matricula+ " ; ";
           
    
      JOptionPane.showMessageDialog (null, sql);
      stmt = con.prepareStatement(sql);
      int sw = stmt.executeUpdate();
      if (sw!=0) { 
          JOptionPane.showMessageDialog(null, "Registro Actualizado", "El Registro fue actualizado",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/dataact.png"));
      }
     }
      catch(ClassNotFoundException e){
          JOptionPane.showMessageDialog (null, e); 
      }
    catch (SQLException e1) {
        JOptionPane.showMessageDialog (null, e1);
    }
      catch (Exception e2) {
          JOptionPane.showMessageDialog (null, e2);
      }
}
    public void consultar(){
        int sw=0;
        try{
         Class.forName("com.mysql.jdbc.Driver");
         String cadena="jdbc:mysql://localhost/dbdistribuida?user=root&password=";
         Connection con;//conecta los datos a la base de datos.
         java.sql.PreparedStatement stmt;//traduce las cadenas para mandarlas a la base de datos
         ResultSet tabla;
         con= DriverManager.getConnection(cadena);
         String matricula=jTextField1.getText();
        String sql=" select * from alumno " 
              + "where matricula = " + matricula+";";
         stmt=con.prepareStatement(sql);
          // System.out.println(sql);
           tabla=stmt.executeQuery();
           while (tabla.next()) // 
           {
               sw=1;   
               jTextField2.setText(tabla.getString(2));     
               jTextField3.setText(tabla.getString(3));
               jTextField4.setText(tabla.getString(4));            
               jTextField5.setText(tabla.getString(5));
               jTextField6.setText(tabla.getString(6));
               jTextField7.setText(tabla.getString(7));     
               jTextField8.setText(tabla.getString(8));
               jTextField9.setText(tabla.getString(9));            
               jTextField10.setText(tabla.getString(10));
               jTextField11.setText(tabla.getString(11));
               jTextField12.setText(tabla.getString(12));     
               jTextField13.setText(tabla.getString(13));
               jTextField14.setText(tabla.getString(14));            
               jTextField15.setText(tabla.getString(15));
               jTextField17.setText(tabla.getString(17));     
               jTextField18.setText(tabla.getString(18));
               jTextField19.setText(tabla.getString(19));  
           } 
           }catch(ClassNotFoundException e){
           JOptionPane.showMessageDialog(null, e);
           }
           catch(SQLException e1){
           JOptionPane.showMessageDialog(null, e1);
           }
          catch(Exception e2){
          JOptionPane.showMessageDialog(null, e2);
          }
        if (sw==0) { 
            JOptionPane.showMessageDialog(null, "No existe registro", "El Registro no se encontro",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/registronoencontrado.png"));

        }



}
    public void borrar(){
        try{ 
          Class.forName("com.mysql.jdbc.Driver");
          String cadena = "jdbc:mysql://localhost/dbdistribuida?user=root&password=";
          Connection con; PreparedStatement stmt;
          con = DriverManager.getConnection (cadena);
          String sql= " delete from alumno where matricula=";
          sql += "\"" + jTextField1.getText() + "\";"; 
          JOptionPane.showMessageDialog (null, sql);
          stmt = con.prepareStatement(sql);
          int sw = stmt.executeUpdate();
          if (sw!=0) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado de la Base de datos", "Registro eliminado exitosamente",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/eliminarbase.png"));
              nuevo();
          }
        }catch(ClassNotFoundException e){ 
            JOptionPane.showMessageDialog (null, e); }
        catch (SQLException e1) { 
            JOptionPane.showMessageDialog (null, e1); }
        catch (Exception e2) { 
          JOptionPane.showMessageDialog (null, e2);}
    }
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuidaPU").createEntityManager();
        alumno_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Alumno_1 a");
        alumno_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : alumno_1Query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        btncerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbcolonia = new javax.swing.JComboBox<>();
        cmbsex = new javax.swing.JComboBox<>();
        cmbsta = new javax.swing.JComboBox<>();
        cmbcert = new javax.swing.JComboBox<>();
        cmbdeta = new javax.swing.JComboBox<>();
        cmdcede = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menunuevo = new javax.swing.JMenuItem();
        menuguardar = new javax.swing.JMenuItem();
        menumodificar = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menubuscar = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuayuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1800, 720));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("matricula:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        btnnuevo.setText(" Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btngrabar.setBackground(new java.awt.Color(255, 255, 255));
        btngrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btngrabar.setText(" Agregar");
        btngrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrabarActionPerformed(evt);
            }
        });

        btnmodificar.setBackground(new java.awt.Color(255, 255, 255));
        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnmodificar.setText(" Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnbuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnbuscar.setText(" Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        btneliminar.setBackground(new java.awt.Color(255, 255, 255));
        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        label1.setText("nombre del usuario");

        label2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        label2.setText("numero de usuario");

        btncerrar.setBackground(new java.awt.Color(255, 255, 255));
        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salida32.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("nombre(s):");

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Apellido paterno");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Apellido materno");

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel7.setText("id_colonia");

        jTextField5.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("calle");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("numero");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("codigo postal");

        jTextField8.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setText("correo electronico:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setText("Genero");

        jTextField10.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel13.setText("edad");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel15.setText("CURP");

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel16.setText("foto archivo:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel17.setText("Boleta");

        jTextField15.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel18.setText("id_status");

        jTextField17.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setText("Tipo de Certificado");

        jTextField18.setEnabled(false);

        jTextField19.setEnabled(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel23.setText("id_detalle");

        jLabel24.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel24.setText("Cede:");

        cmbcolonia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbcoloniaMouseClicked(evt);
            }
        });
        cmbcolonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcoloniaActionPerformed(evt);
            }
        });

        cmbsex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsexActionPerformed(evt);
            }
        });

        cmbsta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbstaActionPerformed(evt);
            }
        });

        cmbcert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcertActionPerformed(evt);
            }
        });

        cmbdeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdetaActionPerformed(evt);
            }
        });

        cmdcede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcedeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel14.setText("Informacion Escolar");

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel19.setText("Direccion del Alumno");

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, alumno_1List, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${matricula}"));
        columnBinding.setColumnName("Matricula");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellidopat}"));
        columnBinding.setColumnName("Apellidopat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellidomat}"));
        columnBinding.setColumnName("Apellidomat");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idColonia}"));
        columnBinding.setColumnName("Id Colonia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${calle}"));
        columnBinding.setColumnName("Calle");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numero}"));
        columnBinding.setColumnName("Numero");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigopostal}"));
        columnBinding.setColumnName("Codigopostal");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${correo}"));
        columnBinding.setColumnName("Correo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idSexo}"));
        columnBinding.setColumnName("Id Sexo");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${edad}"));
        columnBinding.setColumnName("Edad");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${curp}"));
        columnBinding.setColumnName("Curp");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fotoarchivo}"));
        columnBinding.setColumnName("Fotoarchivo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${boleta}"));
        columnBinding.setColumnName("Boleta");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idStatus}"));
        columnBinding.setColumnName("Id Status");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCertificado}"));
        columnBinding.setColumnName("Id Certificado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCede}"));
        columnBinding.setColumnName("Id Cede");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(597, 597, 597))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(118, 118, 118)
                                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(131, 131, 131)
                                        .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(120, 120, 120)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(202, 202, 202)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbsta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, 70)
                                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(179, 179, 179)
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel1)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbcert, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbdeta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdcede, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(cmbsex, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(110, 110, 110)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1298, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btncerrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cmbsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel19)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(cmbcert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cmdcede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar)
                    .addComponent(btngrabar)
                    .addComponent(btnbuscar))
                .addContainerGap())
        );

        jMenu1.setText("Acciones");

        menunuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        menunuevo.setText("Nuevo");
        menunuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menunuevoActionPerformed(evt);
            }
        });
        jMenu1.add(menunuevo);

        menuguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        menuguardar.setText("Agregar");
        menuguardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuguardarMouseClicked(evt);
            }
        });
        menuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuguardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuguardar);

        menumodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        menumodificar.setText("Modificar");
        menumodificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menumodificarMouseClicked(evt);
            }
        });
        menumodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumodificarActionPerformed(evt);
            }
        });
        jMenu1.add(menumodificar);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jMenuItem1.setText("Eliminar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        menubuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        menubuscar.setText("Buscar");
        menubuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menubuscarMouseClicked(evt);
            }
        });
        menubuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubuscarActionPerformed(evt);
            }
        });
        jMenu1.add(menubuscar);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Ayuda");

        menuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        menuayuda.setText("Ayuda");
        jMenu6.add(menuayuda);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1427, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menunuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunuevoActionPerformed
        nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_menunuevoActionPerformed

    private void menuguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuguardarMouseClicked
        alumno nuevo=new alumno();
        nuevo.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_menuguardarMouseClicked

    private void menuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuguardarActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_menuguardarActionPerformed

    private void menumodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarMouseClicked
           // TODO add your handling code here:
    }//GEN-LAST:event_menumodificarMouseClicked

    private void menumodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumodificarActionPerformed
modificar();            // TODO add your handling code here:
    }//GEN-LAST:event_menumodificarActionPerformed

    private void menubuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuscarMouseClicked
   // TODO add your handling code here:
    }//GEN-LAST:event_menubuscarMouseClicked

    private void menubuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuscarActionPerformed
     consultar();// TODO add your handling code here:
    }//GEN-LAST:event_menubuscarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       borrar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cmdcedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcedeActionPerformed
        traeridcedee();        // TODO add your handling code here:
    }//GEN-LAST:event_cmdcedeActionPerformed

    private void cmbdetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdetaActionPerformed
        traeriddet();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdetaActionPerformed

    private void cmbcertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcertActionPerformed
        traeridcet();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcertActionPerformed

    private void cmbstaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbstaActionPerformed
        traeridsta();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbstaActionPerformed

    private void cmbsexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsexActionPerformed
        traeridsex();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsexActionPerformed

    private void cmbcoloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcoloniaActionPerformed
        traeridcol();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcoloniaActionPerformed

    private void cmbcoloniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbcoloniaMouseClicked

    }//GEN-LAST:event_cmbcoloniaMouseClicked

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        menupri ni=new menupri();
        ni.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        borrar();        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "META BIEN SUS DATOS", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jTextField1.requestFocus();
        } else {
            try {
                String b;
                Procedimientos.buscamateria(Integer.parseInt(jTextField1.getText()));
                b = jTextField1.getText();
                res = conexionsql1.Consulta("select * from alumno");
                while(res.next()){
                    if(res.getString(1).equals(b)){
                        JOptionPane.showMessageDialog(null, "Datos Encontrados");
                        jTextField1.setText(res.getString(1));
                        jTextField2.setText(res.getString(2));
                        jTextField3.setText(res.getString(3));
                        jTextField4.setText(res.getString(4));
                        jTextField5.setText(res.getString(5));
                        jTextField6.setText(res.getString(6));
                        jTextField7.setText(res.getString(7));
                        jTextField8.setText(res.getString(8));
                        jTextField9.setText(res.getString(9));
                        jTextField10.setText(res.getString(10));
                        jTextField11.setText(res.getString(11));
                        jTextField12.setText(res.getString(12));
                        jTextField13.setText(res.getString(13));
                        jTextField14.setText(res.getString(14));
                        jTextField15.setText(res.getString(15));
                        jTextField17.setText(res.getString(17));
                        jTextField18.setText(res.getString(18));
                        jTextField19.setText(res.getString(19));

                    }
                }
            }catch(SQLException e){

                JOptionPane.showMessageDialog(null, "Datos no Encontrados");
            }
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificar();        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        if (jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"INGRESA TUS DATOS CORRECTOS");
        }
        else{
            res=javaapplication4.conexionsql1.Consulta("Select count(nombre)from alumno where matricula='"+jTextField1.getText()+"'");
            try {
                while (res.next()) {
                    coun=res.getInt(1);

                }
            } catch (SQLException e) {
            }
            if (coun>=1) {
                JOptionPane.showMessageDialog(this,"este elemento ya existe");
            }
            else{
                try {
                    Conexiones.Procedimientos.GrabarAlumno(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),jTextField5.getText(),jTextField6.getText(),jTextField7.getText(),jTextField8.getText(),jTextField9.getText(),jTextField10.getText(),jTextField11.getText(),jTextField12.getText(),jTextField13.getText(),jTextField14.getText(),jTextField15.getText(),jTextField17.getText(),jTextField18.getText(),jTextField19.getText());
                } catch (SQLException ex) {
                    Logger.getLogger(alumno.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this,"exito");
            }
        }       // TODO add your handling code here:
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo(); // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<javaapplication4.Alumno_1> alumno_1List;
    private javax.persistence.Query alumno_1Query;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncerrar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbcert;
    private javax.swing.JComboBox<String> cmbcolonia;
    private javax.swing.JComboBox<String> cmbdeta;
    private javax.swing.JComboBox<String> cmbsex;
    private javax.swing.JComboBox<String> cmbsta;
    private javax.swing.JComboBox<String> cmdcede;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JMenuItem menuayuda;
    private javax.swing.JMenuItem menubuscar;
    private javax.swing.JMenuItem menuguardar;
    private javax.swing.JMenuItem menumodificar;
    private javax.swing.JMenuItem menunuevo;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables


}
