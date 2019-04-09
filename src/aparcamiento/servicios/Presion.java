/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.servicios;


/**
 *
 * @author jorge
 */
public class Presion extends javax.swing.JDialog {

    /**
     * Creates new form Co
     */
    public Presion(java.awt.Frame parent, boolean modal) {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ruedasButton = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        CancelarButton = new de.craften.ui.swingmaterial.MaterialButton();
        kms = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel6 = new javax.swing.JLabel();
        bar = new de.craften.ui.swingmaterial.MaterialTextField();
        materialButton1 = new de.craften.ui.swingmaterial.MaterialButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        hinchaRuedas = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        aceiteButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cambioAceite = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setPreferredSize(new java.awt.Dimension(506, 300));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/oil.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/car.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 30, -1));

        ruedasButton.setBackground(new java.awt.Color(255, 204, 0));
        ruedasButton.setBorder(null);
        ruedasButton.setText("         hinchado de neúmaticos");
        ruedasButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        ruedasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruedasButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ruedasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 280, 70));

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 140, 70));

        CancelarButton.setBackground(new java.awt.Color(255, 51, 51));
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel2.add(CancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 140, 70));

        kms.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        kms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmsActionPerformed(evt);
            }
        });
        kms.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                kmsKeyTyped(evt);
            }
        });
        jPanel2.add(kms, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 50, 60));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("Si desea usar alguna de las siguientes funciones, introduzca los campos indicados:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 460, -1));

        bar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        bar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barActionPerformed(evt);
            }
        });
        bar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                barKeyTyped(evt);
            }
        });
        jPanel2.add(bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 30, 60));

        materialButton1.setBackground(new java.awt.Color(0, 204, 204));
        materialButton1.setText("Analizar");
        materialButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(materialButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 130, 70));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 20, 140));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel5.setText("bares");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 50, -1));

        hinchaRuedas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(hinchaRuedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, 20));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel9.setText("Número de bares");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 170, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel11.setText("kms.");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 50, -1));

        aceiteButton.setBackground(new java.awt.Color(255, 204, 0));
        aceiteButton.setBorder(null);
        aceiteButton.setText("         cambio de aceite");
        aceiteButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        aceiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceiteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(aceiteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 70));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel12.setText("Número de kilómetros");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Resultado:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 100, -1));

        cambioAceite.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cambioAceite.setText("      ____");
        jPanel2.add(cambioAceite, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 240, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("marcado por el odómetro:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 170, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("marcado por el manómetro:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 180, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Servicio gratuito");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 90, 20));

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ruedasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruedasButtonActionPerformed
  
    }//GEN-LAST:event_ruedasButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void kmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kmsActionPerformed

    private void kmsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kmsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_kmsKeyTyped

    private void barActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_barActionPerformed

    private void barKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_barKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_barKeyTyped

    private void aceiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceiteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceiteButtonActionPerformed

    private void materialButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton1ActionPerformed
        if(!bar.getText().equals("")) {
            cambioAceite.setText("");
            if(Double.parseDouble(bar.getText()) > 2.1d || Double.parseDouble(bar.getText()) < 1.8d)
                hinchaRuedas.setText("- Es preciso hinchar los neumáticos");
            else
                hinchaRuedas.setText("- No es preciso hinchar los neumáticos");
        }
        else hinchaRuedas.setText("");
           
        if(!kms.getText().equals("")) {
            if(Double.parseDouble(kms.getText()) > 5000)
                cambioAceite.setText("- Es preciso cambiar el aceite");
            else
                cambioAceite.setText("- No es preciso cambiar el aceite");
        }
        else cambioAceite.setText("");
    }//GEN-LAST:event_materialButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Presion dialog = new Presion(new javax.swing.JFrame(), true);
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
    private de.craften.ui.swingmaterial.MaterialButton aceiteButton;
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private de.craften.ui.swingmaterial.MaterialTextField bar;
    private javax.swing.JLabel cambioAceite;
    private javax.swing.JLabel hinchaRuedas;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private de.craften.ui.swingmaterial.MaterialTextField kms;
    private de.craften.ui.swingmaterial.MaterialButton materialButton1;
    private de.craften.ui.swingmaterial.MaterialButton ruedasButton;
    // End of variables declaration//GEN-END:variables
}
