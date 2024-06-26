package modeloDTO;

import miAbstract.Cita;

public class CitasMedicasDTO extends Cita {

    private int id;
    private int dni;
    private String paciente;
    private String doctor;
    private String motivo;

    public CitasMedicasDTO(int id, String fecha, String paciente, String doctor, int dni, String motivo) {
        super(fecha);
        this.id = id;
        this.dni = dni;
        this.paciente = paciente;
        this.doctor = doctor;
        this.motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public void detallesCita() {
    }

}
