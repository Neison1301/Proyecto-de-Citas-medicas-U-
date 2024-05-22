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
    private  int id;

    public NPacientes(int dni, int edad, int id, String nombre, String apellido, String telefono, String email, boolean genero) {
        super(id, nombre, apellido, telefono, email, genero);
        this.dni = dni;
        this.edad = edad;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void agregarPaciente(int id, int dni, String nombre, String apellido, String telefono, String email, boolean genero) {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setGenero(genero);
        setDni(dni);
    }

    @Override
    public void crear(String archivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
            writer.write(String.format("%d, %d, %d, %s, %s, %s, %s, %s%n", id, getDni(), getEdad(), getNombre(), getApellido(),
                    getTelefono(), getEmail(), isGenero() ? "Masculino" : "Femenino"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<Object[]> leer(String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mostrarInformacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void generarReporte() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizar(HashMap<String, Object> nuevosValores, String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int id, String archivo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
