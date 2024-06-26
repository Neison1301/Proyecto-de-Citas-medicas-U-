package miInterfaces;

import java.util.ArrayList;

public interface CRUD<T> {

    void crear(T entidad);

    ArrayList<T> leer();

    void actualizar(int id);

    void eliminar(int id);
}
