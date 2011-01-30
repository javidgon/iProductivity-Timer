/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * TaskViewImplInternal.java
 *
 * Created on 22-ene-2011, 15:43:57
 */

package view.task;

import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import model.entity.Task;

/**
 *
 * @author javidgon
 */
public class TaskViewImplInternal extends javax.swing.JPanel {
 private TaskViewImpl view;

    /** Creates new form JPanelContacto */
    public TaskViewImplInternal(TaskViewImpl view) {
        initComponents();
        this.view=view;
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAdd = new javax.swing.JButton();
        jButtonRemove = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDescription = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Description:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14));
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Type:");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Próximo", "Proyecto", "Algún día", "En espera" }));

        jButton2.setText("Task accomplished");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel1)
                            .add(jLabel2))
                        .add(3, 3, 3)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBox1, 0, 203, Short.MAX_VALUE)
                            .add(jTextFieldDescription, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(jButtonAdd)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonUpdate)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButtonRemove)
                        .add(40, 40, 40))
                    .add(layout.createSequentialGroup()
                        .add(jButton1)
                        .addContainerGap(217, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jTextFieldDescription, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1))
                .add(14, 14, 14)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButtonAdd)
                    .add(jButtonUpdate)
                    .add(jButtonRemove))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton2)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
    try {                if(!view.getLabelCounter().getText().equals("0")){
                view.getLabelCongratulations().setText("Tarea creada satisfactoriamente.");
                view.fireNuevoTaskGesture(this.jTextFieldDescription.getText(), (String) this.jComboBox1.getSelectedItem());
                                    }else{

            view.getLabelCongratulations().setText("Necesita establecer un tiempo primero.");
            }
    } catch (RuntimeException e) {
        javax.swing.JOptionPane.showMessageDialog(new JInternalFrame(), e, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        try {                if(!view.getLabelCounter().getText().equals("0")){
         view.getLabelCongratulations().setText("Tarea eliminada satisfactoriamente.");
        view.fireBorraTaskGesture(this.jTextFieldDescription.getText());
                            }else{

            view.getLabelCongratulations().setText("Necesita establecer un tiempo primero.");
            }
    } catch (RuntimeException e) {
        javax.swing.JOptionPane.showMessageDialog(new JInternalFrame(), e, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
         try {                if(!view.getLabelCounter().getText().equals("0")){
                     view.getLabelCongratulations().setText("Tarea actualizada satisfactoriamente");
        view.fireActualizaTaskGesture(this.jTextFieldDescription.getText(), (String)this.jComboBox1.getSelectedItem());
                            }else{

            view.getLabelCongratulations().setText("Necesita establecer un tiempo primero.");
            }
    } catch (RuntimeException e) {
        javax.swing.JOptionPane.showMessageDialog(new JInternalFrame(), e, "Warning", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        view.refresh();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        view.getLabelCongratulations().setText("Enhorabuena!");
        view.fireRealizarTaskGesture(this.jTextFieldDescription.getText(),(String)this.jComboBox1.getSelectedItem());

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldDescription;
    // End of variables declaration//GEN-END:variables
 public void setTask(Task task) {
        this.jTextFieldDescription.setText(task.getDescription());
        this.jComboBox1.setSelectedItem(task.getType());
    }
}