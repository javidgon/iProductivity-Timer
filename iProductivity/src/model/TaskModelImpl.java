/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.TaskController;
import java.util.List;
import model.entity.Entidad;
import model.entity.Task;
import model.persistence.GenericDAO;
import model.persistence.JDBC.TaskDAOJDBC;

/**
 *
 * @author javidgon
 */
public class TaskModelImpl extends AbstractModelImp<TaskController,Task,String> implements TaskModel{

    @Override
    GenericDAO obtenerImplementacionDAO() {
        return new TaskDAOJDBC();
    }

public void listar() {
        /*GenericDAO dao=obtenerImplementacionDAO();
        return dao.list();
*/
    }



}
