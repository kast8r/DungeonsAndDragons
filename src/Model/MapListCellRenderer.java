/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;

/**
 *
 * @author kastor
 */


public class MapListCellRenderer extends DefaultListCellRenderer  {

        private Map<Integer, Color> playerColors;
        
        public MapListCellRenderer() {
            playerColors = new HashMap<>();
            playerColors.put(0, Color.MAGENTA);
            playerColors.put(1, Color.RED);
            playerColors.put(2, Color.GREEN);
        }
    
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
                                                      boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            label.setOpaque(false);

            String playerName = (String) value;
            label.setText(playerName);
            label.setHorizontalTextPosition(SwingConstants.LEFT);

            Color playerColor = playerColors.get(index);

            int circleSize = 50;
            label.setIconTextGap(30);
            Image circleImage = new BufferedImage(circleSize, circleSize, BufferedImage.TYPE_INT_ARGB);
            Graphics2D graphics = (Graphics2D) circleImage.getGraphics();

            graphics.setColor(playerColor);

            graphics.fillOval(0, 0, circleSize, circleSize);

            label.setIcon(new ImageIcon(circleImage));

            return label;
        }
}

