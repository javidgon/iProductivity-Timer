/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.task;

import controller.TaskController;
import model.TaskModel;
import view.*;
/**
 *
 * @author javidgon
 */
public interface TaskView extends View<TaskController, TaskModel>{

    public void contador(final int valor);

    public TaskViewImplInternal getPaneltask();

}
