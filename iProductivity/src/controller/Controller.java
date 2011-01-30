// Interfaz "Controller" de MVC en JAVA.
package controller;

import java.io.Serializable;
import java.util.List;
import model.Model;
import view.View;


public interface Controller<M extends Model, V extends View, D extends Serializable> {

    void setup(M model, List<V> view);
    void start();

    void addView(V view);
    void removeView(V view);

    M getModel();
    void setModel(M model);

    void nuevaEntidadGesture(List<D> datos);
    void borraEntidadGesture(D pk);
    void actualizaEntidadGesture(List<D> datos);

    void fireDataModelChanged();

}
