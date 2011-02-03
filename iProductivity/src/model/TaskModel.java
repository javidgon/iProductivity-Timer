/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.TaskController;
import java.util.List;
import model.entity.Task;

/**
 *
 * @author javidgon
 */
public interface TaskModel extends Model<TaskController,Task,String>{

        // Interfaz específica de la entidad TASK.

      List<Task> listDone();
      List<String> listCategories();
      String leerCategoria(String id);
      void realizarEntidad(Task entidad);
      void actualizarCategoria(String id, String name);
}
