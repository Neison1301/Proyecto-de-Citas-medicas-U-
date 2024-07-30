package modeloDAO;

import config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.sql.CallableStatement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modeloDTO.CitasMedicasDTO;
import miInterfaces.AtencionMedica;
import miInterfaces.CRUD;

public class CitasMedicasDAO implements CRUD<CitasMedicasDTO>, AtencionMedica {

    private Conexion conexion;

    public CitasMedicasDAO() {
        this.conexion = new Conexion();
    }

    CitasMedicasDAO(Conexion c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void crear(CitasMedicasDTO cita) {
        String sql = "INSERT INTO CitasMedicas (IdPaciente, IdDoctor, FechaConsulta, Motivo, Diagnostico, Tratamiento, Estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sqlHistorial = "INSERT INTO HistorialMedico (IdPaciente, FechaVisita, Diagnostico, Tratamiento, Observaciones) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = conexion.establecerConexion()) {
            conn.setAutoCommit(false);

            try (PreparedStatement pstmtCita = conn.prepareStatement(sql); PreparedStatement pstmtHistorial = conn.prepareStatement(sqlHistorial)) {

                // cita médica
                pstmtCita.setInt(1, cita.getIdPaciente());
                pstmtCita.setInt(2, cita.getIdDoctor());
                pstmtCita.setTimestamp(3, Timestamp.valueOf(cita.getFechaConsulta()));
                pstmtCita.setString(4, cita.getMotivo());
                pstmtCita.setString(5, cita.getDiagnostico());
                pstmtCita.setString(6, cita.getTratamiento());
                pstmtCita.setString(7, cita.getEstado().name());
                pstmtCita.executeUpdate();

                // historial médico
                pstmtHistorial.setInt(1, cita.getIdPaciente());
                pstmtHistorial.setTimestamp(2, Timestamp.valueOf(cita.getFechaConsulta()));
                pstmtHistorial.setString(3, cita.getDiagnostico());
                pstmtHistorial.setString(4, cita.getTratamiento());
                pstmtHistorial.setString(5, ""); // Aquí puedes poner observaciones adicionales si las tienes
                pstmtHistorial.executeUpdate();

                conn.commit();
                JOptionPane.showMessageDialog(null, "Cita médica creada correctamente.");
            } catch (SQLException e) {
                conn.rollback();
                System.out.println("Error al insertar cita médica: " + e.getMessage());
            } finally {
                conn.setAutoCommit(true);
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<CitasMedicasDTO> leer(int ids) {
        ArrayList<CitasMedicasDTO> citas = new ArrayList<>();
        String sql = "SELECT IdCita, IdPaciente, IdDoctor, FechaConsulta, Motivo, Diagnostico, Tratamiento, Estado FROM CitasMedicas";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("IdCita");
                int idPaciente = rs.getInt("IdPaciente");
                int idDoctor = rs.getInt("IdDoctor");
                Timestamp fechaConsulta = rs.getTimestamp("FechaConsulta");
                String motivo = rs.getString("Motivo");
                String diagnostico = rs.getString("Diagnostico");
                String tratamiento = rs.getString("Tratamiento");
                String estadoStr = rs.getString("Estado");
                CitasMedicasDTO.Estado estado = CitasMedicasDTO.Estado.valueOf(estadoStr); // Convertir String a Enum

                CitasMedicasDTO cita = new CitasMedicasDTO(id, idPaciente, idDoctor, fechaConsulta.toLocalDateTime(), motivo, diagnostico, tratamiento, estado);
                citas.add(cita);
            }

        } catch (SQLException e) {
            System.out.println("Error al leer citas médicas: " + e.getMessage());
        }
        return citas;
    }

    @Override
    public void actualizar(int id) {
        String sqlSelect = "SELECT IdPaciente, IdDoctor, FechaConsulta, Motivo, Diagnostico, Tratamiento, Estado FROM CitasMedicas WHERE IdCita = ?";
        String sqlUpdate = "UPDATE CitasMedicas SET IdPaciente = ?, IdDoctor = ?, FechaConsulta = ?, Motivo = ?, Diagnostico = ?, Tratamiento = ?, Estado = ? WHERE IdCita = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmtSelect = conn.prepareStatement(sqlSelect); PreparedStatement pstmtUpdate = conn.prepareStatement(sqlUpdate)) {

            pstmtSelect.setInt(1, id);

            try (ResultSet rs = pstmtSelect.executeQuery()) {
                if (rs.next()) {
                    int idPaciente = rs.getInt("IdPaciente");
                    int idDoctor = rs.getInt("IdDoctor");
                    Timestamp fechaConsulta = rs.getTimestamp("FechaConsulta");
                    String motivo = rs.getString("Motivo");
                    String diagnostico = rs.getString("Diagnostico");
                    String tratamiento = rs.getString("Tratamiento");
                    String estadoStr = rs.getString("Estado");
                    CitasMedicasDTO.Estado estado = CitasMedicasDTO.Estado.valueOf(estadoStr); // Convertir String a Enum

                    // Mostrar JOptionPane para editar los datos
                    JTextField tfIdPaciente = new JTextField(String.valueOf(idPaciente));
                    JTextField tfIdDoctor = new JTextField(String.valueOf(idDoctor));
                    JTextField tfFechaConsulta = new JTextField(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(fechaConsulta));
                    JTextField tfMotivo = new JTextField(motivo);
                    JTextField tfDiagnostico = new JTextField(diagnostico);
                    JTextField tfTratamiento = new JTextField(tratamiento);
                    JTextField tfEstado = new JTextField(estadoStr);

                    Object[] message = {
                        "ID Paciente:", tfIdPaciente,
                        "ID Doctor:", tfIdDoctor,
                        "Fecha Consulta:", tfFechaConsulta,
                        "Motivo:", tfMotivo,
                        "Diagnóstico:", tfDiagnostico,
                        "Tratamiento:", tfTratamiento,
                        "Estado:", tfEstado
                    };

                    int option = JOptionPane.showConfirmDialog(null, message, "Editar Cita", JOptionPane.OK_CANCEL_OPTION);

                    if (option == JOptionPane.OK_OPTION) {
                        pstmtUpdate.setInt(1, Integer.parseInt(tfIdPaciente.getText()));
                        pstmtUpdate.setInt(2, Integer.parseInt(tfIdDoctor.getText()));
                        pstmtUpdate.setTimestamp(3, Timestamp.valueOf(tfFechaConsulta.getText()));
                        pstmtUpdate.setString(4, tfMotivo.getText());
                        pstmtUpdate.setString(5, tfDiagnostico.getText());
                        pstmtUpdate.setString(6, tfTratamiento.getText());
                        pstmtUpdate.setString(7, tfEstado.getText());
                        pstmtUpdate.setInt(8, id);

                        pstmtUpdate.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Cita médica actualizada correctamente.");
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
        String sql = "DELETE FROM CitasMedicas WHERE IdCita = ?";

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

        DoctorDAO doctorDAO = new DoctorDAO(conexion); // Suponiendo que tienes conexión establecida
        PacientesDAO pacienteDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true); // Suponiendo que tienes conexión establecida

        ArrayList<CitasMedicasDTO> citas = leer(0); // Suponiendo que leerCitas() devuelve todas las citas

        if (!citas.isEmpty()) {
            System.out.println("Cantidad de citas recuperadas: " + citas.size());  // Mensaje de diagnóstico

            for (CitasMedicasDTO cita : citas) {
                // Obtener nombre del doctor de la cita actual
                String nombreDoctor = doctorDAO.obtenerNombreDoctor(cita.getIdDoctor());

                // Obtener nombre del paciente de la cita actual
                String nombrePaciente = pacienteDAO.obtenerNombrePaciente(cita.getIdPaciente());

                // Agregar fila al modelo de la tabla con los datos necesarios
                modelo.addRow(new Object[]{
                    cita.getIdCita(),
                    cita.getMotivo(),
                    cita.getFechaConsulta()
                });
            }
        } else {
            System.out.println("La lista de citas es nula o está vacía.");
        }
    }

    @Override
    public void cancelarCita(int id) {
        eliminar(id);
    }

    @Override
    public void agendarCita(CitasMedicasDTO cita) {
        crear(cita);
    }

    @Override
    public void detallesCita() {
    }

    public void mostrarDetalleCita(int id, JTextArea textArea) {
        ArrayList<CitasMedicasDTO> citas = leer(0);
        DoctorDAO doctorDAO = new DoctorDAO(conexion);
        PacientesDAO pacienteDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);

        for (CitasMedicasDTO cita : citas) {
            if (cita.getIdCita() == id) {
                String nombreDoctor = doctorDAO.obtenerNombreDoctor(cita.getIdDoctor());
                String nombrePaciente = pacienteDAO.obtenerNombrePaciente(cita.getIdPaciente());

                String detalleCita = "Fecha: " + cita.getFechaConsulta() + "\n"
                        + "Paciente: " + nombrePaciente + "\n"
                        + "Doctor: " + nombreDoctor + "\n"
                        + "Motivo: " + cita.getMotivo() + "\n"
                        + "Diagnóstico: " + cita.getDiagnostico() + "\n"
                        + "Tratamiento: " + cita.getTratamiento() + "\n"
                        + "Estado: " + cita.getEstado() + "\n";

                textArea.setText(detalleCita);
                break;
            }
        }
    }

    public void crearCitaMedica(String nombrePaciente, String nombreDoctor, LocalDateTime fechaConsulta, String motivo, String diagnostico, String tratamiento, CitasMedicasDTO.Estado estado) {
        // Primero obtenemos el IdPaciente
        int idPaciente = obtenerIdPaciente(nombrePaciente);
        if (idPaciente == -1) {
            JOptionPane.showMessageDialog(null, "No se encontró el paciente con nombre: " + nombrePaciente);
            return;
        }

        // Luego obtenemos el IdDoctor
        int idDoctor = obtenerIdDoctor(nombreDoctor);
        if (idDoctor == -1) {
            JOptionPane.showMessageDialog(null, "No se encontró el doctor con nombre: " + nombreDoctor);
            return;
        }

        // Consulta SQL para insertar la cita médica
        String sql = "INSERT INTO CitasMedicas (IdPaciente, IdDoctor, FechaConsulta, Motivo, Diagnostico, Tratamiento, Estado) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        // Establecer los parámetros en la consulta preparada
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, idPaciente);
            pstmt.setInt(2, idDoctor);
            pstmt.setTimestamp(3, Timestamp.valueOf(fechaConsulta));
            pstmt.setString(4, motivo);
            pstmt.setString(5, diagnostico);
            pstmt.setString(6, tratamiento);
            pstmt.setString(7, estado.name());

            // Ejecutar la consulta
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error al crear cita médica: " + ex.getMessage());
        }
    }

