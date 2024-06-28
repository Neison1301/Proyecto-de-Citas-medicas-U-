package modeloDAO;

import miInterfaces.Boleta;
import miInterfaces.CRUD;
import modeloDTO.DoctorDTO;
import config.Conexion;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class DoctorDAO implements CRUD<DoctorDTO>, Boleta {

    private Conexion conexion;

    public DoctorDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void crear(DoctorDTO doctor) {
        String sql = "INSERT INTO Doctores (DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, doctor.getDni());
            pstmt.setString(2, doctor.getNombre());
            pstmt.setString(3, doctor.getApellido());
            pstmt.setInt(4, doctor.getTelefono());
            pstmt.setString(5, doctor.getEmail());
            pstmt.setString(6, doctor.isGenero() ? "Masculino" : "Femenino");
            pstmt.setString(7, doctor.getEspecialidad());

            pstmt.execute();

            JOptionPane.showMessageDialog(null, "Doctor registrado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar doctor: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<DoctorDTO> leer(int dni) {
        ArrayList<DoctorDTO> doctores = new ArrayList<>();

        String sql = "SELECT IdDoctor, DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad FROM Doctores";
        if (dni != 0) {
            sql += " WHERE IdDoctor = ?";
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

                DoctorDTO doctor = new DoctorDTO(doctorId,dniDoctor, nombre, apellido, telefono, email, genero, especialidad);
                doctores.add(doctor);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer doctores: " + e.getMessage());
        }

        return doctores;
    }

    @Override
    public void actualizar(int id) {
        String sqlSelect = "SELECT DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad FROM Doctores WHERE IdDoctor = ?";
        String sqlUpdate = "UPDATE Doctores SET DniDoctor = ?, NDoctor = ?, Apellido = ?, Telefono = ?, Email = ?, Genero = ?, Especialidad = ? WHERE IdDoctor = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {

            pstmtSelect.setInt(1, id);

            try (ResultSet rs = pstmtSelect.executeQuery()) {
                if (rs.next()) {
                    int dniActual = rs.getInt("DniDoctor");
                    String nombreActual = rs.getString("NDoctor");
                    String apellidoActual = rs.getString("Apellido");
                    String telefonoActual = rs.getString("Telefono");
                    String emailActual = rs.getString("Email");
                    boolean generoActual = rs.getString("Genero").equalsIgnoreCase("Masculino");
                    String especialidadActual = rs.getString("Especialidad");

                    // Mostrar JOptionPane para editar los datos
                    JTextField tfDni = new JTextField(String.valueOf(dniActual));
                    JTextField tfNombre = new JTextField(nombreActual);
                    JTextField tfApellido = new JTextField(apellidoActual);
                    JTextField tfTelefono = new JTextField(telefonoActual);
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

                    Object[] message = {
                        "Dni", tfDni,
                        "Nombre:", tfNombre,
                        "Apellido:", tfApellido,
                        "Teléfono:", tfTelefono,
                        "Email:", tfEmail,
                        "Género:", generoPanel,
                        "Especialidad:", tfEspecialidad
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Editar Doctor", JOptionPane.OK_CANCEL_OPTION);

                    if (option == JOptionPane.OK_OPTION) {
                        pstmtUpdate.setInt(1, Integer.parseInt(tfDni.getText()));
                        pstmtUpdate.setString(2, tfNombre.getText());
                        pstmtUpdate.setString(3, tfApellido.getText());
                        pstmtUpdate.setString(4, tfTelefono.getText());
                        pstmtUpdate.setString(5, tfEmail.getText());
                        pstmtUpdate.setString(6, rbMasculino.isSelected() ? "Masculino" : "Femenino");
                        pstmtUpdate.setString(7, tfEspecialidad.getText());
                        pstmtUpdate.setInt(8, id);

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
        String sql = "DELETE FROM Doctores WHERE IdDoctor = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Doctor eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el doctor seleccionado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar doctor: " + e.getMessage());
        }
    }

    @Override
    public void generarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        String sql = "SELECT DniDoctor, NDoctor, Apellido, Telefono, Email, Genero, Especialidad FROM Doctores WHERE IdDoctor = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idDoctor);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String detalleDoctor = String.format("Dni: %s\nNombre: %s\nApellido: %s\nTeléfono: %s\nEmail: %s\nGénero: %s\nEspecialidad: %s\n",
                        rs.getInt("DniDoctor"),
                        rs.getString("NDoctor"),
                        rs.getString("Apellido"),
                        rs.getString("Telefono"),
                        rs.getString("Email"),
                        rs.getString("Genero"),
                        rs.getString("Especialidad"));

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
                doctor = new DoctorDTO(0,0, null, null, 0, null, true, null);
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

                modelo.addRow(new Object[]{doctor.getId(), doctor.getNombre() + " " + doctor.getApellido(), doctor.getEspecialidad()});
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún doctor ese nombre " + nombre);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar doctor por su nombre: " + e.getMessage());
        }

        return doctor;
    }

}
