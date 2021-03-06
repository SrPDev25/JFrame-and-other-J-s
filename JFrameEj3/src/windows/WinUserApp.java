/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import control.BusControlC;
import control.MyJFrame;

/**
 *
 * @author dam
 */
public class WinUserApp extends MyJFrame {

    BusControlC miControl;
    PanelSeeLines panelSeeLines;
    
    public WinUserApp(BusControlC miControl) {
        this.miControl=miControl;
        initComponents();
        centrar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuSeeLines = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuDisconnect = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(300, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Options");

        mnuSeeLines.setText("Consulta");
        mnuSeeLines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSeeLinesActionPerformed(evt);
            }
        });
        jMenu1.add(mnuSeeLines);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");

        mnuDisconnect.setText("Disconnect");
        mnuDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDisconnectActionPerformed(evt);
            }
        });
        jMenu2.add(mnuDisconnect);

        mnuExit.setText("Exit");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        jMenu2.add(mnuExit);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        cierre();
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDisconnectActionPerformed
        new WinLogin(miControl).setVisible(true);
        dispose();
        pack();
    }//GEN-LAST:event_mnuDisconnectActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cierre();
    }//GEN-LAST:event_formWindowClosing

    private void mnuSeeLinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSeeLinesActionPerformed
        clean();
        panelSeeLines=new PanelSeeLines(miControl);
        this.getContentPane().add(panelSeeLines);
        pack();
    }//GEN-LAST:event_mnuSeeLinesActionPerformed

    private void clean(){
        try{
            this.remove(panelSeeLines);
        }catch(Exception ex){
            
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuDisconnect;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuSeeLines;
    // End of variables declaration//GEN-END:variables
}
