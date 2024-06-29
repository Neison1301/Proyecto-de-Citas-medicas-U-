package modeloDTO;

public class DoctorEspecialidadDTO {

    private int idDoctor;
    private int idEspecialidad;

    public DoctorEspecialidadDTO(int idDoctor, int idEspecialidad) {
        this.idDoctor = idDoctor;
        this.idEspecialidad = idEspecialidad;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }
}
