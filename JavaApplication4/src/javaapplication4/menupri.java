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
        btndocente = new javax.swing.JButton();
        btndirector = new javax.swing.JButton();
        btncede = new javax.swing.JButton();
        btnsalon = new javax.swing.JButton();
        btngrupo = new javax.swing.JButton();
        btnboleta = new javax.swing.JButton();
        btncalendario = new javax.swing.JButton();
        btndetallehorario = new javax.swing.JButton();
        btnstatus = new javax.swing.JButton();
        btnmateria = new javax.swing.JButton();
        btncertificado = new javax.swing.JButton();
        btnturnodocente = new javax.swing.JButton();
        btnhorario = new javax.swing.JButton();
        btnalumno = new javax.swing.JButton();
        btnusuario = new javax.swing.JButton();
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
        jMenuItem2 = new javax.swing.JMenuItem();
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
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 1600));

        btncerrarsesion.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncerrarsesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrarsesion.png"))); // NOI18N
        btncerrarsesion.setText("Cerrar Sesion");
        btncerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarsesionActionPerformed(evt);
            }
        });

        btndocente.setBackground(new java.awt.Color(255, 255, 255));
        btndocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/docente.png"))); // NOI18N
        btndocente.setToolTipText("Docente");
        btndocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndocenteActionPerformed(evt);
            }
        });

        btndirector.setBackground(new java.awt.Color(255, 255, 255));
        btndirector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/director.png"))); // NOI18N
        btndirector.setToolTipText("Director");
        btndirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndirectorActionPerformed(evt);
            }
        });

        btncede.setBackground(new java.awt.Color(255, 255, 255));
        btncede.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/cede_1.png"))); // NOI18N
        btncede.setToolTipText("Cede");
        btncede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncedeActionPerformed(evt);
            }
        });

        btnsalon.setBackground(new java.awt.Color(255, 255, 255));
        btnsalon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/salon.png"))); // NOI18N
        btnsalon.setToolTipText("Salon");
        btnsalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalonActionPerformed(evt);
            }
        });

        btngrupo.setBackground(new java.awt.Color(255, 255, 255));
        btngrupo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/boleta.png"))); // NOI18N
        btngrupo.setToolTipText("Boleta");
        btngrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngrupoActionPerformed(evt);
            }
        });

        btnboleta.setBackground(new java.awt.Color(255, 255, 255));
        btnboleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/grupo.png"))); // NOI18N
        btnboleta.setToolTipText("Grupo");
        btnboleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnboletaActionPerformed(evt);
            }
        });

        btncalendario.setBackground(new java.awt.Color(255, 255, 255));
        btncalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/calendario.png"))); // NOI18N
        btncalendario.setToolTipText("Calendario");
        btncalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalendarioActionPerformed(evt);
            }
        });

        btndetallehorario.setBackground(new java.awt.Color(255, 255, 255));
        btndetallehorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/detalle horario.png"))); // NOI18N
        btndetallehorario.setToolTipText("Detalle horario");
        btndetallehorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndetallehorarioActionPerformed(evt);
            }
        });

        btnstatus.setBackground(new java.awt.Color(255, 255, 255));
        btnstatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/status.png"))); // NOI18N
        btnstatus.setToolTipText("Status");
        btnstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstatusActionPerformed(evt);
            }
        });

        btnmateria.setBackground(new java.awt.Color(255, 255, 255));
        btnmateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/materia.png"))); // NOI18N
        btnmateria.setToolTipText("Materia");
        btnmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmateriaActionPerformed(evt);
            }
        });

        btncertificado.setBackground(new java.awt.Color(255, 255, 255));
        btncertificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/certificado.png"))); // NOI18N
        btncertificado.setToolTipText("Certificado");
        btncertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncertificadoActionPerformed(evt);
            }
        });

        btnturnodocente.setBackground(new java.awt.Color(255, 255, 255));
        btnturnodocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/turno docente.png"))); // NOI18N
        btnturnodocente.setToolTipText("Turno docente");
        btnturnodocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnturnodocenteActionPerformed(evt);
            }
        });

        btnhorario.setBackground(new java.awt.Color(255, 255, 255));
        btnhorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/horario.png"))); // NOI18N
        btnhorario.setToolTipText("Horario");
        btnhorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhorarioActionPerformed(evt);
            }
        });

        btnalumno.setBackground(new java.awt.Color(255, 255, 255));
        btnalumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/alumno.png"))); // NOI18N
        btnalumno.setToolTipText("Alumno");
        btnalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalumnoActionPerformed(evt);
            }
        });

        btnusuario.setBackground(new java.awt.Color(255, 255, 255));
        btnusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/basededatos/iconosmismo/usuarios.png"))); // NOI18N
        btnusuario.setToolTipText("Usuarios");
        btnusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnusuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btndetallehorario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btndocente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndirector, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmateria, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncede, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncertificado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnturnodocente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnboleta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhorario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btngrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnalumno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(btncerrarsesion)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncerrarsesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btndocente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btndirector, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncede, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnsalon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnboleta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btngrupo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncalendario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnalumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnusuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(1, 1, 1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnturnodocente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncertificado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnstatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndetallehorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnhorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(550, 30));

        jMenu1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenu1.setText("Comunidad Escolar");
        jMenu1.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N

        menualumno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        menudocente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        menudirecto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        menuusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
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

        jMenu2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jMenuItem2.setText("Detalle horario");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jMenu4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jMenu5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jMenu6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
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

        jMenuItem3.setText("ExtraerId");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
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
    dispose();
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
        formaestatus staa=new formaestatus();
        staa.setVisible(true);
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
        formahorarioclase horo=new formahorarioclase();
        horo.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_menuhorarioclaseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        prueba_combo comb=new prueba_combo();
        comb.setVisible(true);
        dispose();   
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        detalle_horario hora=new detalle_horario();
        hora.setVisible(true);
        dispose();   
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    obtenerid obt= new obtenerid();
obt.setVisible(true);
dispose();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btndocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndocenteActionPerformed
        docente doc=new docente();
        doc.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btndocenteActionPerformed

    private void btndirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndirectorActionPerformed
        director dir=new director();
        dir.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btndirectorActionPerformed

    private void btncedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncedeActionPerformed
        cede ce=new cede();
        ce.setVisible(true);        // TODO add your handling code here:
            dispose();
    }//GEN-LAST:event_btncedeActionPerformed

    private void btnsalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalonActionPerformed
    salon sa=new salon();
    sa.setVisible(true);// TODO add your handling code here:
    dispose();
    }//GEN-LAST:event_btnsalonActionPerformed

    private void btnboletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnboletaActionPerformed
    especialbole bol=new especialbole();
    bol.setVisible(true);// TODO add your handling code here:
    dispose();
    }//GEN-LAST:event_btnboletaActionPerformed

    private void btngrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngrupoActionPerformed
    grupo gr=new grupo();
    gr.setVisible(true);// TODO add your handling code here:
    dispose();
    }//GEN-LAST:event_btngrupoActionPerformed

    private void btncalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalendarioActionPerformed
        calendario cale=new calendario();
        cale.setVisible(true);        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btncalendarioActionPerformed

    private void btnstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstatusActionPerformed
        formaestatus sta=new formaestatus();
        sta.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnstatusActionPerformed

    private void btnmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmateriaActionPerformed
        materia mat=new materia();
        mat.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnmateriaActionPerformed

    private void btncertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncertificadoActionPerformed
        tipocert tip=new tipocert();
        tip.setVisible(true);
        dispose();
    }//GEN-LAST:event_btncertificadoActionPerformed

    private void btnturnodocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnturnodocenteActionPerformed
       turnodoc td= new turnodoc();
       td.setVisible(true);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnturnodocenteActionPerformed

    private void btnhorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhorarioActionPerformed
        formahorarioclase horo=new formahorarioclase();
        horo.setVisible(true);
        dispose();     
    }//GEN-LAST:event_btnhorarioActionPerformed

    private void btndetallehorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetallehorarioActionPerformed
        detalle_horario hora=new detalle_horario();
        hora.setVisible(true);
        dispose();   
    }//GEN-LAST:event_btndetallehorarioActionPerformed

    private void btnalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalumnoActionPerformed
        alumno alus=new alumno();
        alus.setVisible(true); 
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnalumnoActionPerformed

    private void btnusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnusuarioActionPerformed
        usuario usua=new usuario();
        usua.setVisible(true);
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_btnusuarioActionPerformed

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
    private javax.swing.JButton btnalumno;
    private javax.swing.JButton btnboleta;
    private javax.swing.JButton btncalendario;
    private javax.swing.JButton btncede;
    private javax.swing.JButton btncerrarsesion;
    private javax.swing.JButton btncertificado;
    private javax.swing.JButton btndetallehorario;
    private javax.swing.JButton btndirector;
    private javax.swing.JButton btndocente;
    private javax.swing.JButton btngrupo;
    private javax.swing.JButton btnhorario;
    private javax.swing.JButton btnmateria;
    private javax.swing.JButton btnsalon;
    private javax.swing.JButton btnstatus;
    private javax.swing.JButton btnturnodocente;
    private javax.swing.JButton btnusuario;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
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
