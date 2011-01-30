// Interfaz "GENERIC DAO" de la persistencia de MVC en JAVA.
package model.persistence;

import java.io.Serializable;
import java.util.List;
import model.entity.Entidad;


public interface GenericDAO<T extends Entidad, K extends Serializable> {

    void create(T entidad);
    T read(K pk);
    void update(T entidad);
    void delete(T entidad);
    void done(T entidad);
    List<T> list(K Serializable);
    List<T> listDone(K Serializable);

}
