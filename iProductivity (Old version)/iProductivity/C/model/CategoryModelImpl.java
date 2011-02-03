/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import controller.CategoryController;
import model.entity.Category;
import model.persistence.GenericDAO;
import model.persistence.JDBC.CategoryDAOJDBC;

/**
 *
 * @author javidgon
 */
public class CategoryModelImpl extends AbstractModelImp<CategoryController,Category,String> implements CategoryModel{

    @Override
    GenericDAO obtenerImplementacionDAO() {
        return new CategoryDAOJDBC();
    }

}
