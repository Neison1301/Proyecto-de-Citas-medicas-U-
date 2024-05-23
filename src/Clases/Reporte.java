package Clases;

public abstract class Reporte implements Boleta {

    protected String titulo;

    public Reporte(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public abstract void generarReporte();

}
