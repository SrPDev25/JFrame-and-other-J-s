/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.Empresa;
import control.MyJFrame;
import control.UserCode;
import model.Usuario;

/**
 *
 * @author satan
 */
public class WinControl extends MyJFrame {

    Empresa miEmpresa;
    Usuario usuarioActivo;
    PanelAltaCurso panelAltaCurso;
    
    public WinControl(Empresa miEmpresa, Usuario usuarioActivo) {
        initComponents();
        this.miEmpresa=miEmpresa;
        this.usuarioActivo=usuarioActivo;
        centrar();
        
        if(this.usuarioActivo.getNivelAcceso()==UserCode.ADMINISTRADOR){
            mnuConsulta.setVisible(false);
        }else{
            mnuAltaAlumno.setVisible(false);
            mnuAltaCurso.setVisible(false);
        }
    }

    private void clean(){
        try{
            this.remove(panelAltaCurso);
        }catch(Exception ex){
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAltaCurso = new javax.swing.JMenuItem();
        mnuAltaAlumno = new javax.swing.JMenuItem();
        mnuConsulta = new javax.swing.JMenuItem();
        mnuMnuSalir = new javax.swing.JMenu();
        mnuDesconectar = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setSize(new java.awt.Dimension(400, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Opciones");

        mnuAltaCurso.setText("Alta de curso");
        mnuAltaCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAltaCursoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAltaCurso);

        mnuAltaAlumno.setText("Alta de alumnos");
        jMenu1.add(mnuAltaAlumno);

        mnuConsulta.setText("Consulta de cursos");
        jMenu1.add(mnuConsulta);

        jMenuBar1.add(jMenu1);

        mnuMnuSalir.setText("Salir");

        mnuDesconectar.setText("Desconectar");
        mnuDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDesconectarActionPerformed(evt);
            }
        });
        mnuMnuSalir.add(mnuDesconectar);

        mnuSalir.setText("Salir de la Aplicación");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuMnuSalir.add(mnuSalir);

        jMenuBar1.add(mnuMnuSalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDesconectarActionPerformed
        new WinLoging(miEmpresa).setVisible(true);
        this.dispose();
        pack();
    }//GEN-LAST:event_mnuDesconectarActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        cerrar();
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void mnuAltaCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAltaCursoActionPerformed
        panelAltaCurso=new PanelAltaCurso(miEmpresa);
        this.getContentPane().add(panelAltaCurso);
        pack();
    }//GEN-LAST:event_mnuAltaCursoActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAltaAlumno;
    private javax.swing.JMenuItem mnuAltaCurso;
    private javax.swing.JMenuItem mnuConsulta;
    private javax.swing.JMenuItem mnuDesconectar;
    private javax.swing.JMenu mnuMnuSalir;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}
