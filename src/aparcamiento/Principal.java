/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento;

import aparcamiento.parkings.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        getRootPane().setGlassPane(new JComponent() {
            public void paintComponent(Graphics g) {
                g.setColor(new Color(0, 0, 0, 100));
                g.fillRect(0, 0, getWidth(), getHeight());
                super.paintComponent(g);
            }
        });
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
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        sesion = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        salir = new de.craften.ui.swingmaterial.MaterialButton();
        materialPanel1 = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel3 = new javax.swing.JLabel();
        iMinerva = new javax.swing.JLabel();
        iVilla = new javax.swing.JLabel();
        iAmma = new javax.swing.JLabel();
        iRosa = new javax.swing.JLabel();
        iURJC = new javax.swing.JLabel();
        mapa = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p7 = new javax.swing.JLabel();
        Minerva = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MinervaArea = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel7 = new javax.swing.JLabel();
        URJC = new javax.swing.JLabel();
        p9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        URJCArea = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel12 = new javax.swing.JLabel();
        p11 = new javax.swing.JLabel();
        Villa = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        VilllaArea = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel17 = new javax.swing.JLabel();
        p13 = new javax.swing.JLabel();
        Rosa = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        RosaArea = new de.craften.ui.swingmaterial.MaterialButton();
        p15 = new javax.swing.JLabel();
        Amma = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        AmmaArea = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setText("Aparcamientos públicos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 100));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(Inicio.email);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logout.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel14.setText("CERRAR");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 378, -1, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel15.setText("SESIÓN");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 397, -1, -1));

        sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sesionActionPerformed(evt);
            }
        });
        jPanel1.add(sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 150, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/avatar (2).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("¡Bienvenido!");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(Inicio.name);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel18.setText("SALIR");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 447, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/cancel.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 150, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 220, 500));

        materialPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/escala.png"))); // NOI18N
        materialPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        iMinerva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        iMinerva.setName("1"); // NOI18N
        iMinerva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iMinervaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iMinervaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iMinervaMouseExited(evt);
            }
        });
        materialPanel1.add(iMinerva, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        iVilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        iVilla.setName("3"); // NOI18N
        iVilla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iVillaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iVillaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iVillaMouseExited(evt);
            }
        });
        materialPanel1.add(iVilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        iAmma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        iAmma.setName("5"); // NOI18N
        iAmma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iAmmaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iAmmaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iAmmaMouseExited(evt);
            }
        });
        materialPanel1.add(iAmma, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        iRosa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        iRosa.setName("4"); // NOI18N
        iRosa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iRosaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iRosaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iRosaMouseExited(evt);
            }
        });
        materialPanel1.add(iRosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        iURJC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        iURJC.setName("2"); // NOI18N
        iURJC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iURJCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                iURJCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                iURJCMouseExited(evt);
            }
        });
        materialPanel1.add(iURJC, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        mapa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mapa.png"))); // NOI18N
        mapa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        materialPanel1.add(mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 21, 599, 438));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("_____________________________");
        materialPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 220, -1));

        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        materialPanel1.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        Minerva.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Minerva.setText("Parking \"Minerva\"");
        materialPanel1.add(Minerva, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel6.setText("C/ Minerva, 27  -  (227 m)");
        materialPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 90, -1, -1));

        MinervaArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinervaAreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinervaAreaMouseExited(evt);
            }
        });
        MinervaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinervaAreaActionPerformed(evt);
            }
        });
        materialPanel1.add(MinervaArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 290, 100));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel7.setText("_____________________________");
        materialPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 190, -1, -1));

        URJC.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        URJC.setText("Parking \"URJC\"");
        materialPanel1.add(URJC, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 150, -1, -1));

        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        materialPanel1.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel11.setText("C/ San Cipriano, 10  -  (745 m)");
        materialPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        URJCArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                URJCAreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                URJCAreaMouseExited(evt);
            }
        });
        URJCArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                URJCAreaActionPerformed(evt);
            }
        });
        materialPanel1.add(URJCArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 290, 100));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel12.setText("_____________________________");
        materialPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 270, -1, -1));

        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        materialPanel1.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 230, -1, -1));

        Villa.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Villa.setText("Parking \"Villajimena\"");
        materialPanel1.add(Villa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel16.setText("C/ Villablanca, 30  -  (978 m)");
        materialPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, -1, -1));

        VilllaArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VilllaAreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VilllaAreaMouseExited(evt);
            }
        });
        VilllaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VilllaAreaActionPerformed(evt);
            }
        });
        materialPanel1.add(VilllaArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 290, 100));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setText("_____________________________");
        materialPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        p13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        materialPanel1.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, -1, -1));

        Rosa.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Rosa.setText("Parking \"Rosa Chacel\"");
        materialPanel1.add(Rosa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel21.setText("C/ de la Raya, 3  -  (1,2 km)");
        materialPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, -1, -1));

        RosaArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RosaAreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RosaAreaMouseExited(evt);
            }
        });
        RosaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RosaAreaActionPerformed(evt);
            }
        });
        materialPanel1.add(RosaArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 290, 100));

        p15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/parking.png"))); // NOI18N
        materialPanel1.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, -1, -1));

        Amma.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        Amma.setText("Parking \"Amma\"");
        materialPanel1.add(Amma, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel26.setText("C/ de los Almendros, 8  -  (1,3 km)");
        materialPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 410, -1, -1));

        AmmaArea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AmmaAreaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AmmaAreaMouseExited(evt);
            }
        });
        AmmaArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmmaAreaActionPerformed(evt);
            }
        });
        materialPanel1.add(AmmaArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 290, 100));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel13.setText("Escoja un aparcamiento de los siguientes:");
        materialPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, -1));

        getContentPane().add(materialPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 102, 960, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iAmmaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iAmmaMouseEntered
        Amma.setFont(new java.awt.Font("Roboto", 1, 18));
        p15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_iAmmaMouseEntered

    private void iAmmaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iAmmaMouseExited
        Amma.setFont(new java.awt.Font("Roboto", 0, 18));
        p15.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_iAmmaMouseExited

    private void iRosaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRosaMouseEntered
        Rosa.setFont(new java.awt.Font("Roboto", 1, 18));
        p13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_iRosaMouseEntered

    private void iRosaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRosaMouseExited
        Rosa.setFont(new java.awt.Font("Roboto", 0, 18));
        p13.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_iRosaMouseExited

    private void iURJCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iURJCMouseEntered
        URJC.setFont(new java.awt.Font("Roboto", 1, 18));
        p9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_iURJCMouseEntered

    private void iURJCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iURJCMouseExited
        URJC.setFont(new java.awt.Font("Roboto", 0, 18));
        p9.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_iURJCMouseExited

    private void iVillaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iVillaMouseEntered
        Villa.setFont(new java.awt.Font("Roboto", 1, 18));
        p11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_iVillaMouseEntered

    private void iVillaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iVillaMouseExited
        Villa.setFont(new java.awt.Font("Roboto", 0, 18));
        p11.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_iVillaMouseExited

    private void iMinervaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMinervaMouseEntered
        Minerva.setFont(new java.awt.Font("Roboto", 1, 18));
        p7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_iMinervaMouseEntered

    private void iMinervaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMinervaMouseExited
        Minerva.setFont(new java.awt.Font("Roboto", 0, 18));
        p7.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_iMinervaMouseExited

    private void MinervaAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinervaAreaMouseEntered
        iMinerva.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_MinervaAreaMouseEntered

    private void URJCAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URJCAreaMouseEntered
        iURJC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_URJCAreaMouseEntered

    private void VilllaAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VilllaAreaMouseEntered
        iVilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_VilllaAreaMouseEntered

    private void RosaAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RosaAreaMouseEntered
        iRosa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_RosaAreaMouseEntered

    private void AmmaAreaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmmaAreaMouseEntered
        iAmma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(32, 74, 135), 3));
    }//GEN-LAST:event_AmmaAreaMouseEntered

    private void MinervaAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinervaAreaMouseExited
        iMinerva.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_MinervaAreaMouseExited

    private void URJCAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_URJCAreaMouseExited
        iURJC.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_URJCAreaMouseExited

    private void VilllaAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VilllaAreaMouseExited
        iVilla.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_VilllaAreaMouseExited

    private void RosaAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RosaAreaMouseExited
        iRosa.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_RosaAreaMouseExited

    private void AmmaAreaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AmmaAreaMouseExited
        iAmma.setBorder(javax.swing.BorderFactory.createEmptyBorder());
    }//GEN-LAST:event_AmmaAreaMouseExited

    private void AmmaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmmaAreaActionPerformed
        JFrame min = new Amma();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_AmmaAreaActionPerformed

    private void MinervaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinervaAreaActionPerformed
        JFrame min = new Minerva();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_MinervaAreaActionPerformed

    private void iMinervaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iMinervaMouseClicked
        JFrame min = new Minerva();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_iMinervaMouseClicked

    private void URJCAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_URJCAreaActionPerformed
        JFrame min = new URJC();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_URJCAreaActionPerformed

    private void iURJCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iURJCMouseClicked
        JFrame min = new URJC();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_iURJCMouseClicked

    private void VilllaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VilllaAreaActionPerformed
        JFrame min = new Villa();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_VilllaAreaActionPerformed

    private void iVillaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iVillaMouseClicked
        JFrame min = new Villa();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_iVillaMouseClicked

    private void RosaAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RosaAreaActionPerformed
        JFrame min = new Rosa();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_RosaAreaActionPerformed

    private void iRosaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iRosaMouseClicked
        JFrame min = new Rosa();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_iRosaMouseClicked

    private void iAmmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iAmmaMouseClicked
        JFrame min = new Amma();
        min.setVisible(true);
        min.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_iAmmaMouseClicked

    private void sesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sesionActionPerformed
        CerrarSesion conf= new CerrarSesion(this, true);
        conf.setLocationRelativeTo(null);
        getRootPane().getGlassPane().setVisible(true);
        conf.setVisible(true);
        getRootPane().getGlassPane().setVisible(false);
    }//GEN-LAST:event_sesionActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Salida conf= new Salida(this, true);
        conf.setLocationRelativeTo(null);
        getRootPane().getGlassPane().setVisible(true);
        conf.setVisible(true);
        getRootPane().getGlassPane().setVisible(false);
    }//GEN-LAST:event_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amma;
    private de.craften.ui.swingmaterial.MaterialButton AmmaArea;
    private javax.swing.JLabel Minerva;
    private de.craften.ui.swingmaterial.MaterialButton MinervaArea;
    private javax.swing.JLabel Rosa;
    private de.craften.ui.swingmaterial.MaterialButton RosaArea;
    private javax.swing.JLabel URJC;
    private de.craften.ui.swingmaterial.MaterialButton URJCArea;
    private javax.swing.JLabel Villa;
    private de.craften.ui.swingmaterial.MaterialButton VilllaArea;
    private javax.swing.JLabel iAmma;
    private javax.swing.JLabel iMinerva;
    private javax.swing.JLabel iRosa;
    private javax.swing.JLabel iURJC;
    private javax.swing.JLabel iVilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mapa;
    private de.craften.ui.swingmaterial.MaterialPanel materialPanel1;
    private javax.swing.JLabel p11;
    private javax.swing.JLabel p13;
    private javax.swing.JLabel p15;
    private javax.swing.JLabel p7;
    private javax.swing.JLabel p9;
    private de.craften.ui.swingmaterial.MaterialButton salir;
    private de.craften.ui.swingmaterial.MaterialButton sesion;
    // End of variables declaration//GEN-END:variables
}
