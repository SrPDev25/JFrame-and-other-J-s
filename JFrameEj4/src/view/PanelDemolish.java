/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.Mail;
import javax.swing.DefaultComboBoxModel;
import model.User;

/**
 *
 * @author satan
 */
public class PanelDemolish extends javax.swing.JPanel {

    Mail myMail;
    DefaultComboBoxModel modelCombo;
    User activeuser;

    public PanelDemolish(Mail myMail, User user) {
        initComponents();
        this.myMail = myMail;
        activeuser = user;
        modelCombo = new DefaultComboBoxModel();
        comboUsers.setModel(modelCombo);
        chargeUsers();
    }

    private void chargeUsers() {
        modelCombo.removeAllElements();
        modelCombo.addAll(myMail.getUsers());
        modelCombo.removeElement(activeuser);
        if (modelCombo.getSize() == 0) {
            lblError.setText("No hay usuarios para eliminar");
        } else {
            lblError.setText("");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboUsers = new javax.swing.JComboBox<>();
        btnDemolish = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Dar de baja un usuario");

        comboUsers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnDemolish.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDemolish.setText("Dar de baja");
        btnDemolish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDemolishActionPerformed(evt);
            }
        });

        lblError.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDemolish)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnDemolish)
                .addContainerGap(132, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDemolishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDemolishActionPerformed
        User userDeleted = (User) modelCombo.getElementAt(comboUsers.getSelectedIndex());
        myMail.getUsers().remove(userDeleted);
        chargeUsers();
    }//GEN-LAST:event_btnDemolishActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDemolish;
    private javax.swing.JComboBox<String> comboUsers;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblError;
    // End of variables declaration//GEN-END:variables
}
