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
import static javaapplication4.mes.res;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class especialbole extends javax.swing.JFrame {
    static ResultSet res;
    int coun;
    public especialbole() {
        initComponents();
        cargaralumno();
        cargarmateria();
        cargardocente();
        CargarArticulo();
        this.setTitle("Boleta");
        this.setLocale(null);
        
        this.setLocationRelativeTo(null);
    }
    
        public void CargarArticulo(){
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
        res = conexionsql1.Consulta("select * from especial");
        try{
            while(res.next()){
                java.util.Vector v = new java.util.Vector();
                v.add(res.getInt(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                modelo.addRow(v);
                jTable1.setModel(modelo);
            }
        }catch (SQLException e){
        }
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuidaPU").createEntityManager();
        especialQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e FROM Especial e");
        especialList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : especialQuery.getResultList();
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
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        cmbalumno = new javax.swing.JComboBox<>();
        cmbmateria = new javax.swing.JComboBox<>();
        cmbdocente = new javax.swing.JComboBox<>();
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
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 900));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Boletas");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("Id Matricula");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("Id Alumno");

        jTextField2.setEnabled(false);

        btnnuevo.setBackground(new java.awt.Color(255, 255, 255));
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
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

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/salida32.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setText("Id Materia");

        jTextField3.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setText("Id Docente");

        jTextField4.setEnabled(false);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setText("Calificación");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        cmbalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbalumnoActionPerformed(evt);
            }
        });

        cmbmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmateriaActionPerformed(evt);
            }
        });

        cmbdocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbdocenteActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Especial", "Matricula", "Id Materia", "Id Docente", "Calificacion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbalumno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbdocente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextField5))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnmodificar, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(btnnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnbuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btngrabar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnnuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btngrabar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbalumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbdocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(54, 54, 54)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuguardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuguardarMouseClicked

    }//GEN-LAST:event_menuguardarMouseClicked

    private void menuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuguardarActionPerformed
grabar();
    }//GEN-LAST:event_menuguardarActionPerformed

    private void menumodificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumodificarMouseClicked
 
    }//GEN-LAST:event_menumodificarMouseClicked

    private void menumodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumodificarActionPerformed
modificar();
    }//GEN-LAST:event_menumodificarActionPerformed

    private void menubuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menubuscarMouseClicked

    }//GEN-LAST:event_menubuscarMouseClicked

    private void menubuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubuscarActionPerformed
   
    }//GEN-LAST:event_menubuscarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed
try{
            PreparedStatement pps = conexionsql1.getConexion().prepareStatement("update especial set matricula ='" + jTextField2.getText() + "',  id_materia='" + jTextField3.getText() +
                    "', id_docente='" + jTextField4.getText()+"', calificacion='" + jTextField5.getText() + "' where id_especial='" + jTextField1.getText() + "'");
                pps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Los datos se modificaron exitosamente");
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField4.setText("");
                jTextField3.setText("");
                jTextField1.requestFocus();
            }catch(SQLException e){
                System.out.println(e);
        }CargarArticulo();
    }//GEN-LAST:event_btnmodificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menupri ni=new menupri();
        ni.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void menunuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menunuevoActionPerformed
        nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_menunuevoActionPerformed

    private void btngrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrabarActionPerformed
   if (jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"INGRESA TUS DATOS CORRECTOS");      
        }
        else{
             res=javaapplication4.conexionsql1.Consulta("Select count(id_especial)from especial where id_especial='"+jTextField1.getText()+"'");
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
                     Conexiones.Procedimientos.grabarespe(jTextField1.getText(),jTextField2.getText(),jTextField3.getText(),jTextField4.getText(),jTextField5.getText());
                 } catch (SQLException ex) {
                     Logger.getLogger(detalle_horario.class.getName()).log(Level.SEVERE, null, ex);
                 }
                 JOptionPane.showMessageDialog(this,"exito");
             }
        }CargarArticulo();
        
    }//GEN-LAST:event_btngrabarActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
          if(jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "META BIEN SUS DATOS", "Error", JOptionPane.ERROR_MESSAGE);
            jTextField1.setText("");
            jTextField1.requestFocus();
        } else {
            try 
            {
                String b;
                Procedimientos.buscaespe(Integer.parseInt(jTextField1.getText()));
                b = jTextField1.getText();
                res = conexionsql1.Consulta("select * from detalle_horario");
                while(res.next()){
                    if(res.getString(1).equals(b)){
                        JOptionPane.showMessageDialog(null, "Datos Encontrados");
                        jTextField1.setText(res.getString(1));
                        jTextField2.setText(res.getString(2));
                        jTextField3.setText(res.getString(3));
                        jTextField4.setText(res.getString(4));
                        jTextField5.setText(res.getString(5));

                       

                    }
                }
           }catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null, "Datos no Encontrados");
            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        borrar();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cmbalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbalumnoActionPerformed
traeridalumno();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbalumnoActionPerformed

    private void cmbmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmateriaActionPerformed
