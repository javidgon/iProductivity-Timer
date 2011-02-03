// Clase abstracta "Model" de MVC en JAVA.
package model;

import controller.Controller;
import java.io.Serializable;
import java.util.List;
import model.entity.Entidad;
import model.persistence.GenericDAO;

public abstract class AbstractModelImp<C extends Controller, T extends Entidad, K extends Serializable> implements Model<C,T,K> {

    // Implementación abstracta del modelo.

    private C controller;

    public C getController() {
        return controller;
    }

    public void setController(C controller) {
        this.controller=controller;
    }

    public void nuevaEntidad(T entidad) {
        GenericDAO dao=obtenerImplementacionDAO();
        dao.create(entidad);
        controller.fireDataModelChanged();
    }

    public T obtenerEntidad(K pk) {
        GenericDAO dao=obtenerImplementacionDAO();
        return (T) dao.read(pk);
        //return null;
    }

    public void eliminarEntidad(T entidad) {
        GenericDAO dao=obtenerImplementacionDAO();
        dao.delete(entidad);
        controller.fireDataModelChanged();
    }

    public void actualizarEntidad(T entidad) {
        GenericDAO dao=obtenerImplementacionDAO();
        dao.update(entidad);
        controller.fireDataModelChanged();
    }




    abstract GenericDAO obtenerImplementacionDAO();

}
