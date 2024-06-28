package modeloDTO;

import java.time.LocalDateTime;

public class CitasMedicasDTO {

    private int idCita;
    private int idPaciente;
    private int idDoctor;
    private LocalDateTime fechaConsulta;
    private String motivo;
    private String diagnostico;
    private String tratamiento;
    private Estado estado;

    public enum Estado {
        Programada,
        Cancelada,
        Realizada
    }

    public CitasMedicasDTO(int idCita, int idPaciente, int idDoctor, LocalDateTime fechaConsulta, String motivo, String diagnostico, String tratamiento, Estado estado) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.fechaConsulta = fechaConsulta;
        this.motivo = motivo;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public LocalDateTime getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(LocalDateTime fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
