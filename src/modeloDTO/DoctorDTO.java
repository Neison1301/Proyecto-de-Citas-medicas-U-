package modeloDTO;

import miAbstract.Persona;
import java.math.BigDecimal;
import java.time.LocalDate;

public class DoctorDTO extends Persona {

    private String especialidad;
    private String direccion;
    private String ciudad;
    private String estado;
    private String codigoPostal;
    private LocalDate fechaContratacion;
    private BigDecimal salario;

    public DoctorDTO(int id, int dni, String nombre, String apellido, int telefono, String email, boolean genero, String especialidad, String direccion, String ciudad, String estado, String codigoPostal, LocalDate fechaContratacion, BigDecimal salario) {
        super(id, dni, nombre, apellido, telefono, email, genero);
        this.especialidad = especialidad;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.codigoPostal = codigoPostal;
        this.fechaContratacion = fechaContratacion;
        this.salario = salario;
    }


    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
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

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getDni() {
        return dni;
    }

    @Override
    public void setDni(int dni) {
        this.dni = dni;
    }

}
