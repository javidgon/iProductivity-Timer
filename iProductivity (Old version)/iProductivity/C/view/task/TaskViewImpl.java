/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TaskViewImpl.java
 *
 * Created on 22-ene-2011, 11:59:09
 */

package view.task;

import controller.CategoryController;
import controller.CategoryControllerImpl;
import controller.TaskController;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import model.TaskModel;
import model.entity.Category;
import model.entity.CategoryImpl;
import model.entity.Task;
import view.AbstractViewImp;



/**
 *
 * @author javidgon
 */
public class TaskViewImpl extends AbstractViewImp<TaskController, TaskModel> implements TaskView  {
    private TaskTableAndComboModel tableModelProximo;
        private TaskTableAndComboModel tableModelAlgunDia;
            private TaskTableAndComboModel tableModelProyecto;
                private TaskTableAndComboModel tableModelEnEspera;
                private CategoryController cc;
                private Category c1 = null;
                private Category c2 = null;
                private Category c3 = null;
                private Category c4 = null;

    private TaskViewImplInternal paneltask;
    /** Creates new form TaskViewImpl */

    public TaskViewImpl() {
        tableModelProximo = new TaskTableAndComboModel("Próximo");
        tableModelAlgunDia = new TaskTableAndComboModel("Algún día");
        tableModelProyecto = new TaskTableAndComboModel("Proyecto");
        tableModelEnEspera = new TaskTableAndComboModel("En espera");
        this.paneltask = new TaskViewImplInternal(this);
        cc = new CategoryControllerImpl();
        initComponents();
        this.checkCategories();
        this.jPanelCliente.add(this.paneltask);


    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */

    public void checkCategories(){
/*
    c1 = (Category) cc.read("1");
    c2 = (Category) cc.read("2");
    c3 = (Category) cc.read("3");
    c4 = (Category) cc.read("4");

   this.jLabel1.setText(c1.getName());
      this.jLabel2.setText(c2.getName());
         this.jLabel3.setText(c3.getName());
            this.jLabel4.setText(c4.getName());
*/
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jTableEnEspera = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProyecto = new javax.swing.JTable();
        jPanelCliente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableAlgunDia1 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableProximo1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelCreation = new javax.swing.JLabel();
        jLabelType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelCongratulations = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelCounter = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabelMoney = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelEarnings = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelMinutes = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1070, 600));

