package vistas.servicio;

import config.Conexion;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import modeloDAO.CitasMedicasDAO;
import modeloDAO.DoctorDAO;
import modeloDAO.PacientesDAO;
import modeloDTO.CitasMedicasDTO;
import vistas.usuario.MenuPrincipal;

public class RegistrarCitas extends javax.swing.JFrame {

    Conexion conexion = new Conexion();
    DoctorDAO doctoresDAO = new DoctorDAO(conexion);
    PacientesDAO pacientesDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);
    CitasMedicasDAO citasMedicasDAO = new CitasMedicasDAO();

    public RegistrarCitas() {
        initComponents();
        doctoresDAO.cargarComboDoctores(cbdoctor);
        pacientesDAO.cargarComboPacientes(cbpaciente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menu2 = new Label.Menu();
        jPanel13 = new javax.swing.JPanel();
        lblRegistrarDoctor1 = new javax.swing.JLabel();
        LlbNombres1 = new javax.swing.JLabel();
        jSeparator59 = new javax.swing.JSeparator();
        LlbApellidos1 = new javax.swing.JLabel();
        jSeparator60 = new javax.swing.JSeparator();
        LblEspecialidad1 = new javax.swing.JLabel();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        BtnRegresarInicio2 = new javax.swing.JButton();
        jbregistrar1 = new javax.swing.JButton();
        LblEspecialidad2 = new javax.swing.JLabel();
        tfMotivo = new javax.swing.JTextField();
        tfFechaCita = new com.toedter.calendar.JDateChooser();
        cbpaciente = new javax.swing.JComboBox<>();
        cbdoctor = new javax.swing.JComboBox<>();
        LblEspecialidad3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tadiagnostico = new javax.swing.JTextArea();
        tstratamiento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txatratamiento = new javax.swing.JTextArea();
        LlbNombres3 = new javax.swing.JLabel();
        cbestado = new javax.swing.JComboBox<>();
        jSeparator63 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 171, 228));
        jPanel2.setForeground(new java.awt.Color(51, 0, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(640, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu2.setBackground(new java.awt.Color(255, 255, 255));
        menu2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistrarDoctor1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblRegistrarDoctor1.setForeground(new java.awt.Color(51, 0, 153));
        lblRegistrarDoctor1.setText("Registrar Cita");

        LlbNombres1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres1.setText("Paciente:");

        jSeparator59.setForeground(new java.awt.Color(0, 0, 0));

        LlbApellidos1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos1.setText("Doctor");

        jSeparator60.setForeground(new java.awt.Color(0, 0, 0));

        LblEspecialidad1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad1.setText("Fecha de la Cita:");

        jSeparator61.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator62.setForeground(new java.awt.Color(0, 0, 0));

        BtnRegresarInicio2.setBackground(new java.awt.Color(51, 0, 153));
        BtnRegresarInicio2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        BtnRegresarInicio2.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarInicio2.setText("Volver");
        BtnRegresarInicio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegresarInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarInicio2jButton1ActionPerformed(evt);
            }
        });

        jbregistrar1.setBackground(new java.awt.Color(51, 0, 153));
        jbregistrar1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbregistrar1.setForeground(new java.awt.Color(255, 255, 255));
        jbregistrar1.setText("Registrar");
        jbregistrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbregistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrar1ActionPerformed(evt);
            }
        });

        LblEspecialidad2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad2.setText("Motivo de la Cita:");

        tfMotivo.setBorder(null);
        tfMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMotivoActionPerformed(evt);
            }
        });

        tfFechaCita.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        LblEspecialidad3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad3.setText("Diagnostico");

        tadiagnostico.setColumns(20);
        tadiagnostico.setRows(5);
        jScrollPane1.setViewportView(tadiagnostico);

        tstratamiento.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        tstratamiento.setText("Tratamiento");

        txatratamiento.setColumns(20);
        txatratamiento.setRows(5);
        jScrollPane2.setViewportView(txatratamiento);

        LlbNombres3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres3.setText("Estado:");

        cbestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Programada", "Cancelada", "Realizada" }));

        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistrarDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LlbNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblEspecialidad1)
                                    .addComponent(cbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LlbNombres3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblEspecialidad2)
                                    .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(63, 63, 63)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEspecialidad3)
                                    .addComponent(LlbApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbdoctor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(tstratamiento))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LlbNombres1)
                            .addComponent(LlbApellidos1)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblRegistrarDoctor1)))
                .addGap(6, 6, 6)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbpaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbdoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblEspecialidad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEspecialidad3)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(tstratamiento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(LblEspecialidad2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(LlbNombres3)
                            .addGap(6, 6, 6)
                            .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(19, 19, 19)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu2.add(jPanel13);
        jPanel13.setBounds(10, 10, 700, 470);

        jPanel2.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 770, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMotivoActionPerformed

    private void jbregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrar1ActionPerformed
        String pacienteSeleccionado = cbpaciente.getSelectedItem().toString();
        String doctorSeleccionado = cbdoctor.getSelectedItem().toString();
        String motivo = tfMotivo.getText();
        String diagnostico = tadiagnostico.getText();
        String tratamiento = txatratamiento.getText();
        String estado = cbestado.getSelectedItem().toString();
        
        Date fechaSeleccionada = tfFechaCita.getDate();
        LocalDateTime fechaCita = fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();

 
        // Llamar al método para crear la cita médica en la base de datos
        citasMedicasDAO.crearCitaMedicaf(pacienteSeleccionado, doctorSeleccionado, fechaCita, motivo, diagnostico, tratamiento, CitasMedicasDTO.Estado.Programada);
        JOptionPane.showMessageDialog(null, "La cita médica se ha registrado correctamente.");

    }//GEN-LAST:event_jbregistrar1ActionPerformed

    private void BtnRegresarInicio2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2jButton1ActionPerformed

        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarInicio2jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCitas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresarInicio2;
    private javax.swing.JLabel LblEspecialidad1;
    private javax.swing.JLabel LblEspecialidad2;
    private javax.swing.JLabel LblEspecialidad3;
    private javax.swing.JLabel LlbApellidos1;
    private javax.swing.JLabel LlbNombres1;
    private javax.swing.JLabel LlbNombres3;
    private javax.swing.JComboBox<String> cbdoctor;
    private javax.swing.JComboBox<String> cbestado;
    private javax.swing.JComboBox<String> cbpaciente;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JButton jbregistrar1;
    private javax.swing.JLabel lblRegistrarDoctor1;
    private Label.Menu menu2;
    private javax.swing.JTextArea tadiagnostico;
    private com.toedter.calendar.JDateChooser tfFechaCita;
    private javax.swing.JTextField tfMotivo;
    private javax.swing.JLabel tstratamiento;
    private javax.swing.JTextArea txatratamiento;
    // End of variables declaration//GEN-END:variables

}
