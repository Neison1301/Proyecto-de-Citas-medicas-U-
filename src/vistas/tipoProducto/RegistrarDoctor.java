package vistas.tipoProducto;

import Clases.Ndoctor;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import  vistas.cliente.MenuPrincipal;
import vistas.cliente.Pacientes;
public class RegistrarDoctor extends javax.swing.JFrame {

    MenuPrincipal menu = new MenuPrincipal();
    Ndoctor ndoctor = new Ndoctor(0, null, null, null, null, false, null, 0);

    public RegistrarDoctor(MenuPrincipal menu) {
        initComponents();
        this.menu = menu;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        menu2 = new Label.Menu();
        jPanel13 = new javax.swing.JPanel();
        lblRegistrarDoctor1 = new javax.swing.JLabel();
        lblDni1 = new javax.swing.JLabel();
        tfDni1 = new javax.swing.JTextField();
        jSeparator54 = new javax.swing.JSeparator();
        LlbNombres1 = new javax.swing.JLabel();
        tfNombre1 = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        LlbApellidos1 = new javax.swing.JLabel();
        tfapellidos1 = new javax.swing.JTextField();
        jSeparator60 = new javax.swing.JSeparator();
        LblEspecialidad1 = new javax.swing.JLabel();
        tfEspecialidad1 = new javax.swing.JTextField();
        jSeparator61 = new javax.swing.JSeparator();
        LblTelefono1 = new javax.swing.JLabel();
        tfTelefono1 = new javax.swing.JTextField();
        jSeparator62 = new javax.swing.JSeparator();
        LblCorreo1 = new javax.swing.JLabel();
        tfCorreo1 = new javax.swing.JTextField();
        jSeparator63 = new javax.swing.JSeparator();
        BtnRegresarInicio2 = new javax.swing.JButton();
        jbregistrar1 = new javax.swing.JButton();
        LblGenero1 = new javax.swing.JLabel();
        cbGenero1 = new javax.swing.JComboBox<>();
        menu3 = new Label.Menu();

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
        lblRegistrarDoctor1.setText("Registrar Doctor");

        lblDni1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDni1.setText("DNI");

        tfDni1.setBorder(null);
        tfDni1.setPreferredSize(new java.awt.Dimension(64, 20));

        jSeparator54.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres1.setText("Nombres ");

        tfNombre1.setBorder(null);

        jSeparator59.setForeground(new java.awt.Color(0, 0, 0));

        LlbApellidos1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos1.setText("Apellidos");

        tfapellidos1.setBorder(null);

        jSeparator60.setForeground(new java.awt.Color(0, 0, 0));

        LblEspecialidad1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad1.setText("Especialidad");

        tfEspecialidad1.setBorder(null);

        jSeparator61.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono1.setText("Telefono");

        tfTelefono1.setBorder(null);

        jSeparator62.setForeground(new java.awt.Color(0, 0, 0));

        LblCorreo1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblCorreo1.setText("Correo Electronico");

        tfCorreo1.setBorder(null);
        tfCorreo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreo1jTextField5ActionPerformed(evt);
            }
        });

        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));

        BtnRegresarInicio2.setBackground(new java.awt.Color(51, 0, 153));
        BtnRegresarInicio2.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        BtnRegresarInicio2.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarInicio2.setText("Volver");
        BtnRegresarInicio2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegresarInicio2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresarInicio2MouseClicked(evt);
            }
        });
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

        LblGenero1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblGenero1.setText("Genero");

        cbGenero1.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbGenero1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cbGenero1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cbGenero1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbGenero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenero1jComboBox1ActionPerformed(evt);
            }
        });

        menu3.setBackground(new java.awt.Color(255, 255, 255));
        menu3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCorreo1)
                            .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTelefono1)
                            .addComponent(tfDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDni1)
                            .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegistrarDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LlbNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LblEspecialidad1))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblGenero1)
                                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LlbApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfapellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)))
                .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRegistrarDoctor1)
                .addGap(12, 12, 12)
                .addComponent(lblDni1)
                .addGap(2, 2, 2)
                .addComponent(tfDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(LlbNombres1)
                                            .addComponent(LlbApellidos1))
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfapellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(5, 5, 5)
                                        .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblEspecialidad1)
                                    .addComponent(LblGenero1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEspecialidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblTelefono1)
                        .addGap(1, 1, 1)
                        .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblCorreo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu2.add(jPanel13);
        jPanel13.setBounds(10, 10, 410, 460);

        jPanel2.add(menu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 420, 490));

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

    private void tfCorreo1jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreo1jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreo1jTextField5ActionPerformed

    private void BtnRegresarInicio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2MouseClicked
        menu.setVisible(true);

        this.dispose();    }//GEN-LAST:event_BtnRegresarInicio2MouseClicked

    private void BtnRegresarInicio2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2jButton1ActionPerformed


    }//GEN-LAST:event_BtnRegresarInicio2jButton1ActionPerformed

    private void jbregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrar1ActionPerformed
        int dni;
        String nombre, apellido, telefono, correo, especialidad;
        boolean genero;

        if (tfDni1.getText().isEmpty() || tfNombre1.getText().isEmpty() || tfapellidos1.getText().isEmpty()
                || tfTelefono1.getText().isEmpty() || tfCorreo1.getText().isEmpty() || tfEspecialidad1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        try {
            dni = Integer.parseInt(tfDni1.getText());
            nombre = tfNombre1.getText();
            apellido = tfapellidos1.getText();
            telefono = tfTelefono1.getText();
            correo = tfCorreo1.getText();
            genero = cbGenero1.getSelectedItem().toString().equals("Masculino");
            especialidad = tfEspecialidad1.getText();

            ndoctor.agregarDoctor(dni, nombre, apellido, telefono, correo, genero, especialidad, 1);
            // Escribir los datos del doctor en el archivo de registro
            ndoctor.crear(ndoctor);

            JOptionPane.showMessageDialog(null, "Doctor registrado exitosamente.");

            Pacientes paciente = new Pacientes();
            paciente.setVisible(true);

            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el doctor: " + e.getMessage());
        
        }    }//GEN-LAST:event_jbregistrar1ActionPerformed

    private void cbGenero1jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenero1jComboBox1ActionPerformed
    }//GEN-LAST:event_cbGenero1jComboBox1ActionPerformed

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
        java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(RegistrarDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            MenuPrincipal menu = new MenuPrincipal();
            new RegistrarDoctor(menu).setVisible(true);

        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresarInicio2;
    private javax.swing.JLabel LblCorreo1;
    private javax.swing.JLabel LblEspecialidad1;
    private javax.swing.JLabel LblGenero1;
    private javax.swing.JLabel LblTelefono1;
    private javax.swing.JLabel LlbApellidos1;
    private javax.swing.JLabel LlbNombres1;
    private javax.swing.JComboBox<String> cbGenero1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JButton jbregistrar1;
    private javax.swing.JLabel lblDni1;
    private javax.swing.JLabel lblRegistrarDoctor1;
    private Label.Menu menu2;
    private Label.Menu menu3;
    private javax.swing.JTextField tfCorreo1;
    private javax.swing.JTextField tfDni1;
    private javax.swing.JTextField tfEspecialidad1;
    private javax.swing.JTextField tfNombre1;
    private javax.swing.JTextField tfTelefono1;
    private javax.swing.JTextField tfapellidos1;
    // End of variables declaration//GEN-END:variables
}
