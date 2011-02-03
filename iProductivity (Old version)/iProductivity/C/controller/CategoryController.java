/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.CategoryModel;
import model.entity.Entidad;
import view.task.TaskView;

/**
 *
 * @author javidgon
 */
public interface CategoryController extends Controller<CategoryModel, TaskView, String>{

    public Entidad read(String pk);
}
