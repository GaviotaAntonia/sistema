package javaapplication4;

import java.awt.Image;
import java.awt.Toolkit;

public class menupri extends javax.swing.JFrame {
    public menupri() {
        initComponents();
        this.setTitle("Menu principal");
        this.setLocale(null);
        this.setLocationRelativeTo(null);
    }@Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("iconos/zorrito.png"));


        return retValue;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btncerrarsesion = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menualumno = new javax.swing.JMenuItem();
        menudocente = new javax.swing.JMenuItem();
        menudirecto = new javax.swing.JMenuItem();
        menuusuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menudia = new javax.swing.JMenuItem();
        menumes = new javax.swing.JMenuItem();
        menucal = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menucede = new javax.swing.JMenuItem();
        menusalon = new javax.swing.JMenuItem();
        menugrupo = new javax.swing.JMenuItem();
        menubol = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menucolo = new javax.swing.JMenuItem();
        menuestado = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menusexo = new javax.swing.JMenuItem();
        menustatus = new javax.swing.JMenuItem();
        menumateria = new javax.swing.JMenuItem();
        menutice = new javax.swing.JMenuItem();
        menuturnodoc = new javax.swing.JMenuItem();
        menuhorarioclase = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuayuda = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btncerrarsesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btncerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrarsesion.png"))); // NOI18N
        btncerrarsesion.setText("Cerrar Sesion");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(765, Short.MAX_VALUE)
                .addComponent(btncerrarsesion)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(491, Short.MAX_VALUE)
                .addComponent(btncerrarsesion)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(550, 30));

        jMenu1.setText("Comunidad Escolar");
        jMenu1.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menualumno.setActionCommand("alumnos");
        menualumno.setLabel("Alumnos");
        menualumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menualumnoMouseClicked(evt);
            }
        });
        menualumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menualumnoActionPerformed(evt);
            }
        });
        jMenu1.add(menualumno);

        menudocente.setText("Docente");
        menudocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudocenteMouseClicked(evt);
            }
        });
        menudocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudocenteActionPerformed(evt);
            }
        });
        jMenu1.add(menudocente);

        menudirecto.setText("Director");
        menudirecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudirectoMouseClicked(evt);
            }
        });
        menudirecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudirectoActionPerformed(evt);
            }
        });
        jMenu1.add(menudirecto);

        menuusuario.setText("Usuario");
        menuusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuusuarioMouseClicked(evt);
            }
        });
        menuusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuusuarioActionPerformed(evt);
            }
        });
        jMenu1.add(menuusuario);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Agenda");
        jMenu2.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menudia.setText("Día");
        menudia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menudiaMouseClicked(evt);
            }
        });
        menudia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menudiaActionPerformed(evt);
            }
        });
        jMenu2.add(menudia);

        menumes.setText("Mes");
        menumes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menumesMouseClicked(evt);
            }
        });
        menumes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumesActionPerformed(evt);
            }
        });
        jMenu2.add(menumes);

        menucal.setText("Calendario");
        menucal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menucalMouseClicked(evt);
            }
        });
        menucal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucalActionPerformed(evt);
            }
        });
        jMenu2.add(menucal);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Instalaciones");
        jMenu3.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menucede.setText("Cede");
        menucede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucedeActionPerformed(evt);
            }
        });
        jMenu3.add(menucede);

        menusalon.setText("Salón");
        menusalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusalonActionPerformed(evt);
            }
        });
        jMenu3.add(menusalon);

        menugrupo.setText("Grupo");
        menugrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menugrupoActionPerformed(evt);
            }
        });
        jMenu3.add(menugrupo);

        menubol.setText("Boleta");
        menubol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menubolActionPerformed(evt);
            }
        });
        jMenu3.add(menubol);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Direccion");
        jMenu4.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menucolo.setText("Colonia");
        menucolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menucoloActionPerformed(evt);
            }
        });
        jMenu4.add(menucolo);

        menuestado.setText("Estado");
        menuestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuestadoActionPerformed(evt);
            }
        });
        jMenu4.add(menuestado);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Informacion");
        jMenu5.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menusexo.setText("Sexo");
        menusexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menusexoActionPerformed(evt);
            }
        });
        jMenu5.add(menusexo);

        menustatus.setText("Status");
        menustatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menustatusActionPerformed(evt);
            }
        });
        jMenu5.add(menustatus);

        menumateria.setText("Materia");
        menumateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menumateriaActionPerformed(evt);
            }
        });
        jMenu5.add(menumateria);

        menutice.setText("Tipo de certificado");
        menutice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuticeActionPerformed(evt);
            }
        });
        jMenu5.add(menutice);

        menuturnodoc.setText("Turno docente");
        menuturnodoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuturnodocActionPerformed(evt);
            }
        });
        jMenu5.add(menuturnodoc);

        menuhorarioclase.setText("Horario Clase");
        menuhorarioclase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuhorarioclaseActionPerformed(evt);
            }
        });
        jMenu5.add(menuhorarioclase);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Ayuda");
        jMenu6.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menuayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/ayuda.png"))); // NOI18N
        menuayuda.setText("Ayuda");
        jMenu6.add(menuayuda);

        jMenuItem1.setText("Combo box");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menualumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menualumnoActionPerformed
        alumno nuevo=new alumno();
        nuevo.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menualumnoActionPerformed

    private void menudocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudocenteActionPerformed
        docente doc=new docente();
        doc.setVisible(true); 
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menudocenteActionPerformed

    private void menudirectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudirectoActionPerformed
        director di=new director();
        di.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_menudirectoActionPerformed

    private void menucalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucalActionPerformed
      calendario cale=new calendario();
      cale.setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menucalActionPerformed

    private void menubolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menubolActionPerformed
       especialbole bole =new especialbole();
       bole.setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menubolActionPerformed

    private void menuturnodocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuturnodocActionPerformed
       turnodoc td= new turnodoc();
       td.setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menuturnodocActionPerformed

    private void menualumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menualumnoMouseClicked
    alumno nuevo=new alumno();
    nuevo.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menualumnoMouseClicked

    private void menudocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudocenteMouseClicked
    docente doc=new docente();
    doc.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menudocenteMouseClicked

    private void menudirectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudirectoMouseClicked
        director dir= new director();
        dir.setVisible(true); 
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menudirectoMouseClicked

    private void menuusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuusuarioMouseClicked
         usuario usu=new usuario();
         usu.setVisible(true);
         dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menuusuarioMouseClicked

    private void menudiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menudiaMouseClicked
        dia di=new dia();
        di.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menudiaMouseClicked

    private void menumesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menumesMouseClicked
      mes me=new mes();
      me.setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menumesMouseClicked

    private void menucalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menucalMouseClicked
      calendario cale=new calendario();
      cale.setVisible(true);
      dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menucalMouseClicked

    private void menuusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuusuarioActionPerformed
     usuario usu=new usuario();
     usu.setVisible(true);
     dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menuusuarioActionPerformed

    private void menudiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menudiaActionPerformed
    dia di=new dia();
    di.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menudiaActionPerformed

    private void menumesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumesActionPerformed
    mes me=new mes();
    me.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menumesActionPerformed

    private void menucedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucedeActionPerformed
    cede ce=new cede();
    ce.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menucedeActionPerformed

    private void menusalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusalonActionPerformed
     salon sa=new salon();
     sa.setVisible(true);
     dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menusalonActionPerformed

    private void menugrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menugrupoActionPerformed
     grupo gru=new grupo();
     gru.setVisible(true);
     dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menugrupoActionPerformed

    private void menucoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menucoloActionPerformed
    formacolonia forma=new formacolonia();
    forma.setVisible(true);
    disable();
    }//GEN-LAST:event_menucoloActionPerformed

    private void menuestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuestadoActionPerformed
    estado est=new estado();
    est.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menuestadoActionPerformed

    private void menusexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menusexoActionPerformed
     sexo se=new sexo();
    se.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menusexoActionPerformed

    private void menustatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menustatusActionPerformed
        status sta=new status();
        sta.setVisible(true);
        dispose();
    }//GEN-LAST:event_menustatusActionPerformed

    private void menuticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuticeActionPerformed
    tipocert tip=new tipocert();
    tip.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_menuticeActionPerformed

    private void btncerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarsesionActionPerformed
    login log=new login();
    log.setVisible(true);
    dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btncerrarsesionActionPerformed

    private void menumateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menumateriaActionPerformed
        materia mat=new materia();
        mat.setVisible(true);
        dispose();
    }//GEN-LAST:event_menumateriaActionPerformed

    private void menuhorarioclaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuhorarioclaseActionPerformed
        horarioclase horo=new horarioclase();
        horo.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_menuhorarioclaseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        prueba_combo comb=new prueba_combo();
        comb.setVisible(true);
        dispose();   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(menupri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menupri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menupri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menupri.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menupri().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem menualumno;
    private javax.swing.JMenuItem menuayuda;
    private javax.swing.JMenuItem menubol;
    private javax.swing.JMenuItem menucal;
    private javax.swing.JMenuItem menucede;
    private javax.swing.JMenuItem menucolo;
    private javax.swing.JMenuItem menudia;
    private javax.swing.JMenuItem menudirecto;
    private javax.swing.JMenuItem menudocente;
    private javax.swing.JMenuItem menuestado;
    private javax.swing.JMenuItem menugrupo;
    private javax.swing.JMenuItem menuhorarioclase;
    private javax.swing.JMenuItem menumateria;
    private javax.swing.JMenuItem menumes;
    private javax.swing.JMenuItem menusalon;
    private javax.swing.JMenuItem menusexo;
    private javax.swing.JMenuItem menustatus;
    private javax.swing.JMenuItem menutice;
    private javax.swing.JMenuItem menuturnodoc;
    private javax.swing.JMenuItem menuusuario;
    // End of variables declaration//GEN-END:variables
}
