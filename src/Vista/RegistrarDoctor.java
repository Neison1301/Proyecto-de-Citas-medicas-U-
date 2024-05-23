package Vista;

import Clases.CitasMedicas;
import Clases.Ndoctor;
import javax.swing.JOptionPane;


public class RegistrarDoctor extends javax.swing.JFrame {

    Ndoctor ndoctor = new Ndoctor(new int[100], new String[100], new String[100], new String[100], new String[100], new boolean[100], new String[100]);

    Ndoctor ndoctor = new Ndoctor(0, null, null, null, null, false, null, 0);

    public RegistrarDoctor(Menu menu) {
    public RegistrarDoctor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu1 = new Label.Menu();
        jPanel12 = new javax.swing.JPanel();
        lblRegistrarDoctor = new javax.swing.JLabel();
        lblDni = new javax.swing.JLabel();
        tfDni = new javax.swing.JTextField();
        jSeparator52 = new javax.swing.JSeparator();
        LlbNombres = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        jSeparator55 = new javax.swing.JSeparator();
        LlbApellidos = new javax.swing.JLabel();
        tfapellidos = new javax.swing.JTextField();
        jSeparator57 = new javax.swing.JSeparator();
        LblEspecialidad = new javax.swing.JLabel();
        tfEspecialidad = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        LblTelefono = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        jSeparator53 = new javax.swing.JSeparator();
        LblCorreo = new javax.swing.JLabel();
        tfCorreo = new javax.swing.JTextField();
        jSeparator56 = new javax.swing.JSeparator();
        BtnRegresarInicio1 = new javax.swing.JButton();
        jbregistrar = new javax.swing.JButton();
        LblGenero = new javax.swing.JLabel();
        cbGenero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(9, 27, 48));
        jPanel1.setForeground(new java.awt.Color(51, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        lblRegistrarDoctor.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        lblRegistrarDoctor.setForeground(new java.awt.Color(51, 0, 153));
        lblRegistrarDoctor.setText("Registrar Doctor");

        lblDni.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblDni.setText("DNI");

        tfDni.setBorder(null);
        tfDni.setPreferredSize(new java.awt.Dimension(64, 20));
        tfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDniActionPerformed(evt);
            }
        });

        jSeparator52.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres.setText("Nombres ");

        tfNombre.setBorder(null);

        jSeparator55.setForeground(new java.awt.Color(0, 0, 0));

        LlbApellidos.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos.setText("Apellidos");

        tfapellidos.setBorder(null);

        jSeparator57.setForeground(new java.awt.Color(0, 0, 0));

        LblEspecialidad.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad.setText("Especialidad");

        tfEspecialidad.setBorder(null);

        jSeparator58.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono.setText("Telefono");

        tfTelefono.setBorder(null);
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonoActionPerformed(evt);
            }
        });

        jSeparator53.setForeground(new java.awt.Color(0, 0, 0));

        LblCorreo.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblCorreo.setText("Correo Electronico");

        tfCorreo.setBorder(null);
        tfCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCorreojTextField5ActionPerformed(evt);
            }
        });

        jSeparator56.setForeground(new java.awt.Color(0, 0, 0));

        BtnRegresarInicio1.setBackground(new java.awt.Color(51, 0, 153));
        BtnRegresarInicio1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        BtnRegresarInicio1.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresarInicio1.setText("Volver");
        BtnRegresarInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRegresarInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnRegresarInicio1MouseClicked(evt);
            }
        });
        BtnRegresarInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarInicio1jButton1ActionPerformed(evt);
            }
        });

        jbregistrar.setBackground(new java.awt.Color(51, 0, 153));
        jbregistrar.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jbregistrar.setForeground(new java.awt.Color(255, 255, 255));
        jbregistrar.setText("Registrar");
        jbregistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbregistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbregistrarMouseClicked(evt);
            }
        });
        jbregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbregistrarActionPerformed(evt);
            }
        });

        LblGenero.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblGenero.setText("Genero");

        cbGenero.setFont(new java.awt.Font("Cambria", 0, 12)); // NOI18N
        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        cbGenero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        cbGenero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGenerojComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(BtnRegresarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblCorreo)
                        .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LblTelefono))
                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDni)
                    .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRegistrarDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LlbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(LblEspecialidad))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblGenero)
                            .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LlbApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRegistrarDoctor)
                .addGap(12, 12, 12)
                .addComponent(lblDni)
                .addGap(2, 2, 2)
                .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LlbNombres)
                                    .addComponent(LlbApellidos))
                                .addGap(6, 6, 6)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEspecialidad)
                            .addComponent(LblGenero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LblTelefono)
                .addGap(1, 1, 1)
                .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegresarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        menu1.add(jPanel12);
        jPanel12.setBounds(0, 0, 410, 460);

        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 440, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniActionPerformed

    private void tfCorreojTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreojTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreojTextField5ActionPerformed

    private void jbregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {
        int dni;
        String nombre, apellido, telefono, email, especialidad;
        boolean genero;
    private void BtnRegresarInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresarInicio1MouseClicked
        Citas citas = new Citas();

        citas.setVisible(true);

        try {
            dni = Integer.parseInt(tfDni1.getText());
            nombre = tfNombre1.getText();
            apellido = tfapellidos1.getText();
            telefono = tfTelefono1.getText();
            email = tfCorreo1.getText();
            genero = cbGenero1.getSelectedItem().toString().equals("Masculino");
            especialidad = tfEspecialidad1.getText();
            this.dispose();
    }//GEN-LAST:event_BtnRegresarInicio1MouseClicked

        ndoctor.establecerInformacion(dni, nombre, apellido, telefono, email, genero, especialidad, 0);
        ndoctor.crear();
        JOptionPane.showMessageDialog(null, "Doctor registrado exitosamente.");
        menu.setVisible(true);
        this.dispose();
    }
    catch (NumberFormatException e

    
        ) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI.");
    }
    catch (HeadlessException e

    
        ) {
            JOptionPane.showMessageDialog(null, "Error al registrar el doctor: " + e.getMessage());
    }
}                                            
    private void BtnRegresarInicio1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio1jButton1ActionPerformed
        Pacientes paciente = new Pacientes();

        paciente.setVisible(true);


    }//GEN-LAST:event_BtnRegresarInicio1jButton1ActionPerformed

    private void jbregistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbregistrarMouseClicked

        Citas citas = new Citas
        
        citas.setVisible(true);

        this.dispose();


    }//GEN-LAST:event_jbregistrarMouseClicked

    private void jbregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrarActionPerformed

        int dni = Integer.parseInt(tfDni.getText());
        String nombre = tfNombre.getText();
        String apellido = tfapellidos.getText();
        String telefono = tfTelefono.getText();
        String correo = tfCorreo.getText();
        boolean genero = cbGenero.getSelectedItem().toString().equals("Masculino");
        String especialidad = tfEspecialidad.getText();

        ndoctor.agregarDoctor(dni, nombre, apellido, telefono, correo, genero, especialidad);

        ndoctor.escribirDatosEnArchivo("RegistroDoctor.txt");

        JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente.");

        Pacientes paciente = new Pacientes();

        paciente.setVisible(true);

        this.dispose();
    }//GEN-LAST:event_jbregistrarActionPerformed

    private void tfTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonoActionPerformed

    private void cbGenerojComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenerojComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGenerojComboBox1ActionPerformed

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
            new RegistrarDoctor().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresarInicio1;
    private javax.swing.JLabel LblCorreo;
    private javax.swing.JLabel LblEspecialidad;
    private javax.swing.JLabel LblGenero;
    private javax.swing.JLabel LblTelefono;
    private javax.swing.JLabel LlbApellidos;
    private javax.swing.JLabel LlbNombres;
    private javax.swing.JComboBox<String> cbGenero;
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
    private javax.swing.JLabel lblRegistrarDoctor;
    private Label.Menu menu1;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEspecialidad;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfapellidos;
    // End of variables declaration//GEN-END:variables
}
