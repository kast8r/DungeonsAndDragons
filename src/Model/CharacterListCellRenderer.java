/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import javax.swing.BorderFactory;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

/**
 *
 * @author kastor
 */


public class CharacterListCellRenderer extends DefaultListCellRenderer  {

        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                                                      boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            
            if (index == 0) {
                label.setBorder(BorderFactory.createMatteBorder(1,0, 1, 0, Color.BLACK));  
            } else {
                label.setBorder(BorderFactory.createMatteBorder(0,0, 1, 0, Color.BLACK));
            }
            
            
            label.setOpaque(false);  


            String playerName = (String) value;
            label.setText(playerName);
            label.setHorizontalTextPosition(SwingConstants.LEFT); 
            FontMetrics met = super.getFontMetrics(super.getFont());
            int width = met.stringWidth(super.getText());                
            super.setIconTextGap(300 - width); 

            
            label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/trash.png")));
            
            return label;
        }
}

