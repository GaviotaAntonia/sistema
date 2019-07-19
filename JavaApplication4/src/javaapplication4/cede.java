package javaapplication4;
import Conexiones.Procedimientos;
import java.awt.HeadlessException;
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
import static javaapplication4.director.res;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class cede extends javax.swing.JFrame {
    
    static ResultSet res;
    int coun;

    public cede() {
        initComponents();
        

        this.cmbestado.removeAllItems();
          try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select estado from estado;");
                while(rs.next())
                {
                    this.cmbestado.addItem(rs.getString("estado"));
                    traeridestado();
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
        this.cmbcolonia.removeAllItems();
          try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select colonia from colonia;");
                while(rs.next())
                {
                    this.cmbcolonia.addItem(rs.getString("colonia"));
                    traeridcolonia();
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
        this.cmbdirector.removeAllItems();
          try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select nombre from director;");
                while(rs.next())
                {
                    this.cmbdirector.addItem(rs.getString("nombre"));
                    traeriddirector();
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
        this.cmbsalon.removeAllItems();
          try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select salon from salon;");
                while(rs.next())
                {
                    this.cmbsalon.addItem(rs.getString("salon"));
                    traeridsalon();
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
         
        this.setTitle("Cede");
        this.setLocale(null);
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage() 
    {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("iconos/zorrito.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuidaPU").createEntityManager();
        cede_1Query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cede_1 c");
        cede_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cede_1Query.getResultList();
        cede_1Query1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT c FROM Cede_1 c");
        cede_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : cede_1Query1.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btngrabar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        cmbestado = new javax.swing.JComboBox<>();
        cmbcolonia = new javax.swing.JComboBox<>();
        cmbdirector = new javax.swing.JComboBox<>();
        cmbsalon = new javax.swing.JComboBox<>();
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
        jLabel1.setText("Cede");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Id_Cede");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Nombre de la cede");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Id_Estado");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Id_colonia");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Calle");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setText("Numero");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setText("Codigo postal");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel9.setText("Correo");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel10.setText("Id_Director:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel11.setText("id_salon");

        btnsalir.setBackground(new java.awt.Color(255, 255, 255));
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salida32.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

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
        btnmodificar.setText("Modificar");
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
        btneliminar.setText(" Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        label1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        label1.setText("nombre del usuario");

        label2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        label2.setText("numero de usuario");

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setEnabled(false);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setEnabled(false);

        jTextField9.setEnabled(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setEnabled(false);

        cmbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbestadoActionPerformed(evt);
            }
        });

        cmbcolonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcoloniaActionPerformed(evt);
            }
        });

        cmbdirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdirectorActionPerformed(evt);
            }
        });

        cmbsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsalonActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, cede_1List1, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCede}"));
        columnBinding.setColumnName("Id Cede");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombreCede}"));
        columnBinding.setColumnName("Nombre Cede");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idColonia}"));
        columnBinding.setColumnName("Id Colonia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numero}"));
        columnBinding.setColumnName("Numero");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoPostal}"));
        columnBinding.setColumnName("Codigo Postal");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${correo}"));
        columnBinding.setColumnName("Correo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idDirector}"));
        columnBinding.setColumnName("Id Director");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idSalon}"));
        columnBinding.setColumnName("Id Salon");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idEstado}"));
        columnBinding.setColumnName("Id Estado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${calle}"));
        columnBinding.setColumnName("Calle");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(139, 139, 139))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(cmbdirector, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnmodificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btngrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1026, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(btnsalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbcolonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbdirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbsalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnnuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmodificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btngrabar)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnbuscar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        grabar();  // TODO add your handling code here:
    }//GEN-LAST:event_menuguardarMouseClicked

    private void menuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuguardarActionPerformed
        grabar();       // TODO add your handling code here:
    }//GEN-LAST:event_menuguardarActionPerformed

    private void menumodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarMouseClicked
              // TODO add your handling code here:
    }//GEN-LAST:event_menumodificarMouseClicked

    private void menumodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumodificarActionPerformed
        modificar();        // TODO add your handling code here:
    }//GEN-LAST:event_menumodificarActionPerformed

    private void menubuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuscarMouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_menubuscarMouseClicked

    private void menubuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuscarActionPerformed
        consultar();     
    }//GEN-LAST:event_menubuscarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();       
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
        modificar();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        menupri ni=new menupri();
        ni.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "META BIEN SUS DATOS", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jTextField1.requestFocus();
        } else {
            try {
                String b;
                Procedimientos.BuscarCede(Integer.parseInt(jTextField1.getText()));
                b = jTextField1.getText();
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
                jTextField1.requestFocus();
                jTextField2.requestFocus();
                jTextField3.requestFocus();
                jTextField4.requestFocus();
                jTextField5.requestFocus();
                jTextField6.requestFocus();
                jTextField7.requestFocus();
                jTextField8.requestFocus();
                jTextField9.requestFocus();
                jTextField10.requestFocus();

                res = conexionsql1.Consulta("select * from cede");
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
                    }
                }
                }catch(SQLException e){
          
                JOptionPane.showMessageDialog(null, "Datos no Encontrados");
            }
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
        if (jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty()|| jTextField4.getText().isEmpty()|| jTextField6.getText().isEmpty()|| jTextField7.getText().isEmpty()|| jTextField8.getText().isEmpty()||
            jTextField9.getText().isEmpty()|| jTextField10.getText().isEmpty()|| jTextField3.getText().isEmpty()|| jTextField5.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"INGRESA TUS DATOS CORRECTOS");      
        }
        else{
            try {
                res=javaapplication4.conexionsql1.Consulta("Select count(nombre_cede)from cede where nombre_cede='"+jTextField2.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(id_colonia)from cede where id_colonia='"+jTextField4.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(numero)from cede where numero='"+jTextField6.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(codigo_postal)from cede where codigo_postal='"+jTextField7.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(correo)from cede where correo='"+jTextField8.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(id_director)from cede where id_director='"+jTextField9.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(id_salon)from cede where id_salon='"+jTextField10.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(id_estado)from cede where id_estado='"+jTextField3.getText()+"'");
                res=javaapplication4.conexionsql1.Consulta("Select count(calle)from cede where calle='"+jTextField5.getText()+"'");

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
                    Conexiones.Procedimientos.EntradaCede(jTextField1.getText(), jTextField2.getText(), jTextField4.getText(), jTextField6.getText(), jTextField7.getText(), jTextField8.getText(), jTextField9.getText()
                                                            , jTextField10.getText(), jTextField3.getText(), jTextField5.getText());
                    JOptionPane.showMessageDialog(this,"exito");
                }
                    } catch (SQLException ex) {
                Logger.getLogger(materia.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        int row = jTable1.getSelectedRow();
        int opc = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar el registro?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(opc == JOptionPane.YES_OPTION){
            try{
                Procedimientos.EliminarCede(Integer.parseInt(jTable1.getValueAt(row, 0).toString()));
                JOptionPane.showMessageDialog(null, "Registro eliminado de la Base de datos", "Registro eliminado exitosamente",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/eliminarbase.png"));
          nuevo();
            }catch (SQLException e){
            }
        }   
    }//GEN-LAST:event_btneliminarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        borrar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cmbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbestadoActionPerformed
        traeridestado();
    }//GEN-LAST:event_cmbestadoActionPerformed

    private void cmbcoloniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcoloniaActionPerformed
        traeridcolonia();
    }//GEN-LAST:event_cmbcoloniaActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void cmbdirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdirectorActionPerformed
        traeriddirector();
    }//GEN-LAST:event_cmbdirectorActionPerformed

    private void cmbsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsalonActionPerformed
       traeridsalon();
    }//GEN-LAST:event_cmbsalonActionPerformed

