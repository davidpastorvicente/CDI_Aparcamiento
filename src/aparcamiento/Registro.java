/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.awt.Dimension;

/**
 *
 * @author david
 */
public class Registro extends javax.swing.JDialog {

    /**
     * Creates new form Registro
     */
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        pagoOpc.add(paypalButton);
        pagoOpc.add(tarjetaButton);
        tarjetaButton.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pagoOpc = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        materialTextField1 = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        materialTextField2 = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel3 = new javax.swing.JLabel();
        materialTextField3 = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel4 = new javax.swing.JLabel();
        materialTextField4 = new de.craften.ui.swingmaterial.MaterialTextField();
        jPanel3 = new javax.swing.JPanel();
        materialTextField5 = new de.craften.ui.swingmaterial.MaterialTextField();
        CancelarButton = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        materialTextField6 = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        materialTextField7 = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel9 = new javax.swing.JLabel();
        materialTextField8 = new de.craften.ui.swingmaterial.MaterialTextField();
        tarjetaButton = new javax.swing.JRadioButton();
        paypalButton = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(340, 290));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        materialTextField1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(materialTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 140, 69));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 101, 33));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Apellidos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 101, 33));

        materialTextField2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(materialTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 140, 69));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Correo:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 101, 33));

        materialTextField3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(materialTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 200, 69));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Móvil:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 101, 33));

        materialTextField4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(materialTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 140, 69));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 310));

        jPanel3.setMinimumSize(new java.awt.Dimension(340, 310));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        materialTextField5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        materialTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTextField5ActionPerformed(evt);
            }
        });
        jPanel3.add(materialTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 139, 20, 70));

        CancelarButton.setBackground(new java.awt.Color(255, 51, 51));
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(CancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 140, 70));

        aceptarButton.setBackground(new java.awt.Color(51, 204, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 70));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("caducidad:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Seleccionar método de pago:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 33));

        materialTextField6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(materialTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 90, 170, 60));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("CVV/CVC:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 33));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("/");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 10, 30));

        materialTextField7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        materialTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTextField7ActionPerformed(evt);
            }
        });
        jPanel3.add(materialTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 139, 40, 70));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 60, 30));

        materialTextField8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        materialTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialTextField8ActionPerformed(evt);
            }
        });
        jPanel3.add(materialTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 139, 20, 70));

        tarjetaButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        tarjetaButton.setText("Tarjeta bancaria");
        tarjetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaButtonActionPerformed(evt);
            }
        });
        jPanel3.add(tarjetaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        paypalButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        paypalButton.setText("PayPal");
        paypalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paypalButtonActionPerformed(evt);
            }
        });
        jPanel3.add(paypalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Número de tarjeta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 33));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 370, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        //transferirDatos        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void materialTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTextField7ActionPerformed

    private void materialTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTextField8ActionPerformed

    private void materialTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialTextField5ActionPerformed

    private void tarjetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaButtonActionPerformed
        // TODO add your handling code here:
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Seleccionar método de pago:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 200, 33));
        
        materialTextField5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(materialTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 139, 20, 70));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("caducidad:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Número de tarjeta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 33));

        materialTextField6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(materialTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 90, 170, 60));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("CVV/CVC:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 33));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setText("/");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 10, 30));

        materialTextField7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(materialTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 139, 40, 70));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 60, 30));

        materialTextField8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(materialTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 139, 20, 70));
        
        jPanel3.revalidate();
        jPanel3.repaint();
        pack();
    }//GEN-LAST:event_tarjetaButtonActionPerformed

    private void paypalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paypalButtonActionPerformed
        // TODO add your handling code here:
        jPanel3.remove(jLabel5);
        //jPanel3.remove(jLabel6);
        jPanel3.remove(jLabel7);
        jPanel3.remove(jLabel8);
        jPanel3.remove(materialTextField5);
        jPanel3.remove(materialTextField6);
        jPanel3.remove(materialTextField7);
        jPanel3.remove(materialTextField8);
        jPanel3.remove(jLabel9);

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Número de cuenta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 130, 33));

        materialTextField6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(materialTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 90, 170, 60));

        jPanel3.revalidate();
        jPanel3.repaint();
        pack();
    }//GEN-LAST:event_paypalButtonActionPerformed

    /**
     * @param args the command line arguments
     */

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
    private javax.swing.JPanel jPanel3;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField1;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField2;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField3;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField4;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField5;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField6;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField7;
    private de.craften.ui.swingmaterial.MaterialTextField materialTextField8;
    private javax.swing.ButtonGroup pagoOpc;
    private javax.swing.JRadioButton paypalButton;
    private javax.swing.JRadioButton tarjetaButton;
    // End of variables declaration//GEN-END:variables
}
