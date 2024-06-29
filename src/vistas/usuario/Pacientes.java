package vistas.usuario;

import config.Conexion;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modeloDAO.PacientesDAO;
import modeloDTO.PacientesDTO;
import vistas.Doctor.Doctor;
import vistas.Horario.Horario;
import vistas.logueo.Inicio;
import vistas.servicio.Citas;

public class Pacientes extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    private PacientesDAO pacientesDAO;
    PacientesDAO nPacientes = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);

    public Pacientes() {
        initComponents();
        this.pacientesDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);
        nPacientes.mostrarCitas(tbPacientes, 0);
        mostrarFechaYHoraActual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu1 = new Label.Menu();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbldoctor = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbHorario = new javax.swing.JLabel();
        menu2 = new Label.Menu();
        txtfecha = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        menu3 = new Label.Menu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPacientes = new javax.swing.JTable();
        menu4 = new Label.Menu();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        menu5 = new Label.Menu();
        jLabel5 = new javax.swing.JLabel();
        menu6 = new Label.Menu();
        jLabel6 = new javax.swing.JLabel();
        menu7 = new Label.Menu();
        txtfiltrar = new javax.swing.JTextField();
        menu8 = new Label.Menu();
        lbEliminar = new javax.swing.JLabel();
        menu9 = new Label.Menu();
        lbleditar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pacientes");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(70, 170, 200));

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("      CITAS");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        menu1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 139, 120, 60));

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("  Cerrar Sesion");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        menu1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 449, 110, 30));

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Usuario");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        menu1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 91, 70, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        menu1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 111, 100, 10));

        lbldoctor.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lbldoctor.setText("   DOCTORES");
        lbldoctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbldoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbldoctor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldoctorMouseClicked(evt);
            }
        });
        menu1.add(lbldoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 124, 62));

        jPanel2.setBackground(new java.awt.Color(173, 216, 230));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setText("  PACIENTES");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 68, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
        );

        menu1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        lbHorario.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        lbHorario.setText("   HORARIO");
        lbHorario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHorarioMouseClicked(evt);
            }
        });
        menu1.add(lbHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 130, 60));

        menu2.setBackground(new java.awt.Color(255, 255, 255));

        txtfecha.setEditable(false);
        txtfecha.setBackground(new java.awt.Color(255, 255, 255));
        txtfecha.setColumns(1);
        txtfecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtfecha.setBorder(null);

        txthora.setEditable(false);
        txthora.setBackground(new java.awt.Color(255, 255, 255));
        txthora.setColumns(1);
        txthora.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txthora.setBorder(null);
        txthora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthoraActionPerformed(evt);
            }
        });

        menu2.setLayer(txtfecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu2.setLayer(txthora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu2Layout = new javax.swing.GroupLayout(menu2);
        menu2.setLayout(menu2Layout);
        menu2Layout.setHorizontalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        menu2Layout.setVerticalGroup(
            menu2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        menu3.setBackground(new java.awt.Color(255, 255, 255));

        tbPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id ", "Paciente", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPacientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPacientes);
        if (tbPacientes.getColumnModel().getColumnCount() > 0) {
            tbPacientes.getColumnModel().getColumn(0).setMinWidth(25);
            tbPacientes.getColumnModel().getColumn(0).setPreferredWidth(25);
            tbPacientes.getColumnModel().getColumn(0).setMaxWidth(25);
            tbPacientes.getColumnModel().getColumn(1).setResizable(false);
            tbPacientes.getColumnModel().getColumn(2).setMinWidth(75);
            tbPacientes.getColumnModel().getColumn(2).setPreferredWidth(75);
            tbPacientes.getColumnModel().getColumn(2).setMaxWidth(75);
        }

        menu3.add(jScrollPane1);
        jScrollPane1.setBounds(10, 30, 360, 180);

        menu4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setText("Datos del Paciente:");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        menu4.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu4.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu4Layout = new javax.swing.GroupLayout(menu4);
        menu4.setLayout(menu4Layout);
        menu4Layout.setHorizontalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        menu4Layout.setVerticalGroup(
            menu4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        menu5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel5.setText("Historial Medico");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        menu5.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu5Layout = new javax.swing.GroupLayout(menu5);
        menu5.setLayout(menu5Layout);
        menu5Layout.setHorizontalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu5Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        menu5Layout.setVerticalGroup(
            menu5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );

        menu6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel6.setText("Deudas");

        menu6.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu6Layout = new javax.swing.GroupLayout(menu6);
        menu6.setLayout(menu6Layout);
        menu6Layout.setHorizontalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu6Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menu6Layout.setVerticalGroup(
            menu6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        menu7.setBackground(new java.awt.Color(255, 255, 255));

        txtfiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfiltrarActionPerformed(evt);
            }
        });
        txtfiltrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfiltrarKeyPressed(evt);
            }
        });

        menu7.setLayer(txtfiltrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu7Layout = new javax.swing.GroupLayout(menu7);
        menu7.setLayout(menu7Layout);
        menu7Layout.setHorizontalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu7Layout.setVerticalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtfiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu8.setBackground(new java.awt.Color(255, 255, 255));

        lbEliminar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbEliminar.setText("Eliminar");
        lbEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEliminarMouseClicked(evt);
            }
        });

        menu8.setLayer(lbEliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu8Layout = new javax.swing.GroupLayout(menu8);
        menu8.setLayout(menu8Layout);
        menu8Layout.setHorizontalGroup(
            menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu8Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(lbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        menu8Layout.setVerticalGroup(
            menu8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        menu9.setBackground(new java.awt.Color(255, 255, 255));

        lbleditar.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lbleditar.setText(" Editar:");
        lbleditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbleditarMouseClicked(evt);
            }
        });

        menu9.setLayer(lbleditar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu9Layout = new javax.swing.GroupLayout(menu9);
        menu9.setLayout(menu9Layout);
        menu9Layout.setHorizontalGroup(
            menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu9Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lbleditar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        menu9Layout.setVerticalGroup(
            menu9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbleditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(menu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menu9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Inicio inciarSesion = new Inicio();
        inciarSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Citas citas = new Citas();
        citas.setVisible(true);
        this.dispose();    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void tbPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPacientesMouseClicked
        if (evt.getClickCount() == 2) { //doble clic
            int filaSeleccionada = tbPacientes.getSelectedRow();
            if (filaSeleccionada != -1) {
                int idPaciente = Integer.parseInt(tbPacientes.getValueAt(filaSeleccionada, 0).toString());
                nPacientes.mostrarDetallePaciente(idPaciente, jTextArea2);
            }

        }    }//GEN-LAST:event_tbPacientesMouseClicked

    private void lbEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEliminarMouseClicked
        int fila = tbPacientes.getSelectedRow();

        if (fila >= 0) {
            int idCita = (int) tbPacientes.getValueAt(fila, 0);
            int confirmar = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que quieres eliminar este paciente?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                nPacientes.eliminar(idCita);
                nPacientes.mostrarCitas(tbPacientes, 0); // Actualizar la tabla de citas
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un paciente para eliminar.");
        }
    }//GEN-LAST:event_lbEliminarMouseClicked

    private void txthoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthoraActionPerformed

    private void txtfiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfiltrarActionPerformed


    }//GEN-LAST:event_txtfiltrarActionPerformed

    private void txtfiltrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfiltrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            // Obtener el texto del campo de texto txtfiltrar
            String dniTexto = txtfiltrar.getText().trim();

            // Validar que el texto ingresado sea un número entero válido
            try {
                int dni = Integer.parseInt(dniTexto);
                pacientesDAO.buscarPorDni(dni, tbPacientes);                

            } catch (NumberFormatException e) {
                Logger.getLogger(Doctor.class.getName()).log(Level.SEVERE, null, e);
                JOptionPane.showMessageDialog(null, "Ingrese un número válido para el DNI." + e.getMessage());
            }
        }


    }//GEN-LAST:event_txtfiltrarKeyPressed

    private void lbHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHorarioMouseClicked
        Horario horario = new Horario();
        horario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbHorarioMouseClicked

    private void lbldoctorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldoctorMouseClicked
        Doctor doctorr = new Doctor();
        doctorr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lbldoctorMouseClicked

    private void lbleditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbleditarMouseClicked
        int filaSeleccionada = tbPacientes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una paciente para editar.");
            return;
        }

        int id = (int) tbPacientes.getValueAt(filaSeleccionada, 0);

        PacientesDAO pacienteDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);

        pacienteDAO.actualizar(id);

        ArrayList<PacientesDTO> pacientesActualizados = pacienteDAO.leer(id);

        DefaultTableModel modelo = (DefaultTableModel) tbPacientes.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de llenarla de nuevo

        for (PacientesDTO paciente : pacientesActualizados) {
            Object[] fila = {
                paciente.getIdPaciente(),
                paciente.getnPaciente() + " " + paciente.getApellidos(),
                paciente.getTelefono()
            };
            modelo.addRow(fila);

        }
        pacienteDAO.mostrarCitas(tbPacientes, 0);
    }//GEN-LAST:event_lbleditarMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        /* int filaSeleccionada = tbPacientes.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un paciente.");
        }

        int id = (int) tbPacientes.getValueAt(filaSeleccionada, 0);
        historialMedicoDAO = new HistorialMedicoDAO();
        ArrayList<HistorialMedicoDTO> historialList = historialMedicoDAO.obtenerHistorialPorPaciente(idPaciente);

        String[] columnNames = {"Fecha Visita", "Diagnóstico", "Tratamiento", "Observaciones", "Estado"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (HistorialMedicoDTO historial : historialList) {
            Object[] row = {historial.getFechaVisita(), historial.getDiagnostico(), historial.getTratamiento(), historial.getObservaciones(), historial.getEstadoPaciente()};
            model.addRow(row);
        }

        tableHistorial = new JTable(model);
        add(new JScrollPane(tableHistorial), BorderLayout.CENTER);

        setTitle("Historial Médico del Paciente");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);*/


    }//GEN-LAST:event_jLabel5MouseClicked
    private void mostrarFechaYHoraActual() {
        // Obtener la fecha y hora actual
        Date fechaHora = new Date();
        // Formatear la fecha
        SimpleDateFormat sdfFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormateada = sdfFecha.format(fechaHora);
        // Formatear la hora
        SimpleDateFormat sdfHora = new SimpleDateFormat("HH:mm:ss");
        String horaFormateada = sdfHora.format(fechaHora);
        // Mostrar la fecha y hora en los JTextField
        txtfecha.setText(fechaFormateada);
        txthora.setText(horaFormateada);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lbEliminar;
    private javax.swing.JLabel lbHorario;
    private javax.swing.JLabel lbldoctor;
    private javax.swing.JLabel lbleditar;
    private Label.Menu menu1;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private Label.Menu menu4;
    private Label.Menu menu5;
    private Label.Menu menu6;
    private Label.Menu menu7;
    private Label.Menu menu8;
    private Label.Menu menu9;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtfiltrar;
    private javax.swing.JTextField txthora;
    // End of variables declaration//GEN-END:variables
}
