package modeloDAO;

import config.Conexion;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modeloDTO.CitasMedicasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import miInterfaces.AtencionMedica;
import miInterfaces.CRUD;
import java.sql.Timestamp;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CitasMedicasDAO implements CRUD<CitasMedicasDTO>, AtencionMedica {

    private Conexion conexion;

    public CitasMedicasDAO() {
        this.conexion = new Conexion();
    }

    @Override
    public void crear(CitasMedicasDTO cita) {

        String sql = "INSERT INTO CitasMedicas (Fecha, NPaciente, NDoctor, DniPaciente, Motivo) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection conn = conexion.establecerConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);

            pstmt.setString(1, cita.getFecha());
            pstmt.setString(2, cita.getPaciente());
            pstmt.setString(3, cita.getDoctor());
            pstmt.setInt(4, cita.getDni());
            pstmt.setString(5, cita.getMotivo());

            pstmt.execute();

        } catch (SQLException e) {
            System.out.println("Error al insertar cita médica: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<CitasMedicasDTO> leer(int ids) {
        ArrayList<CitasMedicasDTO> citas = new ArrayList<>();

        String sql = "SELECT Id, Fecha, NPaciente, NDoctor, DniPaciente, Motivo FROM CitasMedicas";

        try {
            Connection conn = conexion.establecerConexion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("Id");
                Timestamp fechaTimestamp = rs.getTimestamp("Fecha");
                String fecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fechaTimestamp);
                String paciente = rs.getString("NPaciente");
                String doctor = rs.getString("NDoctor");
                int dni = rs.getInt("DniPaciente");
                String motivo = rs.getString("Motivo");

                CitasMedicasDTO cita = new CitasMedicasDTO(id, fecha, paciente, doctor, dni, motivo);
                citas.add(cita);
            }
        } catch (SQLException e) {
            System.out.println("Error al leer citas médicas: " + e.getMessage());
        }
        return citas;
    }

    @Override
    public void actualizar(int id) {

        String sqlSelect = "SELECT Fecha, NPaciente, NDoctor, DniPaciente, Motivo FROM CitasMedicas WHERE Id = ?";
        String sqlUpdate = "UPDATE CitasMedicas SET Fecha = ?, NPaciente = ?, NDoctor = ?, DniPaciente = ?, Motivo = ? WHERE Id = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {

            pstmtSelect.setInt(1, id);

            try (ResultSet rs = pstmtSelect.executeQuery()) {
                if (rs.next()) {
                    Timestamp fechaTimestamp = rs.getTimestamp("Fecha");
                    String fechaActual = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fechaTimestamp);
                    String pacienteActual = rs.getString("NPaciente");
                    String doctorActual = rs.getString("NDoctor");
                    int dniActual = rs.getInt("DniPaciente");
                    String motivoActual = rs.getString("Motivo");

                    // Mostrar JOptionPane para editar los datos
                    JTextField tfFecha = new JTextField(fechaActual);
                    JTextField tfPaciente = new JTextField(pacienteActual);
                    JTextField tfDoctor = new JTextField(doctorActual);
                    JTextField tfDni = new JTextField(String.valueOf(dniActual));
                    JTextField tfMotivo = new JTextField(motivoActual);

                    Object[] message = {
                        "Fecha:", tfFecha,
                        "Paciente:", tfPaciente,
                        "Doctor:", tfDoctor,
                        "DNI:", tfDni,
                        "Motivo:", tfMotivo
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Editar Cita", JOptionPane.OK_CANCEL_OPTION);

                    if (option == JOptionPane.OK_OPTION) {
                        pstmtUpdate.setString(1, tfFecha.getText());
                        pstmtUpdate.setString(2, tfPaciente.getText());
                        pstmtUpdate.setString(3, tfDoctor.getText());
                        pstmtUpdate.setInt(4, Integer.parseInt(tfDni.getText()));
                        pstmtUpdate.setString(5, tfMotivo.getText());
                        pstmtUpdate.setInt(6, id);

                        pstmtUpdate.executeUpdate();
                        System.out.println("Cita médica actualizada correctamente.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró la cita médica seleccionada.");
                }
            }

        } catch (SQLException e) {
            System.out.println("Error al actualizar cita médica: " + e.getMessage());
        }
    }

    @Override
    public void eliminar(int id) {
        String sql = "DELETE FROM CitasMedicas WHERE Id = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cita eliminada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la cita médica seleccionada.");
            }

        } catch (SQLException e) {
            System.out.println("Error al eliminar cita médica: " + e.getMessage());
        }
    }

    public void mostrarCitas(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        int ids = 0;
        CitasMedicasDAO citasMedicasDAO = new CitasMedicasDAO();
        ArrayList<CitasMedicasDTO> citas = citasMedicasDAO.leer(ids);

        if (citas != null) {
            System.out.println("Cantidad de citas recuperadas: " + citas.size());  // Mensaje de diagnóstico
            for (CitasMedicasDTO cita : citas) {
                modelo.addRow(new Object[]{cita.getId(), cita.getMotivo(), cita.getFecha()});
            }
        } else {
            System.out.println("La lista de citas es nula o está vacía.");
        }
    }

    @Override
    public void cancelarCita(int id) {
        eliminar(id);
    }

    private void manejarError(String mensaje, IOException e) {
        JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
    }

    @Override
    public void agendarCita(CitasMedicasDTO cita) {
        crear(cita);
    }

    @Override
    public void detallesCita() {
    }

    public void mostrarDetalleCita(int id, JTextArea textArea) {
        int ids = 0;
        CitasMedicasDAO dao = new CitasMedicasDAO();
        ArrayList<CitasMedicasDTO> citas = dao.leer(ids);

        for (CitasMedicasDTO cita : citas) {
            if (cita.getId() == id) {
                String detalleCita = "Fecha: " + cita.getFecha() + "\n"
                        + "Paciente: " + cita.getPaciente() + "\n"
                        + "Doctor: " + cita.getDoctor() + "\n"
                        + "DNI: " + cita.getDni() + "\n"
                        + "Motivo: " + cita.getMotivo() + "\n";

                textArea.setText(detalleCita);
                break;
            }
        }
    }

}
