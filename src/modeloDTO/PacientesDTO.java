package modeloDTO;

import java.time.LocalDate;

public class PacientesDTO {

    private int idPaciente;
    private int dniPaciente;
    private String nPaciente;
    private String apellidos;
    private LocalDate fechaNacimiento;
    private int telefono;
    private String email;
    private boolean genero;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;

    public PacientesDTO(int idPaciente, int dniPaciente, String nPaciente, String apellidos, LocalDate fechaNacimiento, int telefono, String email, boolean genero, String direccion, String ciudad, String estado, String codigoPostal) {
        this.idPaciente = idPaciente;
        this.dniPaciente = dniPaciente;
        this.nPaciente = nPaciente;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.genero = genero;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getDniPaciente() {
        return dniPaciente;
    }

    public void setDniPaciente(int dniPaciente) {
        this.dniPaciente = dniPaciente;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}
