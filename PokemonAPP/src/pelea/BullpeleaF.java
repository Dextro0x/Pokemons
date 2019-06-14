/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelea;

import Interfaz.PokemonBatalla;
import Interfaz.pokemonsele.BullbasaurF;
import pokemonapp.Contrincante;
import pokemonapp.pokemon;

/**
 *
 * @author ASUS
 */
public class BullpeleaF extends javax.swing.JFrame {
    pokemon mipok = new pokemon("Bullbasaur");
    
    Contrincante rival = new Contrincante("Moltres");
    
    public BullpeleaF() {
        initComponents();
        this.setLocationRelativeTo(null);
        PokemonBatalla po = new PokemonBatalla();
        nomen.setText(po.nombre);
        jmostrar.setText(mipok.Estado());
        jblas.setText(rival.Estado());
        
    }

    @SuppressWarnings("unchecked")
    void analizar(){
       if(mipok.vida == 0){
           jTextArea1.append(mipok.nombre + " ha sido derrotado "
                                    + rival.nombre + " ha ganado.");
           
           jButton2.setEnabled(false);
           pocion1.setEnabled(false);
           jButton9.setEnabled(false);
           jButton8.setEnabled(false);
           jButton4.setEnabled(false);
       }
       if(rival.vida == 0){
           jTextArea1.append(rival.nombre + " ha sido derrotado "
                                     + mipok.nombre + " ha ganado.");
           
           jButton2.setEnabled(false);
           pocion1.setEnabled(false);
           jButton9.setEnabled(false);
           jButton8.setEnabled(false);
           jButton4.setEnabled(false);
       }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nomen = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pocion1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txtnombref = new javax.swing.JLabel();
        jblas = new javax.swing.JLabel();
        jmostrar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/bulba_1.gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 150, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/contrincante.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 180, 200));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/moltres.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 210, 170));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 30));

        jButton2.setText("ATACAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jButton4.setText("RENDIRSE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, -1, -1));

        jButton5.setText("VOLVER");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        nomen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomen.setForeground(java.awt.Color.orange);
        getContentPane().add(nomen, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 100, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/entrenadora (3).gif"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 210, 280));

        pocion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/pocion (1) (1).gif"))); // NOI18N
        pocion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pocion1ActionPerformed(evt);
            }
        });
        getContentPane().add(pocion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 30, 30));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/pocion (1) (1).gif"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 30, 30));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/pocion (1) (1).gif"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 30, 30));

        txtnombref.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtnombref, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 90, 30));

        jblas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jblas, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 160, 30));

        jmostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 60, 30));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 720, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/fondo de batalla.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        BullbasaurF bf = new BullbasaurF();
        bf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        PokemonBatalla pk = new PokemonBatalla();
        pk.setVisible(true);
        this.setVisible(false);
               
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String mostrar = mipok.UsarHP(mipok);
        jTextArea1.append(mostrar + "\n");
        jmostrar.setText(mipok.Estado());
        jButton8.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String resultado = mipok.Atacar(rival);
        jTextArea1.append(resultado + "\n");
        int cont = 0;    
        int pos = (int)(Math.random()*100);
            if(cont < 3){
                if(pos < 25 && rival.vida <= 40){
                String resultado2 = rival.UsarHP(rival);
                jTextArea1.append(resultado2 + "\n");
                cont = cont + 1;
            }
            else{
                 String resultado2 = rival.Atacar(mipok);
                 jTextArea1.append(resultado2 + "\n");
            }
            
        }
        else{
            String resultado2 = rival.Atacar(mipok);
            jTextArea1.append(resultado2 + "\n");               
        }
        
       
        jmostrar.setText(mipok.Estado());
        jblas.setText(rival.Estado());
                
        
        analizar();                  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void pocion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pocion1ActionPerformed
        String mostrar = mipok.UsarHP(mipok);
        jTextArea1.append(mostrar + "\n");
        jmostrar.setText(mipok.Estado());
        pocion1.setEnabled(false);  
    }//GEN-LAST:event_pocion1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String mostrar = mipok.UsarHP(mipok);
        jTextArea1.append(mostrar + "\n");
        jmostrar.setText(mipok.Estado());
        jButton9.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(BullpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BullpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BullpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BullpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BullpeleaF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jblas;
    private javax.swing.JLabel jmostrar;
    private javax.swing.JLabel nomen;
    private javax.swing.JButton pocion1;
    public javax.swing.JLabel txtnombref;
    // End of variables declaration//GEN-END:variables

    private BullbasaurF BullbasaurF() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
