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

import controller.TaskController;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import model.TaskModel;
import model.entity.Task;
import view.AbstractViewImp;

/**
 *
 * @author javidgon
 */
public class TaskViewImpl extends AbstractViewImp<TaskController, TaskModel> implements TaskView {

    private TaskTableAndComboModel tableModelProximo;
    private TaskViewImplInternal paneltask;
    private float precio = 0;
    private float perdido = 0;
    Timer timer = null;

    /** Creates new form TaskViewImpl */
    public TaskViewImpl() {
        tableModelProximo = new TaskTableAndComboModel();
        this.paneltask = new TaskViewImplInternal(this);
        initComponents();
        this.jPanelCliente.add(this.paneltask);

    }

    // Inicialización y refresco.

    public void init() {

        initComponents();

    }
    
    public void refresh() {
        jTableTasks.clearSelection();
        this.paneltask.refresh();
        tableModelProximo.setTasks(getModel().listar());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCliente = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        jLabelID = new javax.swing.JLabel();
        jLabelCongratulations = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelCounter = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabelTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelMoney = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabelEarnings = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabelMinutes = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1070, 600));

        jPanelCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCliente.setLayout(new javax.swing.BoxLayout(jPanelCliente, javax.swing.BoxLayout.LINE_AXIS));

        jTableTasks.setModel(tableModelProximo);
        jTableTasks.setSize(new java.awt.Dimension(450, 50));
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksTaskMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTableTasks);

        jLabelCongratulations.setFont(new java.awt.Font("Lucida Grande", 0, 12));
        jLabelCongratulations.setForeground(new java.awt.Color(255, 0, 0));
        jLabelCongratulations.setText("  ");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14));
        jLabel10.setText("Time:");

        jLabelCounter.setForeground(new java.awt.Color(204, 0, 0));
        jLabelCounter.setText("0");

        jLabel11.setText("seconds");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18));
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("Crear una nueva tarea:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24));
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("iProductivity");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 13));
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Tu camino hacia la productividad");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelTime.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabelTime.setForeground(new java.awt.Color(0, 0, 153));
        jLabelTime.setText("   ");

        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("segundos restantes");

        jButton2.setText("Stop");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Task Accomplished");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabelMoney.setForeground(new java.awt.Color(153, 0, 0));
        jLabelMoney.setText("0");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("You've lost ");

        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setText("euros");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel14.setForeground(new java.awt.Color(0, 153, 0));
        jLabel14.setText("You've won ");

        jLabelEarnings.setForeground(new java.awt.Color(0, 51, 255));
        jLabelEarnings.setText("0");

        jLabel16.setForeground(new java.awt.Color(0, 153, 0));
        jLabel16.setText("euros");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel15.setForeground(new java.awt.Color(0, 153, 0));
        jLabel15.setText("Price per hour:");

        jLabel17.setForeground(new java.awt.Color(0, 153, 0));
        jLabel17.setText("euros");

        jLabelMinutes.setText("  ");

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                        .add(26, 26, 26)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jButton2)
                                    .add(jButton1))
                                .add(18, 18, 18)
                                .add(jLabelTime)
                                .add(18, 18, 18)
                                .add(jLabel1))
                            .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabelMinutes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jButton3))))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel1Layout.createSequentialGroup()
                        .add(34, 34, 34)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel14)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabelEarnings, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel16))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel12)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(jLabelMoney, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel13))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jLabel15)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 102, Short.MAX_VALUE)
                                .add(jLabel17)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jLabelTime)
                    .add(jLabel1))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton3)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel15)
                        .add(jLabelMinutes))
                    .add(jLabel17))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(jLabel12)
                    .add(jLabelMoney, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel14)
                    .add(jLabelEarnings)
                    .add(jLabel16))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabelID)
                    .add(layout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(jLabel2)
                        .add(18, 18, 18)
                        .add(jLabel7)
                        .add(86, 86, 86)
                        .add(jLabelCongratulations, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 299, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                            .add(jPanelCliente, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(57, 57, 57)
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabelCounter, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel11))))
                    .add(layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(jLabel6)))
                .add(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jLabelID)
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(layout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(jLabel7))
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jLabelCongratulations)))
                .add(6, 6, 6)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanelCliente, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel10)
                        .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabelCounter)))
                .add(140, 140, 140))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableTasksTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksTaskMouseClicked

        TaskTableAndComboModel ctm = (TaskTableAndComboModel) this.jTableTasks.getModel();
        Task task = ctm.getRow(this.jTableTasks.getSelectedRow());
        paneltask.setTask(task);

    }//GEN-LAST:event_jTableTasksTaskMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if (!jLabelCounter.getText().equals("0") && !paneltask.getjTextFieldDescription().equals("") && !paneltask.getjComboBox2().getSelectedItem().equals("")) {
            this.contadorNegativo(Integer.parseInt((String) paneltask.getjComboBox2().getSelectedItem()) * 60);
        } else {

            jLabelCongratulations.setText("Se ha producido un error. Tiempo? Espacio sin rellenar?.");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        timer.cancel();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        perdido = Float.parseFloat(this.jLabelMoney.getText());
        timer.cancel();
        this.jLabelCongratulations.setText("Enhorabuena!");
        this.fireRealizarTaskGesture(paneltask.getjTextFieldDescription().getText());
        Float before = Float.parseFloat(this.jLabelEarnings.getText());
        String nuevo = (String) paneltask.getjComboBox2().getSelectedItem();
        Float entero = Float.parseFloat(nuevo);
        this.jLabelEarnings.setText(String.valueOf(before + (entero) * (Float.parseFloat(this.jLabelMinutes.getText())) / 60));
    }//GEN-LAST:event_jButton3ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelCongratulations;
    private javax.swing.JLabel jLabelCounter;
    private javax.swing.JLabel jLabelEarnings;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMinutes;
    private javax.swing.JLabel jLabelMoney;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTableTasks;
    // End of variables declaration//GEN-END:variables



    // Métodos fundamentales.
    protected void fireNuevoTaskGesture(String description, String type, String value) {
        List<String> datos = new ArrayList<String>();
        datos.add(description);
        datos.add(type);
        datos.add(value);
        getController().nuevaEntidadGesture(datos);

    }

    protected void fireActualizaTaskGesture(String description, String type, String value) {
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

    // Métodos contadores.
    public void contadorNegativo(final int valor) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            int i = valor;

            public void run() {
                jLabelTime.setText(String.valueOf(i--));
                if (i < 0) {
                    timer.cancel();
                    ticks(precio / 3600);
                }
                if (i < 30) {
                    jLabelTime.setForeground(Color.red);
                } else {
                    jLabelTime.setForeground(Color.blue);
                }
            }
        }, 0, 1000);
    }

    public void contador(final int valor) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            int i = valor;

            public void run() {
                jLabelCounter.setText(String.valueOf(i++));
            }
        }, 0, 1000);
    }

    public void ticks(final float money) {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {

            int i = 0;

            public void run() {
                jLabelMoney.setText(String.valueOf(perdido + ((i++) * money)));
                /*if (i > valor)
                timer.cancel();*/
            }
        }, 0, 1000);
    }

    // Métodos GET.

    public TaskViewImplInternal getPaneltask() {
        return paneltask;
    }

    public JLabel getjLabelMinutes() {
        return this.jLabelMinutes;
    }

    public JLabel getjLabelCongratulations() {
        return jLabelCongratulations;
    }

    public JLabel getjLabelCounter() {
        return jLabelCounter;
    }


    // Métodos SET.


    public void setValor(float precio) {
        this.precio = precio;
    }
}
