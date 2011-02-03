/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model.persistence;

import java.util.List;
import model.entity.Task;

/**
 *
 * @author javidgon
 */
public interface TaskDAO extends GenericDAO<Task, String> {

    // Interfaz específica de la entidad TASK.

    List<Task> listDone();
    String readCategory(String id);
    List<String> listCategories();
    void updateCategory(String id, String name);
    void done(Task entidad);
}
