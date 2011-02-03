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
    public String leerCategoria(String id){
        GenericDAO dao = obtenerImplementacionDAO();
        return dao.readCategory(id);

    }

    public List<String> listCategories() {
        GenericDAO dao = obtenerImplementacionDAO();
        return dao.listCategories();
    }

    public void actualizarCategoria(String id, String name) {
        GenericDAO dao = obtenerImplementacionDAO();
        dao.updateCategory(id, name);

    }


}
