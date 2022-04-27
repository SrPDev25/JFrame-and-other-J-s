/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import control.Empresa;
import control.MyJFrame;
import modelo.Usuario;

/**
 *
 * @author satan
 */
public class VtnControl extends MyJFrame {

    Empresa miEmpresa;
    String usuarioActivo;
    PanelAltaNoticia panelAltaNoticia;
    PanelConsultaNoticias panelConsultaNoticias;

    public VtnControl(Empresa miEmpresa, String usuarioActivo) {
        initComponents();
        centrar();
        this.usuarioActivo = usuarioActivo;
        this.miEmpresa = miEmpresa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuConsulta = new javax.swing.JMenuItem();
        mnuAltaNoticia = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Noticias");
        setMinimumSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Opciones");

        mnuConsulta.setText("Consulta de noticias");
        mnuConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuConsulta);

        mnuAltaNoticia.setText("Alta de noticia");
        mnuAltaNoticia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaNoticiaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAltaNoticia);

        jMenuBar1.add(jMenu1);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        cerrar();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new VtnLoging(miEmpresa).setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuAltaNoticiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaNoticiaActionPerformed
        clean();
        panelAltaNoticia = new PanelAltaNoticia(miEmpresa, usuarioActivo);
        this.getContentPane().add(panelAltaNoticia);
        pack();
    }//GEN-LAST:event_mnuAltaNoticiaActionPerformed

    private void mnuConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultaActionPerformed
        clean();
        panelConsultaNoticias = new PanelConsultaNoticias(miEmpresa, usuarioActivo);
        this.getContentPane().add(panelConsultaNoticias);
        pack();
    }//GEN-LAST:event_mnuConsultaActionPerformed

    private void clean() {
        try {
            this.remove(panelAltaNoticia);
        } catch (Exception ex) {

        }
        try {
            this.remove(panelConsultaNoticias);
        } catch (Exception ex) {

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAltaNoticia;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
