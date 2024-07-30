
package modeloDTO;

public class ConsultoriosDTO {

    private int idConsultorio;
    private String nombreConsultorio;
    private String ubicacion;
    private String telefono;

    public ConsultoriosDTO(int idConsultorio, String nombreConsultorio, String ubicacion, String telefono) {
        this.idConsultorio = idConsultorio;
        this.nombreConsultorio = nombreConsultorio;
        this.ubicacion = ubicacion;
        this.telefono = telefono;
    }

    
    public int getIdConsultorio() {
        return idConsultorio;
    }

    public void setIdConsultorio(int idConsultorio) {
        this.idConsultorio = idConsultorio;
    }

    public String getNombreConsultorio() {
        return nombreConsultorio;
    }

    public void setNombreConsultorio(String nombreConsultorio) {
        this.nombreConsultorio = nombreConsultorio;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
