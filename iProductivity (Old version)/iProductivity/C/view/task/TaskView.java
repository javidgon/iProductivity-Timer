/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.task;

import controller.TaskController;
import javax.swing.JLabel;
import model.TaskModel;
import view.*;
/**
 *
 * @author javidgon
 */
public interface TaskView extends View<TaskController, TaskModel>{

    public void contador(final int valor);

    public void ticks(final float money);

    public TaskViewImplInternal getPaneltask();

    public TaskTableAndComboModel getTableModelProyecto() ;
    public JLabel getjLabelMinutes();
}
