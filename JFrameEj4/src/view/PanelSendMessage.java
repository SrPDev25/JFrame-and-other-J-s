/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.Fecha;
import control.Mail;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.Message;
import model.User;

/**
 *
 * @author satan
 */
public class PanelSendMessage extends javax.swing.JPanel {

    Mail myMail;
    User activeUser;

    public PanelSendMessage(Mail myMail, User activeUser) {
        initComponents();
        this.activeUser = activeUser;
        this.myMail = myMail;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtMatter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMessage = new javax.swing.JTextArea();
        btnSend = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblErrorMessage = new javax.swing.JLabel();
        lblErrorMail = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Message");

        txtMatter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatterKeyPressed(evt);
            }
        });

        jLabel2.setText("Asunto");

        txtMessage.setColumns(20);
        txtMessage.setRows(5);
        txtMessage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMessageKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtMessage);

        btnSend.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSend.setText("Enviar");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        jLabel3.setText("Mensaje");

        txtMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMailKeyPressed(evt);
            }
        });

        jLabel4.setText("Destinatario");

        lblErrorMessage.setForeground(java.awt.Color.red);

        lblErrorMail.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSend)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMatter, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblErrorMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(134, 134, 134))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(27, 27, 27)
                            .addComponent(lblErrorMessage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4))
                    .addComponent(lblErrorMail, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(lblErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSend)
                .addContainerGap(10, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        String matter = txtMatter.getText().trim();
        String message = txtMessage.getText();
        String direction = txtMail.getText().trim();
        Fecha fecha = new Fecha();
        fecha.setToday();
        boolean correct = true;
        int posUser = myMail.getUsers().indexOf(new User(direction));

        //Comprueba hay mensaje
        if (message.trim().equals("")) {
            correct = false;
            lblErrorMessage.setText("El mensaje no tiene contenido");
        } else {
            lblErrorMessage.setText("");
        }

        //comprueba si la direccion existe
        if (direction.equals("")) {
            correct = false;
            lblErrorMail.setText("Falta dirección");
        } else {
            posUser = myMail.getUsers().indexOf(new User(direction));
            if (posUser == -1) {
                lblErrorMail.setText("Dirección no encontrada");
                correct = false;
            } else {
                lblErrorMail.setText("");
            }
        }

        //No se se indico asunto se asigna uno predeterminado
        if (matter.equals("")) {
            matter = "Sin asunto";
        }

        //Le añade al usuario receptor el mensaje
        if (correct) {
            myMail.getUsers().get(posUser).getMailbox().add(
                    new Message(matter, fecha, matter, activeUser.getDirection()));
            JOptionPane.showMessageDialog(this, "Mensaje enviado", "Enviado", JOptionPane.INFORMATION_MESSAGE);
            clean();
        }


    }//GEN-LAST:event_btnSendActionPerformed

    private void txtMatterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMail.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtMatter.setText("");
        }
    }//GEN-LAST:event_txtMatterKeyPressed

    private void txtMailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtMessage.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtMail.setText("");
        }
    }//GEN-LAST:event_txtMailKeyPressed

    private void txtMessageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMessageKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnSend.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtMessage.setText("");
        }
    }//GEN-LAST:event_txtMessageKeyPressed

    private void clean() {
        txtMail.setText("");
        txtMatter.setText("");
        txtMessage.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorMail;
    private javax.swing.JLabel lblErrorMessage;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtMatter;
    private javax.swing.JTextArea txtMessage;
    // End of variables declaration//GEN-END:variables
}
