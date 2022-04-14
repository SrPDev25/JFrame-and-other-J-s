/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.Fecha;
import control.Mail;
import control.MyJTable;
import java.awt.Color;
import java.util.Vector;
import model.Message;
import model.User;

/**
 *
 * @author satan
 */
public class PanelMailbox extends javax.swing.JPanel {

    Mail myMail;
    User activeUser;
    MyJTable modelMailbox;//Usa my propia clase MyJTable con metodos editados

    public PanelMailbox(Mail myMail, User activeUser) {
        initComponents();
        this.myMail = myMail;
        this.activeUser = activeUser;
        modelMailbox = new MyJTable();
        tblMailbox.setModel(modelMailbox);
        modelMailbox.setColumnIdentifiers(new String[]{
            "Asunto", "Autor", "Fecha", "Leido"});
        chargeMails();
        
        //Evita que las columnas puedan ser movidas
        tblMailbox.getTableHeader().setReorderingAllowed(false);
    }
        //activeUser.getMailbox().add(new Message("queso", new Fecha("12/1/2000"), TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY)); //Mensaje de prueba

    /**
     * Carga los mensajes del usuario activo
     */
    private void chargeMails() {
        cleanTable();
        for (Message m : activeUser.getMailbox()) {
            Vector v = new Vector();
            v.add(m.getMatter());
            v.add(m.getAuthor());
            v.add(m.getDate());
            if (m.isRead()) {
                v.add("Si");
            } else {
                tblMailbox.setBackground(Color.GRAY);
                v.add("No");
            }
            modelMailbox.addRow(v);

        }
    }

    /**
     * Limpia la tabla de mensajes
     */
    private void cleanTable() {
        while (modelMailbox.getRowCount() != 0) {
            modelMailbox.removeRow(0);
        }
    }

    /**
     * Limpia los textos del mensaje
     */
    private void cleanMessage() {
        txtAuthor.setText("");
        txtContent.setText("");
        txtDate.setText("");
        txtMatter.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMailbox = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtMatter = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtContent = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Bandeja de entrada");

        tblMailbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMailbox.setCellSelectionEnabled(true);
        tblMailbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMailboxMouseClicked(evt);
            }
        });
        tblMailbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblMailboxKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblMailbox);
        tblMailbox.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblMailbox.getColumnModel().getColumnCount() > 0) {
            tblMailbox.getColumnModel().getColumn(0).setResizable(false);
            tblMailbox.getColumnModel().getColumn(1).setResizable(false);
            tblMailbox.getColumnModel().getColumn(2).setResizable(false);
            tblMailbox.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Mensaje");

        txtContent.setColumns(20);
        txtContent.setRows(5);
        jScrollPane2.setViewportView(txtContent);

        jLabel3.setText("Autor");

        jLabel4.setText("Asunto");

        jLabel5.setText("Fecha");

        jLabel6.setText("Mensaje");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtMatter, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMatter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblMailboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblMailboxKeyPressed

    }//GEN-LAST:event_tblMailboxKeyPressed

    /**
     * Cuando se da clic en la tabla coge el mensaje seleccionado
     *
     * @param evt
     */
    private void tblMailboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMailboxMouseClicked
        int pos = tblMailbox.getSelectedRow();
        //Si al clicar no se dió a ningun mensaje no hace nada
        if (pos != -1) {
            Message reading;
            reading = (Message) activeUser.getMailbox().get(pos);
            cleanMessage();
            //Inserta mensaje
            txtAuthor.setText(reading.getAuthor());
            txtContent.setText(reading.getContent());
            txtDate.setText(reading.getDate().stringFecha());
            txtMatter.setText(reading.getMatter());
            
            reading.setRead(true);//Hace que el mensaje esté en leido
            chargeMails();
        }
    }//GEN-LAST:event_tblMailboxMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblMailbox;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextArea txtContent;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtMatter;
    // End of variables declaration//GEN-END:variables
}
