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
import model.persistence.TaskDAO;

/**
 *
 * @author javidgon
 */
public class TaskModelImpl extends AbstractModelImp<TaskController, Task, String> implements TaskModel {

    @Override
    TaskDAO obtenerImplementacionDAO() {
        return new TaskDAOJDBC();
    }

    public String leerCategoria(String id) {
        TaskDAO dao = obtenerImplementacionDAO();
        return dao.readCategory(id);

    }

    public List<String> listCategories() {
        TaskDAO dao = obtenerImplementacionDAO();
        return dao.listCategories();
    }

    public void actualizarCategoria(String id, String name) {
        TaskDAO dao = obtenerImplementacionDAO();
        dao.updateCategory(id, name);

    }


    public List<Task> listar() {
        TaskDAO dao = obtenerImplementacionDAO();
        return dao.list();

    }

    public List<Task> listDone() {
        TaskDAO dao = obtenerImplementacionDAO();
        return dao.listDone();


    }

    public void realizarEntidad(Task entidad) {
        TaskDAO dao = obtenerImplementacionDAO();
        dao.done(entidad);
        getController().fireDataModelChanged();
    }
}
