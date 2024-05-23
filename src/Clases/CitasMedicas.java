package Clases;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class CitasMedicas extends Cita implements CRUD<CitasMedicas>, AtencionMedica {

    private static final String ARCHIVO_CITAS = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\Documents\\NetBeansProjects\\CitasMedicas-master\\src\\Almacenamiento\\CitasMedi.txt";
    private static int ultimoId = 0;
    public int id = 1;
    private NPacientes paciente;
    private Ndoctor doctor;
    public String motivo;

    public CitasMedicas(int id, String fecha, String hora, NPacientes paciente, Ndoctor doctor, String motivo) {
        super(fecha, hora);
        this.id = id;
        this.paciente = paciente;
        this.doctor = doctor;
        this.motivo = motivo;
        if (id > ultimoId) {
            ultimoId = id;
        }
    }

    public int getId() {
        return id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public static void setUltimoId(int ultimoId) {
        CitasMedicas.ultimoId = ultimoId;
    }

    public NPacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(NPacientes paciente) {
        this.paciente = paciente;
    }

    public Ndoctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Ndoctor doctor) {
        this.doctor = doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    @Override
    public void crear(CitasMedicas cita) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CITAS, true))) {
            String datosCita = String.format("%d, %s, %s, %s, %s, %s, %s%n", id, fecha, hora, paciente.getNombre(), doctor.getNombre(), paciente.getId(), motivo);
            writer.write(datosCita);
            JOptionPane.showMessageDialog(null, "Cita creada con éxito.");
            writer.write(String.valueOf(id));
            id++;
        } catch (IOException e) {
            manejarError("Error al escribir en el archivo: ", e);
        }
    }

    @Override
    public ArrayList<CitasMedicas> leer() {
        ArrayList<CitasMedicas> citas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CITAS))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                if (parts.length >= 7) {
                    id = Integer.parseInt(parts[0]);
                    fecha = parts[1];
                    hora = parts[2];
                    String pacienteNombre = parts[3];
                    String doctorNombre = parts[4];
                    int pacienteDni = Integer.parseInt(parts[5]);
                    motivo = parts[6];

                    paciente = new NPacientes(pacienteDni, 0, 0, pacienteNombre, null, null, null, false);
                    doctor = new Ndoctor(0, doctorNombre, null, null, null, false, null, 0);

                    CitasMedicas cita = new CitasMedicas(id, fecha, hora, paciente, doctor, motivo);
                    citas.add(cita);
                }
            }
        } catch (IOException e) {
            manejarError("Error al leer el archivo: ", e);
        }
        return citas;
    }

    @Override
    public void actualizar(int id, HashMap<String, Object> nuevosValores) {
        File archivoTemporal = new File(ARCHIVO_CITAS + ".tmp");

        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CITAS)); BufferedWriter writer = new BufferedWriter(new FileWriter(archivoTemporal))) {
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
            archivoTemporal.renameTo(new File(ARCHIVO_CITAS));
        } catch (IOException e) {
            manejarError("Error al actualizar el archivo: ", e);
        }
    }

    @Override
    public void eliminar(int id) {
         ArrayList<CitasMedicas> citas = leer();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CITAS))) {
            for (CitasMedicas cita : citas) {
                if (cita.getId() != id) {
                    writer.write(String.format("%d, %s, %s, %s, %s, %s, %s%n", cita.getId(), cita.getFecha(), cita.getHora(), cita.getPaciente().getNombre(), cita.getDoctor().getNombre(), cita.getPaciente().getDni(), cita.getMotivo()));
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
        ArrayList<CitasMedicas> citas = leer();

        for (CitasMedicas cita : citas) {
            modelo.addRow(new Object[]{cita.getId(), cita.getMotivo(), cita.getFecha(), cita.getHora(),
                cita.getPaciente().getNombre(), cita.getDoctor().getNombre()});
        }
    }

    @Override
    public void detallesCita() {
        System.out.println("Cita Médica - ID: " + id + ", Fecha: " + fecha + ", Hora: " + hora + ", Paciente: " + paciente.getNombre() + ", Doctor: " + doctor.getNombre());
    }

    @Override
    public void agendarCita(CitasMedicas cita) {
        crear(cita);
    }

    @Override
    public void cancelarCita(int id) {
        eliminar(id);
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

    private void manejarError(String mensaje, IOException e) {
        JOptionPane.showMessageDialog(null, mensaje + e.getMessage());
    }

    public CitasMedicas obtenerCitaPorId(int id) {
        ArrayList<CitasMedicas> citas = leer();
        for (CitasMedicas cita : citas) {
            if (cita.getId() == id) {
                return cita;
            }
        }
        return null; // Retorna null si no se encuentra la cita con el ID especificado
    }

}
