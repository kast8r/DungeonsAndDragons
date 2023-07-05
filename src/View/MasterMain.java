/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author kastor
 */
public class MasterMain extends javax.swing.JFrame {

    /**
     * Creates new form MasterMain
     */
    public MasterMain() {
         try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MasterMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MasterMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MasterMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MasterMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnMap = new javax.swing.JLabel();
        btnPlayersRoom = new javax.swing.JLabel();
        btnWeapons = new javax.swing.JLabel();
        btnItems = new javax.swing.JLabel();
        btnArmor = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 700));
        jPanel1.setLayout(null);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(610, 0, 50, 700);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 350, 610, 30);

        btnMap.setBackground(new java.awt.Color(0, 0, 0));
        btnMap.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnMap.setForeground(new java.awt.Color(255, 255, 255));
        btnMap.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMap.setText("<html><u>Mapa</u></html>");
        btnMap.setOpaque(true);
        btnMap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMapMouseClicked(evt);
            }
        });
        jPanel1.add(btnMap);
        btnMap.setBounds(820, 480, 220, 70);

        btnPlayersRoom.setBackground(new java.awt.Color(0, 0, 0));
        btnPlayersRoom.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnPlayersRoom.setForeground(new java.awt.Color(255, 255, 255));
        btnPlayersRoom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPlayersRoom.setText("<html><u>Sala de jugadores</u></html>");
        btnPlayersRoom.setOpaque(true);
        btnPlayersRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlayersRoomMouseClicked(evt);
            }
        });
        jPanel1.add(btnPlayersRoom);
        btnPlayersRoom.setBounds(160, 130, 270, 70);

        btnWeapons.setBackground(new java.awt.Color(0, 0, 0));
        btnWeapons.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnWeapons.setForeground(new java.awt.Color(255, 255, 255));
        btnWeapons.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnWeapons.setText("<html><u>Armas</u></html>");
        btnWeapons.setOpaque(true);
        btnWeapons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnWeaponsMouseClicked(evt);
            }
        });
        jPanel1.add(btnWeapons);
        btnWeapons.setBounds(50, 410, 220, 70);

        btnItems.setBackground(new java.awt.Color(0, 0, 0));
        btnItems.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnItems.setForeground(new java.awt.Color(255, 255, 255));
        btnItems.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnItems.setText("<html><u>Objetos</u></html>");
        btnItems.setOpaque(true);
        btnItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnItemsMouseClicked(evt);
            }
        });
        jPanel1.add(btnItems);
        btnItems.setBounds(190, 540, 220, 70);

        btnArmor.setBackground(new java.awt.Color(0, 0, 0));
        btnArmor.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnArmor.setForeground(new java.awt.Color(255, 255, 255));
        btnArmor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnArmor.setText("<html><u>Armaduras</u></html>");
        btnArmor.setOpaque(true);
        btnArmor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArmorMouseClicked(evt);
            }
        });
        jPanel1.add(btnArmor);
        btnArmor.setBounds(330, 410, 220, 70);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/world.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(790, 70, 310, 340);

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/back.png"))); // NOI18N
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(10, 10, 50, 50);

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

    private void btnPlayersRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlayersRoomMouseClicked
        PlayersRoom pr = new PlayersRoom();
        pr.setVisible(true);
    }//GEN-LAST:event_btnPlayersRoomMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        ProfileSelection ps = new ProfileSelection();
        ps.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnMapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMapMouseClicked
        Map m = new Map();
        m.setVisible(true);
    }//GEN-LAST:event_btnMapMouseClicked

    private void btnWeaponsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnWeaponsMouseClicked
        GearCreation gc = new GearCreation();
        gc.setVisible(true);
    }//GEN-LAST:event_btnWeaponsMouseClicked

    private void btnArmorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArmorMouseClicked
        GearCreation gc = new GearCreation();
        gc.setVisible(true);
    }//GEN-LAST:event_btnArmorMouseClicked

    private void btnItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnItemsMouseClicked
        GearCreation gc = new GearCreation();
        gc.setVisible(true);
    }//GEN-LAST:event_btnItemsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MasterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MasterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MasterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MasterMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MasterMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel btnArmor;
    private javax.swing.JLabel btnBack;
    private javax.swing.JLabel btnItems;
    private javax.swing.JLabel btnMap;
    private javax.swing.JLabel btnPlayersRoom;
    private javax.swing.JLabel btnWeapons;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
