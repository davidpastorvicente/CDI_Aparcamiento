/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.servicios;

import java.awt.Color;

/**
 *
 * @author jorge
 */
public class Combustible1 extends javax.swing.JDialog {

    /**
     * Creates new form Co
     */
    public Combustible1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        materialButton4 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton5 = new de.craften.ui.swingmaterial.MaterialButton();
        materialTextField1 = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel5 = new javax.swing.JLabel();
        materialButton6 = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel7 = new javax.swing.JLabel();
        materialButton8 = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel6 = new javax.swing.JLabel();
        materialButton7 = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel8 = new javax.swing.JLabel();
        materialButton9 = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        CancelarButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setPreferredSize(new java.awt.Dimension(506, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Tipo de combustible:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 32));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Cantidad:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/drop.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/euro.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 30, -1));

        materialButton4.setBackground(new java.awt.Color(255, 204, 0));
        materialButton4.setBorder(null);
        materialButton4.setText("          LITROS");
        materialButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 140, 70));

        materialButton5.setBackground(new java.awt.Color(255, 204, 0));
        materialButton5.setText("          EUROS");
        materialButton5.setName(""); // NOI18N
        materialButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 140, 70));

        materialTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTextField1ActionPerformed(evt);
            }
        });
        materialTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                materialTextField1KeyTyped(evt);
            }
        });
        jPanel2.add(materialTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 30, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/600px-WV-95.svg.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        materialButton6.setBackground(new java.awt.Color(0, 204, 204));
        materialButton6.setBorder(null);
        materialButton6.setText("          Gasolina 95");
        materialButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/240px-WV-98.svg.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        materialButton8.setBackground(new java.awt.Color(0, 204, 204));
        materialButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/240px-WV-98.svg.png"))); // NOI18N
        materialButton8.setText("          Gasolina 98");
        materialButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 190, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/combustible.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        materialButton7.setBackground(new java.awt.Color(0, 204, 204));
        materialButton7.setText("          Diésel normal");
        materialButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diesel.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 30, -1));

        materialButton9.setBackground(new java.awt.Color(0, 204, 204));
        materialButton9.setText("          Diésel Efitec");
        materialButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, 70));

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 140, 70));

        CancelarButton.setBackground(new java.awt.Color(255, 51, 51));
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 140, 70));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel9.setText("seleccionada:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Precio de la gasolina");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 506, 288));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -8, 540, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTextField1ActionPerformed

    private void materialButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton4ActionPerformed
        materialButton4.setBackground(new java.awt.Color(204,153,0));        // TODO add your handling code here:
        materialButton4.setFont(new java.awt.Font("Roboto Medium", 1, 15));
        materialButton5.setBackground(new java.awt.Color(255, 204,0));        // TODO add your handling code here:
        materialButton5.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_materialButton4ActionPerformed

    private void materialButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton6ActionPerformed
        materialButton8.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton8.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton7.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton7.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton6.setBackground(new java.awt.Color(0, 153, 153));        // TODO add your handling code here:
        materialButton6.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        materialButton9.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton9.setFont(new java.awt.Font("Roboto Medium", 0, 14));
    }//GEN-LAST:event_materialButton6ActionPerformed

    private void materialButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton8ActionPerformed
        materialButton6.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton6.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton7.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton7.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton8.setBackground(new java.awt.Color(0, 153, 153));        // TODO add your handling code here:
        materialButton8.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        materialButton9.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton9.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        
    }//GEN-LAST:event_materialButton8ActionPerformed

    private void materialButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton7ActionPerformed
        materialButton6.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton6.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton8.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton8.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton7.setBackground(new java.awt.Color(0, 153, 153));        // TODO add your handling code here:
        materialButton7.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        materialButton9.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton9.setFont(new java.awt.Font("Roboto Medium", 0, 14));
    }//GEN-LAST:event_materialButton7ActionPerformed

    private void materialButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton9ActionPerformed
        materialButton6.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton6.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton7.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton7.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton9.setBackground(new java.awt.Color(0, 153, 153));        // TODO add your handling code here:
        materialButton9.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        materialButton8.setBackground(new java.awt.Color(0, 204, 204));        // TODO add your handling code here:
        materialButton8.setFont(new java.awt.Font("Roboto Medium", 0, 14));
    }//GEN-LAST:event_materialButton9ActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        //transferirDatos        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void materialButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton5ActionPerformed
        materialButton5.setBackground(new java.awt.Color(204,153,0));        // TODO add your handling code here:
        materialButton5.setFont(new java.awt.Font("Roboto Medium", 1, 15));
        materialButton4.setBackground(new java.awt.Color(255, 204,0));        // TODO add your handling code here:
        materialButton4.setFont(new java.awt.Font("Roboto Medium", 0, 14));
        materialButton5.setForeground(Color.WHITE);
    }//GEN-LAST:event_materialButton5ActionPerformed

    private void materialTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_materialTextField1KeyTyped
        if(materialTextField1.getText().length()>=2){
            evt.consume();
        }
    }//GEN-LAST:event_materialTextField1KeyTyped

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
            java.util.logging.Logger.getLogger(Combustible1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combustible1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combustible1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combustible1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Combustible1 dialog = new Combustible1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton CancelarButton;
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private de.craften.ui.swingmaterial.MaterialButton materialButton4;
    private de.craften.ui.swingmaterial.MaterialButton materialButton5;
    private de.craften.ui.swingmaterial.MaterialButton materialButton6;
    private de.craften.ui.swingmaterial.MaterialButton materialButton7;
    private de.craften.ui.swingmaterial.MaterialButton materialButton8;
    private de.craften.ui.swingmaterial.MaterialButton materialButton9;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField1;
    // End of variables declaration//GEN-END:variables
}