package modeloDAO;

import miInterfaces.Boleta;
import miInterfaces.CRUD;
import modeloDTO.DoctorDTO;
import config.Conexion;
import java.math.BigDecimal;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import modeloDTO.EspecialidadMedicaDTO;

public class DoctorDAO implements CRUD<DoctorDTO>, Boleta {

    private Conexion conexion;

    public DoctorDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crear(DoctorDTO doctor) {
        String sql = "INSERT INTO Doctores (DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad, Direccion, Ciudad, Estado, CodigoPostal, FechaContratacion, Salario) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, doctor.getDni());
            pstmt.setString(2, doctor.getNombre());
            pstmt.setString(3, doctor.getApellido());
            pstmt.setInt(4, doctor.getTelefono());
            pstmt.setString(5, doctor.getEmail());
            pstmt.setString(6, doctor.isGenero() ? "Masculino" : "Femenino");
            pstmt.setString(7, doctor.getEspecialidad());
            pstmt.setString(8, doctor.getDireccion());
            pstmt.setString(9, doctor.getCiudad());
            pstmt.setString(10, doctor.getEstado());
            pstmt.setString(11, doctor.getCodigoPostal());
            pstmt.setDate(12, java.sql.Date.valueOf(doctor.getFechaContratacion()));
            pstmt.setBigDecimal(13, doctor.getSalario());

            pstmt.execute();

            JOptionPane.showMessageDialog(null, "Doctor registrado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar doctor: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<DoctorDTO> leer(int dni) {
        ArrayList<DoctorDTO> doctores = new ArrayList<>();

        String sql = "SELECT IdDoctor, DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad, Direccion, Ciudad, Estado, CodigoPostal, FechaContratacion, Salario FROM Doctores";
        if (dni != 0) {
            sql += " WHERE DniDoctor = ?";
        }

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            if (dni != 0) {
                pstmt.setInt(1, dni);
            }

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int doctorId = rs.getInt("IdDoctor");
                int dniDoctor = rs.getInt("DniDoctor");
                String nombre = rs.getString("NDoctor");
                String apellido = rs.getString("Apellido");
                int telefono = rs.getInt("Telefono");
                String email = rs.getString("Email");
                boolean genero = rs.getString("Genero").equalsIgnoreCase("Masculino");
                String especialidad = rs.getString("Especialidad");
                String direccion = rs.getString("Direccion");
                String ciudad = rs.getString("Ciudad");
                String estado = rs.getString("Estado");
                String codigoPostal = rs.getString("CodigoPostal");
                LocalDate fechaContratacion = rs.getDate("FechaContratacion").toLocalDate();
                BigDecimal salario = rs.getBigDecimal("Salario");

                DoctorDTO doctor = new DoctorDTO(doctorId, dniDoctor, nombre, apellido, telefono, email, genero, especialidad, direccion, ciudad, estado, codigoPostal, fechaContratacion, salario);
                doctores.add(doctor);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer doctores: " + e.getMessage());
        }

        return doctores;
    }

