/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Clases.PanelRound;
import Model.CharacterListCellRenderer;
import Model.PlayersListCellRenderer;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author kastor
 */
public class CharacterChosen extends javax.swing.JFrame {

    /**
     * Creates new form RecoverPassword
     */
    public CharacterChosen() {
        initComponents();
        setLocationRelativeTo(null);
        
        switchPanel(0);
     

    
    }


    
    class RoundedPanel extends JPanel
    {
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Draws the rounded panel with borders.
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setColor(getBackground());
            }
            graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        btnMaster1 = new javax.swing.JLabel();
        bigPanelRound = new Clases.PanelRound();
        lblName = new javax.swing.JLabel();
        bigPanelPicture = new javax.swing.JLabel();
        panelRound_v = new Clases.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        panelRound0 = new Clases.PanelRound();
        jLabel13 = new javax.swing.JLabel();
        panelRound1 = new Clases.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        panelRound2 = new Clases.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound3 = new Clases.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        panelRound4 = new Clases.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        btnMaster5 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(10, 10, 50, 50);

        jPanel3.setBackground(new java.awt.Color(162, 130, 79));

        jPanel26.setBackground(new java.awt.Color(210, 171, 102));

        jLabel29.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Características y salvaciones");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
        );

        jPanel27.setBackground(new java.awt.Color(210, 171, 102));

        jLabel30.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Habilidades");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );

        jPanel28.setBackground(new java.awt.Color(210, 171, 102));

        jLabel31.setFont(new java.awt.Font("Open Sans", 0, 16)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("<html>Otras<p>Competencias</html>ç");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(166, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(167, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(377, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(158, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(165, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(25, 25, 25)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(26, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(330, 400, 524, 300);

        btnMaster1.setBackground(new java.awt.Color(162, 130, 79));
        btnMaster1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnMaster1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMaster1.setText("<html><u>Siguiente</u></html>");
        btnMaster1.setOpaque(true);
        btnMaster1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaster1MouseClicked(evt);
            }
        });
        jPanel1.add(btnMaster1);
        btnMaster1.setBounds(920, 630, 240, 50);

        bigPanelRound.setBackground(new java.awt.Color(184, 159, 114));
        bigPanelRound.setForeground(new java.awt.Color(255, 255, 255));
        bigPanelRound.setRoundBottomLeft(250);
        bigPanelRound.setRoundBottomRight(250);
        bigPanelRound.setRoundTopLeft(250);
        bigPanelRound.setRoundTopRight(250);

        lblName.setBackground(new java.awt.Color(210, 171, 102));
        lblName.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("Info personaje");
        lblName.setOpaque(true);
        lblName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNameMouseClicked(evt);
            }
        });

        bigPanelPicture.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bigPanelPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/classes/bardo_s.png"))); // NOI18N

        javax.swing.GroupLayout bigPanelRoundLayout = new javax.swing.GroupLayout(bigPanelRound);
        bigPanelRound.setLayout(bigPanelRoundLayout);
        bigPanelRoundLayout.setHorizontalGroup(
            bigPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bigPanelRoundLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(bigPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bigPanelPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        bigPanelRoundLayout.setVerticalGroup(
            bigPanelRoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bigPanelRoundLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bigPanelPicture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );

        jPanel1.add(bigPanelRound);
        bigPanelRound.setBounds(480, 110, 220, 220);

        panelRound_v.setBackground(new java.awt.Color(184, 159, 114));
        panelRound_v.setForeground(new java.awt.Color(255, 255, 255));
        panelRound_v.setRoundBottomLeft(250);
        panelRound_v.setRoundBottomRight(250);
        panelRound_v.setRoundTopLeft(250);
        panelRound_v.setRoundTopRight(250);
        panelRound_v.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound_vMouseClicked(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("V");

        javax.swing.GroupLayout panelRound_vLayout = new javax.swing.GroupLayout(panelRound_v);
        panelRound_v.setLayout(panelRound_vLayout);
        panelRound_vLayout.setHorizontalGroup(
            panelRound_vLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        panelRound_vLayout.setVerticalGroup(
            panelRound_vLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel1.add(panelRound_v);
        panelRound_v.setBounds(577, 350, 30, 30);

        panelRound0.setBackground(new java.awt.Color(184, 159, 114));
        panelRound0.setForeground(new java.awt.Color(255, 255, 255));
        panelRound0.setRoundBottomLeft(250);
        panelRound0.setRoundBottomRight(250);
        panelRound0.setRoundTopLeft(250);
        panelRound0.setRoundTopRight(250);
        panelRound0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound0MouseClicked(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("CAR");

        javax.swing.GroupLayout panelRound0Layout = new javax.swing.GroupLayout(panelRound0);
        panelRound0.setLayout(panelRound0Layout);
        panelRound0Layout.setHorizontalGroup(
            panelRound0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound0Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound0Layout.setVerticalGroup(
            panelRound0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound0);
        panelRound0.setBounds(410, 140, 60, 60);

        panelRound1.setBackground(new java.awt.Color(184, 159, 114));
        panelRound1.setForeground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(250);
        panelRound1.setRoundBottomRight(250);
        panelRound1.setRoundTopLeft(250);
        panelRound1.setRoundTopRight(250);
        panelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound1MouseClicked(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("EQ");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound1);
        panelRound1.setBounds(460, 70, 60, 60);

        panelRound2.setBackground(new java.awt.Color(184, 159, 114));
        panelRound2.setForeground(new java.awt.Color(255, 255, 255));
        panelRound2.setRoundBottomLeft(250);
        panelRound2.setRoundBottomRight(250);
        panelRound2.setRoundTopLeft(250);
        panelRound2.setRoundTopRight(250);
        panelRound2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound2MouseClicked(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VID");

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound2);
        panelRound2.setBounds(560, 40, 60, 60);

        panelRound3.setBackground(new java.awt.Color(184, 159, 114));
        panelRound3.setForeground(new java.awt.Color(255, 255, 255));
        panelRound3.setRoundBottomLeft(250);
        panelRound3.setRoundBottomRight(250);
        panelRound3.setRoundTopLeft(250);
        panelRound3.setRoundTopRight(250);
        panelRound3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound3MouseClicked(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("HAB");

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(panelRound3);
        panelRound3.setBounds(660, 70, 60, 60);

        panelRound4.setBackground(new java.awt.Color(184, 159, 114));
        panelRound4.setForeground(new java.awt.Color(255, 255, 255));
        panelRound4.setRoundBottomLeft(250);
        panelRound4.setRoundBottomRight(250);
        panelRound4.setRoundTopLeft(250);
        panelRound4.setRoundTopRight(250);
        panelRound4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound4MouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("INF");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound4);
        panelRound4.setBounds(710, 140, 60, 60);

        btnMaster5.setBackground(new java.awt.Color(162, 130, 79));
        btnMaster5.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnMaster5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMaster5.setText("SB = Subraza");
        btnMaster5.setOpaque(true);
        btnMaster5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMaster5MouseClicked(evt);
            }
        });
        jPanel1.add(btnMaster5);
        btnMaster5.setBounds(980, 30, 190, 50);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/background.png"))); // NOI18N
        jPanel1.add(backgroundImage);
        backgroundImage.setBounds(0, 0, 1200, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        Shop s = new Shop();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnMaster1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaster1MouseClicked
    
    }//GEN-LAST:event_btnMaster1MouseClicked

    private void lblNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNameMouseClicked

    private void btnMaster5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaster5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMaster5MouseClicked

    private void panelRound2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound2MouseClicked
        switchPanel(2);
    }//GEN-LAST:event_panelRound2MouseClicked

    private void panelRound4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound4MouseClicked
        switchPanel(4);
    }//GEN-LAST:event_panelRound4MouseClicked

    private void panelRound_vMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound_vMouseClicked
        
    }//GEN-LAST:event_panelRound_vMouseClicked

    private void panelRound1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound1MouseClicked
        switchPanel(1);        
    }//GEN-LAST:event_panelRound1MouseClicked

    private void panelRound3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound3MouseClicked
        switchPanel(3);
    }//GEN-LAST:event_panelRound3MouseClicked

    private void panelRound0MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound0MouseClicked
        switchPanel(0);
    }//GEN-LAST:event_panelRound0MouseClicked

   
    
    private void switchPanel(int num) {
    repaint();
    Color color = new Color(162, 130, 79);
    Color blackColor = Color.BLACK;


    
    PanelRound[] panels = {panelRound0, panelRound1, panelRound2, panelRound3, panelRound4};

    for (int i = 0; i < panels.length; i++) {
        if (i == num) {
            panels[i].setBorderColor(blackColor);

        } else {
            panels[i].setBorderColor(color);
        }
    }
    
    
    }

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CharacterChosen().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel bigPanelPicture;
    private Clases.PanelRound bigPanelRound;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnMaster1;
    private javax.swing.JLabel btnMaster5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblName;
    private Clases.PanelRound panelRound0;
    private Clases.PanelRound panelRound1;
    private Clases.PanelRound panelRound2;
    private Clases.PanelRound panelRound3;
    private Clases.PanelRound panelRound4;
    private Clases.PanelRound panelRound_v;
    // End of variables declaration//GEN-END:variables
}