package Vista;

import Clases.InicioSesion;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    MenuPrincipal menu = new MenuPrincipal();
    InicioSesion inicioSesion = new InicioSesion();

    public Inicio() {
        initComponents();
        //jpInicio.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpInicio = new javax.swing.JPanel();
        menu1 = new Label.Menu();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Jusuario = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        BtnAccederMenu = new javax.swing.JButton();
        jlbicon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpInicioKeyPressed(evt);
            }
        });
        jpInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 51, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(9, 27, 48));
        jLabel1.setText("Iniciar Sesion");
        menu1.add(jLabel1);
        jLabel1.setBounds(60, 40, 190, 35);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel3.setText("Usuario *");
        menu1.add(jLabel3);
        jLabel3.setBounds(20, 110, 80, 17);

        Jusuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Jusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JusuarioKeyPressed(evt);
            }
        });
        menu1.add(Jusuario);
        Jusuario.setBounds(20, 140, 270, 18);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña *");
        menu1.add(jLabel4);
        jLabel4.setBounds(20, 170, 100, 17);

        contraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        contraseña.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        contraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contraseñaKeyPressed(evt);
            }
        });
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
        BtnAccederMenu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BtnAccederMenuKeyPressed(evt);
            }
        });
        menu1.add(BtnAccederMenu);
        BtnAccederMenu.setBounds(20, 250, 270, 31);

        jpInicio.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 310, 350));

        jlbicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/FondoDoctoor.jpg"))); // NOI18N
        jpInicio.add(jlbicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        getContentPane().add(jpInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAccederMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAccederMenuActionPerformed
        iniciarSesion();
    }//GEN-LAST:event_BtnAccederMenuActionPerformed

    private void contraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contraseñaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();
        }
    }//GEN-LAST:event_contraseñaKeyPressed

    private void BtnAccederMenuKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BtnAccederMenuKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            iniciarSesion();
        }
    }//GEN-LAST:event_BtnAccederMenuKeyPressed

    private void JusuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JusuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            contraseña.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_JusuarioKeyPressed

    private void jpInicioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpInicioKeyPressed
        /*if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        } else if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Jusuario.requestFocus();
        }*/
    }//GEN-LAST:event_jpInicioKeyPressed

    private void iniciarSesion() {
        String usuario = Jusuario.getText().trim();
        String contra = new String(contraseña.getPassword()).trim();

        if (inicioSesion == null) {
            inicioSesion = new InicioSesion();
        }

        if (inicioSesion.ingresar(usuario, contra)) {
            menu.setVisible(true);
            dispose();
        } else {
            Jusuario.setText("");
            contraseña.setText("");
            JOptionPane.showMessageDialog(this, "Error: Usuario o contraseña incorrectos. Por favor, inténtalo de nuevo.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
            Jusuario.requestFocus();
        }
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAccederMenu;
    private javax.swing.JTextPane Jusuario;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlbicon;
    private javax.swing.JPanel jpInicio;
    private Label.Menu menu1;
    // End of variables declaration//GEN-END:variables
}
