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
    public void setjLabel1(JLabel jLabel1);

    public void setjLabel2(JLabel jLabel2);

    public void setjLabel3(JLabel jLabel3);

    public void setjLabel4(JLabel jLabel4);

    public JLabel getjLabel1();

    public JLabel getjLabel2();

    public JLabel getjLabel3();

    public JLabel getjLabel4();

    public void init();
}
