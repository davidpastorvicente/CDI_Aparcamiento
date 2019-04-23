/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Inicio extends javax.swing.JFrame {

    public static String usuario, passwd, name, email;
    public static JFrame prin;

    /**
     * Creates new form inicio
     */
    public Inicio() {
        getRootPane().setGlassPane(new JComponent() {
            public void paintComponent(Graphics g) {
                g.setColor(new Color(0, 0, 0, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        });
        incorLabel = new javax.swing.JLabel();
        name = "Administrador";
        email = "admin@upm.es";
        usuario = "admin";
        passwd = "1234";
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
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        atras = new de.craften.ui.swingmaterial.MaterialButton();
        jPanel2 = new javax.swing.JPanel();
        UserLabel = new javax.swing.JLabel();
        inicButton = new de.craften.ui.swingmaterial.MaterialButton();
        regButton = new de.craften.ui.swingmaterial.MaterialButton();
        userField = new de.craften.ui.swingmaterial.MaterialTextField();
        pwdLabel = new javax.swing.JLabel();
        pwdField = new de.craften.ui.swingmaterial.MaterialPasswordField();
        noCButton = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 310, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SALIR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 340, 50, 30));

        atras.setToolTipText("Salir");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 295, 93, 95));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 93, 391));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        UserLabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        UserLabel.setForeground(new java.awt.Color(255, 255, 255));
        UserLabel.setText("Usuario:");
        jPanel2.add(UserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        inicButton.setText("Iniciar sesión");
        inicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicButtonActionPerformed(evt);
            }
        });
        jPanel2.add(inicButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 155, 65));

        regButton.setText("¡Regístrate!");
        regButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regButtonActionPerformed(evt);
            }
        });
        jPanel2.add(regButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 155, 65));

        userField.setForeground(new java.awt.Color(255, 255, 255));
        userField.setAccent(new java.awt.Color(0, 153, 153));
        userField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jPanel2.add(userField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 170, 60));

        pwdLabel.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        pwdLabel.setForeground(new java.awt.Color(255, 255, 255));
        pwdLabel.setText("Contraseña:");
        jPanel2.add(pwdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        pwdField.setForeground(new java.awt.Color(255, 255, 255));
        pwdField.setAccent(new java.awt.Color(0, 153, 153));
        pwdField.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jPanel2.add(pwdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 170, 60));

        noCButton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        noCButton.setForeground(new java.awt.Color(255, 255, 255));
        noCButton.setText("¿No tienes cuenta?");
        jPanel2.add(noCButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 120, 496, 271));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setText("Aparcamientos públicos");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 400, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Gestión de parking públicos de la Comunidad de Madrid");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 0, 496, 114));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicButtonActionPerformed
        if (userField.getText().equals(usuario) && pwdField.getText().equals(passwd)) {
            prin = new Principal();
            this.setVisible(false);
            prin.setLocationRelativeTo(null);
            prin.setVisible(true);
        } else if (userField.getText().equals("admin") && pwdField.getText().equals("1234")) {
            name = "Administrador";
            email = "admin@upm.es";
            prin = new Principal();
            this.setVisible(false);
            prin.setLocationRelativeTo(null);
            prin.setVisible(true);
        }
        else {
            incorLabel.setFont(new java.awt.Font("Roboto Regular", 1, 14)); // NOI18N
            incorLabel.setForeground(new java.awt.Color(153, 0, 0));
            incorLabel.setText("¡Usuario incorrecto! Vuelva a intentarlo.");
            jPanel2.add(incorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
            this.pack();
        }

    }//GEN-LAST:event_inicButtonActionPerformed

    private void regButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regButtonActionPerformed
        JDialog reg = new Registro(this, true);
        reg.setLocationRelativeTo(null);
        reg.setVisible(true);
        prin = new Principal();
    }//GEN-LAST:event_regButtonActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Salida conf= new Salida(this, true);
        conf.setLocationRelativeTo(null);
        getRootPane().getGlassPane().setVisible(true);
        conf.setVisible(true);
        getRootPane().getGlassPane().setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private javax.swing.JLabel incorLabel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UserLabel;
    private de.craften.ui.swingmaterial.MaterialButton atras;
    private de.craften.ui.swingmaterial.MaterialButton inicButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel noCButton;
    private de.craften.ui.swingmaterial.MaterialPasswordField pwdField;
    private javax.swing.JLabel pwdLabel;
    private de.craften.ui.swingmaterial.MaterialButton regButton;
    private de.craften.ui.swingmaterial.MaterialTextField userField;
    // End of variables declaration//GEN-END:variables
}
