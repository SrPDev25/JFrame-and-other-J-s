/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.table.DefaultTableModel;

//Hereda el DefaultTableModel
public class MyJTable extends DefaultTableModel {

    //Cambia el metodo para que las celdas no sean editables
    @Override
    public boolean isCellEditable(int row, int column) {
        return false;
    }


}
