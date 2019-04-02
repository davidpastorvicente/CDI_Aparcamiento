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
public class Minerva extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Minerva() {
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
        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        materialButton12 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton8 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton13 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton14 = new de.craften.ui.swingmaterial.MaterialButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parking \"Minerva\"");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 100));

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione la planta :");
        materialPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Precio/hora:     X  €");
        materialPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel8.setText("Número de baños:    X    (x adaptados)");
        materialPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("Acceso a ascensor:    SI/NO");
        materialPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("( x  movilidad reducida, x  familiar, x motos y  x coches )");
        materialPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel5.setText("Número de plazas:      X ");
        materialPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, 30));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("Localización:   C/Minerva,27");
        materialPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Distancia en metros:   227");
        materialPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        materialButton12.setBackground(new java.awt.Color(204, 204, 204));
        materialButton12.setText("Planta 1");
        materialButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton12ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 60));

        materialButton8.setBackground(new java.awt.Color(204, 204, 204));
        materialButton8.setText("Planta 2");
        materialButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton8ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 120, 60));

        materialButton13.setBackground(new java.awt.Color(204, 204, 204));
        materialButton13.setText("Planta 3");
        materialButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton13ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 120, 60));

        materialButton14.setBackground(new java.awt.Color(204, 204, 204));
        materialButton14.setText("Planta 0");
        materialButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton14ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 60));

        getContentPane().add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 102, 960, 490));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gasolinera (1).png"))); // NOI18N
        jLabel3.setText("Gasolinera");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lavadero-de-coches (1).png"))); // NOI18N
        jLabel4.setText(" Lavadero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/baseline_exit_to_app_black_36dp.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 220, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton12ActionPerformed

    private void materialButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton8ActionPerformed

    private void materialButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton13ActionPerformed

    private void materialButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton14ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private de.craften.ui.swingmaterial.MaterialButton materialButton12;
    private de.craften.ui.swingmaterial.MaterialButton materialButton13;
    private de.craften.ui.swingmaterial.MaterialButton materialButton14;
    private de.craften.ui.swingmaterial.MaterialButton materialButton8;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    // End of variables declaration//GEN-END:variables
}
