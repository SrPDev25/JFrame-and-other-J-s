/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import control.Empresa;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import model.Asignatura;

/**
 *
 * @author satan
 */
public class PanelAltaCurso extends javax.swing.JPanel {

    Empresa miEmpresa;
    DefaultListModel modeloLista;

    public PanelAltaCurso(Empresa miEmpresa) {
        initComponents();
        this.miEmpresa = miEmpresa;
        modeloLista = new DefaultListModel();
        listaAsignaturas.setModel(modeloLista);
    }

    private void clean(){
        txtAsignatura.setText("");
        txtCodigo.setText("");
        txtDenominacion.setText("");
        txtPlazas.setText("");
        modeloLista.removeAllElements();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDenominacion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaAsignaturas = new javax.swing.JList<>();
        txtAsignatura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnAnnadirAsign = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        lblErrorAsign = new javax.swing.JLabel();
        lblErrorCode = new javax.swing.JLabel();
        lblErrorDenominacion = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlazas = new javax.swing.JTextField();
        lblErrorPlazas = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setText("Alta curso");

        jLabel2.setText("Codigo");

        jLabel3.setText("Denominacion");

        listaAsignaturas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaAsignaturas);

        jLabel4.setText("Nueva Asignatura");

        btnAnnadirAsign.setText("Añadir");
        btnAnnadirAsign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnadirAsignActionPerformed(evt);
            }
        });

        btnCrear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCrear.setText("Crear curso");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        lblErrorAsign.setForeground(java.awt.Color.red);

        lblErrorCode.setForeground(java.awt.Color.red);

        lblErrorDenominacion.setForeground(java.awt.Color.red);

        jLabel5.setText("Numero de plazas");

        lblErrorPlazas.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnCrear))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblErrorAsign, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 51, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtAsignatura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnnadirAsign))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblErrorCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblErrorDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblErrorPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)))))
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblErrorCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDenominacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblErrorDenominacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(lblErrorPlazas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btnAnnadirAsign))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorAsign, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void btnAnnadirAsignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnadirAsignActionPerformed
        Asignatura newAsignatura = new Asignatura(txtAsignatura.getText());

        if (modeloLista.indexOf(newAsignatura) == -1) {
            modeloLista.addElement(newAsignatura);
            lblErrorAsign.setText("");
        } else if (txtDenominacion.equals("")) {
            lblErrorAsign.setText("Asignatura vacia");
        } else {
            lblErrorAsign.setText("Asignatura ya existente");
        }


    }//GEN-LAST:event_btnAnnadirAsignActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        String codigo = txtCodigo.getText();
        String denominacion = txtDenominacion.getText();
        int nPlazas=0;

        ArrayList<Asignatura> asignaturas = new ArrayList<>();
        boolean right = true;

        if (codigo.equals("")) {
            lblErrorCode.setText("Campo obligatorio");
            right = false;
        } else if (miEmpresa.existeCurso(codigo)) {
            lblErrorCode.setText("Curso ya existente");
            right = false;
        } else {
            lblErrorCode.setText("");
        }

        if (denominacion.equals("")) {
            lblErrorDenominacion.setText("*");
            right = false;
        } else {
            lblErrorDenominacion.setText("");
        }

        if (modeloLista.getSize() == 0) {
            lblErrorAsign.setText("No se añadieron asignaturas");
            right = false;
        } else {
            lblErrorAsign.setText("");

        }

        if (txtPlazas.getText().equals("")) {
            lblErrorPlazas.setText("*");
            right = false;
        } else {
            try {
                nPlazas=Integer.parseInt(txtPlazas.getText());
                lblErrorPlazas.setText("");
                
            } catch (NumberFormatException ex) {
                lblErrorPlazas.setText("*");
                right = false;
            }
        }

        if (right) {
            for (int i = 0; i < modeloLista.getSize(); i++) {
                asignaturas.add((Asignatura) modeloLista.get(i));
            }

            miEmpresa.nuevoCurso(codigo, denominacion, nPlazas, asignaturas);
        }


    }//GEN-LAST:event_btnCrearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnadirAsign;
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorAsign;
    private javax.swing.JLabel lblErrorCode;
    private javax.swing.JLabel lblErrorDenominacion;
    private javax.swing.JLabel lblErrorPlazas;
    private javax.swing.JList<String> listaAsignaturas;
    private javax.swing.JTextField txtAsignatura;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDenominacion;
    private javax.swing.JTextField txtPlazas;
    // End of variables declaration//GEN-END:variables
}
