package Vista;

import Clases.InicioSesion;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    InicioSesion inicioSesion = new InicioSesion();

    public IniciarSesion() {
        initComponents();

        this.setLocationRelativeTo(null);
        rsscalelabel.RSScaleLabel.setScaleLabel(fondo, "src/iconos/FondoDoctorr.jpg");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu1 = new Label.Menu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jusuario = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        BtnAccederMenu = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro Medico");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 0, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 51, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 27, 48));
        jLabel1.setText("Iniciar Sesion");
        menu1.add(jLabel1);
        jLabel1.setBounds(60, 40, 190, 35);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("Usuario *");
        menu1.add(jLabel2);
        jLabel2.setBounds(20, 110, 80, 17);

        Jusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        menu1.add(Jusuario);
        Jusuario.setBounds(20, 140, 270, 18);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña *");
        menu1.add(jLabel3);
        jLabel3.setBounds(20, 170, 100, 17);

        contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        contraseña.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        menu1.add(contraseña);
        contraseña.setBounds(20, 210, 270, 18);

        BtnAccederMenu.setBackground(new java.awt.Color(9, 27, 48));
        BtnAccederMenu.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        BtnAccederMenu.setForeground(new java.awt.Color(255, 255, 255));
        BtnAccederMenu.setText("Acceder");
        BtnAccederMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAccederMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAccederMenuActionPerformed(evt);
            }
        });
        menu1.add(BtnAccederMenu);
        BtnAccederMenu.setBounds(20, 250, 270, 31);

        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 310, 360));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/FondoDoctorr.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAccederMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAccederMenuActionPerformed

        String usuario = Jusuario.getText();
        String contra = new String(this.contraseña.getPassword());

        if (inicioSesion == null) {
            inicioSesion = new InicioSesion();
        }

        if (inicioSesion.ingresar(usuario, contra)) {

            Menu menu = new Menu();
            menu.setVisible(true);

            dispose();
        } else {

            JOptionPane.showMessageDialog(this, "Error: Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnAccederMenuActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAccederMenu;
    private javax.swing.JTextPane Jusuario;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private Label.Menu menu1;
    // End of variables declaration//GEN-END:variables
}
