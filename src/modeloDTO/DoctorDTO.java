package modeloDTO;

import miAbstract.Persona;

public class DoctorDTO extends Persona {

    private String especialidad;


    public DoctorDTO(int id, String nombre, String apellido, int telefono, String email, boolean genero, String especialidad) {
        super(id, nombre, apellido, telefono, email, genero);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
