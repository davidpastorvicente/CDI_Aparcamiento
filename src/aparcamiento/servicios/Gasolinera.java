/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.servicios;

import aparcamiento.parkings.*;
import java.awt.Color;
import java.util.Date;

/**
 *
 * @author david
 */
public class Gasolinera extends javax.swing.JFrame {

    Parking p;

    /**
     * Creates new form NewJFrame
     *
     * @param p
     */
    public Gasolinera(Parking p) {
        totalCombustible = null;
        gasDate = null;
        this.p = p;
        initComponents();
        materialPanel1.remove(cancelarButton);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        litrosButton = new de.craften.ui.swingmaterial.MaterialButton();
        eurosButton = new de.craften.ui.swingmaterial.MaterialButton();
        cantidad = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel5 = new javax.swing.JLabel();
        gasolina95button = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel7 = new javax.swing.JLabel();
        gasolina98button = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel6 = new javax.swing.JLabel();
        dieselButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel8 = new javax.swing.JLabel();
        efitecButton = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        precio = new javax.swing.JLabel();
        precio1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        euros = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        calcular = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cancelarButton = new de.craften.ui.swingmaterial.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(960, 490));

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("1. Elija el tipo de combustible:");
        materialPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, 32));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("2. Seleccione el modo:");
        materialPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 200, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/drop.png"))); // NOI18N
        materialPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 298, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/euro.png"))); // NOI18N
        materialPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 298, 30, -1));

        litrosButton.setBackground(new java.awt.Color(255, 204, 0));
        litrosButton.setBorder(null);
        litrosButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        litrosButton.setLabel("      LITROS");
        litrosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                litrosButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(litrosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 170, 70));

        eurosButton.setBackground(new java.awt.Color(255, 204, 0));
        eurosButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        eurosButton.setLabel("      EUROS");
        eurosButton.setName(""); // NOI18N
        eurosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eurosButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(eurosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, 70));

        cantidad.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        materialPanel1.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 30, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/600px-WV-95.svg.png"))); // NOI18N
        materialPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 158, -1, -1));

        gasolina95button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina95button.setBorder(null);
        gasolina95button.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        gasolina95button.setLabel("      Gasolina 95");
        gasolina95button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gasolina95buttonActionPerformed(evt);
            }
        });
        materialPanel1.add(gasolina95button, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 210, 70));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/240px-WV-98.svg.png"))); // NOI18N
        materialPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 158, -1, -1));

        gasolina98button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina98button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/240px-WV-98.svg.png"))); // NOI18N
        gasolina98button.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        gasolina98button.setLabel("      Gasolina 98");
        gasolina98button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gasolina98buttonActionPerformed(evt);
            }
        });
        materialPanel1.add(gasolina98button, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 210, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/combustible.png"))); // NOI18N
        materialPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 158, -1, -1));

        dieselButton.setBackground(new java.awt.Color(0, 204, 204));
        dieselButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        dieselButton.setLabel("      Diésel normal");
        dieselButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dieselButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(dieselButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 230, 70));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/diesel.png"))); // NOI18N
        materialPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 158, 30, -1));

        efitecButton.setBackground(new java.awt.Color(0, 204, 204));
        efitecButton.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        efitecButton.setLabel("      Diésel Efitec");
        efitecButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efitecButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(efitecButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 220, 70));

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Añadir servicio");
        aceptarButton.setEnabled(false);
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 190, 70));

        precio.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        precio.setText("-");
        materialPanel1.add(precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 50, -1));

        precio1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        precio1.setText("€/litro");
        materialPanel1.add(precio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel12.setText("Precio de la gasolina seleccionada:");
        materialPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 215, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel14.setText("El total a pagar es:");
        materialPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 150, -1));

        euros.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        euros.setText(" 00,00 € (00,00 litros)");
        euros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        materialPanel1.add(euros, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 330, 235, 50));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel9.setText("3. Introduzca la cantidad:");
        materialPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 200, -1));

        calcular.setBackground(new java.awt.Color(204, 0, 102));
        calcular.setText("Calcular coste");
        calcular.setFont(new java.awt.Font("Roboto Medium", 1, 16)); // NOI18N
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });
        materialPanel1.add(calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 220, 70));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel10.setText(" Surtidor de combustible");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        materialPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 275, 50));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gasolinera (1).png"))); // NOI18N
        materialPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 30, -1, 70));

        cancelarButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelarButton.setText("Cancelar servicio");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 190, 70));

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

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        if (opc == 0) {
            totalCombustible = String.format("%.2f", Double.parseDouble(cantidad.getText()) * price) + " €";
        } else {
            totalCombustible = String.format("%.2f", Double.parseDouble(cantidad.getText())) + " €";
        }
        Confirmacion1 conf = new Confirmacion1(this, true, true, p);
        p.activarSombra(conf);
        if (conf.getSi()) {
            materialPanel1.remove(aceptarButton);
            materialPanel1.add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 190, 70));
            revalidate();
            repaint();
            pack();
        }
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void efitecButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efitecButtonActionPerformed
        gasolina95button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina95button.setFont(new java.awt.Font("Roboto", 0, 16));
        dieselButton.setBackground(new java.awt.Color(0, 204, 204));
        dieselButton.setFont(new java.awt.Font("Roboto", 0, 16));
        efitecButton.setBackground(new java.awt.Color(0, 153, 153));
        efitecButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        gasolina98button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina98button.setFont(new java.awt.Font("Roboto", 0, 16));
        price = 1.115;
        precio.setText("1,115");
    }//GEN-LAST:event_efitecButtonActionPerformed

    private void dieselButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dieselButtonActionPerformed
        gasolina95button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina95button.setFont(new java.awt.Font("Roboto", 0, 16));
        gasolina98button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina98button.setFont(new java.awt.Font("Roboto", 0, 16));
        dieselButton.setBackground(new java.awt.Color(0, 153, 153));
        dieselButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        efitecButton.setBackground(new java.awt.Color(0, 204, 204));
        efitecButton.setFont(new java.awt.Font("Roboto", 0, 16));
        price = 1.023;
        precio.setText("1,023");
    }//GEN-LAST:event_dieselButtonActionPerformed

    private void gasolina98buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gasolina98buttonActionPerformed
        gasolina95button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina95button.setFont(new java.awt.Font("Roboto", 0, 16));
        dieselButton.setBackground(new java.awt.Color(0, 204, 204));
        dieselButton.setFont(new java.awt.Font("Roboto", 0, 16));
        gasolina98button.setBackground(new java.awt.Color(0, 153, 153));
        gasolina98button.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        efitecButton.setBackground(new java.awt.Color(0, 204, 204));
        efitecButton.setFont(new java.awt.Font("Roboto", 0, 16));
        price = 1.317;
        precio.setText("1,317");
    }//GEN-LAST:event_gasolina98buttonActionPerformed

    private void gasolina95buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gasolina95buttonActionPerformed
        gasolina98button.setBackground(new java.awt.Color(0, 204, 204));
        gasolina98button.setFont(new java.awt.Font("Roboto", 0, 16));
        dieselButton.setBackground(new java.awt.Color(0, 204, 204));
        dieselButton.setFont(new java.awt.Font("Roboto", 0, 16));
        gasolina95button.setBackground(new java.awt.Color(0, 153, 153));
        gasolina95button.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        efitecButton.setBackground(new java.awt.Color(0, 204, 204));
        efitecButton.setFont(new java.awt.Font("Roboto", 0, 16));
        price = 1.232;
        precio.setText("1,232");
    }//GEN-LAST:event_gasolina95buttonActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        char c = evt.getKeyChar();
        if (cantidad.getText().length() >= 2 || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void eurosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eurosButtonActionPerformed
        eurosButton.setBackground(new java.awt.Color(204, 153, 0));
        eurosButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        litrosButton.setBackground(new java.awt.Color(255, 204, 0));
        litrosButton.setFont(new java.awt.Font("Roboto", 0, 16));
        eurosButton.setForeground(Color.WHITE);
        opc = 1;

    }//GEN-LAST:event_eurosButtonActionPerformed

    private void litrosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_litrosButtonActionPerformed
        litrosButton.setBackground(new java.awt.Color(204, 153, 0));
        litrosButton.setFont(new java.awt.Font("Roboto Medium", 1, 16));
        eurosButton.setBackground(new java.awt.Color(255, 204, 0));
        eurosButton.setFont(new java.awt.Font("Roboto", 0, 16));
        litrosButton.setForeground(Color.WHITE);
        opc = 0;

    }//GEN-LAST:event_litrosButtonActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        if (!cantidad.getText().equals("")) {
            if (opc == 0) {
                totalCombustible = String.format("%.2f", Double.parseDouble(cantidad.getText()) * price) + " €";
                price2 = Double.parseDouble(cantidad.getText()) * price;
                euros.setText(" " + totalCombustible + " (" + String.format("%.2f", Double.parseDouble(cantidad.getText())) + " litros)");
            } else if (opc == 1) {
                totalCombustible = String.format("%.2f", Double.parseDouble(cantidad.getText())) + " €";
                price2 = Double.parseDouble(cantidad.getText());
                euros.setText(" " + totalCombustible + " (" + String.format("%.2f", Double.parseDouble(cantidad.getText()) / price) + " litros)");
            }
            aceptarButton.setEnabled(true);
        }
    }//GEN-LAST:event_calcularActionPerformed

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        Confirmacion4 conf = new Confirmacion4(this, true, false, p);
        p.activarSombra(conf);
        if (conf.getSi()) {
            materialPanel1.remove(cancelarButton);
            materialPanel1.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 390, 190, 70));
            Gasolinera.reset();
        }
    }//GEN-LAST:event_cancelarButtonActionPerformed

    public de.craften.ui.swingmaterial.MaterialPanel getPanel() {
        return materialPanel1;
    }

    public static void reset() {
        totalCombustible = null;
        gasDate = null;
    }

    public static String totalCombustible;
    public static double price, price2;
    private int opc;
    public static Date gasDate;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private de.craften.ui.swingmaterial.MaterialButton calcular;
    private de.craften.ui.swingmaterial.MaterialButton cancelarButton;
    private de.craften.ui.swingmaterial.MaterialTextField cantidad;
    private de.craften.ui.swingmaterial.MaterialButton dieselButton;
    private de.craften.ui.swingmaterial.MaterialButton efitecButton;
    private javax.swing.JLabel euros;
    private de.craften.ui.swingmaterial.MaterialButton eurosButton;
    private de.craften.ui.swingmaterial.MaterialButton gasolina95button;
    private de.craften.ui.swingmaterial.MaterialButton gasolina98button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private de.craften.ui.swingmaterial.MaterialButton litrosButton;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    private javax.swing.JLabel precio;
    private javax.swing.JLabel precio1;
    // End of variables declaration//GEN-END:variables
}
