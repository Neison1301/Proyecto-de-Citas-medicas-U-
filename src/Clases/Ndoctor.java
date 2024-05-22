package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Ndoctor extends Persona implements CRUD {

    private String registrodoctor = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\Documents\\NetBeansProjects\\CitasMedicas-master\\src\\Almacenamiento\\RegistroDoctor.txt";
    private String especialidad;
    private int cantidadActual;

    public Ndoctor(int id, String nombre, String apellido, String telefono, String email, boolean genero, String especialidad, int cantidadActual) {
        super(id, nombre, apellido, telefono, email, genero);
        this.especialidad = especialidad;
        this.cantidadActual = cantidadActual;
    }

    public String getRegistrodoctor() {
        return registrodoctor;
    }

    public void setRegistrodoctor(String registrodoctor) {
        this.registrodoctor = registrodoctor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    @Override
    public void crear() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(registrodoctor, true))) {
            writer.write(String.format("%d, %s, %s, %s, %s, %s, %s, %d%n", getId(), getNombre(), getApellido(), getTelefono(), getEmail(),
                    isGenero() ? "Masculino" : "Femenino", especialidad, cantidadActual));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object[]> leer() {
        ArrayList<Object[]> doctores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(registrodoctor))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 8) {
                    id = Integer.parseInt(parts[0]);
                    String nombre = parts[1];
                    String apellido = parts[2];
                    String telefono = parts[3];
                    String email = parts[4];
                    boolean genero = parts[5].equals("Masculino");
                    especialidad = parts[6];
                    cantidadActual = Integer.parseInt(parts[7]);
                    Object[] doctor = {id, nombre, apellido, telefono, email, genero, especialidad, cantidadActual};
                    doctores.add(doctor);
                }
            }
        } catch (IOException e) {
            // Maneja la excepción apropiadamente en tu aplicación
            
        }
        return doctores;
    }

    @Override
    public void actualizar(HashMap<String, Object> nuevosValores) {
        id = (int) nuevosValores.get("id");
        eliminar(id); // Eliminar el doctor existente
        // Crear el doctor con los nuevos valores
        crear();
    }

    @Override
    public void eliminar(int id) {
        ArrayList<Object[]> doctores = leer(); // Leer los doctores desde el archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(registrodoctor))) {
            for (Object[] doctor : doctores) {
                int doctorId = (int) doctor[0];
                if (doctorId != id) {
                    writer.write(String.format("%d, %s, %s, %s, %s, %s, %s, %d%n", doctor[0], doctor[1], doctor[2], doctor[3], doctor[4], doctor[5], doctor[6], doctor[7]));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
