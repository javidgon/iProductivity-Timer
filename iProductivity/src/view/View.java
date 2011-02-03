/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import controller.Controller;
import model.Model;


/**
 *
 * @author Norberto Díaz-Díaz
 */
public interface View <C extends Controller, M extends Model>{

    // Interfaz genérica de la vista.

    C getController();
    void setController(C controller);
    M getModel();
    void setModel(M model);

    void dataModelChanged();
    void display();

}
