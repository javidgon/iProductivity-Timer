/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package view.task;

import java.util.ArrayList;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import model.TaskModel;
import model.TaskModelImpl;

/**
 *
 * @author javidgon
 */
public class CategoryComboModel implements ComboBoxModel {


    private List<String> categories = new ArrayList<String>();
    private List<ListDataListener> dataListeners = new ArrayList<ListDataListener>();

    //Implementacion Singleton
    private static TaskTableAndComboModel model=null;

    public CategoryComboModel(){
        TaskModel modelo = new TaskModelImpl();
        this.setTasks(modelo.listCategories());
    }


    public List<String> getTasks() {
        return categories;
    }

    public void setTasks(List<String> categories) {
        this.categories = categories;
        fireContentsChanged();
    }

    protected void fireContentsChanged() {
        fireContentsChangedListData();
    }

    //--------------- MÉTODOS PROPIOS DE ComboBoxModel -------------------------
    private String CategorySelected = null;

    public void setSelectedItem(Object anItem) {
        if (anItem != null) {
            CategorySelected = (String) anItem;
            fireContentsChangedListData();
        }
    }

    public Object getSelectedItem() {
        return CategorySelected;
    }

    public int getSize() {
        return categories.size();
    }

    public Object getElementAt(int index) {
        return categories.get(index);
    }

    public void addListDataListener(ListDataListener l) {
        dataListeners.add(l);
    }

    public void removeListDataListener(ListDataListener l) {
        dataListeners.remove(l);
    }

    protected void fireContentsChangedListData() {
        ListDataEvent e = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, categories.size());
        for (ListDataListener l : dataListeners) {
            l.contentsChanged(e);
        }
    }
}
