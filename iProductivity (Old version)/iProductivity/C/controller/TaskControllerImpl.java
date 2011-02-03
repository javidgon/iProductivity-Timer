/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import model.TaskModel;
import model.entity.Entidad;
import model.entity.Task;
import model.entity.TaskImpl;
import view.task.TaskView;

/**
 *
 * @author javidgon
 */
public class TaskControllerImpl extends AbstractControllerImp<TaskModel, TaskView, String> implements TaskController {

    @Override
    Entidad generaEntidad(List<String> datos) {
        String description=datos.get(0);
        String type=datos.get(1);
        String value = datos.get(2);
        Task c=new TaskImpl(description,type, value);
        return c;
    }


    @Override
    Entidad generaEntidad(String pk) {
        Task c=new TaskImpl(pk);
        return c;
    }





}
