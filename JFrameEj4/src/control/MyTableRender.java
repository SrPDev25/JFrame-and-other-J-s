/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author satan
 */
public class MyTableRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {

        String read = (String) table.getValueAt(row, 4);
        if (read.equalsIgnoreCase("si")) {
            setBackground(Color.GRAY);
        } else {
            setBackground(Color.WHITE);

        }

         return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    }
}
