package modeloDAO;

import config.Conexion;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import miInterfaces.CRUD;
import modeloDTO.HistorialMedicoDTO;

public class HistorialMedicoDAO implements CRUD<HistorialMedicoDTO> {

    private Conexion conexion;

    public HistorialMedicoDAO() {
        this.conexion = new Conexion();
    }

    @Override
    public void crear(HistorialMedicoDTO historial) {
        String sql = "INSERT INTO HistorialMedico (IdPaciente, FechaVisita, Diagnostico, Tratamiento, Observaciones) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, historial.getIdPaciente());
            pstmt.setDate(2, new java.sql.Date(historial.getFechaVisita().getTime()));
            pstmt.setString(3, historial.getDiagnostico());
            pstmt.setString(4, historial.getTratamiento());
            pstmt.setString(5, historial.getObservaciones());
            pstmt.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public List<HistorialMedicoDTO> obtenerHistorialPorPaciente(int idPaciente) {
        List<HistorialMedicoDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM HistorialMedico WHERE IdPaciente = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idPaciente);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    HistorialMedicoDTO historial = new HistorialMedicoDTO(0, 0, null, null, null, null);
                    historial.setIdHistorial(rs.getInt("IdHistorial"));
                    historial.setIdPaciente(rs.getInt("IdPaciente"));
                    historial.setFechaVisita(rs.getDate("FechaVisita"));
                    historial.setDiagnostico(rs.getString("Diagnostico"));
                    historial.setTratamiento(rs.getString("Tratamiento"));
                    historial.setObservaciones(rs.getString("Observaciones"));
                    lista.add(historial);
                }
            }
        } catch (SQLException e) {
        }
        return lista;
    }
7/
    public boolean actualizarHistorial(HistorialMedicoDTO historial) {
        String sqlSelect = "SELECT IdPaciente, FechaVisita, Diagnostico, Tratamiento, Observaciones FROM HistorialMedico WHERE IdHistorial = ?";
        String sqlUpdate = "UPDATE HistorialMedico SET IdPaciente = ?, FechaVisita = ?, Diagnostico = ?, Tratamiento = ?, Observaciones = ? WHERE IdHistorial = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {
            pstmtSelect.setInt(1, idHistorial);
            try (ResultSet rs = pstmtSelect.executeQuery()) {
                if (rs.next()) {
                    int idPaciente = rs.getInt("IdPaciente");
                    Date fechaVisita = rs.getDate("FechaVisita");
                    String diagnostico = rs.getString("Diagnostico");
                    String tratamiento = rs.getString("Tratamiento");
                    String observaciones = rs.getString("Observaciones");

                    // Mostrar JOptionPane para editar los datos
                    JTextField tfIdPaciente = new JTextField(String.valueOf(idPaciente));
                    JTextField tfFechaVisita = new JTextField(fechaVisita.toString());
                    JTextField tfDiagnostico = new JTextField(diagnostico);
                    JTextField tfTratamiento = new JTextField(tratamiento);
                    JTextField tfObservaciones = new JTextField(observaciones);

                    Object[] message = {
                        "ID Paciente:", tfIdPaciente,
                        "Fecha Visita:", tfFechaVisita,
                        "Diagnóstico:", tfDiagnostico,
                        "Tratamiento:", tfTratamiento,
                        "Observaciones:", tfObservaciones
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Editar Historial", JOptionPane.OK_CANCEL_OPTION);
                    if (option == JOptionPane.OK_OPTION) {
                        pstmtUpdate.setInt(1, Integer.parseInt(tfIdPaciente.getText()));
                        pstmtUpdate.setDate(2, Date.valueOf(tfFechaVisita.getText()));
                        pstmtUpdate.setString(3, tfDiagnostico.getText());
                        pstmtUpdate.setString(4, tfTratamiento.getText());
                        pstmtUpdate.setString(5, tfObservaciones.getText());
                        pstmtUpdate.setInt(6, idHistorial);
                        pstmtUpdate.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Historial médico actualizado correctamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el historial médico seleccionado.");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar historial médico: " + e.getMessage());
        }
    }

    public boolean eliminarHistorial(int idHistorial) {
        String sql = "DELETE FROM HistorialMedico WHERE IdHistorial = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idHistorial);
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public ArrayList<HistorialMedicoDTO> leer(int id) {
        ArrayList<HistorialMedicoDTO> lista = new ArrayList<>();
        String sql = "SELECT * FROM HistorialMedico WHERE IdPaciente = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idPaciente);
            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    HistorialMedicoDTO historial = new HistorialMedicoDTO(
                            rs.getInt("IdHistorial"),
                            rs.getInt("IdPaciente"),
                            rs.getDate("FechaVisita"),
                            rs.getString("Diagnostico"),
                            rs.getString("Tratamiento"),
                            rs.getString("Observaciones")
                    );
                    lista.add(historial);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error al leer historial médico: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void actualizar(int id) {
        String sql = "UPDATE HistorialMedico SET FechaVisita = ?, Diagnostico = ?, Tratamiento = ?, Observaciones = ? WHERE IdHistorial = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDate(1, new java.sql.Date(historial.getFechaVisita().getTime()));
            pstmt.setString(2, historial.getDiagnostico());
            pstmt.setString(3, historial.getTratamiento());
            pstmt.setString(4, historial.getObservaciones());
            pstmt.setInt(5, historial.getIdHistorial());
            return pstmt.executeUpdate() > 0;
        } catch (SQLException e) {
            return false;
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM HistorialMedico WHERE IdHistorial = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idHistorial);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Historial médico eliminado con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el historial médico seleccionado.");
            }
        } catch (SQLException e) {
            System.out.println("Error al eliminar historial médico: " + e.getMessage());
        }
    }
}
}
