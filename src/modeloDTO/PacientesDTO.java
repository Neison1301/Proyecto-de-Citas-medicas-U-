package modeloDTO;

public class PacientesDTO {

    private int id;
    private int dniPaciente;
    private int edad;
    private String nPaciente;
    private String apellidos;
    private int telefono;
    private String email;
    private boolean genero;

    public PacientesDTO(int id, int dniPaciente, int edad, String nPaciente, String apellidos, int telefono, String email, boolean genero) {
        this.id = id;
        this.dniPaciente = dniPaciente;
        this.edad = edad;
        this.nPaciente = nPaciente;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        this.dniPaciente = dniPaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getnPaciente() {
        return nPaciente;
    }

    public void setnPaciente(String nPaciente) {
        this.nPaciente = nPaciente;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }
}
