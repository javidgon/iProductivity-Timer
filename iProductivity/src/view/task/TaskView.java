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
public interface TaskView extends View<TaskController, TaskModel> {

    // Interfaz específica de la entidad TASK.

    public void contador(final int valor);

    public void ticks(final float money);

    public void fireBorraTaskGesture(String description);

    public TaskViewImplInternal getPaneltask();

    public JLabel getjLabelMinutes();

    public JLabel getjLabelCongratulations();

    public JLabel getjLabelCounter();

    public void refresh();

    public void setValor(float valor);
}
