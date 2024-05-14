package Clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Ndoctor extends CitasMedicas {

    String registrodoctor = "src/Almacenamiento/RegistroDoctor.txt";

    private int cantidadActual;

    private int[] idDoctor;
    private String[] nombreDoctor;
    private String[] apellidoDoctor;
    private String[] telefonoDoctor;
    private String[] emailDoctor;
    private boolean[] generoDoctor;
    private String[] especialidadDoctor;

    public int[] getIdDoctor() {
        return idDoctor;
    }

    public String[] getNombreDoctor() {
        return nombreDoctor;
    }

    public String[] getApellidoDoctor() {
        return apellidoDoctor;
    }

    public String[] getTelefonoDoctor() {
        return telefonoDoctor;
    }

    public String[] getEmailDoctor() {
        return emailDoctor;
    }

    public boolean[] getGeneroDoctor() {
        return generoDoctor;
    }

    public void setIdDoctor(int[] idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setNombreDoctor(String[] nombreDoctor) {
        this.nombreDoctor = nombreDoctor;
    }

    public void setApellidoDoctor(String[] apellidoDoctor) {
        this.apellidoDoctor = apellidoDoctor;
    }

    public void setTelefonoDoctor(String[] telefonoDoctor) {
        this.telefonoDoctor = telefonoDoctor;
    }

    public void setEmailDoctor(String[] emailDoctor) {
        this.emailDoctor = emailDoctor;
    }

    public void setGeneroDoctor(boolean[] generoDoctor) {
        this.generoDoctor = generoDoctor;

    }

    public void setEspecialidadDoctor(String[] especialidadDoctor) {
        this.especialidadDoctor = especialidadDoctor;
    }

    public Ndoctor(int[] idDoctor, String[] nombreDoctor, String[] apellidoDoctor, String[] telefonoDoctor, String[] emailDoctor, boolean[] generoDoctor, String[] especialidadDoctor) {
        this.idDoctor = idDoctor;
        this.nombreDoctor = nombreDoctor;
        this.apellidoDoctor = apellidoDoctor;
        this.telefonoDoctor = telefonoDoctor;
        this.emailDoctor = emailDoctor;
        this.generoDoctor = generoDoctor;
        this.especialidadDoctor = especialidadDoctor;
    }

    public void agregarDoctor(int id, String nombre, String apellido, String telefono, String email, boolean genero, String especialidad) {

        if (cantidadActual < 99999999) {
            idDoctor[cantidadActual] = id;
            nombreDoctor[cantidadActual] = nombre;
            apellidoDoctor[cantidadActual] = apellido;
            telefonoDoctor[cantidadActual] = telefono;
            emailDoctor[cantidadActual] = email;
            generoDoctor[cantidadActual] = genero;
            especialidadDoctor[cantidadActual] = especialidad;
            cantidadActual++;
        }
    }

    public void escribirDatosEnArchivo(String Archivo) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(registrodoctor, true));
            for (int i = 0; i < cantidadActual; i++) {
                writer.write(idDoctor[i] + ", ");
                writer.write(nombreDoctor[i] + ", ");
                writer.write(apellidoDoctor[i] + ", ");
                writer.write(telefonoDoctor[i] + ", ");
                writer.write(emailDoctor[i] + ", ");
                writer.write(generoDoctor[i] ? "Masculino" : "Femenino" +", ");
                writer.write(especialidadDoctor[i] + ", ");
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al escribir en el archivo.");
        }
    }

}
