/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.pokemonsele;

import Atxy2k.CustomTextField.RestrictedTextField;
import Interfaz.Femenino;
import pelea.WarpeleaF;

/**
 *
 * @author ASUS
 */
public class WartortleF extends javax.swing.JFrame {

    /**
     * Creates new form Bullbasaur
     */
    public WartortleF() {
        initComponents();
        this.setLocationRelativeTo(null);
        Deshabilitar();
        RestrictedTextField r = new RestrictedTextField(motewarF);
        r.setLimit(10);
    }
    public void Habiliitar(){
        motewarF.setEnabled(true);
    }
    public void Deshabilitar(){
        motewarF.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mygroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        motewarF = new javax.swing.JTextField();
        jsigu = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnsi = new javax.swing.JRadioButton();
        btno = new javax.swing.JRadioButton();
        warno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Genial has elegido ha Wartortle, Desea ponerle un mote ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 26));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Wartortle..gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 100, 100));
        getContentPane().add(motewarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 90, -1));

        jsigu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-flecha-filled-50 (1).png"))); // NOI18N
        jsigu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsiguActionPerformed(evt);
            }
        });
        getContentPane().add(jsigu, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 50, 30));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-volver-32.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 50, 30));

        mygroup.add(btnsi);
        btnsi.setText("SI");
        btnsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsiActionPerformed(evt);
            }
        });
        getContentPane().add(btnsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        mygroup.add(btno);
        btno.setText("NO");
        btno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoActionPerformed(evt);
            }
        });
        getContentPane().add(btno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, -1));

        warno.setForeground(java.awt.Color.red);
        getContentPane().add(warno, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsiActionPerformed
        Habiliitar();
    }//GEN-LAST:event_btnsiActionPerformed

    private void btnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoActionPerformed
        Deshabilitar();
        if(motewarF.getText().isEmpty()){
            warno.setText("");
        }
    }//GEN-LAST:event_btnoActionPerformed

    private void jsiguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsiguActionPerformed
        WarpeleaF wp = new WarpeleaF();
        if(btnsi.isSelected() && motewarF.getText().isEmpty()){
            wp.setVisible(false);
            warno.setText("requerido");
        }
        if(btnsi.isSelected() && !motewarF.getText().isEmpty()){
            wp.setVisible(true);
        }
        if(btno.isSelected()){
            wp.setVisible(true);
        }
    }//GEN-LAST:event_jsiguActionPerformed

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
            java.util.logging.Logger.getLogger(WartortleF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WartortleF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WartortleF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WartortleF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WartortleF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btno;
    private javax.swing.JRadioButton btnsi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jsigu;
    private javax.swing.JTextField motewarF;
    private javax.swing.ButtonGroup mygroup;
    private javax.swing.JLabel warno;
    // End of variables declaration//GEN-END:variables
}