public void nuevo(){
     jTextField1.setText("");    
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField7.setText("");
        jTextField6.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField1.requestFocusInWindow();}

public void grabar(){
    
try{
    Class.forName("com.mysql.jdbc.Driver");
    String cadena="jdbc:mysql://localhost/dbdistribuida?user=root&password=";
    Connection con =DriverManager.getConnection(cadena);
    PreparedStatement stmt=null;
    String id_cede=jTextField1.getText();
    String nombrecede=jTextField2.getText();
    String id_estado=jTextField3.getText();
    String id_colonia=jTextField4.getText();
    String calle=jTextField5.getText();
    String numero=jTextField6.getText();
    String codigo_postal=jTextField7.getText();
    String correo=jTextField8.getText();
    String id_director=jTextField9.getText();
    String id_salon=jTextField10.getText();
    
    String sql="insert into cede values(";
    sql+=id_cede+","+"\""+nombrecede+"\","+"\""+id_estado+"\",";
    sql+="\""+id_colonia+"\","+"\""+calle+"\",";
    sql+="\""+numero+"\","+"\""+codigo_postal+"\",";
    sql+="\""+correo+"\","+"\""+id_director+"\","+"\""+id_salon+"\")";
    stmt=con.prepareStatement(sql);
    int sw=stmt.executeUpdate();
    if(sw!=0){
                     
           JOptionPane.showMessageDialog(null, "Registro dado de alta", "Registro de alta con exito!",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/listoagrega.png"));
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

public void borrar(){
    try{ 
          Class.forName("com.mysql.jdbc.Driver");
      String cadena = "jdbc:mysql://localhost/dbdistribuida?user=root&password=";
      Connection con; PreparedStatement stmt;
             con = DriverManager.getConnection (cadena);
     String sql= " delete from cede where id_cede=";
      sql += "\"" + jTextField1.getText() + "\"" + "\"" + jTextField2.getText() + "\"" + "\"" + jTextField3.getText() + "\"" + "\"" + jTextField4.getText() + "\"" + "\"" + jTextField5.getText() + "\"" + "\"" + jTextField6.getText() + "\"" + "\"" + jTextField7.getText() + "\"" + "\"" + jTextField8.getText() + "\"" + "\"" + jTextField9.getText() + "\"" + "\"" + jTextField10.getText() + "\";"; 
      JOptionPane.showMessageDialog (null, sql);
      stmt = con.prepareStatement(sql);
      int sw = stmt.executeUpdate();
      if (sw!=0) {
          
           JOptionPane.showMessageDialog(null, "Registro eliminado de la Base de datos", "Registro eliminado exitosamente",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/eliminarbase.png"));
          nuevo();
      }
     }
    catch(ClassNotFoundException e)
    {  
        JOptionPane.showMessageDialog (null, e);
    }
    catch (SQLException e1)
    { 
        JOptionPane.showMessageDialog (null, e1); 
    }
      catch (Exception e2)
      {
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
         String  id_cede=jTextField1.getText();
         String sql=" select * from cede " 
              + "where id_cede = " + id_cede+";";
      
           stmt=con.prepareStatement(sql);
          //System.out.println(sql);
           
           tabla=stmt.executeQuery();
           
           while (tabla.next()) // 
           {
               
               sw=1;
               jTextField2.setText(tabla.getString(2));
               jTextField3.setText(tabla.getString(3));
               jTextField4.setText(tabla.getString(4));
               jTextField5.setText(tabla.getString(5));
               jTextField7.setText(tabla.getString(6));
               jTextField6.setText(tabla.getString(7));
               jTextField8.setText(tabla.getString(8));
               jTextField9.setText(tabla.getString(9));
               jTextField10.setText(tabla.getString(10));
               
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

public void modificar(){

      try{ 
          Class.forName("com.mysql.jdbc.Driver");
      String cadena = "jdbc:mysql://localhost/dbdistribuida?user=root&password=";
      Connection con; PreparedStatement stmt;       
      con = DriverManager.getConnection (cadena);   
      String id_cede = jTextField1.getText();
      String nombrecede= jTextField2.getText();
      String id_estado = jTextField3.getText();
      String id_colonia = jTextField4.getText();
      String calle= jTextField5.getText();
      String numero=jTextField6.getText();
      String codigo_postal=jTextField7.getText();
      String correo=jTextField8.getText();
      String id_director=jTextField9.getText();
      String id_salon=jTextField10.getText();
      String sql= " update cede set "; 
      sql += "nombrecede= "+  "\""+nombrecede+ "\",";
      sql += "id_estado= "+  "\""+id_estado+ "\",";
      sql += "id_colonia= "+  "\""+id_colonia+ "\",";
      sql += "calle= "+  "\""+calle+ "\",";
      sql += "numero= "+  "\""+numero+ "\",";
      sql += "codigo_postal= "+  "\""+codigo_postal+ "\",";
      sql += "correo= "+  "\""+correo+ "\",";
      sql += "id_director= "+  "\""+id_director+ "\",";
      sql += "id_salon= " +"\""+ id_salon + "\"" + " where id_cede=" + id_cede+ " ; ";
           
    
      //JOptionPane.showMessageDialog (null, sql);
      stmt = con.prepareStatement(sql);
      int sw = stmt.executeUpdate();
      if (sw!=0) { 
           JOptionPane.showMessageDialog(null, "Registro Actualizado", "El Registro fue actualizado",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/dataact.png"));
      }
     }
      catch(ClassNotFoundException | SQLException | HeadlessException e){
          JOptionPane.showMessageDialog (null, e); 
      }
}
    
    public void traeridestado()
    {
        try 
        {
            Connection con=null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
            Statement s1t=con.createStatement();
            ResultSet rs=s1t.executeQuery("select * from estado where estado='"+this.cmbestado.getSelectedItem()+"'" );
            rs.next();
            //System.out.println(rs);
            this.jTextField3.setText(String.valueOf(rs.getInt("id_estado")));
        }catch (Exception e) 
        {
        } 
    }
    
    public void traeridcolonia()
    {
        try 
        {
            Connection con=null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
            Statement s1t=con.createStatement();
            ResultSet rs=s1t.executeQuery("select * from colonia where colonia='"+this.cmbcolonia.getSelectedItem()+"'" );
            rs.next();
            //System.out.println(rs);
            this.jTextField4.setText(String.valueOf(rs.getInt("id_colonia")));
        }catch (Exception e) 
        {
        } 
    }

    public void traeriddirector()
    {
        try 
        {
            Connection con=null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
            Statement s1t=con.createStatement();
            ResultSet rs=s1t.executeQuery("select * from director where nombre='"+this.cmbdirector.getSelectedItem()+"'" );
            rs.next();
            //System.out.println(rs);
            this.jTextField9.setText(String.valueOf(rs.getInt("id_director")));
        }catch (Exception e) 
        {
        } 
    }

    public void traeridsalon()
    {
        try 
        {
            Connection con=null;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
            Statement s1t=con.createStatement();
            ResultSet rs=s1t.executeQuery("select * from salon where salon='"+this.cmbsalon.getSelectedItem()+"'" );
            rs.next();
            //System.out.println(rs);
            this.jTextField10.setText(String.valueOf(rs.getInt("id_salon")));
        }catch (Exception e) 
        {
        } 
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cede().setVisible(true);
            }
        });
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private java.util.List<javaapplication4.Cede_1> cede_1List;
    private java.util.List<javaapplication4.Cede_1> cede_1List1;
    private javax.persistence.Query cede_1Query;
    private javax.persistence.Query cede_1Query1;
    private javax.swing.JComboBox<String> cmbcolonia;
    private javax.swing.JComboBox<String> cmbdirector;
    private javax.swing.JComboBox<String> cmbestado;
    private javax.swing.JComboBox<String> cmbsalon;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
