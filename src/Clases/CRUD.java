package Clases;

import java.util.ArrayList;
import java.util.HashMap;

public interface CRUD {

    void crear();
    ArrayList<Object[]> leer();
    void actualizar(HashMap<String, Object> nuevosValores);
    void eliminar(int id);
}
