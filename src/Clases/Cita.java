package Clases;

public abstract class Cita {

    protected String fecha;


    public Cita(String fecha) {
        this.fecha = fecha;
    }

    public abstract void detallesCita();
}
