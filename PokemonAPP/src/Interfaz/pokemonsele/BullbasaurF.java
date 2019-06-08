/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.pokemonsele;

import Atxy2k.CustomTextField.RestrictedTextField;
import Interfaz.Femenino;
import pelea.BullpeleaF;

/**
 *
 * @author ASUS
 */
public class BullbasaurF extends javax.swing.JFrame {

    /**
     * Creates new form Bullbasaur
     */
    public BullbasaurF() {
        initComponents();
        this.setLocationRelativeTo(null);
        Deshabilitar();
        RestrictedTextField r = new RestrictedTextField(motebulF);
        r.setLimit(10);
        jsigui.setEnabled(false);
    }
    public void Habilitar(){
        motebulF.setEnabled(true);
    }
    public void Deshabilitar(){
        motebulF.setEnabled(false);
    }
    public void habsigui(){
        if(btsi.isSelected() || btno.isSelected()){
            jsigui.setEnabled(true);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        motebulF = new javax.swing.JTextField();
        jsigui = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btsi = new javax.swing.JRadioButton();
        btno = new javax.swing.JRadioButton();
        jprint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Genial has elegido ha Bullbasaur, Desea ponerle un mote ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 26));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bulba_1.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, 120));
        getContentPane().add(motebulF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 90, -1));

        jsigui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-flecha-filled-50 (1).png"))); // NOI18N
        jsigui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsiguiActionPerformed(evt);
            }
        });
        getContentPane().add(jsigui, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 50, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-volver-32.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 50, 30));

        buttonGroup1.add(btsi);
        btsi.setText("SI");
        btsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsiActionPerformed(evt);
            }
        });
        getContentPane().add(btsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 50, 20));

        buttonGroup1.add(btno);
        btno.setText("NO");
        btno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoActionPerformed(evt);
            }
        });
        getContentPane().add(btno, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 50, 20));

        jprint.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jprint.setForeground(java.awt.Color.red);
        jprint.setToolTipText("");
        getContentPane().add(jprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiActionPerformed
        Habilitar();
        habsigui();
    }//GEN-LAST:event_btsiActionPerformed

    private void btnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoActionPerformed
        Deshabilitar();
        habsigui();
        if(motebulF.getText().isEmpty()){
            jprint.setText("");
        }
    }//GEN-LAST:event_btnoActionPerformed

    private void jsiguiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsiguiActionPerformed
        BullpeleaF bf = new BullpeleaF();
        
        if(btsi.isSelected() && motebulF.getText().isEmpty()){
            bf.setVisible(false);
            jprint.setText("*requerido");           
        }
        if(btsi.isSelected() && !motebulF.getText().isEmpty()){
            bf.setVisible(true);
            this.setVisible(false);
        }
        if(btno.isSelected()){
            bf.setVisible(true);
            this.setVisible(false);
        }
        
    }//GEN-LAST:event_jsiguiActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Femenino f = new Femenino();
        f.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(BullbasaurF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BullbasaurF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BullbasaurF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BullbasaurF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BullbasaurF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btno;
    private javax.swing.JRadioButton btsi;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jprint;
    private javax.swing.JButton jsigui;
    private javax.swing.JTextField motebulF;
    // End of variables declaration//GEN-END:variables
}
