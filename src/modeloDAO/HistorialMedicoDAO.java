package modeloDAO;

import config.Conexion;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
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

    @Override
    public ArrayList<HistorialMedicoDTO> leer(int id) {
        ArrayList<HistorialMedicoDTO> historialMedico = new ArrayList<>();
        String query = "SELECT * FROM HistorialMedico WHERE IdPaciente = ?";

        try (Connection con = conexion.establecerConexion(); PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                HistorialMedicoDTO historial = new HistorialMedicoDTO();
                historial.setIdHistorial(rs.getInt("IdHistorial"));
                historial.setIdPaciente(rs.getInt("IdPaciente"));
                historial.setFechaVisita(rs.getDate("FechaVisita"));
                historial.setDiagnostico(rs.getString("Diagnostico"));
                historial.setTratamiento(rs.getString("Tratamiento"));
                historial.setObservaciones(rs.getString("Observaciones"));
                historial.setEstado(rs.getString("EstadoPaciente"));

                historialMedico.add(historial);
            }
        } catch (SQLException e) {
        }
        return historialMedico;
    }

    @Override
    public void actualizar(int id) {
        String sqlSelect = "SELECT IdPaciente, FechaVisita, Diagnostico, Tratamiento, Observaciones FROM HistorialMedico WHERE IdHistorial = ?";
        String sqlUpdate = "UPDATE HistorialMedico SET IdPaciente = ?, FechaVisita = ?, Diagnostico = ?, Tratamiento = ?, Observaciones = ? WHERE IdHistorial = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {
            pstmtSelect.setInt(1, id);
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
                        pstmtUpdate.setInt(6, id);
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

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM HistorialMedico WHERE IdHistorial = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
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

    public void HistorialMedicoViewer(ArrayList<HistorialMedicoDTO> historialList) {
        JFrame frame = new JFrame();
        String[] columnNames = {"Fecha Visita", "Diagnóstico", "Tratamiento", "Observaciones", "Estado"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (HistorialMedicoDTO historial : historialList) {
            Object[] row = {
                historial.getFechaVisita(),
                historial.getDiagnostico(),
                historial.getTratamiento(),
                historial.getObservaciones(),
                historial.getEstado()
            };
            model.addRow(row);
        }

        JTable tableHistorial = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tableHistorial);

        // Establecer un diseño adecuado
        frame.getContentPane().setLayout(new BorderLayout());

        // Añadir el JScrollPane al contenedor
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setTitle("Historial Médico del Paciente");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
