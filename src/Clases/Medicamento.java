package Clases;

import java.util.ArrayList;

public class Medicamento {

    public String nombre;
    public int cantidadDisponible;
    private ArrayList<RecetaMedica> recetas;

    public Medicamento(String nombre, int cantidadDisponible) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.recetas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public ArrayList<RecetaMedica> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<RecetaMedica> recetas) {
        this.recetas = recetas;
    }
}
