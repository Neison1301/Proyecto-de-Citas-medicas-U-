package Clases;

import java.util.ArrayList;
import java.util.HashMap;

public interface CRUD<T> {

    void crear(T entidad);

    ArrayList<T> leer();

    void actualizar(int id, HashMap<String, Object> nuevosValores);

    void eliminar(int id);
}
