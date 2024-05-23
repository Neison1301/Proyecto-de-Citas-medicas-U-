package Clases;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Ndoctor extends Persona implements CRUD<Ndoctor> {

    private static final String ARCHIVO_DOCTORES = "ruta/al/archivo/doctores.txt";
    private int id;
    private String especialidad;
    private int cantidadActual;

    public Ndoctor(int id, String nombre, String apellido, String telefono, String email, boolean genero, String especialidad, int cantidadActual) {
        super(id, nombre, apellido, telefono, email, genero);
        this.id = id;
        this.especialidad = especialidad;
        this.cantidadActual = cantidadActual;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
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

    public void establecerInformaciondoctor(int id, String nombre, String apellido, String telefono, String email, boolean genero, String especialidad, int cantidadActual) {
        setId(id);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setGenero(genero);
        setEspecialidad(especialidad);
        setCantidadActual(cantidadActual);
    }

    @Override
    public void crear(Ndoctor doctor) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_DOCTORES, true))) {
            String datosDoctor = String.format("%d, %s, %s, %s, %s, %s, %d%n", doctor.getId(), doctor.getNombre(), doctor.getApellido(), doctor.getTelefono(), doctor.getEmail(),
                    doctor.isGenero() ? "Masculino" : "Femenino", doctor.getEspecialidad(), doctor.getCantidadActual());
            writer.write(datosDoctor);
            JOptionPane.showMessageDialog(null, "Doctor creado con éxito.");
        } catch (IOException e) {
            manejarError("Error al escribir en el archivo: ", e);
        }
    }

    @Override
    public ArrayList<Ndoctor> leer() {
        ArrayList<Ndoctor> doctores = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_DOCTORES))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 7) {
                    id = Integer.parseInt(parts[0]);
                    String nombre = parts[1];
                    String apellido = parts[2];
                    String telefono = parts[3];
                    String email = parts[4];
                    boolean genero = parts[5].equals("Masculino");
                    especialidad = parts[6];
                    cantidadActual = Integer.parseInt(parts[7]);
                    Ndoctor doctor = new Ndoctor(id, nombre, apellido, telefono, email, genero, especialidad, cantidadActual);
                    doctores.add(doctor);
                }
            }
        } catch (IOException e) {
            manejarError("Error al leer el archivo: ", e);
        }
        return doctores;
    }

    @Override
    public void actualizar(int id, HashMap<String, Object> nuevosValores) {
        File archivoTemporal = new File(ARCHIVO_DOCTORES + ".tmp");

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_DOCTORES)); BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemporal))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(", ");
                if (partes.length >= 7 && Integer.parseInt(partes[0]) == id) {
                    for (String clave : nuevosValores.keySet()) {
                        int indice = getIndexFromKey(clave);
                        if (indice != -1) {
                            partes[indice] = nuevosValores.get(clave).toString();
                        }
                    }
                    writer.write(String.join(", ", partes) + "\n");
                } else {
                    writer.write(linea + "\n");
                }
            }
            archivoTemporal.renameTo(new File(ARCHIVO_DOCTORES));
        } catch (IOException e) {
            manejarError("Error al actualizar el archivo: ", e);
        }
    }

    @Override
    public void eliminar(int id) {
        ArrayList<Ndoctor> doctores = leer();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_DOCTORES))) {
            for (Ndoctor doctor : doctores) {
                if (doctor.getId() != id) {
                    writer.write(String.format("%d, %s, %s, %s, %s, %s, %d%n", doctor.getId(), doctor.getNombre(), doctor.getApellido(), doctor.getTelefono(), doctor.getEmail(),
                            doctor.isGenero() ? "Masculino" : "Femenino", doctor.getEspecialidad(), doctor.getCantidadActual()));
                }
            }
            JOptionPane.showMessageDialog(null, "Doctor eliminado con éxito.");
        } catch (IOException e) {
            manejarError("Error al eliminar del archivo: ", e);
        }
    }

    private int getIndexFromKey(String key) {
        return switch (key) {
            case "id" ->
                0;
            case "nombre" ->
                1;
            case "apellido" ->
                2;
            case "telefono" ->
                3;
            case "email" ->
                4;
            case "genero" ->
                5;
            case "especialidad" ->
                6;
            case "cantidadActual" ->
                7;
            default ->
                -1;
        };
    }

    private void manejarError(String mensaje, IOException e) {
        JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
    }
}
