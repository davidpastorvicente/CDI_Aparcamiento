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
public class Registro extends javax.swing.JDialog {

    /**
     * Creates new form Registro
     *
     * @param parent
     * @param modal
     */
    public Registro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        opc = true;
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
        nombre = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        apell = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel4 = new javax.swing.JLabel();
        movil = new de.craften.ui.swingmaterial.MaterialTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cadAnio = new de.craften.ui.swingmaterial.MaterialTextField();
        numTarjeta = new de.craften.ui.swingmaterial.MaterialTextField();
        CVC = new de.craften.ui.swingmaterial.MaterialTextField();
        cadMes = new de.craften.ui.swingmaterial.MaterialTextField();
        CancelarButton = new de.craften.ui.swingmaterial.MaterialButton();
        aceptarButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        icon1 = new de.craften.ui.swingmaterial.MaterialButton();
        tarjetaButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel12 = new javax.swing.JLabel();
        icon2 = new de.craften.ui.swingmaterial.MaterialButton();
        paypalButton = new de.craften.ui.swingmaterial.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(340, 290));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombre.setAccent(new java.awt.Color(0, 153, 153));
        nombre.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });
        jPanel2.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 110, 60));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 20));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Apellidos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        apell.setAccent(new java.awt.Color(0, 153, 153));
        apell.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        apell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellKeyTyped(evt);
            }
        });
        jPanel2.add(apell, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, 60));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("electrónico:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, 20));

        email.setAccent(new java.awt.Color(0, 153, 153));
        email.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 220, 60));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Móvil:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 40, 20));

        movil.setAccent(new java.awt.Color(0, 153, 153));
        movil.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        movil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                movilKeyTyped(evt);
            }
        });
        jPanel2.add(movil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, 60));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel13.setText("Rellene los siguientes campos de texto:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 290, 33));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Correo");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 180, 80, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 360, 310));

        jPanel3.setMinimumSize(new java.awt.Dimension(340, 310));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadAnio.setAccent(new java.awt.Color(0, 153, 153));
        cadAnio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cadAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cadAnioKeyTyped(evt);
            }
        });
        jPanel3.add(cadAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 153, 20, 60));

        numTarjeta.setAccent(new java.awt.Color(0, 153, 153));
        numTarjeta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        numTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numTarjetaKeyTyped(evt);
            }
        });
        jPanel3.add(numTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 92, 170, 60));

        CVC.setAccent(new java.awt.Color(0, 153, 153));
        CVC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        CVC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CVCKeyTyped(evt);
            }
        });
        jPanel3.add(CVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 153, 30, 60));

        cadMes.setAccent(new java.awt.Color(0, 153, 153));
        cadMes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cadMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cadMesKeyTyped(evt);
            }
        });
        jPanel3.add(cadMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 153, 20, 60));

        CancelarButton.setBackground(new java.awt.Color(255, 51, 51));
        CancelarButton.setText("Cancelar");
        CancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(CancelarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 140, 70));

        aceptarButton.setBackground(new java.awt.Color(0, 102, 0));
        aceptarButton.setText("Aceptar");
        aceptarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarButtonActionPerformed(evt);
            }
        });
        jPanel3.add(aceptarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 140, 70));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("caducidad:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Seleccione método de pago:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 33));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("CVV/CVC:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 183, 70, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("/");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 30, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 60, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Número de tarjeta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/credit card.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        icon1.setBackground(new java.awt.Color(204, 204, 204));
        icon1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        icon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icon1ActionPerformed(evt);
            }
        });
        jPanel3.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 80, 70));

        tarjetaButton.setBackground(new java.awt.Color(102, 102, 102));
        tarjetaButton.setText("          Tarjeta bancaria");
        tarjetaButton.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        tarjetaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tarjetaButtonActionPerformed(evt);
            }
        });
        jPanel3.add(tarjetaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 70));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/paypal.png"))); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        icon2.setBackground(new java.awt.Color(204, 204, 204));
        icon2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        icon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                icon2ActionPerformed(evt);
            }
        });
        jPanel3.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 80, 70));

        paypalButton.setBackground(new java.awt.Color(204, 204, 204));
        paypalButton.setText("          PayPal");
        paypalButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paypalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paypalButtonActionPerformed(evt);
            }
        });
        jPanel3.add(paypalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 150, 70));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 370, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_CancelarButtonActionPerformed

    private void aceptarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarButtonActionPerformed
        Inicio.usuario = nombre.getText() + "-UPM";
        Inicio.passwd = "cdi2019";
        Inicio.name = nombre.getText();
        Inicio.email = email.getText();
        Confirm c = new Confirm(null, true);
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aceptarButtonActionPerformed

    private void tarjetaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tarjetaButtonActionPerformed
        opc = true;
        tarjetaButton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        paypalButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paypalButton.setBackground(new java.awt.Color(204, 204, 204));
        tarjetaButton.setBackground(new java.awt.Color(102, 102, 102));

        cadAnio.setAccent(new java.awt.Color(0, 153, 153));
        cadAnio.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(cadAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 153, 20, 60));

        numTarjeta.setAccent(new java.awt.Color(0, 153, 153));
        numTarjeta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(numTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 92, 170, 60));

        CVC.setAccent(new java.awt.Color(0, 153, 153));
        CVC.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(CVC, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 153, 30, 60));

        cadMes.setAccent(new java.awt.Color(0, 153, 153));
        cadMes.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jPanel3.add(cadMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 153, 20, 60));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("caducidad:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 70, 30));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setText("Seleccione método de pago:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 210, 33));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("CVV/CVC:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 183, 70, 20));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("/");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 180, 30, 30));

        jLabel9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel9.setText("Fecha de");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 60, 30));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel10.setText("Número de tarjeta:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 130, 20));

        numTarjeta.setText("");
        jPanel3.revalidate();
        jPanel3.repaint();
        pack();
    }//GEN-LAST:event_tarjetaButtonActionPerformed

    private void paypalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paypalButtonActionPerformed
        opc = false;
        tarjetaButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        paypalButton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        tarjetaButton.setBackground(new java.awt.Color(204, 204, 204));
        paypalButton.setBackground(new java.awt.Color(102, 102, 102));
        numTarjeta.setText("");
        jPanel3.remove(jLabel5);
        jPanel3.remove(jLabel7);
        jPanel3.remove(jLabel8);
        jPanel3.remove(cadAnio);
        jPanel3.remove(CVC);
        jPanel3.remove(cadMes);
        jPanel3.remove(jLabel9);

        jLabel10.setText("Número de cuenta:");

        jPanel3.revalidate();
        jPanel3.repaint();
        pack();
    }//GEN-LAST:event_paypalButtonActionPerformed

    private void movilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_movilKeyTyped
        char c = evt.getKeyChar();
        if (opc) {
            if (movil.getText().length() >= 9 || !Character.isDigit(c)) {
                evt.consume();
            }
        }

    }//GEN-LAST:event_movilKeyTyped

    private void icon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icon1ActionPerformed
        tarjetaButtonActionPerformed(evt);
    }//GEN-LAST:event_icon1ActionPerformed

    private void icon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_icon2ActionPerformed
        paypalButtonActionPerformed(evt);
    }//GEN-LAST:event_icon2ActionPerformed

    private void cadMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadMesKeyTyped
        char c = evt.getKeyChar();
        if (cadMes.getText().length() >= 2 || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cadMesKeyTyped

    private void cadAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadAnioKeyTyped
        char c = evt.getKeyChar();
        if (cadAnio.getText().length() >= 2 || !Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_cadAnioKeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void apellKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellKeyTyped
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_apellKeyTyped

    private void numTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numTarjetaKeyTyped
        char c = evt.getKeyChar();
        if (opc) {
            if (!Character.isDigit(c) || numTarjeta.getText().length() >= 16) {
                evt.consume();
            }
        } else if (numTarjeta.getText().length() >= 30) {
            evt.consume();
        }
    }//GEN-LAST:event_numTarjetaKeyTyped

    private void CVCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CVCKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || CVC.getText().length() >= 3) {
            evt.consume();
        }
    }//GEN-LAST:event_CVCKeyTyped

    /**
     * @param args the command line arguments
     */
    boolean opc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialTextField CVC;
    private de.craften.ui.swingmaterial.MaterialButton CancelarButton;
    private de.craften.ui.swingmaterial.MaterialButton aceptarButton;
    private de.craften.ui.swingmaterial.MaterialTextField apell;
    private de.craften.ui.swingmaterial.MaterialTextField cadAnio;
    private de.craften.ui.swingmaterial.MaterialTextField cadMes;
    private de.craften.ui.swingmaterial.MaterialTextField email;
    private de.craften.ui.swingmaterial.MaterialButton icon1;
    private de.craften.ui.swingmaterial.MaterialButton icon2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private de.craften.ui.swingmaterial.MaterialTextField movil;
    private de.craften.ui.swingmaterial.MaterialTextField nombre;
    private de.craften.ui.swingmaterial.MaterialTextField numTarjeta;
    private de.craften.ui.swingmaterial.MaterialButton paypalButton;
    private de.craften.ui.swingmaterial.MaterialButton tarjetaButton;
    // End of variables declaration//GEN-END:variables
}
