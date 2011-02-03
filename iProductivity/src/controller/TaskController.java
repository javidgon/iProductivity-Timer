/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.TaskModel;
import view.task.TaskView;

/**
 *
 * @author javidgon
 */
public interface TaskController extends Controller<TaskModel, TaskView, String> {

    // Interfaz concreta del controlador TASK.

    String leerCategoria(String id);
    void actualizarCategoria(String id, String name);
    void realizarEntidadGesture(String pk);
}
