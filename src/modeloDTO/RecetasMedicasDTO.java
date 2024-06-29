package modeloDTO;

public class RecetasMedicasDTO {

    private int idReceta;
    private int idCita;
    private String medicamento;
    private String dosis;
    private String instrucciones;

    public RecetasMedicasDTO(int idReceta, int idCita, String medicamento, String dosis, String instrucciones) {
        this.idReceta = idReceta;
        this.idCita = idCita;
        this.medicamento = medicamento;
        this.dosis = dosis;
        this.instrucciones = instrucciones;
    }

    
    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }
    
    
}
