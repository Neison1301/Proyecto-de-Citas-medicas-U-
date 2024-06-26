package vistas.cliente;

import Clases.NPacientes;
import java.text.SimpleDateFormat;
import java.util.Date;
import  vistas.logueo.Inicio;
import vistas.producto.Citas;


        public class Pacientes extends javax.swing.JFrame {

    NPacientes nPacientes = new NPacientes(0, 0, 0, null, null, null, null, false);

    public Pacientes() {
        initComponents();
        nPacientes.mostrarPacientes(tbPacientes);
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
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
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
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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

        jLabel11.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel11.setText("   HORARIO");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 275, 112, 62));

        jLabel13.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel13.setText("   DOCTORES");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menu1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, 124, 62));

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

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        menu7.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout menu7Layout = new javax.swing.GroupLayout(menu7);
        menu7.setLayout(menu7Layout);
        menu7Layout.setHorizontalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu7Layout.setVerticalGroup(
            menu7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(menu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGap(210, 210, 210)
                                .addComponent(menu5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(menu6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(menu7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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

                NPacientes paciente = nPacientes.obtenerId(idPaciente);
                if (paciente != null) {
                    String informacionPaciente = String.format("ID: %d\nNombre: %s\nDNI: %d\nEdad: %d\nTeléfono: %s\nEmail: %s\nGénero: %s\n",
                            paciente.getId(), paciente.getNombre(), paciente.getDni(), paciente.getEdad(),
                            paciente.getTelefono(), paciente.getEmail(), paciente.isGenero() ? "Masculino" : "Femenino");
                    jTextArea2.setText(informacionPaciente);
                } else {
                    jTextArea2.setText("No se encontró información del paciente");
                }
            }
        }    }//GEN-LAST:event_tbPacientesMouseClicked
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JTextField jTextField1;
    private Label.Menu menu1;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private Label.Menu menu4;
    private Label.Menu menu5;
    private Label.Menu menu6;
    private Label.Menu menu7;
    private javax.swing.JTable tbPacientes;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    // End of variables declaration//GEN-END:variables
}
