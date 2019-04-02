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
public class Villa extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Villa() {
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
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        materialButton17 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton18 = new de.craften.ui.swingmaterial.MaterialButton();
        materialButton19 = new de.craften.ui.swingmaterial.MaterialButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parking \"Villablanca\"");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 100));

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione la planta :");
        materialPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 180, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel10.setText("Precio/hora:     X  €");
        materialPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("Número de baños:    X    (x adaptados)");
        materialPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("Acceso a ascensor:    SI/NO");
        materialPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 240, -1, -1));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel13.setText("( x  movilidad reducida, x  familiar, x motos y  x coches )");
        materialPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel14.setText("Número de plazas:      X ");
        materialPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, 30));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setText("Localización:   C/Villablanca,30");
        materialPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel15.setText("Distancia en metros:   978");
        materialPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        materialButton17.setBackground(new java.awt.Color(204, 204, 204));
        materialButton17.setText("Planta 2");
        materialButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton17ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 120, 60));

        materialButton18.setBackground(new java.awt.Color(204, 204, 204));
        materialButton18.setText("Planta 0");
        materialButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton18ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, 60));

        materialButton19.setBackground(new java.awt.Color(204, 204, 204));
        materialButton19.setText("Planta 1");
        materialButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialButton19ActionPerformed(evt);
            }
        });
        materialPanel1.add(materialButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 120, 60));

        getContentPane().add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 102, 960, 490));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/gasolinera (1).png"))); // NOI18N
        jLabel3.setText("Gasolinera");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/presion (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aceite (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel7.setText("Nivel de aire");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel8.setText("y aceite");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/baseline_exit_to_app_black_36dp.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 220, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton17ActionPerformed

    private void materialButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton18ActionPerformed

    private void materialButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialButton19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_materialButton19ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private de.craften.ui.swingmaterial.MaterialButton materialButton17;
    private de.craften.ui.swingmaterial.MaterialButton materialButton18;
    private de.craften.ui.swingmaterial.MaterialButton materialButton19;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    // End of variables declaration//GEN-END:variables
}
