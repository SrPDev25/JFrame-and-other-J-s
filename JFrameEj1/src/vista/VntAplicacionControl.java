/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.Biblioteca;
import control.MyJFrame;

/**
 *
 * @author dam
 */
public class VntAplicacionControl extends MyJFrame {

    Biblioteca miBiblioteca;
    PanelPrestamo panelPrestamo; //Se crea en la ventana un panel del tipo buscado
    PanelUsuarioH panelUsuario;

    /**
     * Creates new form VntAplicacionControl
     */
    public VntAplicacionControl(Biblioteca miBiblioteca) {
        this.miBiblioteca = miBiblioteca;
        centrar();//centra al spawnear
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOpciones = new javax.swing.JMenu();
        mnuAltaUsuarios = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        mnuOpciones.setText("Opciones");

        mnuAltaUsuarios.setText("Alta de Usuarios");
        mnuAltaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaUsuariosActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuAltaUsuarios);

        mnuConsulta.setText("Préstamo de libros");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        mnuOpciones.add(mnuConsulta);

        jMenuItem5.setText("Consulta libros prestados");
        mnuOpciones.add(jMenuItem5);

        jMenuBar1.add(mnuOpciones);

        jMenu2.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDesconectar);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        advertenciaCierre();//Se asegura del cierre seguro
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        advertenciaCierre();
    }//GEN-LAST:event_formWindowClosing

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new VntInicio(miBiblioteca).setVisible(true); //Crea la ventana login dandole la biblioteca
        dispose();//cierra la ventana
        pack();//ajusta tamaños
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
        showPrestamo();
    }//GEN-LAST:event_mnuConsultaActionPerformed

    private void mnuAltaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaUsuariosActionPerformed
        eliminarPanel();
        panelUsuario = new PanelUsuarioH(miBiblioteca);
        this.getContentPane().add(panelUsuario);
        pack();
    }//GEN-LAST:event_mnuAltaUsuariosActionPerformed

    private void showPrestamo(){
        eliminarPanel();//limpia de todos los paneles activos
        panelPrestamo=new PanelPrestamo(miBiblioteca); //crea el panel prestamo
        this.getContentPane().add(panelPrestamo);//Lo añade al panel de la ventana
        pack(); //ajusta tamaños
    }
    
    /**
     * limpia de todos los paneles activos en la ventana
     */
    private void eliminarPanel() {
        try {
            this.remove(panelPrestamo);
        } catch (Exception ex) {

        }
        try {
            this.remove(panelUsuario);
        } catch (Exception ex) {

        }
    }
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem mnuAltaUsuarios;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenu mnuOpciones;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
