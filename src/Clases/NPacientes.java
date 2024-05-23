package Clases;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class NPacientes extends Persona implements CRUD<NPacientes> {

    private static final String ARCHIVO_PACIENTES = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\Documents\\NetBeansProjects\\CitasMedicas-master\\src\\Almacenamiento\\RegistroPaciente.txt";

    private int dni;
    private int edad;
    //relacion de agregacion entre esta clase y recetass medidcas;
    private ArrayList<RecetaMedica> recetasMedicas;

    public NPacientes(int dni, int edad, int id, String nombre, String apellido, String telefono, String email, boolean genero) {
        super(id, nombre, apellido, telefono, email, genero);
        this.dni = dni;
        this.edad = edad;
        this.recetasMedicas = new ArrayList<>();

    }

    public ArrayList<RecetaMedica> getRecetasMedicas() {
        return recetasMedicas;
    }

    public void setRecetasMedicas(ArrayList<RecetaMedica> recetasMedicas) {
        this.recetasMedicas = recetasMedicas;
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

    public void agregarPaciente(int dni, int edad, String nombre, String apellido, String telefono, String email, boolean genero) {
        NPacientes nuevoPaciente = new NPacientes(dni, edad, obtenerId(), nombre, apellido, telefono, email, genero);
        crear(nuevoPaciente);
    }

    @Override
    public void crear(NPacientes paciente) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_PACIENTES, true))) {
            writer.write(String.format("%d, %d, %d, %s, %s, %s, %s, %s%n", paciente.getId(), paciente.getDni(), paciente.getEdad(), paciente.getNombre(), paciente.getApellido(),
                    paciente.getTelefono(), paciente.getEmail(), paciente.isGenero() ? "Masculino" : "Femenino"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<NPacientes> leer() {
        ArrayList<NPacientes> pacientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_PACIENTES))) {
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
                    NPacientes paciente = new NPacientes(dni, edad, id, nombre, apellido, telefono, email, genero);
                    pacientes.add(paciente);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }
        return pacientes;
    }

    @Override
    public void eliminar(int id) {
        ArrayList<NPacientes> pacientes = leer();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_PACIENTES))) {
            for (NPacientes paciente : pacientes) {
                if (paciente.getId() != id) {
                    writer.write(String.format("%d, %d, %d, %s, %s, %s, %s, %s%n", paciente.getId(), paciente.getDni(), paciente.getEdad(), paciente.getNombre(), paciente.getApellido(),
                            paciente.getTelefono(), paciente.getEmail(), paciente.isGenero() ? "Masculino" : "Femenino"));
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public void actualizar(int id, HashMap<String, Object> nuevosValores) {
        ArrayList<NPacientes> pacientes = leer();
        eliminar(id);
        // Crear el paciente con los nuevos valores proporcionados
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_PACIENTES, true))) {

            dni = (int) nuevosValores.get("dni");
            edad = (int) nuevosValores.get("edad");
            String nombre = (String) nuevosValores.get("nombre");
            String apellido = (String) nuevosValores.get("apellido");
            String telefono = (String) nuevosValores.get("telefono");
            String email = (String) nuevosValores.get("email");
            boolean genero = (boolean) nuevosValores.get("genero");

            
            writer.write(String.format("%d, %d, %d, %s, %s, %s, %s, %s%n", id, dni, edad, nombre, apellido, telefono, email, genero ? "Masculino" : "Femenino"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public NPacientes obtenerId(int id) {
        ArrayList<NPacientes> pacientes = leer();
        for (NPacientes paciente : pacientes) {
            if (paciente.getId() == id) {
                return paciente;
            }
        }
        return null; 
    }

    public int obtenerId() {
        int nuevoId = 0;
        ArrayList<NPacientes> pacientes = leer();
        for (NPacientes paciente : pacientes) {
            if (paciente.getId() > nuevoId) {
                nuevoId = paciente.getId();
            }
        }
        return nuevoId + 1; 
    }

    public void mostrarPacientes(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0); 
        ArrayList<NPacientes> pacientes = leer(); 
        
        // Recorrer la lista de pacientes y agregar cada uno a la tabla
        for (NPacientes paciente : pacientes) {
            modelo.addRow(new Object[]{paciente.getId(), paciente.getNombre() + paciente.getApellido(),
                paciente.getTelefono()});
        }
    }

}
