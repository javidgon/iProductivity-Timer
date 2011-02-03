/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.util.List;
import model.CategoryModel;
import model.entity.Category;
import model.entity.CategoryImpl;
import model.entity.Entidad;
import view.task.TaskView;

/**
 *
 * @author javidgon
 */
public class CategoryControllerImpl extends AbstractControllerImp<CategoryModel, TaskView, String> implements CategoryController {

    @Override
    Entidad generaEntidad(List<String> datos) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    Entidad generaEntidad(String pk) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    


}
