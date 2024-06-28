package vistas.cliente;

import config.Conexion;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import modeloDAO.PacientesDAO;
import modeloDTO.PacientesDTO;

public class RegistrarPaciente extends javax.swing.JFrame {

    MenuPrincipal menu = new MenuPrincipal();

    public RegistrarPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu1 = new Label.Menu();
        jPanel12 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        LlbNombres = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        LblTelefono = new javax.swing.JLabel();
        LblCorreo = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();
        tfCorreo = new javax.swing.JTextField();
        tfContraseña = new javax.swing.JTextField();
        BtnRegresarInicio1 = new javax.swing.JButton();
        LblGenero = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jSeparator52 = new javax.swing.JSeparator();
        jSeparator53 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        jbregistrar = new javax.swing.JButton();
        jSeparator56 = new javax.swing.JSeparator();
        LlbNombres1 = new javax.swing.JLabel();
        tfNombre1 = new javax.swing.JTextField();
        jSeparator57 = new javax.swing.JSeparator();
        LblTelefono1 = new javax.swing.JLabel();
        tfTelefono1 = new javax.swing.JTextField();
        LlbApellidos = new javax.swing.JLabel();
        tfedad = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        tfapellidos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 171, 228));
        jPanel1.setForeground(new java.awt.Color(51, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel94.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(51, 0, 153));
        jLabel94.setText("Registrar Paciente");

        lblDni.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDni.setText("DNI");

        tfDni.setBorder(null);
        tfDni.setPreferredSize(new java.awt.Dimension(64, 20));
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });

        LlbNombres.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres.setText("Nombres ");

        tfTelefono.setBorder(null);
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonojTextField4ActionPerformed(evt);
            }
        });

        LblTelefono.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono.setText("Telefono");

        LblCorreo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblCorreo.setText("Correo Electronico");

        cbGenero.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Masculino", "Femenino" }));
        cbGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cbGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenerojComboBox1ActionPerformed(evt);
            }
        });

        tfCorreo.setBorder(null);
        tfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreojTextField5ActionPerformed(evt);
            }
        });

        tfContraseña.setBorder(null);

        BtnRegresarInicio1.setBackground(new java.awt.Color(51, 0, 153));
        BtnRegresarInicio1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        BtnRegresarInicio1.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarInicio1.setText("Volver");
        BtnRegresarInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegresarInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarInicio1jButton1ActionPerformed(evt);
            }
        });

        LblGenero.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblGenero.setText("Genero");

        tfNombre.setBorder(null);

        jSeparator52.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator53.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator55.setForeground(new java.awt.Color(0, 0, 0));

        jbregistrar.setBackground(new java.awt.Color(51, 0, 153));
        jbregistrar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbregistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbregistrar.setText("Registrar");
        jbregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrarActionPerformed(evt);
            }
        });

        jSeparator56.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres1.setText("Apellidos");

        tfNombre1.setBorder(null);

        jSeparator57.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono1.setText("Edad ");

        tfTelefono1.setBorder(null);
        tfTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefono1jTextField4ActionPerformed(evt);
            }
        });

        LlbApellidos.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos.setText("Apellidos");

        tfedad.setBorder(null);

        jSeparator58.setForeground(new java.awt.Color(0, 0, 0));

        tfapellidos.setBorder(null);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(BtnRegresarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCorreo)
                            .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni)
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblGenero)
                    .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LlbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LlbApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LlbNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblTelefono1)
                    .addComponent(tfedad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(480, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel94)
                .addGap(12, 12, 12)
                .addComponent(lblDni)
                .addGap(2, 2, 2)
                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LlbNombres)
                            .addComponent(LlbNombres1)
                            .addComponent(LlbApellidos))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(7, 7, 7)
                .addComponent(LblGenero)
                .addGap(6, 6, 6)
                .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(LblTelefono1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblTelefono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegresarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addContainerGap(308, Short.MAX_VALUE)
                    .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(136, 136, 136)))
        );

        menu1.add(jPanel12);
        jPanel12.setBounds(0, 10, 430, 460);

        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 420, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrarActionPerformed
        int dni, edad, telefono;
        String nombre, apellido, email;
        boolean genero;

        if (tfDni.getText().isEmpty() || tfNombre.getText().isEmpty() || tfapellidos.getText().isEmpty()
                || tfTelefono.getText().isEmpty() || tfCorreo.getText().isEmpty() || tfedad.getText().isEmpty() || cbGenero.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        try {
            dni = Integer.parseInt(tfDni.getText());
            nombre = tfNombre.getText();
            apellido = tfapellidos.getText();
            telefono = Integer.parseInt(tfTelefono.getText());
            email = tfCorreo.getText();
            edad = Integer.parseInt(tfedad.getText());
            genero = cbGenero.getSelectedItem().toString().equals("Masculino");

            PacientesDTO nuevoPaciente = new PacientesDTO(0, dni, edad, nombre, apellido, telefono, email, genero);

            Conexion conexion = new Conexion(); 
            PacientesDAO nPacientesDAO = new PacientesDAO(conexion, 0,0, nombre, apellido, telefono, email, genero);

            nPacientesDAO.crear(nuevoPaciente);

            JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente.");

            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI, teléfono o la edad.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el paciente: " + e.getMessage());
        }

        Pacientes pacientes = new Pacientes();
        pacientes.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jbregistrarActionPerformed

    private void BtnRegresarInicio1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio1jButton1ActionPerformed

        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnRegresarInicio1jButton1ActionPerformed

    private void tfCorreojTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreojTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreojTextField5ActionPerformed

    private void cbGenerojComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenerojComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenerojComboBox1ActionPerformed

    private void tfTelefonojTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonojTextField4ActionPerformed


    }//GEN-LAST:event_tfTelefonojTextField4ActionPerformed

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniActionPerformed

    private void tfTelefono1jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefono1jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefono1jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new RegistrarPaciente().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresarInicio1;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblGenero;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JLabel LblTelefono1;
    private javax.swing.JLabel LlbApellidos;
    private javax.swing.JLabel LlbNombres;
    private javax.swing.JLabel LlbNombres1;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JButton jbregistrar;
    private javax.swing.JLabel lblDni;
    private Label.Menu menu1;
    private javax.swing.JTextField tfContraseña;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfNombre1;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfTelefono1;
    private javax.swing.JTextField tfapellidos;
    private javax.swing.JTextField tfedad;
    // End of variables declaration//GEN-END:variables
}