    @Override
    public void actualizar(int id) {
        String sqlSelect = "SELECT DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad, Direccion, Ciudad, Estado, CodigoPostal, FechaContratacion, Salario FROM Doctores WHERE IdDoctor = ?";
        String sqlUpdate = "UPDATE Doctores SET DniDoctor = ?, NDoctor = ?, Apellido = ?, Telefono = ?, Email = ?, Genero = ?, Especialidad = ?, Direccion = ?, Ciudad = ?, Estado = ?, CodigoPostal = ?, FechaContratacion = ?, Salario = ? WHERE IdDoctor = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {
            pstmtSelect.setInt(1, id);

            try (ResultSet rs = pstmtSelect.executeQuery()) {
                if (rs.next()) {
                    int dniActual = rs.getInt("DniDoctor");
                    String nombreActual = rs.getString("NDoctor");
                    String apellidoActual = rs.getString("Apellido");
                    int telefonoActual = rs.getInt("Telefono");
                    String emailActual = rs.getString("Email");
                    boolean generoActual = rs.getString("Genero").equalsIgnoreCase("Masculino");
                    String especialidadActual = rs.getString("Especialidad");
                    String direccionActual = rs.getString("Direccion");
                    String ciudadActual = rs.getString("Ciudad");
                    String estadoActual = rs.getString("Estado");
                    String codigoPostalActual = rs.getString("CodigoPostal");
                    LocalDate fechaContratacionActual = rs.getDate("FechaContratacion").toLocalDate();
                    BigDecimal salarioActual = rs.getBigDecimal("Salario");

                    // Mostrar JOptionPane para editar los datos
                    JTextField tfDni = new JTextField(String.valueOf(dniActual));
                    JTextField tfNombre = new JTextField(nombreActual);
                    JTextField tfApellido = new JTextField(apellidoActual);
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
                    JTextField tfEspecialidad = new JTextField(especialidadActual);
                    JTextField tfDireccion = new JTextField(direccionActual);
                    JTextField tfCiudad = new JTextField(ciudadActual);
                    JTextField tfEstado = new JTextField(estadoActual);
                    JTextField tfCodigoPostal = new JTextField(codigoPostalActual);
                    JTextField tfFechaContratacion = new JTextField(fechaContratacionActual.toString());
                    JTextField tfSalario = new JTextField(salarioActual.toString());

                    Object[] message = {
                        "Dni", tfDni,
                        "Nombre:", tfNombre,
                        "Apellido:", tfApellido,
                        "Teléfono:", tfTelefono,
                        "Email:", tfEmail,
                        "Género:", generoPanel,
                        "Especialidad:", tfEspecialidad,
                        "Dirección:", tfDireccion,
                        "Ciudad:", tfCiudad,
                        "Estado:", tfEstado,
                        "Código Postal:", tfCodigoPostal,
                        "Fecha Contratación:", tfFechaContratacion,
                        "Salario:", tfSalario
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Editar Doctor", JOptionPane.OK_CANCEL_OPTION);

                    if (option == JOptionPane.OK_OPTION) {
                        pstmtUpdate.setInt(1, Integer.parseInt(tfDni.getText()));
                        pstmtUpdate.setString(2, tfNombre.getText());
                        pstmtUpdate.setString(3, tfApellido.getText());
                        pstmtUpdate.setInt(4, Integer.parseInt(tfTelefono.getText()));
                        pstmtUpdate.setString(5, tfEmail.getText());
                        pstmtUpdate.setString(6, rbMasculino.isSelected() ? "Masculino" : "Femenino");
                        pstmtUpdate.setString(7, tfEspecialidad.getText());
                        pstmtUpdate.setString(8, tfDireccion.getText());
                        pstmtUpdate.setString(9, tfCiudad.getText());
                        pstmtUpdate.setString(10, tfEstado.getText());
                        pstmtUpdate.setString(11, tfCodigoPostal.getText());
                        pstmtUpdate.setDate(12, java.sql.Date.valueOf(tfFechaContratacion.getText()));
                        pstmtUpdate.setBigDecimal(13, new BigDecimal(tfSalario.getText()));
                        pstmtUpdate.setInt(14, id);

                        int rowsAffected = pstmtUpdate.executeUpdate();

                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(null, "Doctor actualizado correctamente.");
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró el doctor seleccionado.");
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el doctor seleccionado.");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar doctor: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "{CALL EliminarDoctor(?)}";

        try (Connection conn = conexion.establecerConexion(); CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setInt(1, id);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Doctor eliminado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar doctor: " + e.getMessage());
        }
    }

    @Override
    public void generarReporte() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void mostrarCitas(JTable tabla, int dni) {
        int ids = 0;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        Conexion c = new Conexion();

        DoctorDAO doctordao = new DoctorDAO(conexion);

        ArrayList<DoctorDTO> doctorrr = doctordao.leer(ids);

        if (doctorrr != null) {
            System.out.println("Cantidad de doctores recuperadas: " + doctorrr.size());  // Mensaje de diagnóstico
            for (DoctorDTO doctordto : doctorrr) {
                modelo.addRow(new Object[]{doctordto.getId(), doctordto.getNombre() + " " + doctordto.getApellido(), doctordto.getEspecialidad()});
            }
        } else {
            System.out.println("La lista de doctores es nula o está vacía.");
        }
    }

    public void mostrarDetalleCita(int idDoctor, JTextArea textArea) {
        String sql = "SELECT DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad, Direccion, Ciudad, Estado, CodigoPostal, FechaContratacion, Salario FROM Doctores WHERE IdDoctor = ?";

        try (Connection conn = conexion.establecerConexion();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idDoctor);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String detalleDoctor = String.format("Dni: %s\nNombre: %s\nApellido: %s\nTeléfono: %s\nEmail: %s\nGénero: %s\nEspecialidad: %s\nDirección: %s\nCiudad: %s\nEstado: %s\nCódigo Postal: %s\nFecha Contratación: %s\nSalario: %s\n",
                        rs.getInt("DniDoctor"),
                        rs.getString("NDoctor"),
                        rs.getString("Apellido"),
                        rs.getString("Telefono"),
                        rs.getString("Email"),
                        rs.getString("Genero"),
                        rs.getString("Especialidad"),
                        rs.getString("Direccion"),
                        rs.getString("Ciudad"),
                        rs.getString("Estado"),
                        rs.getString("CodigoPostal"),
                        rs.getDate("FechaContratacion"),
                        rs.getBigDecimal("Salario"));

                textArea.setText(detalleDoctor);
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el doctor con ID " + idDoctor);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar detalle del doctor: " + e.getMessage());
        }
    }

    public DoctorDTO buscarDoctorPorNombre(String nombre, JTable tabla) throws SQLException {
        DoctorDTO doctor = null;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);

        String sql = "CALL BuscarDoctorPorNombre(?)";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                doctor = new DoctorDTO(0, 0, null, null, 0, null, true, null, null, null, null, null, null, null);
                doctor.setId(rs.getInt("IdDoctor"));
                doctor.setNombre(rs.getString("NDoctor"));
                doctor.setApellido(rs.getString("Apellido"));
                doctor.setTelefono(rs.getInt("Telefono"));
                doctor.setEmail(rs.getString("Email"));
                // Manejo del campo Genero según su tipo en la base de datos
                String generoString = rs.getString("Genero");
                boolean genero = false;
                if (generoString != null) {
                    genero = generoString.equals("Masculino"); // True si es "Masculino"
                }
                doctor.setGenero(genero);
                doctor.setEspecialidad(rs.getString("Especialidad"));
                doctor.setDireccion(rs.getString("Direccion"));
                doctor.setCiudad(rs.getString("Ciudad"));
                doctor.setEstado(rs.getString("Estado"));
                doctor.setCodigoPostal(rs.getString("CodigoPostal"));
                doctor.setFechaContratacion(rs.getDate("FechaContratacion").toLocalDate());
                doctor.setSalario(rs.getBigDecimal("Salario"));

                modelo.addRow(new Object[]{doctor.getId(), doctor.getNombre() + " " + doctor.getApellido(), doctor.getEspecialidad()});
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún doctor con ese nombre " + nombre);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar doctor por su nombre: " + e.getMessage());
        }

