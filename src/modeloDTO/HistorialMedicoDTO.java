package modeloDTO;

import java.util.Date;

public class HistorialMedicoDTO {

    private int idHistorial;
    private int idPaciente;
    private Date fechaVisita;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;

    public HistorialMedicoDTO(int idHistorial, int idPaciente, Date fechaVisita, String diagnostico, String tratamiento, String observaciones) {
        this.idHistorial = idHistorial;
        this.idPaciente = idPaciente;
        this.fechaVisita = fechaVisita;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Date fechaVisita) {
        this.fechaVisita = fechaVisita;
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

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
