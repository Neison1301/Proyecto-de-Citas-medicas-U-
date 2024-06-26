package vistas.cliente;

import modeloDAO.CitasMedicasDAO;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import  vistas.logueo.Inicio;
import vistas.producto.Citas;
import vistas.producto.RegistrarCitas;
import vistas.tipoProducto.RegistrarDoctor;

public class MenuPrincipal extends javax.swing.JFrame {

    CitasMedicasDAO citasMedicas = new CitasMedicasDAO();

    public MenuPrincipal() {
        initComponents();
        citasMedicas.mostrarCitas(tbCitas);
        jpMenu.requestFocus();
        mostrarFechaYHoraActual();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpMenu = new javax.swing.JPanel();
        menu2 = new Label.Menu();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCitas = new javax.swing.JTable();
        menu1 = new Label.Menu();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        menu3 = new Label.Menu();
        txtfecha = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        menu4 = new Label.Menu();
        jLabel14 = new javax.swing.JLabel();
        menu5 = new Label.Menu();
        menu6 = new Label.Menu();
        menu7 = new Label.Menu();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaCitas = new javax.swing.JTextArea();
        menu8 = new Label.Menu();
        lblRegistrarPacientes = new javax.swing.JLabel();
        menu9 = new Label.Menu();
        tfCantidadDoctores = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpMenu.setBackground(new java.awt.Color(70, 170, 200));
        jpMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpMenuKeyPressed(evt);
            }
        });

        menu2.setBackground(new java.awt.Color(255, 255, 255));

        tbCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "id", "Citas Registradas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCitasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCitas);
        if (tbCitas.getColumnModel().getColumnCount() > 0) {
            tbCitas.getColumnModel().getColumn(0).setMinWidth(30);
            tbCitas.getColumnModel().getColumn(0).setPreferredWidth(30);
            tbCitas.getColumnModel().getColumn(0).setMaxWidth(30);
            tbCitas.getColumnModel().getColumn(1).setResizable(false);
        }

        menu2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 190, 220);

        menu1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel10.setText("      CITAS");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setText("  Cerrar Sesion");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setText("Usuario");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setText("   HORARIO");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel12.setText("  PACIENTES");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setText("   DOCTORES");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        menu1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu1.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        menu1.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu1Layout = new javax.swing.GroupLayout(menu1);
        menu1.setLayout(menu1Layout);
        menu1Layout.setHorizontalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1Layout.createSequentialGroup()
                                .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(menu1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))))
                    .addGroup(menu1Layout.createSequentialGroup()
                        .addGroup(menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(menu1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        menu1Layout.setVerticalGroup(
            menu1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        menu3.setBackground(new java.awt.Color(255, 255, 255));

        txtfecha.setEditable(false);
        txtfecha.setBackground(new java.awt.Color(255, 255, 255));
        txtfecha.setColumns(1);
        txtfecha.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtfecha.setBorder(null);
        menu3.add(txtfecha);
        txtfecha.setBounds(260, 20, 120, 30);

        txthora.setEditable(false);
        txthora.setBackground(new java.awt.Color(255, 255, 255));
        txthora.setColumns(1);
        txthora.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txthora.setBorder(null);
        menu3.add(txthora);
        txthora.setBounds(260, 50, 120, 30);

        menu4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel14.setText("                        CITAS");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        menu4.add(jLabel14);
        jLabel14.setBounds(10, 0, 180, 130);

        menu5.setBackground(new java.awt.Color(255, 255, 255));

        menu6.setBackground(new java.awt.Color(255, 255, 255));

        menu7.setBackground(new java.awt.Color(255, 255, 255));

        txaCitas.setColumns(20);
        txaCitas.setRows(5);
        jScrollPane2.setViewportView(txaCitas);

        menu7.add(jScrollPane2);
        jScrollPane2.setBounds(20, 20, 170, 130);

        menu8.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistrarPacientes.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lblRegistrarPacientes.setText("Pacientes");
        lblRegistrarPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarPacientesMouseClicked(evt);
            }
        });
        menu8.add(lblRegistrarPacientes);
        lblRegistrarPacientes.setBounds(60, 0, 110, 60);

        menu9.setBackground(new java.awt.Color(255, 255, 255));

        tfCantidadDoctores.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        tfCantidadDoctores.setText("Doctores");
        tfCantidadDoctores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tfCantidadDoctores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfCantidadDoctoresMouseClicked(evt);
            }
        });
        menu9.add(tfCantidadDoctores);
        tfCantidadDoctores.setBounds(60, 0, 110, 60);

        jLabel6.setFont(new java.awt.Font("Cambria", 1, 20)); // NOI18N
        jLabel6.setText("Agregar : ");

        javax.swing.GroupLayout jpMenuLayout = new javax.swing.GroupLayout(jpMenu);
        jpMenu.setLayout(jpMenuLayout);
        jpMenuLayout.setHorizontalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menu8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menu9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addComponent(menu5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(229, 229, 229))
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jpMenuLayout.setVerticalGroup(
            jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpMenuLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpMenuLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jpMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpMenuLayout.createSequentialGroup()
                                .addComponent(menu8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(menu9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpMenuLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegistrarPacientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarPacientesMouseClicked
        RegistrarPaciente registrarse = new RegistrarPaciente();
        registrarse.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_lblRegistrarPacientesMouseClicked


    private void tfCantidadDoctoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfCantidadDoctoresMouseClicked
        RegistrarDoctor registrarDoctor = new RegistrarDoctor(this);
        registrarDoctor.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_tfCantidadDoctoresMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       Inicio inicio = new Inicio();
       inicio.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        RegistrarCitas registrarCitas = new RegistrarCitas();
        registrarCitas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Citas citas = new Citas();
        citas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        Pacientes pacientes = new Pacientes();
        pacientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jpMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpMenuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            Inicio inciarSesion = new Inicio();
            inciarSesion.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jpMenuKeyPressed

    private void tbCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCitasMouseClicked
        if (evt.getClickCount() == 2) { // Doble clic
            int filaSeleccionada = tbCitas.getSelectedRow();
            if (filaSeleccionada != -1) {
                int idCita = (int) tbCitas.getValueAt(filaSeleccionada, 0); // Suponiendo que la columna 0 contiene el Id
                citasMedicas.mostrarDetalleCita(idCita, txaCitas);// Método para mostrar los detalles de la cita
            }
        }   
    }//GEN-LAST:event_tbCitasMouseClicked
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpMenu;
    private javax.swing.JLabel lblRegistrarPacientes;
    private Label.Menu menu1;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private Label.Menu menu4;
    private Label.Menu menu5;
    private Label.Menu menu6;
    private Label.Menu menu7;
    private Label.Menu menu8;
    private Label.Menu menu9;
    private javax.swing.JTable tbCitas;
    private javax.swing.JLabel tfCantidadDoctores;
    private javax.swing.JTextArea txaCitas;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    // End of variables declaration//GEN-END:variables
}