        jTableEnEspera.setModel(tableModelEnEspera);
        jTableEnEspera.setSize(new java.awt.Dimension(450, 50));
        jTableEnEspera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEnEsperaTaskMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTableEnEspera);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Próximo");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("Proyecto");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel3.setForeground(new java.awt.Color(0, 102, 0));
        jLabel3.setText("En espera");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Algún día");

        jTableProyecto.setModel(tableModelProyecto);
        jTableProyecto.setSize(new java.awt.Dimension(450, 50));
        jTableProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProyectoTaskMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableProyecto);

        jPanelCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCliente.setLayout(new javax.swing.BoxLayout(jPanelCliente, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Más información:");

        jTableAlgunDia1.setModel(tableModelAlgunDia);
        jTableAlgunDia1.setSize(new java.awt.Dimension(450, 50));
        jTableAlgunDia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAlgunDia1TaskMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTableAlgunDia1);

        jTableProximo1.setModel(tableModelProximo);
        jTableProximo1.setSize(new java.awt.Dimension(450, 50));
        jTableProximo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProximo1TaskMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableProximo1);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Crear una nueva tarea:");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setText("Type:");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel8.setText("Description:");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel9.setText("Fecha de creación:");

        jLabelCreation.setText("  ");

        jLabelType.setText("  ");

        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setLineWrap(true);
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaDescription);

        jLabelCongratulations.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jLabelCongratulations.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCongratulations.setText("  ");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel10.setText("Elapsed time:");

        jLabelCounter.setForeground(new java.awt.Color(204, 0, 0));
        jLabelCounter.setText("0");

        jLabel11.setText("seconds");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("You're losing money...");

        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("euros");

        jLabelMoney.setForeground(new java.awt.Color(153, 0, 0));
        jLabelMoney.setText("  ");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("You've won ");

        jLabelEarnings.setForeground(new java.awt.Color(0, 51, 255));
        jLabelEarnings.setText("0");

        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setText("euros!");

        jLabel15.setText("Price:");

        jLabelMinutes.setText("  ");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(40, 40, 40)
                                .add(jScrollPane6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(20, 20, 20)
                                .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 340, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabelCounter)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(40, 40, 40)
                                        .add(jLabel1))
                                    .add(layout.createSequentialGroup()
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel11)))
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(90, 90, 90)
                                        .add(jLabelCongratulations, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel2)
                                        .add(157, 157, 157)))))
                        .add(40, 40, 40)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel15)
                                .add(18, 18, 18)
                                .add(jLabelMinutes))
                            .add(jLabel6)
                            .add(jPanelCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(170, 170, 170)
                                .add(jLabel4)
                                .add(258, 258, 258)
                                .add(jLabel3))
                            .add(layout.createSequentialGroup()
                                .add(40, 40, 40)
                                .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 330, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(20, 20, 20)
                                .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 340, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(40, 40, 40)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(layout.createSequentialGroup()
                                .add(10, 10, 10)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel12)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabelMoney, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 85, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel13))
                                    .add(layout.createSequentialGroup()
                                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(layout.createSequentialGroup()
                                                .add(30, 30, 30)
                                                .add(jLabelID))
                                            .add(jLabel7))
                                        .add(13, 13, 13)
                                        .add(jLabelType))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel8)
                                        .add(20, 20, 20)
                                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel9)
                                        .add(26, 26, 26)
                                        .add(jLabelCreation, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 170, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel14)
                                        .add(18, 18, 18)
                                        .add(jLabelEarnings)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel16)))))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(10, 10, 10)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                .add(jLabel10)
                                .add(jLabelCounter)
                                .add(jLabel11)
                                .add(jLabelCongratulations))
                            .add(layout.createSequentialGroup()
                                .add(30, 30, 30)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel1)
                                    .add(jLabel2))))
                        .add(8, 8, 8))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel15)
                            .add(jLabelMinutes))
                        .add(18, 18, 18)
                        .add(jLabel6)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPanelCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jLabel3)
                    .add(jLabel5))
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 210, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabelID)
                            .add(jLabel7)
                            .add(jLabelType))
                        .add(14, 14, 14)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel8)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(26, 26, 26)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel9)
                            .add(jLabelCreation))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabelMoney)
                            .add(jLabel12)
                            .add(jLabel13))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel14)
                            .add(jLabelEarnings)
                            .add(jLabel16))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableProyectoTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProyectoTaskMouseClicked

            TaskTableAndComboModel ctm = (TaskTableAndComboModel) this.jTableProyecto.getModel();
            Task task = ctm.getRow(this.jTableProyecto.getSelectedRow());
            paneltask.setTask(task);
            jLabelCreation.setText(task.getCreation_date());
            jTextAreaDescription.setText(task.getDescription());
            jLabelType.setText(task.getType());
            
    }//GEN-LAST:event_jTableProyectoTaskMouseClicked

    private void jTableEnEsperaTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEnEsperaTaskMouseClicked

        TaskTableAndComboModel ctm = (TaskTableAndComboModel) this.jTableEnEspera.getModel();
        Task task = ctm.getRow(this.jTableEnEspera.getSelectedRow());
        paneltask.setTask(task);
        jLabelCreation.setText(task.getCreation_date());
        jTextAreaDescription.setText(task.getDescription());
        jLabelType.setText(task.getType());

    }//GEN-LAST:event_jTableEnEsperaTaskMouseClicked

    private void jTableAlgunDia1TaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAlgunDia1TaskMouseClicked

        TaskTableAndComboModel ctm = (TaskTableAndComboModel) this.jTableAlgunDia1.getModel();
        Task task = ctm.getRow(this.jTableAlgunDia1.getSelectedRow());
        paneltask.setTask(task);
        jLabelCreation.setText(task.getCreation_date());
        jTextAreaDescription.setText(task.getDescription());
        jLabelType.setText(task.getType());

    }//GEN-LAST:event_jTableAlgunDia1TaskMouseClicked

    private void jTableProximo1TaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProximo1TaskMouseClicked

        TaskTableAndComboModel ctm = (TaskTableAndComboModel) this.jTableProximo1.getModel();
        Task task = ctm.getRow(this.jTableProximo1.getSelectedRow());
        paneltask.setTask(task);
        jLabelCreation.setText(task.getCreation_date());
        jTextAreaDescription.setText(task.getDescription());
        jLabelType.setText(task.getType());

    }//GEN-LAST:event_jTableProximo1TaskMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCongratulations;
    private javax.swing.JLabel jLabelCounter;
    private javax.swing.JLabel jLabelCreation;
    private javax.swing.JLabel jLabelEarnings;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMinutes;
    private javax.swing.JLabel jLabelMoney;
    private javax.swing.JLabel jLabelType;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableAlgunDia1;
    private javax.swing.JTable jTableEnEspera;
    private javax.swing.JTable jTableProximo1;
    private javax.swing.JTable jTableProyecto;
    private javax.swing.JTextArea jTextAreaDescription;
    // End of variables declaration//GEN-END:variables

