package Vista;

import Clases.CitasMedicas;
import Label.Menu;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class RegistrarCitas extends javax.swing.JFrame {

    private boolean modoEdicion = false;
    private int idCitaEditar;

    public void setModoEdicion(boolean modoEdicion) {
        this.modoEdicion = modoEdicion;
    }

    // Método para activar el modo edición y mostrar los datos de la cita a editar
    public void activarModoEdicion(int idCita, String fecha, String hora, String paciente, String doctor, int dni, String motivo) {
        modoEdicion = true;
        idCitaEditar = idCita;
        mostrarDatos(fecha, hora, paciente, doctor, dni, motivo);
    }

    // Método para desactivar el modo edición y limpiar los campos del formulario
    public void desactivarModoEdicion() {
        modoEdicion = false;
        idCitaEditar = -1; // Restablecer el id de la cita a editar
        limpiarCampos();
    }

    // Método para mostrar los datos de la cita en los campos del formulario
    public void mostrarDatos(String fecha, String hora, String paciente, String doctor, int dni, String motivo) {
        // Mostrar los datos en los campos correspondientes del formulario
        tfFechaCita.setText(fecha);
        tfHoraCita.setText(hora);
        tfPaciente.setText(paciente);
        tfDoctor.setText(doctor);
        tfDni.setText(String.valueOf(dni));
        tfMotivo.setText(motivo);
    }

    // Método para limpiar los campos del formulario
    public void limpiarCampos() {
        tfFechaCita.setText("");
        tfHoraCita.setText("");
        tfPaciente.setText("");
        tfDoctor.setText("");
        tfDni.setText("");
        tfMotivo.setText("");
    }

    public RegistrarCitas() {
        initComponents();
    }
    Menu menu = new Menu();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menu2 = new Label.Menu();
        jPanel13 = new javax.swing.JPanel();
        lblRegistrarDoctor1 = new javax.swing.JLabel();
        LlbNombres1 = new javax.swing.JLabel();
        tfPaciente = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        LlbApellidos1 = new javax.swing.JLabel();
        tfDoctor = new javax.swing.JTextField();
        jSeparator60 = new javax.swing.JSeparator();
        LblEspecialidad1 = new javax.swing.JLabel();
        tfFechaCita = new javax.swing.JTextField();
        jSeparator61 = new javax.swing.JSeparator();
        LblTelefono1 = new javax.swing.JLabel();
        tfHoraCita = new javax.swing.JTextField();
        jSeparator62 = new javax.swing.JSeparator();
        BtnRegresarInicio2 = new javax.swing.JButton();
        jbregistrar1 = new javax.swing.JButton();
        menu3 = new Label.Menu();
        LlbNombres2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jSeparator64 = new javax.swing.JSeparator();
        LblEspecialidad2 = new javax.swing.JLabel();
        tfMotivo = new javax.swing.JTextField();
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

        tfPaciente.setBorder(null);

        jSeparator59.setForeground(new java.awt.Color(0, 0, 0));

        LlbApellidos1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos1.setText("Doctor");

        tfDoctor.setBorder(null);

        jSeparator60.setForeground(new java.awt.Color(0, 0, 0));

        LblEspecialidad1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad1.setText("Fecha de la Cita:");

        tfFechaCita.setBorder(null);

        jSeparator61.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono1.setText("Hora de la Cita");

        tfHoraCita.setBorder(null);
        tfHoraCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoraCitaActionPerformed(evt);
            }
        });

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

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.setForeground(new java.awt.Color(255, 255, 255));

        LlbNombres2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres2.setText("DNI del paciente:");

        tfDni.setBorder(null);

        jSeparator64.setForeground(new java.awt.Color(0, 0, 0));

        LblEspecialidad2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad2.setText("Motivo de la Cita:");

        tfMotivo.setBorder(null);
        tfMotivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMotivoActionPerformed(evt);
            }
        });

        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addComponent(tfFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LlbNombres2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPaciente)
                                    .addComponent(jSeparator59)
                                    .addComponent(LblEspecialidad1)
                                    .addComponent(LlbNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LlbApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTelefono1)))
                            .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfDni, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator64, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblRegistrarDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEspecialidad2)
                            .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblRegistrarDoctor1)
                        .addGap(44, 44, 44)
                        .addComponent(LlbNombres2)
                        .addGap(4, 4, 4)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LlbNombres1)
                                    .addComponent(LlbApellidos1))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEspecialidad1)
                            .addComponent(LblTelefono1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfHoraCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblEspecialidad2)
                        .addGap(7, 7, 7)
                        .addComponent(tfMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu2.add(jPanel13);
        jPanel13.setBounds(10, 20, 410, 460);

        jPanel2.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 430, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrar1ActionPerformed
        String fecha, hora, paciente, doctor, motivo;
        int dni;
        fecha = tfFechaCita.getText();
        hora = tfHoraCita.getText();
        paciente = tfPaciente.getText();
        doctor = tfDoctor.getText();
        dni = Integer.parseInt(tfDni.getText());
        motivo = tfMotivo.getText();

        if (modoEdicion) {
            HashMap<String, Object> nuevosValores = new HashMap<>();
            nuevosValores.put("fecha", fecha);
            nuevosValores.put("hora", hora);
            nuevosValores.put("paciente", paciente);
            nuevosValores.put("doctor", doctor);
            nuevosValores.put("dni", dni);
            nuevosValores.put("motivo", motivo);
            // Actualizar la cita con los nuevos datos
            CitasMedicas citasMedicas = new CitasMedicas(idCitaEditar, fecha, hora, paciente, doctor, dni, motivo);
            citasMedicas.actualizar(0,nuevosValores);
            // Desactivar el modo edición y limpiar los campos del formulario
            desactivarModoEdicion();

            // Mostrar un mensaje de éxito
            JOptionPane.showMessageDialog(null, "La cita se ha actualizado correctamente");
            Citas citas = new Citas();
            citas.setVisible(true);
            this.dispose();
        } else {
            // Si no estamos en modo de edición, creamos una nueva cita
            CitasMedicas nuevaCita = new CitasMedicas(0, fecha, hora, paciente, doctor, dni, motivo);
            nuevaCita.agendarCita(nuevaCita);
            JOptionPane.showMessageDialog(null, "La cita se ha registrado correctamente");
            Citas citas = new Citas();
            citas.setVisible(true);
            this.dispose();

        }

    }//GEN-LAST:event_jbregistrar1ActionPerformed

    private void BtnRegresarInicio2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2jButton1ActionPerformed
        Citas citas = new Citas();
        citas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarInicio2jButton1ActionPerformed

    private void tfHoraCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoraCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoraCitaActionPerformed

    private void tfMotivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMotivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMotivoActionPerformed

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
    private javax.swing.JLabel LblTelefono1;
    private javax.swing.JLabel LlbApellidos1;
    private javax.swing.JLabel LlbNombres1;
    private javax.swing.JLabel LlbNombres2;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JButton jbregistrar1;
    private javax.swing.JLabel lblRegistrarDoctor1;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfDoctor;
    private javax.swing.JTextField tfFechaCita;
    private javax.swing.JTextField tfHoraCita;
    private javax.swing.JTextField tfMotivo;
    private javax.swing.JTextField tfPaciente;
    // End of variables declaration//GEN-END:variables

}