    public int obtenerIdPaciente(String nombrePaciente) {
        int idPaciente = -1;
        String query = "SELECT IdPaciente FROM Pacientes WHERE NPaciente = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombrePaciente);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                idPaciente = rs.getInt("IdPaciente");
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el ID del paciente: " + ex.getMessage());
        }
        return idPaciente;
    }

    public int obtenerIdDoctor(String nombreDoctor) {
        int idDoctor = -1;
        String query = "SELECT IdDoctor FROM Doctores WHERE NDoctor = ?";
        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(query)) {

            pstmt.setString(1, nombreDoctor);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                idDoctor = rs.getInt("IdDoctor");
            }
        } catch (SQLException ex) {
            System.out.println("Error al obtener el ID del doctor: " + ex.getMessage());
        }
        return idDoctor;
    }

    public void crearCitaMedicaf(String nombrePaciente, String nombreDoctor, LocalDateTime fechaConsulta, String motivo, String diagnostico, String tratamiento, CitasMedicasDTO.Estado estado) {
        String callProcedure = "{CALL CrearCitaMedica(?, ?, ?, ?, ?, ?, ?)}";

        try (Connection conn = conexion.establecerConexion(); CallableStatement stmt = conn.prepareCall(callProcedure)) {

            stmt.setString(1, nombrePaciente);
            stmt.setString(2, nombreDoctor);
            stmt.setTimestamp(3, Timestamp.valueOf(fechaConsulta));
            stmt.setString(4, motivo);
            stmt.setString(5, diagnostico);
            stmt.setString(6, tratamiento);
            stmt.setString(7, estado.name());

            boolean result = stmt.execute();
            if (!result) {
                JOptionPane.showMessageDialog(null, "Cita médica creada correctamente.");
            } else {

            }

        } catch (SQLException ex) {
            System.out.println("Error al llamar al procedimiento almacenado: " + ex.getMessage());
        }
    }


    public void mostrarDetallesCitaporf (Date fechaSeleccionada, JTextArea textArea) {
        // Lógica para obtener y mostrar detalles de la cita según la fecha seleccionada
        ArrayList<CitasMedicasDTO> citas = obtenerCitasPorFecha(fechaSeleccionada); // Método para obtener citas por fecha
        DoctorDAO doctorDAO = new DoctorDAO(conexion);
        PacientesDAO pacienteDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);

        boolean citaEncontrada = false;

        for (CitasMedicasDTO cita : citas) {
            String nombreDoctor = doctorDAO.obtenerNombreDoctor(cita.getIdDoctor());
            String nombrePaciente = pacienteDAO.obtenerNombrePaciente(cita.getIdPaciente());

            String detalleCita = "Fecha: " + cita.getFechaConsulta() + "\n"
                    + "Paciente: " + nombrePaciente + "\n"
                    + "Doctor: " + nombreDoctor + "\n"
                    + "Motivo: " + cita.getMotivo() + "\n"
                    + "Diagnóstico: " + cita.getDiagnostico() + "\n"
                    + "Tratamiento: " + cita.getTratamiento() + "\n"
                    + "Estado: " + cita.getEstado() + "\n";

            textArea.setText(detalleCita);
            citaEncontrada = true;
            break; // Termina el bucle al encontrar la primera cita
        }

        if (!citaEncontrada) {
            textArea.setText("No hay citas para la fecha seleccionada.");
        }
    }

    private ArrayList<CitasMedicasDTO> obtenerCitasPorFecha(Date fecha) {
        // Implementa la lógica para obtener citas por la fecha especificada
        // Ejemplo de implementación:
        ArrayList<CitasMedicasDTO> citasPorFecha = new ArrayList<>();
        ArrayList<CitasMedicasDTO> citas = leer(0); // Método para obtener todas las citas

        for (CitasMedicasDTO cita : citas) {
            if (cita.getFechaConsulta().equals(fecha)) {
                citasPorFecha.add(cita);
            }
        }

        return citasPorFecha;
    }


}
