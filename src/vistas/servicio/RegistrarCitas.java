package vistas.servicio;

import modeloDAO.CitasMedicasDAO;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import modeloDTO.CitasMedicasDTO;
import vistas.cliente.MenuPrincipal;

public class RegistrarCitas extends javax.swing.JFrame {

    public RegistrarCitas() {
        initComponents();

    }

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
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        BtnRegresarInicio2 = new javax.swing.JButton();
        jbregistrar1 = new javax.swing.JButton();
        menu3 = new Label.Menu();
        LlbNombres2 = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jSeparator64 = new javax.swing.JSeparator();
        LblEspecialidad2 = new javax.swing.JLabel();
        tfMotivo = new javax.swing.JTextField();
        tfFechaCita = new com.toedter.calendar.JDateChooser();

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

        tfFechaCita.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                    .addComponent(tfDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(LlbNombres2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(LblEspecialidad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        if (tfFechaCita.getDate() == null || tfPaciente.getText().isEmpty()
                || tfDoctor.getText().isEmpty() || tfDni.getText().isEmpty() || tfMotivo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            tfFechaCita.setDate(null);
            tfPaciente.setText("");
            tfDoctor.setText("");
            tfDni.setText("");
            tfMotivo.setText("");
        } else {

            java.util.Date fechaUtil = tfFechaCita.getDate(); 
            String pacienteNombre = tfPaciente.getText();
            String doctorNombre = tfDoctor.getText();
            int dni = Integer.parseInt(tfDni.getText());
            String motivo = tfMotivo.getText();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String fechaMySQL = sdf.format(fechaUtil);

            CitasMedicasDTO cita = new CitasMedicasDTO(0, fechaMySQL, pacienteNombre, doctorNombre, dni, motivo);

            CitasMedicasDAO citasMedicasDAO = new CitasMedicasDAO();
            citasMedicasDAO.crear(cita);

            JOptionPane.showMessageDialog(null, "La cita se ha registrado correctamente");
            MenuPrincipal mp = new MenuPrincipal();
            mp.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jbregistrar1ActionPerformed

    private void BtnRegresarInicio2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2jButton1ActionPerformed

        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarInicio2jButton1ActionPerformed

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
    private javax.swing.JLabel LlbApellidos1;
    private javax.swing.JLabel LlbNombres1;
    private javax.swing.JLabel LlbNombres2;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JButton jbregistrar1;
    private javax.swing.JLabel lblRegistrarDoctor1;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfDoctor;
    private com.toedter.calendar.JDateChooser tfFechaCita;
    private javax.swing.JTextField tfMotivo;
    private javax.swing.JTextField tfPaciente;
    // End of variables declaration//GEN-END:variables

}
