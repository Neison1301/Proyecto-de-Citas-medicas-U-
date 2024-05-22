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

    String registrodoctor = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\Documents\\NetBeansProjects\\CitasMedicas-master\\src\\Almacenamiento\\RegistroDoctor.txt";

    private int cantidadActual;
    private String especialidad;

    public String getRegistrodoctor() {
        return registrodoctor;
    }

    public void setRegistrodoctor(String registrodoctor) {
        this.registrodoctor = registrodoctor;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Ndoctor(int cantidadActual, String especialidad, int id, String nombre, String apellido, String telefono, String email, boolean genero) {
        super(id, nombre, apellido, telefono, email, genero);
        this.cantidadActual = cantidadActual;
        this.especialidad = especialidad;
    }

    @Override
    public void crear(String archivo) {
       try (BufferedWriter writer = new BufferedWriter(new FileWriter(registrodoctor, true))) {
            writer.write(String.format("%d, %s, %s, %s, %s, %s, %s%n", getId(), getNombre(), getApellido(), getTelefono(), getEmail(),
                    isGenero() ? "Masculino" : "Femenino", especialidad));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }    }

    @Override
    public ArrayList<Object[]> leer(String archivo) {
        ArrayList<Object[]> doctores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(registrodoctor))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 7) {
                    int id = Integer.parseInt(parts[0]);
                    String nombre = parts[1];
                    String apellido = parts[2];
                    String telefono = parts[3];
                    String email = parts[4];
                    boolean genero = parts[5].equals("Masculino");
                    String especialidad = parts[6];
                    Object[] doctor = {id, nombre, apellido, telefono, email, genero, especialidad};
                    doctores.add(doctor);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja la excepción apropiadamente en tu aplicación
        }
        return doctores;
    }

    @Override
    public void actualizar(HashMap<String, Object> nuevosValores, String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id, String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
