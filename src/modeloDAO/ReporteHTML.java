package modeloDAO;

import config.Conexion;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modeloDTO.CitasMedicasDTO;
import modeloDTO.DoctorDTO;
import modeloDTO.PacientesDTO;

public class ReporteHTML {

    Conexion conexion = new Conexion();
    CitasMedicasDAO citasMedicasDAO = new CitasMedicasDAO();
    DoctorDAO doctorDAO = new DoctorDAO(conexion);
    DoctorDTO doctorDTO = new DoctorDTO(0, 0, null, null, 0, null, true, null, null, null, null, null, null, null);

    public ReporteHTML() {
    }

    public void generarReporte(int idCita) {
        String rutaArchivo = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\reportefd_facturas.html";
        File archivo = new File(rutaArchivo);

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
            ArrayList<DoctorDTO> doctor = doctorDAO.leer(0);
            ArrayList<CitasMedicasDTO> citas = citasMedicasDAO.leer(0);
            PacientesDAO pacienteDAO = new PacientesDAO(conexion, 0, 0, null, null, 0, null, true);

            String nombreDoctor = "";
            String nombrePaciente = "";
            String direccionPaciente = "";
            int telefonoPaciente = 0;
            String emailPaciente = "";
            String especialidad = "";
            int idDoctor = 0;

            CitasMedicasDTO citaEncontrada = null;

            for (CitasMedicasDTO cita : citas) {
                if (cita.getIdCita() == idCita) {
                    idDoctor = cita.getIdDoctor();
                    nombreDoctor = doctorDAO.obtenerNombreyApellidoDoctor(cita.getIdDoctor());

                    PacientesDTO pacienteDTO = pacienteDAO.obtenerPacientePorId(cita.getIdPaciente());
                    if (pacienteDTO != null) {
                        nombrePaciente = pacienteDTO.getnPaciente(); // Ajusta según tu estructura de DTO
                        direccionPaciente = pacienteDTO.getDireccion();
                        telefonoPaciente = pacienteDTO.getTelefono();
                        emailPaciente = pacienteDTO.getEmail();
                    } else {
                        System.out.println("No se encontró el paciente asociado a la cita.");
                    }

                    citaEncontrada = cita;
                    break;
                }
            }

            if (citaEncontrada == null) {
                System.out.println("Cita no encontrada.");
                return;
            }

            StringBuilder contenidoHTML = new StringBuilder();
            contenidoHTML.append("<!DOCTYPE html>");
            contenidoHTML.append("<html lang=\"es\">");
            contenidoHTML.append("<head>");
            contenidoHTML.append("<meta charset=\"UTF-8\">");
            contenidoHTML.append("<title>Factura</title>");

            //original
            contenidoHTML.append("<style>");
            contenidoHTML.append("body { font-family: Arial, sans-serif; }");
            contenidoHTML.append(".invoice-box { max-width: 800px; margin: auto; padding: 30px; border: 1px solid #eee; box-shadow: 0 0 10px rgba(0, 0, 0, 0.15); }");
            contenidoHTML.append(".invoice-box table { width: 100%; line-height: inherit; text-align: left; }");
            contenidoHTML.append(".invoice-box table td { padding: 10px; vertical-align: top; }");
            contenidoHTML.append(".invoice-box table tr td:nth-child(2) { text-align: right; }"); // Alinea las celdas de la segunda columna a la derecha
            contenidoHTML.append(".invoice-box table tr.top table td.title { font-size: 32px; line-height: 32px; color: #333; }");
            contenidoHTML.append(".invoice-box table tr.information table td { padding-bottom: 20px; }");
            contenidoHTML.append(".invoice-box table tr.heading td { background: #f2f2f2; border-bottom: 1px solid #ddd; font-weight: bold; }");
            contenidoHTML.append(".invoice-box table tr.item td { border-bottom: 1px solid #eee; }");
            contenidoHTML.append(".invoice-box table tr.item.last td { border-bottom: none; }");
            contenidoHTML.append(".invoice-box table tr.total td:nth-child(2) { border-top: 2px solid #eee; font-weight: bold; }");
            contenidoHTML.append(".invoice-box table tr.item td:nth-child(3), .invoice-box table tr.information table td:nth-child(2) { text-align: right; }"); // Alinea específicamente a la derecha las celdas necesarias
            contenidoHTML.append("</style>");

            contenidoHTML.append("</head>");
            contenidoHTML.append("<body>");
            contenidoHTML.append("<div class=\"invoice-box\">");
            contenidoHTML.append("<table>");
            contenidoHTML.append("<tr class=\"top\">");
            contenidoHTML.append("<td colspan=\"2\">");
            contenidoHTML.append("<table>");
            contenidoHTML.append("<tr>");
            contenidoHTML.append("<td class=\"title\">RESERVA DE CITA</td>");
            contenidoHTML.append("<td>Factura #: ").append(citaEncontrada.getIdCita()).append("<br>Fecha: ").append(citaEncontrada.getFechaConsulta()).append("<br>Vencimiento: ").append(citaEncontrada.getFechaConsulta().plusDays(7)).append("</td>");
            contenidoHTML.append("</tr>");
            contenidoHTML.append("</table>");
            contenidoHTML.append("</td>");
            contenidoHTML.append("</tr>");
            contenidoHTML.append("<tr class=\"information\">");
            contenidoHTML.append("<td colspan=\"2\">");
            contenidoHTML.append("<table>");
            contenidoHTML.append("<tr>");
            contenidoHTML.append("<td>Nombre del paciente: <br>").append(nombrePaciente).append("<br>").append(direccionPaciente).append("<br>Lima, Perú</td>");
            contenidoHTML.append("<td>Teléfono: ").append(telefonoPaciente).append("<br>Email: ").append(emailPaciente).append("</td>");
            contenidoHTML.append("</tr>");
            contenidoHTML.append("</table>");
            contenidoHTML.append("</td>");
            contenidoHTML.append("</tr>");
            contenidoHTML.append("<tr class=\"heading\">");
            contenidoHTML.append("<td>Código</td>");
            contenidoHTML.append("<td>Descripción</td>");
            contenidoHTML.append("<td>Doctor</td>");
            contenidoHTML.append("<td>Fecha</td>");
            contenidoHTML.append("<td>Estado</td>");
            contenidoHTML.append("</tr>");

            contenidoHTML.append("<tr class=\"item\">");
            contenidoHTML.append("<td>").append((int) citaEncontrada.getIdCita()).append("</td>");
            contenidoHTML.append("<td>").append(citaEncontrada.getMotivo()).append("</td>");
            contenidoHTML.append("<td>").append(nombreDoctor).append("</td>");
            contenidoHTML.append("<td>").append(citaEncontrada.getFechaConsulta()).append("</td>");
            contenidoHTML.append("<td>Programado</td>");
            contenidoHTML.append("</tr>");

            contenidoHTML.append("<tr class=\"total\">");
            contenidoHTML.append("<td colspan=\"4\"></td>");
            //ACA
            contenidoHTML.append("<td>Gracias por su visita </br> SubTotal de la Cita: S/ ").append(precioDeCita(obtenerEspecialidadDoctor(idDoctor))).append(" </br> IGV: S/ ").append(igv(idDoctor)).append(" </br> Precio total: S/ ").append(preciototal(idDoctor)).append("</td>");
            contenidoHTML.append("</tr>");
            contenidoHTML.append("</table>");
            contenidoHTML.append("</div>");
            contenidoHTML.append("</body>");
            contenidoHTML.append("</html>");

            try (FileWriter escritor = new FileWriter(archivo)) {
                escritor.write(contenidoHTML.toString());
                System.out.println("Reporte generado exitosamente en: " + rutaArchivo);
            } catch (IOException ex) {
                System.out.println("Error al escribir en el archivo: " + ex.getMessage());
            }

        } catch (IOException ex) {
            System.out.println("Error al crear el archivo: " + ex.getMessage());
        }
    }

    public int precioDeCita(String especialidad) {

        int precio = 0;

        switch (especialidad) {
            case "Pediatría" -> {
                return 150;
            }
            case "Oftalmología" -> {
                return 120;
            }
            case "Neurología" -> {
                return 180;
            }
            case "Cirugía General" -> {
                return 210;
            }
            case "Dermatología" -> {
                return 110;
            }
            case "Cardiología" -> {
                return 190;
            }
            case "Ginecología" -> {
                return 133;
            }
            case "Ortopedia" -> {
                return 1650;
            }
            case "Endocrinología" -> {
                return 142;
            }
            case "Urología" -> {
                return 111;
            }
            default -> {
            }
        }
        return precio;
    }
    
    
    
    public  double igv (int idDoctor){
        double igv = 0;
        int hola = precioDeCita(obtenerEspecialidadDoctor(idDoctor)); 
        igv = hola * 0.18;
        return igv;
    }
    
    public int preciototal (int idDoctor){
        double preciototal = 0;
        int hola = precioDeCita(obtenerEspecialidadDoctor(idDoctor)); 
        
        preciototal = hola + igv(idDoctor);
        
        
        return (int) Math.round(preciototal);
    }

    public String obtenerEspecialidadDoctor(int idDoctor) {
        String Especialidad = "Doctor no encontrado";
        Connection conexion = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conexion = this.conexion.establecerConexion();
            String query = "SELECT Especialidad FROM Doctores WHERE IdDoctor = ?";
            stmt = conexion.prepareStatement(query);
            stmt.setInt(1, idDoctor);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Especialidad = rs.getString("Especialidad");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtener la Especialidad del doctor: " + e.getMessage());
        }
        return Especialidad;
    }
}
