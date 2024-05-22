package Clases;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CitasMedicas extends Cita implements CRUD, AtencionMedica {

    private String ARCHIVO_CITAS = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\Documents\\NetBeansProjects\\CitasMedicas-master\\src\\Almacenamiento\\CitasMedi.txt";
    private int ultimoId = 0;
    private int id;
    private int dni;
    private String paciente;
    private String doctor;
    private String motivo;

    public String getARCHIVO_CITAS() {
        return ARCHIVO_CITAS;
    }

    public void setARCHIVO_CITAS(String ARCHIVO_CITAS) {
        this.ARCHIVO_CITAS = ARCHIVO_CITAS;
    }

    public int getUltimoId() {
        return ultimoId;
    }

    public void setUltimoId(int ultimoId) {
        this.ultimoId = ultimoId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public CitasMedicas(int id, int dni, String paciente, String doctor, String motivo, String fecha, String hora) {
        super(fecha, hora);
        this.id = id;
        this.dni = dni;
        this.paciente = paciente;
        this.doctor = doctor;
        this.motivo = motivo;
        if (id > ultimoId) {
            ultimoId = id;
        }
    }

    @Override
    public void crear() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CITAS, true))) {
            String datosCita = String.format("%d, %d, %s, %s, %s, %s, %s%n", id, dni, paciente, doctor, motivo, fecha, hora);
            writer.write(datosCita);
            JOptionPane.showMessageDialog(null, "Cita creada con éxito.");
        } catch (IOException e) {
            manejarError("Error al escribir en el archivo: ", e);
        }
    }

    @Override
    public ArrayList<Object[]> leer() {
        ArrayList<Object[]> datos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CITAS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 7) {
                    Object[] fila = {parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6]};
                    datos.add(fila);
                }
            }
        } catch (IOException e) {
            manejarError("Error al leer el archivo: ", e);
        }
        return datos;
    }

    @Override
    public void actualizar(HashMap<String, Object> nuevosValores) {
        ArrayList<Object[]> datos = leer(); // Corrección aquí
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CITAS))) {
            for (Object[] fila : datos) {
                int citaId = Integer.parseInt(fila[0].toString());
                if (citaId == id) {
                    for (String key : nuevosValores.keySet()) {
                        int index = getIndexFromKey(key);
                        if (index != -1) {
                            fila[index] = nuevosValores.get(key);
                        }
                    }
                }
                writer.write(String.format("%s, %s, %s, %s, %s, %s, %s%n", fila));
            }
            JOptionPane.showMessageDialog(null, "Cita actualizada con éxito.");
        } catch (IOException e) {
            manejarError("Error al actualizar el archivo: ", e);
        }
    }

    @Override
    public void eliminar(int id) {
        ArrayList<Object[]> datos = leer();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CITAS))) {
            for (Object[] fila : datos) {
                if (Integer.parseInt(fila[0].toString()) != id) {
                    writer.write(String.format("%s, %s, %s, %s, %s, %s, %s%n", fila));
                }
            }
            JOptionPane.showMessageDialog(null, "Cita eliminada con éxito.");
        } catch (IOException e) {
            manejarError("Error al eliminar del archivo: ", e);
        }
    }

    public void mostrarCitas(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        ArrayList<Object[]> datos = leer();

        for (Object[] cita : datos) {
            modelo.addRow(new Object[]{cita[0], cita[6]});
        }
    }

    @Override
    public void detallesCita() {
        System.out.println("Cita Médica - ID: " + id + ", Fecha: " + fecha + ", Hora: " + hora + ", Paciente: " + paciente + ", Doctor: " + doctor);
    }

    private int getIndexFromKey(String key) {
        return switch (key) {
            case "id" ->
                0;
            case "fecha" ->
                1;
            case "hora" ->
                2;
            case "paciente" ->
                3;
            case "doctor" ->
                4;
            case "dni" ->
                5;
            case "motivo" ->
                6;
            default ->
                -1;
        };
    }

    @Override
    public void agendarCita(CitasMedicas cita) {
        cita.crear();
    }

    @Override
    public void cancelarCita(CitasMedicas cita) {
        eliminar(id);
    }

    private void manejarError(String mensaje, IOException e) {
        JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
    }

}