        return doctor;

    }
    private Map<String, Integer> doctoresMap = new HashMap<>();

    public void cargarComboDoctores(JComboBox<String> c) {

        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        c.setModel(comboModel);

        Conexion cx = new Conexion();
        DoctorDAO doctordao = new DoctorDAO(cx);
        ArrayList<DoctorDTO> doctorList = doctordao.leer(0);

        doctoresMap.clear();
        for (DoctorDTO doctordto : doctorList) {
            String nombreCompleto = doctordto.getNombre();
            comboModel.addElement(nombreCompleto);
            doctoresMap.put(nombreCompleto, doctordto.getId()); // Suponiendo que `getIdDoctor` obtiene el ID del doctor
        }
    }

    public String obtenerNombreDoctor(int idDoctor) {
        String nombreDoctor = "Doctor no encontrado";
        Connection conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexion = this.conexion.establecerConexion(); // Obtener la conexión desde la instancia de la clase Conexion
            String query = "SELECT NDoctor FROM Doctores WHERE IdDoctor = ?";
            stmt = conexion.prepareStatement(query);
            stmt.setInt(1, idDoctor);
            rs = stmt.executeQuery();

            // Si se encuentra el doctor, asignar el nombre
            if (rs.next()) {
                nombreDoctor = rs.getString("NDoctor");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener nombre del doctor: " + e.getMessage());
        }
        return nombreDoctor;
    }

   public String obtenerNombreyApellidoDoctor(int idDoctor) {
    String nombreDoctor = "Doctor no encontrado";
    Connection conexion = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
        conexion = this.conexion.establecerConexion(); // Obtener la conexión desde la instancia de la clase Conexion
        String query = "SELECT NDoctor, Apellido FROM Doctores WHERE IdDoctor = ?";
        stmt = conexion.prepareStatement(query);
        stmt.setInt(1, idDoctor);
        rs = stmt.executeQuery();

        // Si se encuentra el doctor, asignar el nombre y apellido
        if (rs.next()) {
            nombreDoctor = rs.getString("NDoctor") + " " + rs.getString("Apellido");
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener nombre del doctor: " + e.getMessage());
    
    }
    return nombreDoctor;
}


    public void asignarEspecialidad(int idDoctor, int idEspecialidad) {
        String sql = "INSERT INTO Doctor_Especialidad (IdDoctor, IdEspecialidad) VALUES (?, ?)";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idDoctor);
            pstmt.setInt(2, idEspecialidad);
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Especialidad asignada correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al asignar especialidad: " + e.getMessage());
        }
    }

    public ArrayList<EspecialidadMedicaDTO> obtenerEspecialidadesPorDoctor(int idDoctor) {
        ArrayList<EspecialidadMedicaDTO> especialidades = new ArrayList<>();
        String sql = "SELECT em.IdEspecialidad, em.NombreEspecialidad "
                + "FROM EspecialidadesMedicas em "
                + "JOIN Doctor_Especialidad de ON em.IdEspecialidad = de.IdEspecialidad "
                + "WHERE de.IdDoctor = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idDoctor);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int idEspecialidad = rs.getInt("IdEspecialidad");
                String nombreEspecialidad = rs.getString("NombreEspecialidad");
                EspecialidadMedicaDTO especialidad = new EspecialidadMedicaDTO(idEspecialidad, nombreEspecialidad);
                especialidades.add(especialidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener especialidades: " + e.getMessage());
        }

        return especialidades;
    }

    // Método para cargar especialidades en un combo box
    public void cargarComboEspecialidades(JComboBox<String> comboBox) {
        EspecialidadesMedicasDAO especialidadesMedicasDAO = new EspecialidadesMedicasDAO(conexion);
        ArrayList<EspecialidadMedicaDTO> especialidades = especialidadesMedicasDAO.leer();
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        comboBox.setModel(comboModel);
        for (EspecialidadMedicaDTO especialidad : especialidades) {
            comboModel.addElement(especialidad.getNombreEspecialidad());
        }
    }

}
