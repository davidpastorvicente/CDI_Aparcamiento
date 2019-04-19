/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.servicios;

/**
 *
 * @author david
 */
public class cReserva extends javax.swing.JDialog {

    private String planta, dir, precio, name;
    private javax.swing.JButton sel;

    /**
     * Creates new form Registro
     *
     * @param parent
     * @param modal
     * @param sel
     * @param planta
     */
    public cReserva(java.awt.Frame parent, boolean modal, javax.swing.JButton sel, String planta, String dir, String precio, String name) {
        super(parent, modal);
        this.sel = sel;
        this.planta = planta;
        this.dir=dir;
        this.precio=precio;
        this.name=name;
        initComponents();
    }

    public String getTipoPlaza(javax.swing.JButton sel) {
        switch (sel.getMnemonic()) {
            case 0:
                return "Coche ordinario";
            case 1:
                return "Moto";
            case 2:
                return "Movilidad reducida";
            case 3:
                return "Familiar";
        }
        return "";
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cancelarButton = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setMinimumSize(new java.awt.Dimension(340, 290));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Plaza: " + sel.getName() + "  ·  Planta: " + planta);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 250, 33));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Dirección: " + dir);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 290, 20));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel3.setText("Precio: " + precio);
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 270, 20));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("¡Tu reserva se ha realizado con éxito!");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 33));

        cancelarButton.setBackground(new java.awt.Color(255, 51, 51));
        cancelarButton.setText("Volver");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(cancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 140, 70));

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, 70));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Tipo: " + getTipoPlaza(sel));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 250, 33));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        jLabel14.setText("Parking " + name);
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 310, 33));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("  Tiene una hora para estacionar el vehículo");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 235, 295, 35));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aceptarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private de.craften.ui.swingmaterial.MaterialButton cancelarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.ButtonGroup pagoOpc;
    // End of variables declaration//GEN-END:variables
}
