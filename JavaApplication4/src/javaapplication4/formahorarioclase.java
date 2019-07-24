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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formahorarioclase extends javax.swing.JFrame {
      static ResultSet res;
    int coun;

    public formahorarioclase() {
        initComponents();
        cargardia();
        cargamat();
        cargadoc();
        this.setTitle("Horario Clase");
        this.setLocale(null);
        this.setLocationRelativeTo(null);
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("iconos/zorrito.png"));


        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuidaPU").createEntityManager();
        horarioQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT h FROM Horario h");
        horarioList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : horarioQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        cmbdia = new javax.swing.JComboBox<>();
        cmbmateria = new javax.swing.JComboBox<>();
        btnnuevo = new javax.swing.JButton();
        btnagregar = new javax.swing.JButton();
        btnmodificar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        cmbdoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel1.setText("Nombre de Usuario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salida32.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 2, 14)); // NOI18N
        jLabel2.setText("Numero de usuario");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("Horario de clases");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Id Horario");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Id Día");

        jTextField2.setEnabled(false);
        jTextField2.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Id Materia");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel7.setText("Hora");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel8.setText("Id Docente");

        jTextField3.setEnabled(false);

        jTextField5.setEnabled(false);

        cmbdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdiaActionPerformed(evt);
            }
        });

        cmbmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmateriaActionPerformed(evt);
            }
        });

        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        cmbdoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdocActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, horarioList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idHorario}"));
        columnBinding.setColumnName("Id Horario");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idDia}"));
        columnBinding.setColumnName("Id Dia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMateria}"));
        columnBinding.setColumnName("Id Materia");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${hora}"));
        columnBinding.setColumnName("Hora");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idDocente}"));
        columnBinding.setColumnName("Id Docente");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);

        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbmateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbdia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jTextField4)
                            .addComponent(jTextField1))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(123, 123, 123))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbdoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(279, 279, 279))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmodificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbdoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jMenu1.setText("Acciones");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpiar.png"))); // NOI18N
        jMenuItem1.setText("Nuevo");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar.png"))); // NOI18N
        jMenuItem2.setText("Agregar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        jMenuItem3.setText("Modificar");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        jMenuItem4.setText("Eliminar");
        jMenu1.add(jMenuItem4);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/buscar.png"))); // NOI18N
        jMenuItem5.setText("Buscar");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        jMenuItem6.setText("Ayuda");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
    nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
       if (jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"INGRESA TUS DATOS CORRECTOS");      
        }
        else{
             res=javaapplication4.conexionsql1.Consulta("Select count(id_horario)from horario where id_horario='"+jTextField1.getText()+"'");
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
                     Conexiones.Procedimientos.grabarhorario(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),jTextField5.getText());
                 } catch (SQLException ex) {
                     Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 JOptionPane.showMessageDialog(this,"exito");
             }
        } // TODO add your handling code here:
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
  try{
            PreparedStatement pps = conexionsql1.getConexion().prepareStatement("update horario set  id_dia='" + jTextField2.getText() + "',  id_materia='" + jTextField3.getText() +
                    "', hora='" + jTextField4.getText()+"', id_docente='" + jTextField5.getText() + "' where id_horario='" + jTextField1.getText() + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los datos se modificaron exitosamente");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField4.setText("");
                jTextField3.setText("");
                jTextField1.requestFocus();
            }catch(SQLException e){
                System.out.println(e);
        }              // TODO add your handling code here:
    }//GEN-LAST:event_btnmodificarActionPerformed

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
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField1.requestFocus();
                jTextField2.requestFocus();
                res = conexionsql1.Consulta("select * from horario");
                while(res.next()){
                    if(res.getString(1).equals(b)){
                        JOptionPane.showMessageDialog(null, "Datos Encontrados");
                        jTextField1.setText(res.getString(1));
                        jTextField2.setText(res.getString(2));                       
                        jTextField3.setText(res.getString(3));
                        jTextField4.setText(res.getString(2));
                        jTextField5.setText(res.getString(3));
                    }
                }
            }catch(SQLException e){
          
                JOptionPane.showMessageDialog(null, "Datos no Encontrados");
            }
        }                                
                                                                            
  
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
    borrar();        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

    private void cmbdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdiaActionPerformed
        traeriddia();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdiaActionPerformed

    private void cmbmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmateriaActionPerformed
    traeridmat();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmateriaActionPerformed

    private void cmbdocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdocActionPerformed
    traeriddoc();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdocActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    menupri me=new menupri();
    me.setVisible(true);
    dispose();
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
    public void nuevo(){
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField1.requestFocusInWindow();
        }
    public void grabar(){

try{
    Class.forName("com.mysql.jdbc.Driver");
    String cadena="jdbc:mysql://localhost/dbdistribuida?user=root&password=";
    Connection con =DriverManager.getConnection(cadena);
    PreparedStatement stmt=null;
    String id_horario=jTextField1.getText();
    String id_dia=jTextField2.getText();
    String id_materia=jTextField3.getText();
    String hora=jTextField4.getText();
    String id_docente=jTextField5.getText();
       String sql="insert into horario values(";
    sql+=id_horario+","+"\""+id_dia+"\",";
    sql+=id_materia+","+"\""+hora+"\","+"\""+id_docente+"\")";
             JOptionPane.showMessageDialog (null, sql);
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
    public void modificar(){
        try{ 
          Class.forName("com.mysql.jdbc.Driver");
      String cadena = "jdbc:mysql://localhost/dbdistribuida?user=root&password=";
      Connection con; PreparedStatement stmt;  
             con = DriverManager.getConnection (cadena);
             String id_horarioclase=jTextField1.getText();
             String id_dia=jTextField2.getText();
             String id_materia=jTextField3.getText();
             String hora=jTextField4.getText();
             String id_docente=jTextField5.getText();
             String sql= " update horario set ";
             sql += "id_dia = " +  "\"" + id_dia + "\"," + "id_materia= "+  "\""+id_materia+ "\",";     
             sql += "hora = " +  "\"" + hora + "\",";
             sql += "id_docente= " +"\""+ id_docente + "\"" + " where id_horario =" + id_horarioclase+ " ; ";
             JOptionPane.showMessageDialog (null, sql);
      stmt = con.prepareStatement(sql);
      int sw = stmt.executeUpdate();
      if (sw!=0) {       JOptionPane.showMessageDialog(null, "Registro Actualizado", "El Registro fue actualizado",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/dataact.png"));
      }
     }catch(ClassNotFoundException e){  
         JOptionPane.showMessageDialog (null, e); }
    catch (SQLException e1) {
        JOptionPane.showMessageDialog (null, e1); }
      catch (Exception e2) {
          JOptionPane.showMessageDialog (null, e2);}
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
         String id_horario=jTextField1.getText();
         String sql=" select * from horario " 
              + "where id_horario = " + id_horario+";";
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
          String sql= " delete from horario where id_horario=";
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
       public void cargardia(){
           try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select dia from dia;");
                cmbdia.removeAllItems();
                while(rs.next())
                {
                    cmbdia.addItem(rs.getString(1));
                    traeriddia();
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
         public void traeriddia(){
            try {
         Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from dia where dia='"+this.cmbdia.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField2.setText(String.valueOf(rs.getInt("id_dia")));
     } catch (Exception e) {
     } 
       }
         
         
   public void cargamat(){
           try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select materia from materia;");
                cmbmateria.removeAllItems();
                while(rs.next())
                {
                    cmbmateria.addItem(rs.getString(1));
                    traeridmat();
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
         public void traeridmat(){
            try {
         Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from materia where materia='"+this.cmbmateria.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField3.setText(String.valueOf(rs.getInt("id_materia")));
     } catch (Exception e) {
     } 
       }
         
         
   public void cargadoc(){
           try
            {
                Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement st=con.createStatement();
                ResultSet rs=st.executeQuery("select nombre from docente;");
                cmbdoc.removeAllItems();
                while(rs.next())
                {
                    cmbdoc.addItem(rs.getString(1));
                    traeriddoc();
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
         public void traeriddoc(){
            try {
         Connection con=null;
         
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from docente where nombre='"+this.cmbdoc.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField5.setText(String.valueOf(rs.getInt("id_docente")));
     } catch (Exception e) {
     } 
       }
    
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
            java.util.logging.Logger.getLogger(formahorarioclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formahorarioclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formahorarioclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formahorarioclase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formahorarioclase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbdia;
    private javax.swing.JComboBox<String> cmbdoc;
    private javax.swing.JComboBox<String> cmbmateria;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<javaapplication4.Horario> horarioList;
    private javax.persistence.Query horarioQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
