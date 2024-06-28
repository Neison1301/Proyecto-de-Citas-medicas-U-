package vistas.cliente;

import config.Conexion;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
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
        jSeparator57 = new javax.swing.JSeparator();
        LblTelefono1 = new javax.swing.JLabel();
        tfTelefono = new javax.swing.JTextField();
        LlbApellidos = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        tfapellidos = new javax.swing.JTextField();
        LlbApellidos1 = new javax.swing.JLabel();
        jSeparator59 = new javax.swing.JSeparator();
        jDateNacimiento = new com.toedter.calendar.JDateChooser();
        LblTelefono2 = new javax.swing.JLabel();
        tfDireccion = new javax.swing.JTextField();
        jSeparator60 = new javax.swing.JSeparator();
        LblTelefono3 = new javax.swing.JLabel();
        tfCiudad = new javax.swing.JTextField();
        jSeparator61 = new javax.swing.JSeparator();
        LblTelefono4 = new javax.swing.JLabel();
        tfCodigoPostal = new javax.swing.JTextField();
        jSeparator62 = new javax.swing.JSeparator();
        LlbApellidos2 = new javax.swing.JLabel();
        jSeparator63 = new javax.swing.JSeparator();
        jSeparator64 = new javax.swing.JSeparator();
        jDateChooserRegistro = new com.toedter.calendar.JDateChooser();

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

        jSeparator57.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono1.setText("Estado");

        tfTelefono.setBorder(null);
        tfTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefonojTextField4ActionPerformed(evt);
            }
        });

        LlbApellidos.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos.setText("Apellidos");

        tfEstado.setBorder(null);

        jSeparator58.setForeground(new java.awt.Color(0, 0, 0));

        tfapellidos.setBorder(null);

        LlbApellidos1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos1.setText("Fecha de Nacimiento");

        jSeparator59.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono2.setText("Direccion");

        tfDireccion.setBorder(null);

        jSeparator60.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono3.setText("Ciudad");

        tfCiudad.setBorder(null);

        jSeparator61.setForeground(new java.awt.Color(0, 0, 0));

        LblTelefono4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LblTelefono4.setText("Codigo Postal");

        tfCodigoPostal.setBorder(null);

        jSeparator62.setForeground(new java.awt.Color(0, 0, 0));

        LlbApellidos2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        LlbApellidos2.setText("Fecha de Registro");

        jSeparator63.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator64.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblTelefono)
                            .addComponent(LblCorreo))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooserRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                .addComponent(jSeparator63))
                            .addComponent(LlbApellidos2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblGenero)
                                    .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTelefono3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jDateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LlbApellidos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDni)
                                    .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LlbNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(120, 120, 120)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LlbApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTelefono1)
                                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblTelefono4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(BtnRegresarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101)
                                .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(tfContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel94)
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(lblDni)
                        .addGap(2, 2, 2)
                        .addComponent(tfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LlbNombres)
                            .addComponent(LlbApellidos))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(LblGenero)
                        .addGap(6, 6, 6)
                        .addComponent(cbGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(LlbApellidos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(LblTelefono1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator59, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(LblTelefono2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(LblTelefono3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(LblTelefono4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(LblTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(LlbApellidos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooserRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator63, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(jSeparator56, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRegresarInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        menu1.add(jPanel12);
        jPanel12.setBounds(0, 10, 740, 470);

        jPanel1.add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 770, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfTelefonojTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefonojTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefonojTextField4ActionPerformed

    private void jbregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbregistrarActionPerformed
        int dni, telefono;
        String nombre, apellido, email, direccion, ciudad, estado, codigoPostal;
        boolean genero;
        LocalDate fechaNacimiento, fechaRegistro;

        if (tfDni.getText().isEmpty() || tfNombre.getText().isEmpty() || tfapellidos.getText().isEmpty()
                || tfTelefono.getText().isEmpty() || tfCorreo.getText().isEmpty() || tfDireccion.getText().isEmpty()
                || tfCiudad.getText().isEmpty() || tfEstado.getText().isEmpty() || tfCodigoPostal.getText().isEmpty()
                || cbGenero.getSelectedItem() == null || jDateNacimiento.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
            return;
        }

        try {
            dni = Integer.parseInt(tfDni.getText());
            nombre = tfNombre.getText();
            apellido = tfapellidos.getText();
            telefono = Integer.parseInt(tfTelefono.getText());
            email = tfCorreo.getText();
            direccion = tfDireccion.getText();
            ciudad = tfCiudad.getText();
            estado = tfEstado.getText();
            codigoPostal = tfCodigoPostal.getText();
            genero = cbGenero.getSelectedItem().toString().equals("Masculino");
            fechaNacimiento = jDateNacimiento.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            fechaRegistro = LocalDate.now();  // Fecha de registro actual

            // Crear instancia de PacientesDTO con los datos del formulario
            PacientesDTO nuevoPaciente = new PacientesDTO(0, dni, nombre, apellido, fechaNacimiento, telefono, email, genero, direccion, ciudad, estado, codigoPostal);

            // Crear instancia de Conexion y PacientesDAO
            Conexion conexion = new Conexion();
            PacientesDAO nPacientesDAO = new PacientesDAO(conexion, 0, dni, nombre, apellido, telefono, email, genero);

            // Llamar al método crear de PacientesDAO con el objeto PacientesDTO
            nPacientesDAO.crear(nuevoPaciente);

            JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente.");

            // Cerrar la ventana actual después de registrar
            this.dispose();

            // Mostrar la ventana de Pacientes (suponiendo que es tu siguiente ventana)
            Pacientes pacientes = new Pacientes();
            pacientes.setVisible(true);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el DNI o el teléfono.");
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el paciente: " + e.getMessage());
        }
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

    private void tfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDniActionPerformed

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
    private javax.swing.JLabel LblTelefono2;
    private javax.swing.JLabel LblTelefono3;
    private javax.swing.JLabel LblTelefono4;
    private javax.swing.JLabel LlbApellidos;
    private javax.swing.JLabel LlbApellidos1;
    private javax.swing.JLabel LlbApellidos2;
    private javax.swing.JLabel LlbNombres;
    private javax.swing.JComboBox<String> cbGenero;
    private com.toedter.calendar.JDateChooser jDateChooserRegistro;
    private com.toedter.calendar.JDateChooser jDateNacimiento;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JButton jbregistrar;
    private javax.swing.JLabel lblDni;
    private Label.Menu menu1;
    private javax.swing.JTextField tfCiudad;
    private javax.swing.JTextField tfCodigoPostal;
    private javax.swing.JTextField tfContraseña;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfDni;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfTelefono;
    private javax.swing.JTextField tfapellidos;
    // End of variables declaration//GEN-END:variables
}
