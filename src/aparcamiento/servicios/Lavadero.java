/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.servicios;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author david
 */
public class Lavadero extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Lavadero() {
        totalLavadero=null;
        lavDate=null;
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

        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        abrillButton = new de.craften.ui.swingmaterial.MaterialButton();
        encerButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel5 = new javax.swing.JLabel();
        interiorButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel7 = new javax.swing.JLabel();
        exteriorButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel6 = new javax.swing.JLabel();
        ambosButton = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        precio = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        euros = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        emberButton = new de.craften.ui.swingmaterial.MaterialButton();
        precio2 = new javax.swing.JLabel();
        precio3 = new javax.swing.JLabel();
        precio4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lavadero-de-coches (1).png"))); // NOI18N
        materialPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, 70));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("1. Seleccione una modalidad de lavado:");
        materialPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 32));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/abrill.png"))); // NOI18N
        materialPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 298, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/encer.png"))); // NOI18N
        materialPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 353, 30, -1));

        abrillButton.setBackground(new java.awt.Color(255, 204, 0));
        abrillButton.setBorder(null);
        abrillButton.setEnabled(false);
        abrillButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        abrillButton.setLabel("      ABRILLANTADO");
        abrillButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrillButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(abrillButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 220, 70));

        encerButton.setBackground(new java.awt.Color(255, 204, 0));
        encerButton.setEnabled(false);
        encerButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        encerButton.setLabel("      ENCERADO DE CARROCERÍA");
        encerButton.setName(""); // NOI18N
        encerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encerButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(encerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 335, 320, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/inside.png"))); // NOI18N
        materialPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 158, -1, -1));

        interiorButton.setBackground(new java.awt.Color(0, 204, 204));
        interiorButton.setBorder(null);
        interiorButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        interiorButton.setLabel("      Interior");
        interiorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interiorButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(interiorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 180, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/outside.png"))); // NOI18N
        materialPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 158, -1, -1));

        exteriorButton.setBackground(new java.awt.Color(0, 204, 204));
        exteriorButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/240px-WV-98.svg.png"))); // NOI18N
        exteriorButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        exteriorButton.setLabel("      Exterior");
        exteriorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exteriorButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(exteriorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 180, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/both.png"))); // NOI18N
        materialPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 158, -1, -1));

        ambosButton.setBackground(new java.awt.Color(0, 204, 204));
        ambosButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        ambosButton.setLabel("      Ambos");
        ambosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambosButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(ambosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 170, 70));

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.setEnabled(false);
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 390, 140, 70));

        precio.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        precio.setText("-");
        materialPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 40, -1));

        precio1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        precio1.setText("(+ 0,10 €)");
        materialPanel1.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Precio de la modalidad seleccionada:");
        materialPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 215, -1, -1));

        euros.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        euros.setText(" 0,00 €");
        euros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        materialPanel1.add(euros, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 330, 80, 50));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("2. Escoja los servicios adicionales que desee:");
        materialPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 360, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/embell.png"))); // NOI18N
        materialPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 408, 30, -1));

        emberButton.setBackground(new java.awt.Color(255, 204, 0));
        emberButton.setEnabled(false);
        emberButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        emberButton.setLabel("      Embellecimiento de neumáticos");
        emberButton.setName(""); // NOI18N
        emberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emberButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(emberButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 380, 70));

        precio2.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        precio2.setText("€");
        materialPanel1.add(precio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        precio3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        precio3.setText("(+ 0,15 €)");
        materialPanel1.add(precio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        precio4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        precio4.setText("(+ 0,20 €)");
        materialPanel1.add(precio4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 365, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setText(" Lavadero de vehículos");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        materialPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 260, 50));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("El total a pagar es:");
        materialPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 300, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(materialPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(materialPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abrillButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrillButtonActionPerformed
        if (aux1) {
            abrillButton.setBackground(new java.awt.Color(204, 153, 0));
            abrillButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
            abrillButton.setForeground(Color.WHITE);
            price += 0.15;
        } else {
            abrillButton.setBackground(new java.awt.Color(255, 204, 0));
            abrillButton.setFont(new java.awt.Font("Roboto", 0, 16));
            price -= 0.15;
        }
        euros.setText(" " + String.format("%.2f", price) + " €");
        aux1 = !aux1;
    }//GEN-LAST:event_abrillButtonActionPerformed

    private void encerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encerButtonActionPerformed
        if (aux2) {
            encerButton.setBackground(new java.awt.Color(204, 153, 0));
            encerButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
            encerButton.setForeground(Color.WHITE);
            price += 0.20;
        } else {
            encerButton.setBackground(new java.awt.Color(255, 204, 0));
            encerButton.setFont(new java.awt.Font("Roboto", 0, 16));
            price -= 0.20;
        }
        euros.setText(" " + String.format("%.2f", price) + " €");
        aux2 = !aux2;
    }//GEN-LAST:event_encerButtonActionPerformed

    private void interiorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interiorButtonActionPerformed
        exteriorButton.setBackground(new java.awt.Color(0, 204, 204));
        exteriorButton.setFont(new java.awt.Font("Roboto", 0, 16));
        ambosButton.setBackground(new java.awt.Color(0, 204, 204));
        ambosButton.setFont(new java.awt.Font("Roboto", 0, 16));
        interiorButton.setBackground(new java.awt.Color(0, 153, 153));
        interiorButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        price = 1;
        precio.setText("1,00");
        euros.setText(" 1,00 €");
        abrillButton.setEnabled(true);
        emberButton.setEnabled(true);
        encerButton.setEnabled(true);
        aceptarButton.setEnabled(true);
        abrillButton.setEnabled(true);
        abrillButton.setBackground(new java.awt.Color(255, 204, 0));
        abrillButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux1 = true;
        encerButton.setBackground(new java.awt.Color(255, 204, 0));
        encerButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux2 = true;
        emberButton.setBackground(new java.awt.Color(255, 204, 0));
        emberButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux3 = true;
    }//GEN-LAST:event_interiorButtonActionPerformed

    private void exteriorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exteriorButtonActionPerformed
        interiorButton.setBackground(new java.awt.Color(0, 204, 204));
        interiorButton.setFont(new java.awt.Font("Roboto", 0, 16));
        ambosButton.setBackground(new java.awt.Color(0, 204, 204));
        ambosButton.setFont(new java.awt.Font("Roboto", 0, 16));
        exteriorButton.setBackground(new java.awt.Color(0, 153, 153));
        exteriorButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        price = 1.50;
        precio.setText("1,50");
        euros.setText(" 1,50 €");
        abrillButton.setEnabled(true);
        emberButton.setEnabled(true);
        encerButton.setEnabled(true);
        aceptarButton.setEnabled(true);
        abrillButton.setBackground(new java.awt.Color(255, 204, 0));
        abrillButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux1 = true;
        encerButton.setBackground(new java.awt.Color(255, 204, 0));
        encerButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux2 = true;
        emberButton.setBackground(new java.awt.Color(255, 204, 0));
        emberButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux3 = true;
    }//GEN-LAST:event_exteriorButtonActionPerformed

    private void ambosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambosButtonActionPerformed
        interiorButton.setBackground(new java.awt.Color(0, 204, 204));
        interiorButton.setFont(new java.awt.Font("Roboto", 0, 16));
        exteriorButton.setBackground(new java.awt.Color(0, 204, 204));
        exteriorButton.setFont(new java.awt.Font("Roboto", 0, 16));
        ambosButton.setBackground(new java.awt.Color(0, 153, 153));
        ambosButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        price = 1.9;
        precio.setText("1,90");
        euros.setText(" 1,90 €");
        abrillButton.setEnabled(true);
        emberButton.setEnabled(true);
        encerButton.setEnabled(true);
        aceptarButton.setEnabled(true);
        abrillButton.setBackground(new java.awt.Color(255, 204, 0));
        abrillButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux1 = true;
        encerButton.setBackground(new java.awt.Color(255, 204, 0));
        encerButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux2 = true;
        emberButton.setBackground(new java.awt.Color(255, 204, 0));
        emberButton.setFont(new java.awt.Font("Roboto", 0, 16));
        aux3 = true;
    }//GEN-LAST:event_ambosButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        totalLavadero = euros.getText();
        lavDate= new Date(System.currentTimeMillis());
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void emberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emberButtonActionPerformed
        if (aux3) {
            emberButton.setBackground(new java.awt.Color(204, 153, 0));
            emberButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
            emberButton.setForeground(Color.WHITE);
            price += 0.10;

        } else {
            emberButton.setBackground(new java.awt.Color(255, 204, 0));
            emberButton.setFont(new java.awt.Font("Roboto", 0, 16));
            price -= 0.10;
        }
        euros.setText(" " + String.format("%.2f", price) + " €");
        aux3 = !aux3;
    }//GEN-LAST:event_emberButtonActionPerformed

    public de.craften.ui.swingmaterial.MaterialPanel getPanel() {
        return materialPanel1;
    }

    public static String totalLavadero;
    public static double price;
    private boolean aux1, aux2, aux3;
    public static Date lavDate;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton abrillButton;
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private de.craften.ui.swingmaterial.MaterialButton ambosButton;
    private de.craften.ui.swingmaterial.MaterialButton emberButton;
    private de.craften.ui.swingmaterial.MaterialButton encerButton;
    private javax.swing.JLabel euros;
    private de.craften.ui.swingmaterial.MaterialButton exteriorButton;
    private de.craften.ui.swingmaterial.MaterialButton interiorButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precio1;
    private javax.swing.JLabel precio2;
    private javax.swing.JLabel precio3;
    private javax.swing.JLabel precio4;
    // End of variables declaration//GEN-END:variables
}
