package modeloDAO;

import miAbstract.Persona;
import miInterfaces.CRUD;
import config.Conexion;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import modeloDTO.PacientesDTO;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class PacientesDAO extends Persona implements CRUD<PacientesDTO> {

    public PacientesDAO(Conexion conexion, int id, String nombre, String apellido, int telefono, String email, boolean genero) {
        super(id, nombre, apellido, telefono, email, genero);
        this.conexion = conexion;
    }

    private Conexion conexion;

    @Override
    public void crear(PacientesDTO paciente) {

        String sql = "INSERT INTO Pacientes (DniPaciente, Edad, NPaciente, Apellidos, Telefono, Email, Genero) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, paciente.getDniPaciente());
            pstmt.setInt(2, paciente.getEdad());
            pstmt.setString(3, paciente.getnPaciente());
            pstmt.setString(4, paciente.getApellidos());
            pstmt.setInt(5, paciente.getTelefono());
            pstmt.setString(6, paciente.getEmail());
            pstmt.setString(7, paciente.isGenero() ? "Masculino" : "Femenino");

            pstmt.execute();

            JOptionPane.showMessageDialog(null, "Paciente registrado correctamente.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar paciente: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM Pacientes WHERE Id = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Paciente eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el paciente seleccionada.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar al paciente: " + e.getMessage());
        }

    }

    @Override
    public ArrayList<PacientesDTO> leer(int dni) {
        ArrayList<PacientesDTO> pacientes = new ArrayList<>();

        String sql = "SELECT Id, DniPaciente, Edad, NPaciente, Apellidos, Telefono, Email, Genero FROM Pacientes";
        if (dni != 0) {
            sql += " WHERE DniPaciente = ?";
        }
        try {
            Connection conn = conexion.establecerConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            if (dni != 0) {
                pstmt.setInt(1, dni);
            }

            while (rs.next()) {
                int pacienteid = rs.getInt("Id");
                int dniPaciente = rs.getInt("DniPaciente");
                int edad = rs.getInt("Edad");
                String nombrePaciente = rs.getString("NPaciente");
                String apellidos = rs.getString("Apellidos");
                int telefono = rs.getInt("Telefono");
                String email = rs.getString("Email");
                boolean genero = rs.getString("Genero").equalsIgnoreCase("Masculino");

                PacientesDTO paciente = new PacientesDTO(pacienteid, dniPaciente, edad, nombrePaciente, apellidos, telefono, email, genero);
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
        PacientesDAO pacientesdao = new PacientesDAO(c, 0, null, null, 0, null, true);
        ArrayList<PacientesDTO> pacientesss = pacientesdao.leer(ids);

        if (pacientesss != null) {
            System.out.println("Cantidad de citas recuperadas: " + pacientesss.size());  // Mensaje de diagnóstico
            for (PacientesDTO pacientesDTO : pacientesss) {
                modelo.addRow(new Object[]{pacientesDTO.getId(), pacientesDTO.getnPaciente() + " " + pacientesDTO.getApellidos(), pacientesDTO.getTelefono()});
            }
        } else {
            System.out.println("La lista de citas es nula o está vacía.");
        }
    }

    public void mostrarDetalleCita(int id, JTextArea textArea) {
        int ids = 0;
        PacientesDAO dao = new PacientesDAO(conexion, 0, null, null, 0, null, true);
        ArrayList<PacientesDTO> mostrar = dao.leer(ids);

        for (PacientesDTO pacientesDTO : mostrar) {
            if (pacientesDTO.getId() == id) {
                String detalleCita = "Dni: " + pacientesDTO.getDniPaciente() + "\n"
                        + "Paciente: " + pacientesDTO.getnPaciente() + "\n"
                        + "Apellidos: " + pacientesDTO.getApellidos() + "\n"
                        + "Telefono: " + pacientesDTO.getTelefono() + "\n"
                        + "Email: " + pacientesDTO.getEmail() + "\n";

                textArea.setText(detalleCita);
                break;
            }
        }
    }

    public PacientesDTO buscarPorDni(int dni, JTable tabla) throws SQLException {
        PacientesDTO paciente = null;
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);

        String sql = "SELECT * FROM Pacientes WHERE DniPaciente = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, dni);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                paciente = new PacientesDTO(0, 0, 0, null, null, 0, null, true);
                paciente.setId(rs.getInt("Id"));
                paciente.setDniPaciente(rs.getInt("DniPaciente"));
                paciente.setEdad(rs.getInt("Edad"));
                paciente.setnPaciente(rs.getString("NPaciente"));
                paciente.setApellidos(rs.getString("Apellidos"));
                paciente.setTelefono(rs.getInt("Telefono"));
                paciente.setEmail(rs.getString("Email"));

                modelo.addRow(new Object[]{paciente.getId(), paciente.getnPaciente() + " " + paciente.getApellidos(), paciente.getTelefono()});
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con DNI " + dni);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar paciente por DNI: " + e.getMessage());
        }

        return paciente;
    }
}
