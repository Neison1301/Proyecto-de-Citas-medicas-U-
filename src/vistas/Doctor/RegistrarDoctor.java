
package vistas.Doctor;

import config.Conexion;
import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JOptionPane;
import modeloDTO.DoctorDTO;
import modeloDAO.DoctorDAO;
import vistas.cliente.MenuPrincipal;


public class RegistrarDoctor extends javax.swing.JFrame {

    MenuPrincipal menu = new MenuPrincipal();

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
        tfEspecialidad = new javax.swing.JTextField();
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
        LlbNombres2 = new javax.swing.JLabel();
        tfdireccion = new javax.swing.JTextField();
        jSeparator64 = new javax.swing.JSeparator();
        LlbNombres3 = new javax.swing.JLabel();
        tfciudad = new javax.swing.JTextField();
        jSeparator65 = new javax.swing.JSeparator();
        LlbNombres4 = new javax.swing.JLabel();
        tfcodigopostal = new javax.swing.JTextField();
        jSeparator66 = new javax.swing.JSeparator();
        LlbNombres5 = new javax.swing.JLabel();
        jSeparator67 = new javax.swing.JSeparator();
        jDateChooserFechadeContrato = new com.toedter.calendar.JDateChooser();
        jformatedSalario = new javax.swing.JFormattedTextField();
        LlbNombres6 = new javax.swing.JLabel();
        jSeparator68 = new javax.swing.JSeparator();
        LlbNombres7 = new javax.swing.JLabel();
        tfestado = new javax.swing.JTextField();
        jSeparator69 = new javax.swing.JSeparator();

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
        tfapellidos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfapellidos1ActionPerformed(evt);
            }
        });

        jSeparator60.setForeground(new java.awt.Color(0, 0, 0));

        LblEspecialidad1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblEspecialidad1.setText("Especialidad");

        tfEspecialidad.setBorder(null);

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

        LlbNombres2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres2.setText("Direccion");

        tfdireccion.setBorder(null);

        jSeparator64.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres3.setText("Ciudad");

        tfciudad.setBorder(null);

        jSeparator65.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres4.setText("Codigo Postal ");

        tfcodigopostal.setBorder(null);

        jSeparator66.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres5.setText("Fecha de Contratacion");

        jSeparator67.setForeground(new java.awt.Color(0, 0, 0));

        jformatedSalario.setText("jFormattedTextField1");
        jformatedSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jformatedSalarioActionPerformed(evt);
            }
        });

        LlbNombres6.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres6.setText("Salario");

        jSeparator68.setForeground(new java.awt.Color(0, 0, 0));

        LlbNombres7.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbNombres7.setText("Estado");

        tfestado.setBorder(null);

        jSeparator69.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistrarDoctor1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblCorreo1)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfDni1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDni1)
                                            .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(LblEspecialidad1)
                                                .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LlbNombres1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(LlbNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(tfdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(tfcodigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jSeparator66, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jSeparator67, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(LlbNombres5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(jDateChooserFechadeContrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                            .addComponent(LlbNombres4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addComponent(LlbNombres3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTelefono1)
                                    .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGap(112, 112, 112)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jformatedSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LlbNombres6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator68, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LlbApellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfapellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblGenero1)
                                            .addComponent(LlbNombres7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jSeparator69, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfestado, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8)))))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblRegistrarDoctor1)
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lblDni1)
                        .addGap(2, 2, 2)
                        .addComponent(tfDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(LlbNombres1)
                        .addGap(6, 6, 6)
                        .addComponent(tfNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(LlbApellidos1)
                        .addGap(6, 6, 6)
                        .addComponent(tfapellidos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(LblEspecialidad1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(LlbNombres3)
                        .addGap(6, 6, 6)
                        .addComponent(tfciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblTelefono1)
                        .addGap(1, 1, 1)
                        .addComponent(tfTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(LblCorreo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCorreo1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(LlbNombres2)
                                .addGap(6, 6, 6)
                                .addComponent(tfdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(LblGenero1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbGenero1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(LlbNombres4)
                                .addGap(6, 6, 6)
                                .addComponent(tfcodigopostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(LlbNombres7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(LlbNombres6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jformatedSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(LlbNombres5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserFechadeContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRegresarInicio2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbregistrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        menu2.add(jPanel13);
        jPanel13.setBounds(10, 10, 750, 460);

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

    private void tfCorreo1jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCorreo1jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCorreo1jTextField5ActionPerformed

    private void BtnRegresarInicio2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2MouseClicked
        menu.setVisible(true);

        this.dispose();    }//GEN-LAST:event_BtnRegresarInicio2MouseClicked

    private void BtnRegresarInicio2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarInicio2jButton1ActionPerformed


    }//GEN-LAST:event_BtnRegresarInicio2jButton1ActionPerformed

    private void jbregistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrar1ActionPerformed
        int dni, telefono;
        String nombre, apellido, correo, especialidad, direccion, ciudad, estado, codigoPostal;
        boolean genero;
        LocalDate fechaContratacion;
        BigDecimal salario;

        if (tfDni1.getText().isEmpty() || tfNombre1.getText().isEmpty() || tfapellidos1.getText().isEmpty()
                || tfTelefono1.getText().isEmpty() || tfCorreo1.getText().isEmpty() || tfEspecialidad.getText().isEmpty()
                || tfdireccion.getText().isEmpty() || tfciudad.getText().isEmpty() || tfestado.getText().isEmpty()
                || tfcodigopostal.getText().isEmpty() || jDateChooserFechadeContrato.getDate() == null || jformatedSalario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        try {
            dni = Integer.parseInt(tfDni1.getText());
            nombre = tfNombre1.getText();
            apellido = tfapellidos1.getText();
            telefono = Integer.parseInt(tfTelefono1.getText());
            correo = tfCorreo1.getText();
            genero = cbGenero1.getSelectedItem().toString().equals("Masculino");
            especialidad = tfEspecialidad.getText();
            direccion = tfdireccion.getText();
            ciudad = tfciudad.getText();
            estado = tfestado.getText();
            codigoPostal = tfcodigopostal.getText();
            fechaContratacion = LocalDate.of(jDateChooserFechadeContrato.getCalendar().get(Calendar.YEAR), jDateChooserFechadeContrato.getCalendar().get(Calendar.MONTH) + 1, jDateChooserFechadeContrato.getCalendar().get(Calendar.DAY_OF_MONTH));
            salario = new BigDecimal(jformatedSalario.getText().replace(",", ""));

            // Crear una instancia de DoctorDTO
            DoctorDTO nuevoDoctor = new DoctorDTO(0, dni, nombre, apellido, telefono, estado, genero, especialidad, direccion, ciudad, estado, codigoPostal, fechaContratacion, salario);
            Conexion conexion = new Conexion();
            DoctorDAO doctordao = new DoctorDAO(conexion);
            doctordao.crear(nuevoDoctor);

            // Mostrar la ventana de pacientes u otra ventana según sea necesario
            MenuPrincipal menu1 = new MenuPrincipal();
            menu1.setVisible(true);
            this.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI o salario.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el doctor: " + e.getMessage());
        
        }    }//GEN-LAST:event_jbregistrar1ActionPerformed

    private void cbGenero1jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGenero1jComboBox1ActionPerformed
    }//GEN-LAST:event_cbGenero1jComboBox1ActionPerformed

    private void jformatedSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jformatedSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jformatedSalarioActionPerformed

    private void tfapellidos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfapellidos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfapellidos1ActionPerformed

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
    private javax.swing.JLabel LlbNombres2;
    private javax.swing.JLabel LlbNombres3;
    private javax.swing.JLabel LlbNombres4;
    private javax.swing.JLabel LlbNombres5;
    private javax.swing.JLabel LlbNombres6;
    private javax.swing.JLabel LlbNombres7;
    private javax.swing.JComboBox<String> cbGenero1;
    private com.toedter.calendar.JDateChooser jDateChooserFechadeContrato;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JButton jbregistrar1;
    private javax.swing.JFormattedTextField jformatedSalario;
    private javax.swing.JLabel lblDni1;
    private javax.swing.JLabel lblRegistrarDoctor1;
    private Label.Menu menu2;
    private javax.swing.JTextField tfCorreo1;
    private javax.swing.JTextField tfDni1;
    private javax.swing.JTextField tfEspecialidad;
    private javax.swing.JTextField tfNombre1;
    private javax.swing.JTextField tfTelefono1;
    private javax.swing.JTextField tfapellidos1;
    private javax.swing.JTextField tfciudad;
    private javax.swing.JTextField tfcodigopostal;
    private javax.swing.JTextField tfdireccion;
    private javax.swing.JTextField tfestado;
    // End of variables declaration//GEN-END:variables
}
