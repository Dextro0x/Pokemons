/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.pokemonsele;

import Atxy2k.CustomTextField.RestrictedTextField;
import Interfaz.masculino;
import pelea.Charpelea;

/**
 *
 * @author ASUS
 */
public class Charmander extends javax.swing.JFrame {

    /**
     * Creates new form Bullbasaur
     */
    public Charmander() {
        initComponents();
        this.setLocationRelativeTo(null);
        Deshabilitar();
        RestrictedTextField r = new RestrictedTextField(motechar);
        r.setLimit(10);
        jsigu.setEnabled(false);
    }
    public void Habilitar(){
        motechar.setEnabled(true);
    }
    public void Deshabilitar(){
        motechar.setEnabled(false);
    }   
    public void habilitarsiguient(){
        if(btsi.isSelected() || btno.isSelected()){
            jsigu.setEnabled(true);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        motechar = new javax.swing.JTextField();
        jsigu = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btsi = new javax.swing.JRadioButton();
        btno = new javax.swing.JRadioButton();
        jprint = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Genial has elegido ha Charmeleon, Desea ponerle un mote ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 26));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/charmander.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 180, 130));
        getContentPane().add(motechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 80, -1));

        jsigu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-flecha-filled-50 (1).png"))); // NOI18N
        jsigu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsiguActionPerformed(evt);
            }
        });
        getContentPane().add(jsigu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 50, 30));

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
        getContentPane().add(btsi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 50, 20));

        buttonGroup1.add(btno);
        btno.setText("NO");
        btno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoActionPerformed(evt);
            }
        });
        getContentPane().add(btno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 50, 20));

        jprint.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jprint.setForeground(java.awt.Color.red);
        getContentPane().add(jprint, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 80, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsiActionPerformed
        Habilitar();
        habilitarsiguient();
    }//GEN-LAST:event_btsiActionPerformed

    private void btnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoActionPerformed
        Deshabilitar();
        habilitarsiguient();
        if(motechar.getText().isEmpty()){
            jprint.setText("");
                    
        }
    }//GEN-LAST:event_btnoActionPerformed

    private void jsiguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsiguActionPerformed
        Charpelea cp = new Charpelea();
        
        if(btsi.isSelected() && motechar.getText().isEmpty()){
            cp.setVisible(false);
            jprint.setText("*requerido");                  
        }
        if(btsi.isSelected() && !motechar.getText().isEmpty()){
            cp.setVisible(true);
            this.setVisible(false);
        }
        if(btno.isSelected()){
            cp.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jsiguActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        masculino m = new masculino();
        m.setVisible(true);
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
            java.util.logging.Logger.getLogger(Charmander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Charmander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Charmander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Charmander.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Charmander().setVisible(true);
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
    private javax.swing.JButton jsigu;
    private javax.swing.JTextField motechar;
    // End of variables declaration//GEN-END:variables
}
