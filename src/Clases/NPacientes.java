package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class NPacientes extends Persona implements Reporte, CRUD {

    private String archivo = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\Documents\\NetBeansProjects\\CitasMedicas-master\\src\\Almacenamiento\\RegistroPaciente.txt";
    private int dni;
    private int edad;

    public NPacientes(int dni, int edad, int id, String nombre, String apellido, String telefono, String email, boolean genero) {
        super(id, nombre, apellido, telefono, email, genero);
        this.dni = dni;
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void establecerInformacionPaciente(int id, int dni, String nombre, String apellido, String telefono, String email, boolean genero) {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setGenero(genero);
        setDni(dni);
    }

    @Override
    public void crear() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(String.format("%d, %d, %d, %s, %s, %s, %s, %s%n", id, getDni(), getEdad(), getNombre(), getApellido(),
                    getTelefono(), getEmail(), isGenero() ? "Masculino" : "Femenino"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object[]> leer() {
        ArrayList<Object[]> pacientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 8) {
                    id = Integer.parseInt(parts[0]);
                    dni = Integer.parseInt(parts[1]);
                    edad = Integer.parseInt(parts[2]);
                    String nombre = parts[3];
                    String apellido = parts[4];
                    String telefono = parts[5];
                    String email = parts[6];
                    boolean genero = parts[7].equals("Masculino");
                    Object[] paciente = {id, dni, edad, nombre, apellido, telefono, email, genero};
                    pacientes.add(paciente);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja la excepción apropiadamente en tu aplicación
        }
        return pacientes;
    }

    @Override
    public void mostrarInformacion() {
        ArrayList<Object[]> pacientes = leer();
        for (Object[] paciente : pacientes) {
            // Aquí puedes imprimir la información del paciente en la consola o hacer cualquier otro tipo de manipulación
            System.out.println("ID: " + paciente[0] + ", DNI: " + paciente[1] + ", Nombre: " + paciente[3]);
        }
    }

    @Override
    public void generarReporte() {
        ArrayList<Object[]> pacientes = leer();
        System.out.println("Reporte de pacientes:");
        for (Object[] paciente : pacientes) {
            System.out.println("ID: " + paciente[0] + ", DNI: " + paciente[1] + ", Nombre: " + paciente[3]);
        }

    }

    @Override
    public void actualizar(HashMap<String, Object> nuevosValores) {
        int id = (int) nuevosValores.get("id");
        eliminar(id); // Eliminar el paciente existente
        // Crear el paciente con los nuevos valores
        crear();

    }

    @Override
    public void eliminar(int id) {
        ArrayList<Object[]> pacientes = leer(); // Pasar archivo como parámetro
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo))) {
            for (Object[] paciente : pacientes) {
                int pacienteId = (int) paciente[0];
                if (pacienteId != id) {
                    writer.write(String.format("%d, %d, %d, %s, %s, %s, %s, %s%n", paciente[0], paciente[1], paciente[2], paciente[3], paciente[4], paciente[5], paciente[6], paciente[7]));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public String buscarNombrePorDNI(int dni) {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 8) {
                    int pacienteDNI = Integer.parseInt(parts[1]);
                    if (pacienteDNI == dni) {
                        return parts[3]; // Retorna el nombre del paciente
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Maneja la excepción apropiadamente en tu aplicación
        }
        return null; // Retorna null si no se encuentra el paciente
    }
}
