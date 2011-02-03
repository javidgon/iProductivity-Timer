// Interfaz "Model" de MVC en JAVA.
package model;

import controller.Controller;
import java.io.Serializable;
import java.util.List;
import model.entity.Entidad;

public interface Model<C extends Controller, T extends Entidad, K extends Serializable> {

    C getController();
    void setController(C controller);

    void nuevaEntidad(T entidad);
    T obtenerEntidad(K pk);
    void eliminarEntidad(T entidad);
    void actualizarEntidad(T entidad);
    void realizarEntidad(T entidad);
    K leerCategoria(K id);
    List<T> listar(K type);
    List<T> listDone(K valor);
    List<K> listCategories();
    void actualizarCategoria(K id, K name);

}
