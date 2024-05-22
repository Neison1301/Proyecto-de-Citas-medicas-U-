package Clases;

public abstract class Cita {

    protected String fecha;
    protected String hora;

    public Cita(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public abstract void detallesCita();
}
