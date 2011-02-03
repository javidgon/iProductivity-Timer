// Clase abstracta del controlador de MVC en JAVA.
package controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import model.Model;
import model.entity.Entidad;
import view.View;

public abstract class AbstractControllerImp<M extends Model, V extends View, D extends Serializable> implements Controller<M, V, D> {

    private List<V> views=new ArrayList<V>();
    private M model;

    public void setup(M model, List<V> views) {
        setModel(model);
        addViews(views);
        model.setController(this);
    }

    private void addViews(List<V> views){
        for(V view:views)
            addView(view);
    }
    public void start() {
         for(V view:views)
            view.display();
    }

    public void addView(V view) {
        view.setModel(model);
        view.setController(this);
        views.add(view);
    }

    public void removeView(V view) {
        views.remove(view);
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model=model;
    }

    public void nuevaEntidadGesture(List<D> datos) {
        Entidad entidad=generaEntidad(datos);
        getModel().nuevaEntidad(entidad);
    }

    public void borraEntidadGesture(D pk) {
        Entidad entidad=generaEntidad(pk);
        getModel().eliminarEntidad(entidad);
    }

    public void actualizaEntidadGesture(List<D> datos) {
        Entidad entidad=generaEntidad(datos);
        getModel().actualizarEntidad(entidad);
    }


    public void realizarEntidadGesture(D pk) {
        Entidad entidad=generaEntidad(pk);
        getModel().realizarEntidad(entidad);
    }

    

    public void fireDataModelChanged() {
        for(V view:views)
            view.dataModelChanged();
    }
    abstract Entidad generaEntidad(List<D> datos);
    abstract Entidad generaEntidad(D pk);
}
