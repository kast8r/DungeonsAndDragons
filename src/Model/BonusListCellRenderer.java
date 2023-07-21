/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Component;
import java.awt.FontMetrics;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

/**
 *
 * @author kastor
 */


public class BonusListCellRenderer extends DefaultListCellRenderer  {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                                                      boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setOpaque(false);  


            String playerName = (String) value;
            label.setText(playerName);
            label.setHorizontalTextPosition(SwingConstants.LEFT); 
                        FontMetrics met = super.getFontMetrics(super.getFont());
            int width = met.stringWidth(super.getText());                
            

          

            return label;
        }
}

