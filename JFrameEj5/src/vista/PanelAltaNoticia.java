/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import control.Empresa;
import control.Fecha;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import modelo.Categoria;
import modelo.Usuario;


public class PanelAltaNoticia extends javax.swing.JPanel {

    private Empresa miEmpresa;
    private Usuario usuarioActivo;
    private DefaultComboBoxModel modeloCombo;

    public PanelAltaNoticia(Empresa miEmpresa, Usuario usuarioActivo) {
        initComponents();
        this.miEmpresa = miEmpresa;
        this.usuarioActivo = usuarioActivo;
        modeloCombo = new DefaultComboBoxModel();
        comboCategoria.setModel(modeloCombo);
        cargarCategorias();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtNoticia = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblErrorTitulo = new javax.swing.JLabel();
        btnPublicar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        lblErrorCategoria = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 24)); // NOI18N
        jLabel1.setText("Nueva noticia");

        txtTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTituloKeyPressed(evt);
            }
        });

        txtNoticia.setColumns(20);
        txtNoticia.setRows(5);
        txtNoticia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNoticiaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(txtNoticia);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Título");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Noticia");

        lblErrorTitulo.setForeground(java.awt.Color.red);

        btnPublicar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPublicar.setText("Publicar");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Categoria");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblErrorCategoria.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblErrorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtTitulo))
                    .addComponent(btnPublicar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(lblErrorTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cargarCategorias() {
        modeloCombo.addElement("Elige categoria");
        modeloCombo.addAll(miEmpresa.getCategoria());
    }

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        String titulo = txtTitulo.getText().trim();
        String noticia;
        Fecha fecha;
        boolean correcto=true;
        int posCategoria=comboCategoria.getSelectedIndex();
        Categoria categoria=(Categoria)modeloCombo.getElementAt(posCategoria);
        int pos;
        
        

        if (posCategoria==0) {
            correcto=false;
            lblErrorCategoria.setText("Elige una categoria");
        }else{
            pos = miEmpresa.noticiaValida(titulo, usuarioActivo, categoria);
            lblErrorCategoria.setText("");
            if (pos > -1) {
                lblErrorTitulo.setText("Ya has utilizado este titulo en esta categoría");
                correcto = false;
            } else if (pos == -2) {
                correcto = false;
                lblErrorTitulo.setText("No se determino un título");
            } else {
                lblErrorTitulo.setText("");

            }
        }
        
        if (correcto) {
            noticia = txtNoticia.getText();
            fecha = new Fecha();
            fecha.setToday();
            miEmpresa.nuevaNoticia(titulo, noticia, categoria, usuarioActivo, fecha);
            lblErrorTitulo.setText("");
            limpiar();
        }
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void txtTituloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTituloKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNoticia.requestFocus();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtTitulo.setText("");
        }
    }//GEN-LAST:event_txtTituloKeyPressed

    private void txtNoticiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoticiaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnPublicar.doClick();
        } else if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            txtNoticia.setText("");
        }
    }//GEN-LAST:event_txtNoticiaKeyPressed

    private void limpiar() {
        txtNoticia.setText("");
        txtTitulo.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPublicar;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorCategoria;
    private javax.swing.JLabel lblErrorTitulo;
    private javax.swing.JTextArea txtNoticia;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
