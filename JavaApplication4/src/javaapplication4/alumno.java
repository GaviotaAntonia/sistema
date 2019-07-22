package javaapplication4;
import Conexiones.Procedimientos;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.ImageIcon;

public class alumno extends javax.swing.JFrame {
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
                this.txtcede.setText(String.valueOf(rs.getInt("id_cede")));
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
                this.txtdeta.setText(String.valueOf(rs.getInt("id_detalle")));
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
                this.txtcerti.setText(String.valueOf(rs.getInt("id_certificado")));
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
                this.txtstatus.setText(String.valueOf(rs.getInt("id_status")));
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
                this.txtsexo.setText(String.valueOf(rs.getInt("id_sexo")));
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
                this.txtcolonia.setText(String.valueOf(rs.getInt("id_colonia")));
                this.txtcodigpostal.setText(String.valueOf(rs.getInt("codigo_postal")));
     } catch (Exception e) {
     } 
       }
     
     
   public void nuevo(){
     txtmatricula.setText("");    
        txtnombre.setText("");
        txtapepat.setText("");
        txtapemat.setText("");
        txtcolonia.setText("");    
        txtcalle.setText("");
        txtnumero.setText("");
        txtcodigpostal.setText("");
        txtcorreo.setText("");    
        txtsexo.setText("");
        txtcurp.setText("");
        txtedad.setText("");
        txtfoto.setText("");    
        txtboleta.setText("");
        txtstatus.setText("");
        txtcerti.setText("");    
        txtdeta.setText("");
        txtcede.setText("");
       
        txtmatricula.requestFocusInWindow();}
  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuidaPU").createEntityManager();
        alumno_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT a FROM Alumno_1 a");
        alumno_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : alumno_1Query.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmatricula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnnuevo = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        btncerrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtapepat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtapemat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtcolonia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcalle = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtnumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcodigpostal = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtsexo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtcurp = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfoto = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtboleta = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtcerti = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtdeta = new javax.swing.JTextField();
        txtcede = new javax.swing.JTextField();
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

        txtcolonia.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("calle");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel9.setText("numero");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel10.setText("codigo postal");

        txtcodigpostal.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setText("correo electronico:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel12.setText("Genero");

        txtsexo.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel13.setText("edad");

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel15.setText("CURP");

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel16.setText("foto archivo:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel17.setText("Boleta");

        txtstatus.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel18.setText("id_status");

        txtcerti.setEnabled(false);

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setText("Tipo de Certificado");

        txtdeta.setEnabled(false);

        txtcede.setEnabled(false);

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
                                        .addGap(145, 145, 145)
                                        .addComponent(btnmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(120, 120, 120)
                                        .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(202, 202, 202)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbsta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcodigpostal, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(70, 70, 70)
                                                .addComponent(txtcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                                                .addComponent(txtapepat, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(txtapemat, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcerti, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbcert, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtdeta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbdeta, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcede, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmdcede, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(cmbsex, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cmbcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(txtmatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtapepat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtapemat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cmbsex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtcurp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel19)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtcalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtcodigpostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(txtboleta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcerti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(cmbcert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(cmdcede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcede, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
          // TODO add your handling code here:
    }//GEN-LAST:event_menumodificarActionPerformed

    private void menubuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuscarMouseClicked
   // TODO add your handling code here:
    }//GEN-LAST:event_menubuscarMouseClicked

    private void menubuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuscarActionPerformed
    // TODO add your handling code here:
    }//GEN-LAST:event_menubuscarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
   
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
   int row = jTable1.getSelectedRow();
        int opc = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar el registro?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(opc == JOptionPane.YES_OPTION){
       try {
           Procedimientos.eliminaalumno(Integer.parseInt(jTable1.getValueAt(row, 0).toString()));
           JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Registro eliminado de la Base de datos", "Registro eliminado exitosamente",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/eliminarbase.png"));
          nuevo();
       }
        }                // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(txtmatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "META BIEN SUS DATOS", "Error", JOptionPane.ERROR_MESSAGE);
            txtmatricula.setText("");
            txtmatricula.requestFocus();
        } else {
            try 
            {
                String b;
                Procedimientos.buscamateria(Integer.parseInt(txtmatricula.getText()));
                b = txtmatricula.getText();
                res = conexionsql1.Consulta("select * from alumno");
                while(res.next()){
                    if(res.getString(1).equals(b)){
                        JOptionPane.showMessageDialog(null, "Datos Encontrados");
                        txtmatricula.setText(res.getString(1));
                        txtnombre.setText(res.getString(2));
                        txtapepat.setText(res.getString(3));
                        txtapemat.setText(res.getString(4));
                        txtcolonia.setText(res.getString(5));
                        txtcalle.setText(res.getString(6));
                        txtnumero.setText(res.getString(7));
                        txtcodigpostal.setText(res.getString(8));
                        txtcorreo.setText(res.getString(9));
                        txtsexo.setText(res.getString(10));
                         txtedad.setText(res.getString(11));
                        txtcurp.setText(res.getString(12));
                        txtfoto.setText(res.getString(13));
                        txtboleta.setText(res.getString(14));
                        txtstatus.setText(res.getString(15));
                        txtcerti.setText(res.getString(17));
                        txtdeta.setText(res.getString(18));
                        txtcede.setText(res.getString(19));

                    }
                }
           }catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null, "Datos no Encontrados");
            }
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
       try{
            PreparedStatement pps = conexionsql1.getConexion().prepareStatement("update alumno set nombre='" + txtnombre.getText()+"' apellidopat='"+txtapepat.getText()+"' where matricula='" + txtmatricula.getText() + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los datos se modificaron exitosamente");
             
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no esta ingresando");
        }      // TODO add your handling code here:
              try{
            PreparedStatement pps = conexionsql1.getConexion().prepareStatement("update alumno set nombre='" + txtnombre.getText() +
                    "',  apellidopat='" + txtapepat.getText() +
                    "', apellidomat='" + txtapemat.getText()+
                    "', id_colonia='" + txtcolonia.getText() + 
                    "',  calle='" + txtcalle.getText() +
                    "',  numero='" + txtnumero.getText() +
                    "', codigopostal='" + txtcodigpostal.getText()+
                    "', correo='" + txtcorreo.getText() + 
                    "',  id_sexo='" + txtsexo.getText() +
                    "',  edad='" + txtedad.getText() + 
                    "',  curp='" + txtcurp.getText() +
                    "',  fotoarchivo='" + txtfoto.getText() +
                    "',  boleta='" + txtboleta.getText() +
                    "',  id_status='" + txtstatus.getText() + 
                    "',  id_certificado='" + txtcerti.getText() +
                    "',  id_cede='" + txtcede.getText() +
                    "' where matricula='" + txtmatricula.getText() + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los datos se modificaron exitosamente");
               nuevo();
            }catch(SQLException e){
                System.out.println(e);
        }    // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        if (txtmatricula.getText().isEmpty()|| txtnombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"INGRESA TUS DATOS CORRECTOS");
        }
        else{
            res=javaapplication4.conexionsql1.Consulta("Select count(matricula)from alumno where matricula='"+txtmatricula.getText()+"'");
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
                    Conexiones.Procedimientos.GrabarAlumno(txtmatricula.getText(), txtnombre.getText(),txtapepat.getText(),txtapemat.getText(),txtcolonia.getText(),txtcalle.getText(),txtnumero.getText(), txtcodigpostal.getText() ,txtcorreo.getText(),txtsexo.getText(),txtedad.getText(),txtcurp.getText(),txtfoto.getText(), txtboleta.getText(),txtstatus.getText(),txtcerti.getText(), txtcede.getText());
                    JOptionPane.showMessageDialog(this,"exito");
                } catch (SQLException ex) {
                    Logger.getLogger(alumno.class.getName()).log(Level.SEVERE, null, ex);
                }
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
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JMenuItem menuayuda;
    private javax.swing.JMenuItem menubuscar;
    private javax.swing.JMenuItem menuguardar;
    private javax.swing.JMenuItem menumodificar;
    private javax.swing.JMenuItem menunuevo;
    private javax.swing.JTextField txtapemat;
    private javax.swing.JTextField txtapepat;
    private javax.swing.JTextField txtboleta;
    private javax.swing.JTextField txtcalle;
    private javax.swing.JTextField txtcede;
    private javax.swing.JTextField txtcerti;
    private javax.swing.JTextField txtcodigpostal;
    private javax.swing.JTextField txtcolonia;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcurp;
    private javax.swing.JTextField txtdeta;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtfoto;
    private javax.swing.JTextField txtmatricula;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txtstatus;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables


}
