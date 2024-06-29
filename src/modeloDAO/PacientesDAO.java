package modeloDAO;

import miAbstract.Persona;
import miInterfaces.CRUD;
import config.Conexion;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import modeloDTO.PacientesDTO;
import java.sql.CallableStatement;

public class PacientesDAO extends Persona implements CRUD<PacientesDTO> {

    private Conexion conexion;

    public PacientesDAO(Conexion conexion, int id, int dni, String nombre, String apellido, int telefono, String email, boolean genero) {
        super(id, dni, nombre, apellido, telefono, email, genero);
        this.conexion = conexion;
    }

    @Override
    public void crear(PacientesDTO paciente) {
        String sql = "INSERT INTO Pacientes (DniPaciente, NPaciente, Apellidos, FechaNacimiento, Telefono, Email, Genero, Direccion, Ciudad, Estado, CodigoPostal) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, paciente.getDniPaciente());
            pstmt.setString(2, paciente.getnPaciente());
            pstmt.setString(3, paciente.getApellidos());
            pstmt.setDate(4, java.sql.Date.valueOf(paciente.getFechaNacimiento()));
            pstmt.setInt(5, paciente.getTelefono());
            pstmt.setString(6, paciente.getEmail());
            pstmt.setString(7, paciente.isGenero() ? "Masculino" : "Femenino");
            pstmt.setString(8, paciente.getDireccion());
            pstmt.setString(9, paciente.getCiudad());
            pstmt.setString(10, paciente.getEstado());
            pstmt.setString(11, paciente.getCodigoPostal());

            pstmt.execute();

            JOptionPane.showMessageDialog(null, "Paciente registrado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar paciente: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(int id) {
        String sqlSelect = "SELECT DniPaciente, NPaciente, Apellidos, FechaNacimiento, Telefono, Email, Genero, Direccion, Ciudad, Estado, CodigoPostal FROM Pacientes WHERE IdPaciente = ?";
        String sqlUpdate = "UPDATE Pacientes SET DniPaciente = ?, NPaciente = ?, Apellidos = ?, FechaNacimiento = ?, Telefono = ?, Email = ?, Genero = ?, Direccion = ?, Ciudad = ?, Estado = ?, CodigoPostal = ? WHERE IdPaciente = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {
            pstmtSelect.setInt(1, id);

            try (ResultSet rs = pstmtSelect.executeQuery()) {
                if (rs.next()) {
                    int dniActual = rs.getInt("DniPaciente");
                    String nombreActual = rs.getString("NPaciente");
                    String apellidoActual = rs.getString("Apellidos");
                    LocalDate fechaNacimientoActual = rs.getDate("FechaNacimiento").toLocalDate();
                    int telefonoActual = rs.getInt("Telefono");
                    String emailActual = rs.getString("Email");
                    boolean generoActual = rs.getString("Genero").equalsIgnoreCase("Masculino");
                    String direccionActual = rs.getString("Direccion");
                    String ciudadActual = rs.getString("Ciudad");
                    String estadoActual = rs.getString("Estado");
                    String codigoPostalActual = rs.getString("CodigoPostal");

                    // Implement JOptionPane for editing data
                    JTextField tfDni = new JTextField(String.valueOf(dniActual));
                    JTextField tfNombre = new JTextField(nombreActual);
                    JTextField tfApellido = new JTextField(apellidoActual);
                    JTextField tfFechaNacimiento = new JTextField(fechaNacimientoActual.toString());
                    JTextField tfTelefono = new JTextField(String.valueOf(telefonoActual));
                    JTextField tfEmail = new JTextField(emailActual);
                    JRadioButton rbMasculino = new JRadioButton("Masculino");
                    JRadioButton rbFemenino = new JRadioButton("Femenino");
                    if (generoActual) {
                        rbMasculino.setSelected(true);
                    } else {
                        rbFemenino.setSelected(true);
                    }
                    ButtonGroup bgGenero = new ButtonGroup();
                    bgGenero.add(rbMasculino);
                    bgGenero.add(rbFemenino);
                    JPanel generoPanel = new JPanel();
                    generoPanel.add(rbMasculino);
                    generoPanel.add(rbFemenino);
                    JTextField tfDireccion = new JTextField(direccionActual);
                    JTextField tfCiudad = new JTextField(ciudadActual);
                    JTextField tfEstado = new JTextField(estadoActual);
                    JTextField tfCodigoPostal = new JTextField(codigoPostalActual);

                    Object[] message = {
                        "Dni:", tfDni,
                        "Nombre:", tfNombre,
                        "Apellido:", tfApellido,
                        "Fecha Nacimiento:", tfFechaNacimiento,
                        "Teléfono:", tfTelefono,
                        "Email:", tfEmail,
                        "Género:", generoPanel,
                        "Dirección:", tfDireccion,
                        "Ciudad:", tfCiudad,
                        "Estado:", tfEstado,
                        "Código Postal:", tfCodigoPostal
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Editar Paciente", JOptionPane.OK_CANCEL_OPTION);

                    if (option == JOptionPane.OK_OPTION) {
                        pstmtUpdate.setInt(1, Integer.parseInt(tfDni.getText()));
                        pstmtUpdate.setString(2, tfNombre.getText());
                        pstmtUpdate.setString(3, tfApellido.getText());
                        pstmtUpdate.setDate(4, java.sql.Date.valueOf(tfFechaNacimiento.getText()));
                        pstmtUpdate.setInt(5, Integer.parseInt(tfTelefono.getText()));
                        pstmtUpdate.setString(6, tfEmail.getText());
                        pstmtUpdate.setString(7, rbMasculino.isSelected() ? "Masculino" : "Femenino");
                        pstmtUpdate.setString(8, tfDireccion.getText());
                        pstmtUpdate.setString(9, tfCiudad.getText());
                        pstmtUpdate.setString(10, tfEstado.getText());
                        pstmtUpdate.setString(11, tfCodigoPostal.getText());
                        pstmtUpdate.setInt(12, id);

                        int rowsAffected = pstmtUpdate.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Paciente actualizado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el paciente seleccionado.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el paciente seleccionado.");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar paciente: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "{CALL EliminarPacienteYConsultas(?)}";

        try (Connection conn = conexion.establecerConexion(); CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, id);
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Paciente y sus citas médicas eliminadas correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar paciente y sus citas médicas: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<PacientesDTO> leer(int dni) {
        ArrayList<PacientesDTO> pacientes = new ArrayList<>();

        String sql = "SELECT IdPaciente, DniPaciente, NPaciente, Apellidos, FechaNacimiento, Telefono, Email, Genero, Direccion, Ciudad, Estado, CodigoPostal FROM Pacientes";
        if (dni != 0) {
            sql += " WHERE DniPaciente = ?";
        }
        try {
            Connection conn = conexion.establecerConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            if (dni != 0) {
                pstmt.setInt(1, dni);
            }
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int idPaciente = rs.getInt("IdPaciente");
                int dniPaciente = rs.getInt("DniPaciente");
                String nombrePaciente = rs.getString("NPaciente");
                String apellidos = rs.getString("Apellidos");
                LocalDate fechaNacimiento = rs.getDate("FechaNacimiento").toLocalDate();
                int telefono = rs.getInt("Telefono");
                String email = rs.getString("Email");
                boolean genero = rs.getString("Genero").equalsIgnoreCase("Masculino");
                String direccion = rs.getString("Direccion");
                String ciudad = rs.getString("Ciudad");
                String estado = rs.getString("Estado");
                String codigoPostal = rs.getString("CodigoPostal");

                PacientesDTO paciente = new PacientesDTO(idPaciente, dniPaciente, nombrePaciente, apellidos, fechaNacimiento, telefono, email, genero, direccion, ciudad, estado, codigoPostal);
                pacientes.add(paciente);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer pacientes: " + e.getMessage());
        }
        return pacientes;
    }

    public void mostrarCitas(JTable tabla, int dni) {
        int ids = 0;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        Conexion c = new Conexion();
        PacientesDAO pacientesdao = new PacientesDAO(c, 0, 0, null, null, 0, null, true);
        ArrayList<PacientesDTO> pacientesss = pacientesdao.leer(ids);

        if (pacientesss != null) {
            System.out.println("Cantidad de citas recuperadas: " + pacientesss.size());  // Mensaje de diagnóstico
            for (PacientesDTO pacientesDTO : pacientesss) {
                modelo.addRow(new Object[]{pacientesDTO.getIdPaciente(), pacientesDTO.getnPaciente() + " " + pacientesDTO.getApellidos(), pacientesDTO.getTelefono()});
            }
        } else {
            System.out.println("La lista de citas es nula o está vacía.");
        }
    }

    public void mostrarDetallePaciente(int id, JTextArea textArea) {
        String sql = "SELECT DniPaciente, NPaciente, Apellidos, FechaNacimiento, Telefono, Email, Genero, Direccion, Ciudad, Estado, CodigoPostal FROM Pacientes WHERE IdPaciente = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String detallePaciente = String.format("DNI: %s\nNombre: %s\nApellidos: %s\nFecha de Nacimiento: %s\nTeléfono: %s\nEmail: %s\nGénero: %s\nDirección: %s\nCiudad: %s\nEstado: %s\nCódigo Postal: %s\n",
                        rs.getInt("DniPaciente"),
                        rs.getString("NPaciente"),
                        rs.getString("Apellidos"),
                        rs.getDate("FechaNacimiento"),
                        rs.getString("Telefono"),
                        rs.getString("Email"),
                        rs.getString("Genero"),
                        rs.getString("Direccion"),
                        rs.getString("Ciudad"),
                        rs.getString("Estado"),
                        rs.getString("CodigoPostal"));

                textArea.setText(detallePaciente);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el paciente con ID " + id);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar detalle del paciente: " + e.getMessage());
        }
    }

    public PacientesDTO buscarPorDni(int dni, JTable tabla) {
        PacientesDTO paciente = null;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de agregar nuevos datos

        String sql = "SELECT IdPaciente, DniPaciente, NPaciente, Apellidos, FechaNacimiento, Telefono, Email, Genero, Direccion, Ciudad, Estado, CodigoPostal FROM Pacientes WHERE DniPaciente = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, dni);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int idPaciente = rs.getInt("IdPaciente");
                    int dniPaciente = rs.getInt("DniPaciente");
                    String nombrePaciente = rs.getString("NPaciente");
                    String apellidos = rs.getString("Apellidos");
                    LocalDate fechaNacimiento = rs.getDate("FechaNacimiento").toLocalDate();
                    int telefono = rs.getInt("Telefono"); // Cambiado a String
                    String email = rs.getString("Email");
                    boolean genero = rs.getString("Genero").equalsIgnoreCase("Masculino");
                    String direccion = rs.getString("Direccion");
                    String ciudad = rs.getString("Ciudad");
                    String estado = rs.getString("Estado");
                    String codigoPostal = rs.getString("CodigoPostal");

                    paciente = new PacientesDTO(idPaciente, dniPaciente, nombrePaciente, apellidos, fechaNacimiento, telefono, email, genero, direccion, ciudad, estado, codigoPostal);

                    modelo.addRow(new Object[]{
                        paciente.getIdPaciente(),
                        paciente.getnPaciente() + " " + paciente.getApellidos(),
                        paciente.getTelefono(),
                    });

                    JOptionPane.showMessageDialog(null, "Paciente encontrado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con ese DNI " + dni);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar paciente por DNI: " + e.getMessage());
        }
        return paciente;
    }

    public ArrayList<String> obtenerNombresPacientes() {
        ArrayList<String> nombres = new ArrayList<>();
        try {
            // Tu lógica para obtener nombres de pacientes desde la base de datos
            String sql = "SELECT NPaciente FROM Pacientes";
            PreparedStatement ps = (PreparedStatement) conexion.establecerConexion();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                nombres.add(rs.getString("NPaciente"));
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener nombres de pacientes: " + ex.getMessage());
        }
        return nombres;
    }

    private Map<String, Integer> pacientesMap = new HashMap<>();

    public void cargarComboPacientes(JComboBox<String> c) {
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        c.setModel(comboModel);

        Conexion cx = new Conexion();
        PacientesDAO pacientesdao = new PacientesDAO(cx, 0, 0, null, null, 0, null, true);
        ArrayList<PacientesDTO> pacientesList = pacientesdao.leer(0);

        pacientesMap.clear();
        for (PacientesDTO paciente : pacientesList) {
            String nombreCompleto = paciente.getnPaciente();
            comboModel.addElement(nombreCompleto);
            pacientesMap.put(nombreCompleto, paciente.getIdPaciente()); // Suponiendo que `getIdPaciente` obtiene el ID del paciente
        }
    }

    public String obtenerNombrePaciente(int idpaciente) {
        String nombrePaciente = "Paciente no encontrado";
        Connection conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexion = this.conexion.establecerConexion(); // Obtener la conexión desde la instancia de la clase Conexion
            String query = "SELECT NPaciente FROM Pacientes WHERE IdPaciente = ?";
            stmt = conexion.prepareStatement(query);
            stmt.setInt(1, idpaciente);
            rs = stmt.executeQuery();

            // Si se encuentra el paciente, asignar el nombre
            if (rs.next()) {
                nombrePaciente = rs.getString("NPaciente");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener nombre del paciente: " + e.getMessage());
        }

        return nombrePaciente;
    }

    /*public int obtenerIdPaciente(String nombrePaciente) throws SQLException {
        int idPaciente = -1;
        String query = "SELECT IdPaciente FROM Pacientes WHERE NPaciente = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nombrePaciente);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                idPaciente = rs.getInt("IdPaciente");
            }
        }
        return idPaciente;
    }*/
}
