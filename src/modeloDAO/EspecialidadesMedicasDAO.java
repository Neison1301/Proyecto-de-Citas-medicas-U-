package modeloDAO;

import config.Conexion;
import modeloDTO.EspecialidadMedicaDTO;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class EspecialidadesMedicasDAO {

    private Conexion conexion;

    public EspecialidadesMedicasDAO(Conexion conexion) {
        this.conexion = conexion;
    }

    public void crear(EspecialidadMedicaDTO especialidad) {
        String sql = "INSERT INTO EspecialidadesMedicas (NombreEspecialidad) VALUES (?)";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, especialidad.getNombreEspecialidad());
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Especialidad registrada correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar especialidad: " + e.getMessage());
        }
    }

    public ArrayList<EspecialidadMedicaDTO> leer() {
        ArrayList<EspecialidadMedicaDTO> especialidades = new ArrayList<>();
        String sql = "SELECT  NombreEspecialidad FROM EspecialidadesMedicas";

        try (Connection conn = conexion.establecerConexion(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                
                String nombreEspecialidad = rs.getString("NombreEspecialidad");
                EspecialidadMedicaDTO especialidad = new EspecialidadMedicaDTO(0, nombreEspecialidad);
                especialidades.add(especialidad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al leer especialidades: " + e.getMessage());
        }

        return especialidades;
    }

    public void actualizar(EspecialidadMedicaDTO especialidad) {
        String sql = "UPDATE EspecialidadesMedicas SET NombreEspecialidad = ? WHERE IdEspecialidad = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, especialidad.getNombreEspecialidad());
            pstmt.setInt(2, especialidad.getIdEspecialidad());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Especialidad actualizada correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar especialidad: " + e.getMessage());
        }
    }

    public void eliminar(int idEspecialidad) {
        String sql = "DELETE FROM EspecialidadesMedicas WHERE IdEspecialidad = ?";

        try (Connection conn = conexion.establecerConexion(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, idEspecialidad);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Especialidad eliminada correctamente.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar especialidad: " + e.getMessage());
        }
    }
}
