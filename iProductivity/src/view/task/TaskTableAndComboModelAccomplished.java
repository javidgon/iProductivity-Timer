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
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import model.Model;
import model.TaskModelImpl;
import model.entity.Task;

/**
 *
 * @author javidgon
 */
public class TaskTableAndComboModelAccomplished implements TableModel, ComboBoxModel {


    private List<Task> Tasks = new ArrayList<Task>();
    private List<TableModelListener> tableListeners = new ArrayList<TableModelListener>();
    private List<ListDataListener> dataListeners = new ArrayList<ListDataListener>();

    //Implementacion Singleton
    private static TaskTableAndComboModel model=null;

        public TaskTableAndComboModelAccomplished(String i){
        Model modelo = new TaskModelImpl();
        this.setTasks(modelo.listDone(i));
    }

       

    public List<Task> getTasks() {
        return Tasks;
    }

    public static TaskTableAndComboModel getModel() {
        return model;
    }

    public void setTasks(List<Task> Tasks) {
        this.Tasks = Tasks;
        fireContentsChanged();
    }

    protected void fireContentsChanged() {
        fireContentsChangedTableModel();
        fireContentsChangedListData();
    }
    //--------------- MÉTODOS PROPIOS DE TableModel -------------------------

    public Task getRow(int indexRow) {
        return Tasks.get(indexRow);
    }

    public int getRowCount() {
        return Tasks.size();
    }

    public int getColumnCount() {
        return 2; //ya que tendremos tres valores a mostrar por contacto
    }

    public String getColumnName(int columnIndex) {
        String name = null;
        switch (columnIndex) {
            case 0:
                name = "Description";
                break;
            case 1:
                name = "Creation_date";
                break;
        }
        return name;
    }

    public Class<?> getColumnClass(int columnIndex) {
        return String.class; //Todos los valores de contacto son un String
    }

    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false; //No permito editar celdas
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Task contacto = Tasks.get(rowIndex);
        String value = null;
        switch (columnIndex) {
            case 0:
                value = contacto.getDescription();
                break;
            case 1:
                value = contacto.getCreation_date();
                break;
        }
        return value;

    }

    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void addTableModelListener(TableModelListener l) {
        tableListeners.add(l);
    }

    public void removeTableModelListener(TableModelListener l) {
        tableListeners.remove(l);
    }

    public void fireContentsChangedTableModel() {
        //TableModelEvent event = new TableModelEvent(this,0,getRowCount());
        TableModelEvent event = new TableModelEvent(this, 0, this.getRowCount() - 1, TableModelEvent.ALL_COLUMNS, TableModelEvent.INSERT);
        for (TableModelListener listener : tableListeners) {
            listener.tableChanged(event);
        }
    }
    //--------------- MÉTODOS PROPIOS DE ComboBoxModel -------------------------
    private Task TaskSelected = null;

    public void setSelectedItem(Object anItem) {
        if (anItem != null) {
            TaskSelected = (Task) anItem;
            fireContentsChangedListData();
        }
    }

    public Object getSelectedItem() {
        return TaskSelected;
    }

    public int getSize() {
        return Tasks.size();
    }

    public Object getElementAt(int index) {
        return Tasks.get(index);
    }

    public void addListDataListener(ListDataListener l) {
        dataListeners.add(l);
    }

    public void removeListDataListener(ListDataListener l) {
        dataListeners.remove(l);
    }

    public void fireContentsChangedListData() {
        ListDataEvent e = new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, Tasks.size());
        for (ListDataListener l : dataListeners) {
            l.contentsChanged(e);
        }
    }
}
