/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pandora;

import java.util.Arrays;

/**
 *
 * @author projexter
 */
public class Wizard extends javax.swing.JDialog {

    private 
            String[] game_name_;
            int number_of_players_;
            int width_;
            int height_;
            int dizes_;
            int dizes_count_;
            
    public
            String giveName;
            String givePlayers;
            String giveWidth;
            String giveHeight;
            String giveDizes;
            String giveDizesCount;
            
    /**
     * Creates new form Wizard
     */
    public Wizard(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        t_number_of_players.removeAllItems();
        for(int i = 1; i <= 5; i++)
        {
          t_number_of_players.addItem(i);
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

        game_name_lab = new javax.swing.JLabel();
        t_game_name_ = new javax.swing.JTextField();
        number_of_players_lab = new javax.swing.JLabel();
        t_number_of_players = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        number_of_players_lab1 = new javax.swing.JLabel();
        t_width = new javax.swing.JTextField();
        t_height = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        error_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_dizes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_dizes_max_val = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        t_token = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        game_name_lab.setText("Name des Spieles:");

        t_game_name_.setText("Spielnamen eingeben");

        number_of_players_lab.setText("Spieleranzahl:");

        t_number_of_players.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        t_number_of_players.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_number_of_playersActionPerformed(evt);
            }
        });

        jLabel1.setText("Hier können Sie die Grundeigenschaften zum Spiel eintragen:");

        number_of_players_lab1.setText("Spielfeldgröße (BxH):");

        t_width.setText("10");

        t_height.setText("10");
        t_height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_heightActionPerformed(evt);
            }
        });

        jLabel2.setText("x");

        jLabel3.setText("(max. 32x32 Felder)");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        error_label.setForeground(new java.awt.Color(204, 0, 0));
        error_label.setText("-");

        jLabel4.setText("Anzahl der Würfel:");

        t_dizes.setText("1");
        t_dizes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dizesActionPerformed(evt);
            }
        });

        jLabel5.setText("Augenzahl der Würfel:");

        t_dizes_max_val.setText("6");
        t_dizes_max_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dizes_max_valActionPerformed(evt);
            }
        });

        jLabel6.setText("(von 2 - 20)");

        jLabel7.setText("Anzahl Spielfiguren pro Spieler:");

        t_token.setText("4");
        t_token.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_tokenActionPerformed(evt);
            }
        });

        jLabel8.setText("(von 1 - 128)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(t_token, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(number_of_players_lab1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(number_of_players_lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(game_name_lab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t_number_of_players, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t_game_name_, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(t_width, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(t_height, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel3))
                                            .addComponent(t_dizes, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(t_dizes_max_val, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(game_name_lab)
                        .addComponent(t_game_name_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_number_of_players, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(number_of_players_lab))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_height, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number_of_players_lab1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_dizes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_dizes_max_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_token, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t_number_of_playersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_number_of_playersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_number_of_playersActionPerformed

    private void t_heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_heightActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    width_ = Integer.parseInt(t_width.getText());
    height_ = Integer.parseInt(t_height.getText());
    
    if(width_ > 32)
    {     
        error_label.setText("Breite zu groß: Diese Breite is voll zu breit, Alter");
        return;
    }
    else if(height_ > 32)
    {
        error_label.setText("Höhe zu groß: Diese Höhe geht voll nicht");
        return;
    }
    
            // TODO add your handling code here:
    
        giveName = Arrays.toString(game_name_);
        givePlayers = "" + number_of_players_;
        giveWidth = "" + width_;
        giveHeight = "" + height_;
        giveDizes = "" + dizes_;
        giveDizesCount = "" + dizes_count_;
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t_dizesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dizesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_dizesActionPerformed

    private void t_dizes_max_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dizes_max_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_dizes_max_valActionPerformed

    private void t_tokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_tokenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_tokenActionPerformed

    /**
     * @param args the command line arguments
     */
    /*
    public static void main(String args[]) {
        // Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Wizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Wizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Wizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Wizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the dialog 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Wizard dialog = new Wizard(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error_label;
    private javax.swing.JLabel game_name_lab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel number_of_players_lab;
    private javax.swing.JLabel number_of_players_lab1;
    private javax.swing.JTextField t_dizes;
    private javax.swing.JTextField t_dizes_max_val;
    private javax.swing.JTextField t_game_name_;
    private javax.swing.JTextField t_height;
    private javax.swing.JComboBox t_number_of_players;
    private javax.swing.JTextField t_token;
    private javax.swing.JTextField t_width;
    // End of variables declaration//GEN-END:variables
}
