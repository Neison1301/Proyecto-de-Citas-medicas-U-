package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class NPacientes extends CitasMedicas {

    String rutaArchivo = "src/Almacenamiento/RegistroPaciente.txt";
    
    private int cantidadActual = 0;

    private int[] idPaciente;
    private String[] nombrePaciente;
    private String[] apellidoPaciente;
    private String[] telefonoPaciente;
    private String[] emailPaciente;
    private int[] edadPaciente;
    private boolean[] generoPaciente;

    public int[] getIdPaciente() {
        return idPaciente;
    }

    public String[] getNombrePaciente() {
        return nombrePaciente;
    }

    public String[] getApellidoPaciente() {
        return apellidoPaciente;
    }

    public String[] getTelefonoPaciente() {
        return telefonoPaciente;
    }

    public String[] getEmailPaciente() {
        return emailPaciente;
    }

    public int[] getEdadPaciente() {
        return edadPaciente;
    }

    public boolean[] getGeneroPaciente() {
        return generoPaciente;
    }

    public void setIdPaciente(int[] idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNombrePaciente(String[] nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public void setApellidoPaciente(String[] apellidoPaciente) {
        this.apellidoPaciente = apellidoPaciente;
    }

    public void setTelefonoPaciente(String[] telefonoPaciente) {
        this.telefonoPaciente = telefonoPaciente;
    }

    public void setEmailPaciente(String[] emailPaciente) {
        this.emailPaciente = emailPaciente;
    }

    public void setEdadPaciente(int[] edadPaciente) {
        this.edadPaciente = edadPaciente;
    }

    public void setGeneroPaciente(boolean[] generoPaciente) {
        this.generoPaciente = generoPaciente;
    }

    public NPacientes(int[] idPaciente, String[] nombrePaciente, String[] apellidoPaciente, String[] telefonoPaciente, String[] emailPaciente, int[] edadPaciente, boolean[] generoPaciente) {
        this.idPaciente = idPaciente;
        this.nombrePaciente = nombrePaciente;
        this.apellidoPaciente = apellidoPaciente;
        this.telefonoPaciente = telefonoPaciente;
        this.emailPaciente = emailPaciente;
        this.edadPaciente = edadPaciente;
        this.generoPaciente = generoPaciente;
    }
    

    public void agregarPaciente(int id, String nombre, String apellido, String telefono, String email, int edad, boolean genero) {

        if (cantidadActual < 99999999) {
            idPaciente[cantidadActual] = id;
            nombrePaciente[cantidadActual] = nombre;
            apellidoPaciente[cantidadActual] = apellido;
            telefonoPaciente[cantidadActual] = telefono;
            emailPaciente[cantidadActual] = email;
            edadPaciente[cantidadActual] = edad;
            generoPaciente[cantidadActual] = genero;
            cantidadActual++;
        }
    }

    public void escribirDatosEnArchivo(String Archivo) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaArchivo,true));
            for (int i = 0; i < cantidadActual; i++) {
                writer.write(idPaciente[i] + ", ");
                writer.write(nombrePaciente[i] + ", ");
                writer.write(apellidoPaciente[i] + ", ");
                writer.write(telefonoPaciente[i] + ", ");
                writer.write(emailPaciente[i] + ", ");
                writer.write(edadPaciente[i] + ", ");
                writer.write(generoPaciente[i] ? "Masculino" : "Femenino");
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
        }
    }

}
