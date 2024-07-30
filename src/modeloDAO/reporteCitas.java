
package modeloDAO;
import java.io.File;
import java.io.IOException;

public class reporteCitas {

    public void generarreporte() {
        File archivo;
        try {
            // Especifica la ruta completa del archivo
            String rutaArchivo = "C:\\Users\\NEISON\\OneDrive - Universidad Tecnologica del Peru\\reporte_citas.html";
            
            archivo = new File(rutaArchivo);
            
            // Intenta crear el archivo si no existe
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            // Imprime el mensaje de error en caso de excepción
            System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        reporteCitas reporte = new reporteCitas();
        reporte.generarreporte();
    }
}
