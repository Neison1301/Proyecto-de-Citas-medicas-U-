package mvc;

import java.time.LocalDateTime;
import javax.swing.JComboBox;
import modeloDAO.CitasMedicasDAO;
import modeloDAO.DoctorDAO;
import modeloDAO.PacientesDAO;
import modeloDTO.CitasMedicasDTO;
import config.Conexion;

public class CitasMedicasMVC {

    private DoctorDAO doctoresDAO;
    private PacientesDAO pacientesDAO;
    private CitasMedicasDAO citasMedicasDAO;

    public CitasMedicasMVC() {
        Conexion conexion = new Conexion();
        doctoresDAO = new DoctorDAO(conexion);
        pacientesDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);
        citasMedicasDAO = new CitasMedicasDAO();
    }

    public void cargarComboDoctores(JComboBox<String> comboBox) {
        doctoresDAO.cargarComboDoctores(comboBox);
    }

    public void cargarComboPacientes(JComboBox<String> comboBox) {
        pacientesDAO.cargarComboPacientes(comboBox);
    }

    public void crearCitaMedica(String pacienteSeleccionado, String doctorSeleccionado, LocalDateTime fechaCita, String motivo, String diagnostico, String tratamiento, String estado) {
        CitasMedicasDTO.Estado estadoEnum = CitasMedicasDTO.Estado.Programada;
        citasMedicasDAO.crearCitaMedicaf(pacienteSeleccionado, doctorSeleccionado, fechaCita, motivo, diagnostico, tratamiento, estadoEnum);
    }
}
