/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import control.Empresa;
import control.MyJTable;
import java.util.Vector;
import modelo.Noticia;
import modelo.Usuario;

/**
 *
 * @author satan
 */
public class PanelConsultaNoticias extends javax.swing.JPanel {

    Empresa miEmpresa;
    Usuario usuarioActivo;
    MyJTable modelNoticias;//Usa my propia clase MyJTable con metodos editados

    public PanelConsultaNoticias(Empresa miEmpresa, Usuario usuarioActivo) {
        initComponents();
        this.miEmpresa = miEmpresa;
        this.usuarioActivo = usuarioActivo;
        modelNoticias = new MyJTable();
        tblNoticias.setModel(modelNoticias);
        modelNoticias.setColumnIdentifiers(new String[]{
            "Titulo","Categoria"});
        cargarNoticias();
        
        //Evita que las columnas puedan ser movidas
        tblNoticias.getTableHeader().setReorderingAllowed(false);
        
        btnDelete.setVisible(false);
    }
        //activeUser.getMailbox().add(new Message("queso", new Fecha("12/1/2000"), TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY)); //Mensaje de prueba

    /**
     * Carga las noticias
     */
    private void cargarNoticias() {
        cleanTable();
        for (Noticia n : miEmpresa.getNoticias()) {
            Vector v = new Vector();
            v.add(n.getTitulo());
            v.add(n.getCategoria());
            modelNoticias.addRow(v);
        }
    }

    /**
     * Limpia la tabla de noticias
     */
    private void cleanTable() {
        while (modelNoticias.getRowCount() != 0) {
            modelNoticias.removeRow(0);
        }
    }

    /**
     * Limpia los textos de la noticia
     */
    private void limpiarNoticia() {
        txtNoticia.setText("");
        txtFecha.setText("");
        txtTitulo.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNoticias = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNoticia = new javax.swing.JTextArea();
        txtFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Consulta de noticias");

        tblNoticias.setModel(new javax.swing.table.DefaultTableModel(
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
        tblNoticias.setCellSelectionEnabled(true);
        tblNoticias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNoticiasMouseClicked(evt);
            }
        });
        tblNoticias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblNoticiasKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblNoticias);
        tblNoticias.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tblNoticias.getColumnModel().getColumnCount() > 0) {
            tblNoticias.getColumnModel().getColumn(0).setResizable(false);
            tblNoticias.getColumnModel().getColumn(1).setResizable(false);
            tblNoticias.getColumnModel().getColumn(2).setResizable(false);
            tblNoticias.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel2.setText("Mensaje");

        txtTitulo.setEditable(false);

        txtNoticia.setEditable(false);
        txtNoticia.setColumns(20);
        txtNoticia.setRows(5);
        jScrollPane2.setViewportView(txtNoticia);

        txtFecha.setEditable(false);

        jLabel4.setText("Titulo");

        jLabel5.setText("Fecha");

        jLabel6.setText("Noticia");

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDelete.setText("Borrar noticia");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addGap(133, 133, 133))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete))
                        .addGap(27, 27, 27))))
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
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNoticiasKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNoticiasKeyPressed

    }//GEN-LAST:event_tblNoticiasKeyPressed

    /**
     * Cuando se da clic en la tabla coge la noticia seleccionado
     *
     * @param evt
     */
    private void tblNoticiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNoticiasMouseClicked
        int pos = tblNoticias.getSelectedRow();
        //Si al clicar no se dió a ningun mensaje no hace nada
        if (pos != -1) {
            Noticia reading;
            reading = (Noticia) miEmpresa.getNoticias().get(pos);
            limpiarNoticia();
            //Inserta mensaje
            txtNoticia.setText(reading.getNoticia());
            txtFecha.setText(reading.getFecha().stringFecha());
            txtTitulo.setText(reading.getTitulo());            
            if(usuarioActivo.getLogin().equals(reading.getAutor().getLogin())){
                btnDelete.setVisible(true);
            }else{
                btnDelete.setVisible(false);
                
            }
        }
    }//GEN-LAST:event_tblNoticiasMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        miEmpresa.getNoticias().remove(tblNoticias.getSelectedRow());
        cargarNoticias();
        limpiarNoticia();
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblNoticias;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextArea txtNoticia;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
