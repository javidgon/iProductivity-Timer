// Interfaz "GENERIC DAO" de la persistencia de MVC en JAVA.
package model.persistence;

import java.io.Serializable;
import java.util.List;
import model.entity.Entidad;


public interface GenericDAO<T extends Entidad, K extends Serializable> {

    // Interfaz genérica DAO. Aquí vamos a encontrar los métodos compartidos.

    void create(T entidad);
    T read(K pk);
    void update(T entidad);
    void delete(T entidad);
    List<T> list();

}
