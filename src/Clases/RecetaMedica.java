package Clases;

import java.util.ArrayList;

public class RecetaMedica extends Medicamento {

    private String nombrePaciente;

    private ArrayList<Medicamento> medicamentosRecetados;

    public RecetaMedica(String nombrePaciente, ArrayList<Medicamento> medicamentosRecetados, String nombre, int cantidadDisponible) {
        super(nombre, cantidadDisponible);
        this.nombrePaciente = nombrePaciente;
        this.medicamentosRecetados = medicamentosRecetados;
    }


    public ArrayList<Medicamento> getMedicamentosRecetados() {
        return medicamentosRecetados;
    }

    public void setMedicamentosRecetados(ArrayList<Medicamento> medicamentosRecetados) {
        this.medicamentosRecetados = medicamentosRecetados;
    }



    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

}
