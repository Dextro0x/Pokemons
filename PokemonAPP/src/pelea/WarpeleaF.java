/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelea;

import static Cambiarmotes.WarmoteF.nomw;
import Interfaz.PokemonBatalla;
import Interfaz.pokemonsele.WartortleF;
import pokemonapp.Contrincante;
import pokemonapp.pokemon;

/**
 *
 * @author ASUS
 */
public class WarpeleaF extends javax.swing.JFrame {
    
    pokemon mipok = new pokemon(nomw);
    
    Contrincante rival = new Contrincante("Sceptile");

    /**
     * Creates new form Bullpelea
     */
    public WarpeleaF() {
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
           btpos1.setEnabled(false);
           btpos2.setEnabled(false);
           btpos3.setEnabled(false);
           jButton5.setEnabled(false);
       }
       if(rival.vida == 0){
           jTextArea1.append(rival.nombre + " ha sido derrotado "
                                     + mipok.nombre + " ha ganado.");
           
           jButton2.setEnabled(false);
           btpos1.setEnabled(false);
           btpos2.setEnabled(false);
           btpos3.setEnabled(false);
           jButton5.setEnabled(false);
       }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        nomen = new javax.swing.JLabel();
        btpos1 = new javax.swing.JButton();
        btpos2 = new javax.swing.JButton();
        btpos3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jmostrar = new javax.swing.JLabel();
        jblas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/entrenadora (3).gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 220, 290));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/racuaza.gif"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 210, 200));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/Wartortle..gif"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 150, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/contrincante.gif"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 180, 200));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 30));

        jButton2.setText("ATACAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jButton4.setText("VOLVER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jButton5.setText("RENDIRSE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 570, -1, -1));

        nomen.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nomen.setForeground(java.awt.Color.orange);
        getContentPane().add(nomen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 120, 20));

        btpos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/pocion (1) (1).gif"))); // NOI18N
        btpos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpos1ActionPerformed(evt);
            }
        });
        getContentPane().add(btpos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 30, 30));

        btpos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/pocion (1) (1).gif"))); // NOI18N
        btpos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpos2ActionPerformed(evt);
            }
        });
        getContentPane().add(btpos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 30, 30));

        btpos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/pocion (1) (1).gif"))); // NOI18N
        btpos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpos3ActionPerformed(evt);
            }
        });
        getContentPane().add(btpos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 30, 30));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 680, 200));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("1234567890");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 100, 20));

        jmostrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 60, 20));

        jblas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jblas, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CabuImagen/fondo de batalla.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        WartortleF wf = new WartortleF();
        wf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        PokemonBatalla pk = new PokemonBatalla();
        pk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String resultado = mipok.Atacar(rival);
        mipok.nombre = nomw;
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

    private void btpos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpos1ActionPerformed
        String mostrar = mipok.UsarHP(mipok);
        jTextArea1.append(mostrar + "\n");
        jmostrar.setText(mipok.Estado());
        btpos1.setEnabled(false);
    }//GEN-LAST:event_btpos1ActionPerformed

    private void btpos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpos2ActionPerformed
        String mostrar = mipok.UsarHP(mipok);
        jTextArea1.append(mostrar + "\n");
        jmostrar.setText(mipok.Estado());
        btpos2.setEnabled(false);
    }//GEN-LAST:event_btpos2ActionPerformed

    private void btpos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpos3ActionPerformed
        String mostrar = mipok.UsarHP(mipok);
        jTextArea1.append(mostrar + "\n");
        jmostrar.setText(mipok.Estado());
        btpos3.setEnabled(false);
    }//GEN-LAST:event_btpos3ActionPerformed

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
            java.util.logging.Logger.getLogger(WarpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarpeleaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WarpeleaF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btpos1;
    private javax.swing.JButton btpos2;
    private javax.swing.JButton btpos3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jblas;
    private javax.swing.JLabel jmostrar;
    private javax.swing.JLabel nomen;
    // End of variables declaration//GEN-END:variables
}