traeridmat();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmateriaActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void cmbdocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbdocenteActionPerformed
traeriddoc();        // TODO add your handling code here:
    }//GEN-LAST:event_cmbdocenteActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
int row = jTable1.getSelectedRow();
        int opc = JOptionPane.showConfirmDialog(this, "¿Estas seguro de eliminar el registro?","Pregunta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(opc == JOptionPane.YES_OPTION){
       try {
           Procedimientos.eliminarespe(Integer.parseInt(jTable1.getValueAt(row, 0).toString()));
           JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Registro eliminado de la Base de datos", "Registro eliminado exitosamente",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/eliminarbase.png"));
          nuevo();
       }
        } CargarArticulo();
    }//GEN-LAST:event_btneliminarActionPerformed
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
    String id_mad=jTextField1.getText();
    String alumno=jTextField2.getText();
    String id_materia=jTextField3.getText();
    String id_docente=jTextField4.getText();
    String calificacion=jTextField5.getText();
    String sql="insert into especial values(";
    sql+=id_mad+","+"\""+alumno+"\",";
    sql+=id_materia+","+"\""+id_docente+"\","+"\""+calificacion+"\")";
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
     String sql= " delete from especial where id_mad=";
      sql += "\"" + jTextField1.getText() + "\";"; 
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
         String id_mad=jTextField1.getText();
         String sql=" select * from especial " 
              + "where id_mad = " + id_mad+";";
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
    public void modificar(){
        try{ 
          Class.forName("com.mysql.jdbc.Driver");
      String cadena = "jdbc:mysql://localhost/dbdistribuida?user=root&password=";
      Connection con; PreparedStatement stmt;  
             con = DriverManager.getConnection (cadena);
             String id_mad=jTextField1.getText();
             String id_alumno=jTextField2.getText();
             String id_materia=jTextField3.getText();
             String id_docente=jTextField4.getText();
             String calificacion=jTextField5.getText();
             String sql= " update especial set ";  
             sql += "id_alumno= " +  "\"" + id_alumno+ "\","+"id_materia= " +  "\"" + id_materia+ "\",";
             sql+="id_docente= " +  "\"" + id_docente + "\",";
             sql += "calificacion= " +"\""+ calificacion + "\"" + " where id_mad =" + id_mad+ " ; ";
             JOptionPane.showMessageDialog (null, sql);
      stmt = con.prepareStatement(sql);
      int sw = stmt.executeUpdate();
      if (sw!=0) {      JOptionPane.showMessageDialog(null, "Registro Actualizado", "El Registro fue actualizado",
                JOptionPane.INFORMATION_MESSAGE, new ImageIcon("src/basededatos/dataact.png"));}
     }
        catch(ClassNotFoundException e)
        {  
         JOptionPane.showMessageDialog (null, e);
        }
    catch (SQLException e1) 
    {
        JOptionPane.showMessageDialog (null, e1);
    }
      catch (Exception e2) {
          JOptionPane.showMessageDialog (null, e2);}}
    
    public void  cargaralumno(){
    try
    {
        Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select nombre from alumno;");
        cmbalumno.removeAllItems();
        while(rs.next())
        {
            cmbalumno.addItem(rs.getString(1));
            traeridalumno();
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
           public void traeridalumno(){
            try {
         Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
                Statement s1t=con.createStatement();
                ResultSet rs=s1t.executeQuery("select * from alumno where nombre='"+this.cmbalumno.getSelectedItem()+"'" );
                rs.next();
                jTextField2.setText(String.valueOf(rs.getInt("matricula")));
     } catch (ClassNotFoundException | SQLException e) {
     } 
       }
           

    public void cargarmateria(){
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

    public void cargardocente(){
    try
    {
        Connection con=null;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-AHM3DOT\\\\SQLEXPRESS:1433;databaseName=dbdistribuida","sa","awdx123");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select nombre from docente;");
        cmbdocente.removeAllItems();
        while(rs.next())
        {
            cmbdocente.addItem(rs.getString(1));
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
                ResultSet rs=s1t.executeQuery("select * from docente where nombre='"+this.cmbdocente.getSelectedItem()+"'" );
                rs.next();
                //System.out.println(rs);
                this.jTextField4.setText(String.valueOf(rs.getInt("id_docente")));
     } catch (Exception e) {
     } 
       }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new especialbole().setVisible(true);
                jTextField2.setEnabled(false);
                jTextField3.setEnabled(false);
                jTextField4.setEnabled(false);
           }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btngrabar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JComboBox<String> cmbalumno;
    private javax.swing.JComboBox<String> cmbdocente;
    private javax.swing.JComboBox<String> cmbmateria;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<javaapplication4.Especial> especialList;
    private javax.persistence.Query especialQuery;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JMenuItem menuayuda;
    private javax.swing.JMenuItem menubuscar;
    private javax.swing.JMenuItem menuguardar;
    private javax.swing.JMenuItem menumodificar;
    private javax.swing.JMenuItem menunuevo;
    // End of variables declaration//GEN-END:variables
}
