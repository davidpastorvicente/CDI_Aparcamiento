/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.parkings;

/**
 *
 * @author david
 */
public class URJC extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public URJC() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel2 = new javax.swing.JLabel();
        materialButton9 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton13 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton14 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton15 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton16 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton17 = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parking \"Universidad Rey Juan Carlos\"");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 630, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 100));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gasolinera (1).png"))); // NOI18N
        jLabel3.setText(" Gasolinera");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lavadero-de-coches (1).png"))); // NOI18N
        jLabel4.setText(" Lavadero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/presion (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aceite (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel7.setText("Nivel de aire");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel8.setText("y aceite");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 220, 500));

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione la planta :");
        materialPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, 30));

        materialButton9.setBackground(new java.awt.Color(204, 204, 204));
        materialButton9.setText("Planta 1");
        materialButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton9ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 60));

        materialButton13.setBackground(new java.awt.Color(204, 204, 204));
        materialButton13.setText("Planta 2");
        materialButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton13ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 120, 60));

        materialButton14.setBackground(new java.awt.Color(204, 204, 204));
        materialButton14.setText("Planta 3");
        materialButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton14ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 120, 60));

        materialButton15.setBackground(new java.awt.Color(204, 204, 204));
        materialButton15.setText("Planta 4");
        materialButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton15ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 120, 60));

        materialButton16.setBackground(new java.awt.Color(204, 204, 204));
        materialButton16.setText("Planta 5");
        materialButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton16ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 120, 60));

        materialButton17.setBackground(new java.awt.Color(204, 204, 204));
        materialButton17.setText("Planta 0");
        materialButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton17ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 60));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setText("                 Precio");
        materialPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel18.setText("(2 adaptados)");
        materialPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 340, 80, 20));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel19.setText("9");
        materialPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setText("                         Motos");
        materialPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("            Ascensor");
        materialPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setText("                 Baños");
        materialPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel23.setText("   Plazas totales");
        materialPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setText("                       Coches");
        materialPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, -1, -1));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel25.setText("Movilidad reducida");
        materialPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 200, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel26.setText("                 Familiares");
        materialPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel27.setText("      Localización");
        materialPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 50, -1, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel28.setText("            Distancia");
        materialPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setText("745 m.");
        materialPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, -1, -1));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel30.setText("0,86 €/hora");
        materialPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 380, -1, -1));

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel31.setText("6");
        materialPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 260, -1, -1));

        jLabel32.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel32.setText("42");
        materialPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 170, -1, -1));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel33.setText("3");
        materialPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, -1, -1));

        jLabel34.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel34.setText("60");
        materialPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, -1, -1));

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel35.setText("SÍ");
        materialPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jLabel36.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel36.setText("3");
        materialPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 340, -1, -1));

        jLabel37.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel37.setText("C/ San Cipriano, 10");
        materialPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 120, -1));
        materialPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 270, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        materialPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 40, 20, 370));
        materialPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 160, 270, 10));

        getContentPane().add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 102, 960, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton9ActionPerformed

    private void materialButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton13ActionPerformed

    private void materialButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton14ActionPerformed

    private void materialButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton15ActionPerformed

    private void materialButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton16ActionPerformed

    private void materialButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton17ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private de.craften.ui.swingmaterial.MaterialButton materialButton13;
    private de.craften.ui.swingmaterial.MaterialButton materialButton14;
    private de.craften.ui.swingmaterial.MaterialButton materialButton15;
    private de.craften.ui.swingmaterial.MaterialButton materialButton16;
    private de.craften.ui.swingmaterial.MaterialButton materialButton17;
    private de.craften.ui.swingmaterial.MaterialButton materialButton9;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    // End of variables declaration//GEN-END:variables
}
