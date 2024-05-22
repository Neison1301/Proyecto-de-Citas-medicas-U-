package Clases;

import java.util.ArrayList;
import java.util.HashMap;

public interface CRUD {

    void crear(String archivo);
    ArrayList<Object[]> leer(String archivo);
    void actualizar(HashMap<String, Object> nuevosValores, String archivo);
    void eliminar(int id, String archivo);
}