public JLabel getLabelCongratulations(){

    return jLabelCongratulations;
}

    public TaskTableAndComboModel getTableModelProyecto() {
        return tableModelProyecto;
    }

public JLabel getLabelCounter(){

    return jLabelCounter;
}


    public void refresh() {
       tableModelProximo.setTasks(getModel().listar("Próximo"));//cambia el modelo de JTable(TableModel) por medio de una clase que hemos creado (ContactosTableModel)
         tableModelProyecto.setTasks(getModel().listar("Proyecto"));
           tableModelAlgunDia.setTasks(getModel().listar("Algún día"));
             tableModelEnEspera.setTasks(getModel().listar("En espera"));
             jTableProximo1.clearSelection();
             jTableAlgunDia1.clearSelection();
             jTableEnEspera.clearSelection();
             jTableProyecto.clearSelection();
    }

    protected void fireNuevoTaskGesture(String description, String type,String value){
        List<String> datos = new ArrayList<String>();
        datos.add(description);
        datos.add(type);
        datos.add(value);
        getController().nuevaEntidadGesture(datos);



    }

    public void contador(final int valor){

        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = valor;

            public void run() {
                jLabelCounter.setText(String.valueOf(i--));
                if (i< 0)
                    timer.cancel();
            }

        }, 0, 1000);
    }

       public void ticks(final float money){

        final Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 0;

            public void run() {
                jLabelMoney.setText(String.valueOf((i++)*money));
                /*if (i > valor)
                    timer.cancel();*/
            }

        }, 0, 1000);
    }


    protected void fireActualizaTaskGesture(String description, String type,String value) {
        List<String> datos = new ArrayList<String>();
        datos.add(description);
        datos.add(type);
        datos.add(value);
        getController().actualizaEntidadGesture(datos);

    }

    public void fireBorraTaskGesture(String description) {
        getController().borraEntidadGesture(description);

    }
 protected void fireRealizarTaskGesture(String description) {

     getController().realizarEntidadGesture(description);

    }

    public JLabel getjLabelEarnings() {
        return jLabelEarnings;
    }

    public void setjLabelEarnings(JLabel jLabelEarnings) {
        this.jLabelEarnings = jLabelEarnings;
    }


    public TaskViewImplInternal getPaneltask() {
        return paneltask;
    }

    public JLabel getjLabelMinutes() {
        return jLabelMinutes;
    }

    public void setjLabelMinutes(JLabel jLabelMinutes) {
        this.jLabelMinutes = jLabelMinutes;
    }




}