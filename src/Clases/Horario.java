package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Horario implements CRUD<Horario> {
    private String archivo = "C:\\Users\\NEISON\\Downloads\\CitasMedicas-master\\src\\Almacenamiento\\Horario.txt";

    private String dia;
    private String horaEntrada;
    private String horaSalida;
    private String descanso;
    private String turno;

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getDescanso() {
        return descanso;
    }

    public void setDescanso(String descanso) {
        this.descanso = descanso;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }


    
    @Override
    public void crear(Horario entidad) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(String.format("%s, %s, %s, %s, %s%n", entidad.getDia(), entidad.getHoraEntrada(), entidad.getHoraSalida(), entidad.getDescanso(), entidad.getTurno()));
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Horario> leer() {
        // Implement logic to read from file and return list of Horario objects
        return null; // Replace null with actual implementation
    }

    @Override
    public void actualizar(int id, HashMap<String, Object> nuevosValores) {
        // Implement logic to update Horario object
    }

    @Override
    public void eliminar(int id) {
        // Implement logic to delete Horario object
    }
}
