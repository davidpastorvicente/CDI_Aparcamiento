/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

/**
 *
 * @author david
 */
public class Confirm extends javax.swing.JDialog {

    /**
     * Creates new form Confirm
     */
    public Confirm(java.awt.Frame parent, boolean modal) {
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
        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        materialPanel1.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 110, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/avatar (1).png"))); // NOI18N
        materialPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText(Inicio.passwd);
        materialPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("¡Enhorabuena!");
        materialPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Tu usuario es: " + Inicio.usuario);
        materialPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Tu contraseña es: ");
        materialPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jPanel1.add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 310, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_aceptarButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    // End of variables declaration//GEN-END:variables
}
