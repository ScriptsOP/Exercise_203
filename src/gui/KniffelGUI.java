/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.KniffelEntry;
import bl.KniffelTableModel;
import bl.KniffelTableRenderer;

/**
 *
 * @author JoZuG
 */
public class KniffelGUI extends javax.swing.JFrame {

    /**
     * Creates new form KniffelGUI
     */
    private KniffelTableModel ktmodel = new KniffelTableModel();
    
    public KniffelGUI() {
        initComponents();
        jtGewinnkarte.setModel(ktmodel);
        jtGewinnkarte.setDefaultRenderer(Object.class, new KniffelTableRenderer());
        
        ktmodel.addEntry(new KniffelEntry("Test", true, 10));
        ktmodel.addEntry(new KniffelEntry("Test", false, 20));
        ktmodel.addEntry(new KniffelEntry("Test", true, 30));
        ktmodel.addEntry(new KniffelEntry("Test", false, 0));
        ktmodel.addEntry(new KniffelEntry("Test", true, 5));
        ktmodel.addEntry(new KniffelEntry("Test", false, 25));
        ktmodel.addEntry(new KniffelEntry("Test", true, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDices = new javax.swing.JTable();
        btWürfeln = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtGewinnkarte = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tfObereSumme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfObererBonus = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfUntereSumme = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfGesamtPunkte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jtDices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtDices);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        btWürfeln.setText("Würfeln");
        btWürfeln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btWürfelnActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(btWürfeln, gridBagConstraints);

        jtGewinnkarte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtGewinnkarte);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jLabel1.setText("Obere Summe:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel1, gridBagConstraints);

        tfObereSumme.setEditable(false);
        tfObereSumme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfObereSummeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfObereSumme, gridBagConstraints);

        jLabel2.setText("Oberer Bonus:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel2, gridBagConstraints);

        tfObererBonus.setEditable(false);
        tfObererBonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfObererBonusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfObererBonus, gridBagConstraints);

        jLabel3.setText("Untere Summe:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel3, gridBagConstraints);

        tfUntereSumme.setEditable(false);
        tfUntereSumme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUntereSummeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfUntereSumme, gridBagConstraints);

        jLabel4.setText("Gesamt-Punkte:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(jLabel4, gridBagConstraints);

        tfGesamtPunkte.setEditable(false);
        tfGesamtPunkte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfGesamtPunkteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        getContentPane().add(tfGesamtPunkte, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUntereSummeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUntereSummeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUntereSummeActionPerformed

    private void tfObereSummeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfObereSummeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfObereSummeActionPerformed

    private void tfObererBonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfObererBonusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfObererBonusActionPerformed

    private void tfGesamtPunkteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfGesamtPunkteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfGesamtPunkteActionPerformed

    private void btWürfelnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btWürfelnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btWürfelnActionPerformed

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
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KniffelGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KniffelGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btWürfeln;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtDices;
    private javax.swing.JTable jtGewinnkarte;
    private javax.swing.JTextField tfGesamtPunkte;
    private javax.swing.JTextField tfObereSumme;
    private javax.swing.JTextField tfObererBonus;
    private javax.swing.JTextField tfUntereSumme;
    // End of variables declaration//GEN-END:variables
}