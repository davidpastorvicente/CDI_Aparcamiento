/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aparcamiento.parkings;

import aparcamiento.servicios.*;

/**
 *
 * @author david
 */
public class Rosa extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Rosa() {
        niv = new Nivel().getPanel();
        lav = new Lavadero().getPanel();
        lib = new boolean[20];
        for (int i = 0; i < 20; i++) {
            lib[i] = true;
        }
        initComponents();
        aux = plazas;
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
        plazas = new de.craften.ui.swingmaterial.MaterialPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        p1 = new javax.swing.JButton();
        p2 = new javax.swing.JButton();
        p3 = new javax.swing.JButton();
        p4 = new javax.swing.JButton();
        p5 = new javax.swing.JButton();
        p6 = new javax.swing.JButton();
        p7 = new javax.swing.JButton();
        p8 = new javax.swing.JButton();
        p9 = new javax.swing.JButton();
        p10 = new javax.swing.JButton();
        p11 = new javax.swing.JButton();
        p12 = new javax.swing.JButton();
        p13 = new javax.swing.JButton();
        p14 = new javax.swing.JButton();
        p15 = new javax.swing.JButton();
        p16 = new javax.swing.JButton();
        p17 = new javax.swing.JButton();
        p18 = new javax.swing.JButton();
        p19 = new javax.swing.JButton();
        p20 = new javax.swing.JButton();
        parking = new javax.swing.JLabel();
        planta0 = new de.craften.ui.swingmaterial.MaterialButton();
        planta1 = new de.craften.ui.swingmaterial.MaterialButton();
        planta2 = new de.craften.ui.swingmaterial.MaterialButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        atras = new de.craften.ui.swingmaterial.MaterialButton();
        nivelButton = new de.craften.ui.swingmaterial.MaterialButton();
        lavaderoButton = new de.craften.ui.swingmaterial.MaterialButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        plazasButton = new de.craften.ui.swingmaterial.MaterialButton();
        ind2 = new javax.swing.JLabel();
        ind1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Parking \"Rosa Chacel\"");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, 100));

        plazas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel2.setText("Seleccione la planta :");
        plazas.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel3.setText("                 Precio");
        plazas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 360, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel17.setText("(2 adaptados)");
        plazas.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, 80, 20));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel18.setText("9");
        plazas.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 180, -1, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setText("                         Motos");
        plazas.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, -1, -1));

        jLabel20.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel20.setText("            Ascensor");
        plazas.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel21.setText("                 Baños");
        plazas.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, -1, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel22.setText("   Plazas totales");
        plazas.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 110, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setText("                       Coches");
        plazas.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setText("Movilidad reducida");
        plazas.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));

        jLabel25.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel25.setText("                 Familiares");
        plazas.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel26.setText("      Localización");
        plazas.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel27.setText("            Distancia");
        plazas.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel28.setText("1200 m.");
        plazas.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, -1, -1));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel29.setText("0,70 €/hora");
        plazas.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, -1, -1));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel30.setText("12");
        plazas.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, -1, -1));

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel31.setText("33");
        plazas.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, -1, -1));

        jLabel32.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel32.setText("6");
        plazas.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, -1, -1));

        jLabel33.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel33.setText("60");
        plazas.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, -1, -1));

        jLabel34.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel34.setText("SÍ");
        plazas.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        jLabel35.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel35.setText("2");
        plazas.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, -1));

        jLabel36.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel36.setText("C/ de la Raya, 3");
        plazas.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 100, -1));
        plazas.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 270, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        plazas.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 20, 370));
        plazas.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 270, 10));

        p1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMinus2.png"))); // NOI18N
        p1.setMnemonic(2);
        p1.setToolTipText("Libre");
        p1.setBorderPainted(false);
        p1.setContentAreaFilled(false);
        p1.setName("1"); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 146, 67, 83));

        p2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoMinus2.png"))); // NOI18N
        p2.setMnemonic(2);
        p2.setToolTipText("Ocupado");
        p2.setBorderPainted(false);
        p2.setContentAreaFilled(false);
        p2.setName("2"); // NOI18N
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 146, 67, 83));

        p3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoMinus2.png"))); // NOI18N
        p3.setMnemonic(2);
        p3.setToolTipText("Ocupado");
        p3.setBorderPainted(false);
        p3.setContentAreaFilled(false);
        p3.setName("3"); // NOI18N
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 146, 67, 83));

        p4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p4.setMnemonic(0);
        p4.setToolTipText("Libre");
        p4.setBorderPainted(false);
        p4.setContentAreaFilled(false);
        p4.setName("4"); // NOI18N
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 146, 54, 83));

        p5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p5.setMnemonic(0);
        p5.setToolTipText("Libre");
        p5.setBorderPainted(false);
        p5.setContentAreaFilled(false);
        p5.setName("5"); // NOI18N
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 146, 54, 83));

        p6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p6.setMnemonic(0);
        p6.setToolTipText("Libre");
        p6.setBorderPainted(false);
        p6.setContentAreaFilled(false);
        p6.setName("6"); // NOI18N
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 146, 54, 83));

        p7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p7.setMnemonic(0);
        p7.setToolTipText("Libre");
        p7.setBorderPainted(false);
        p7.setContentAreaFilled(false);
        p7.setName("7"); // NOI18N
        p7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p7, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 146, 54, 83));

        p8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoCoche2.png"))); // NOI18N
        p8.setMnemonic(0);
        p8.setToolTipText("Ocupado");
        p8.setBorderPainted(false);
        p8.setContentAreaFilled(false);
        p8.setName("8"); // NOI18N
        p8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p8, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 146, 54, 83));

        p9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMotos2.png"))); // NOI18N
        p9.setMnemonic(1);
        p9.setToolTipText("Libre");
        p9.setBorderPainted(false);
        p9.setContentAreaFilled(false);
        p9.setName("9"); // NOI18N
        p9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p9, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 145, 54, 44));

        p10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoMotos2.png"))); // NOI18N
        p10.setMnemonic(1);
        p10.setToolTipText("Ocupado");
        p10.setBorderPainted(false);
        p10.setContentAreaFilled(false);
        p10.setName("10"); // NOI18N
        p10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p10, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 187, 54, 44));

        p11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMinus2.png"))); // NOI18N
        p11.setMnemonic(2);
        p11.setToolTipText("Libre");
        p11.setBorderPainted(false);
        p11.setContentAreaFilled(false);
        p11.setName("11"); // NOI18N
        p11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p11, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 295, 67, 83));

        p12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMinus2.png"))); // NOI18N
        p12.setMnemonic(2);
        p12.setToolTipText("Libre");
        p12.setBorderPainted(false);
        p12.setContentAreaFilled(false);
        p12.setName("12"); // NOI18N
        p12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p12, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 295, 67, 83));

        p13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p13.setMnemonic(0);
        p13.setToolTipText("Libre");
        p13.setBorderPainted(false);
        p13.setContentAreaFilled(false);
        p13.setName("13"); // NOI18N
        p13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p13, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 295, 54, 83));

        p14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoCoche2.png"))); // NOI18N
        p14.setMnemonic(0);
        p14.setToolTipText("Ocupado");
        p14.setBorderPainted(false);
        p14.setContentAreaFilled(false);
        p14.setName("14"); // NOI18N
        p14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p14, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 295, 54, 83));

        p15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p15.setMnemonic(0);
        p15.setToolTipText("Libre");
        p15.setBorderPainted(false);
        p15.setContentAreaFilled(false);
        p15.setName("15"); // NOI18N
        p15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p15, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 295, 54, 83));

        p16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoCoche2.png"))); // NOI18N
        p16.setMnemonic(0);
        p16.setToolTipText("Ocupado");
        p16.setBorderPainted(false);
        p16.setContentAreaFilled(false);
        p16.setName("16"); // NOI18N
        p16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 295, 54, 83));

        p17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p17.setMnemonic(0);
        p17.setToolTipText("Libre");
        p17.setBorderPainted(false);
        p17.setContentAreaFilled(false);
        p17.setName("17"); // NOI18N
        p17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p17, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 295, 54, 83));

        p18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png"))); // NOI18N
        p18.setMnemonic(0);
        p18.setToolTipText("Libre");
        p18.setBorderPainted(false);
        p18.setContentAreaFilled(false);
        p18.setName("18"); // NOI18N
        p18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p18, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 295, 54, 83));

        p19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMotos2.png"))); // NOI18N
        p19.setMnemonic(1);
        p19.setToolTipText("Libre");
        p19.setBorderPainted(false);
        p19.setContentAreaFilled(false);
        p19.setName("19"); // NOI18N
        p19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p19, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 294, 54, 44));

        p20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMotos2.png"))); // NOI18N
        p20.setMnemonic(1);
        p20.setToolTipText("Libre");
        p20.setBorderPainted(false);
        p20.setContentAreaFilled(false);
        p20.setName("20"); // NOI18N
        p20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accion(evt);
            }
        });
        plazas.add(p20, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 336, 54, 44));

        parking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ppequeño.png"))); // NOI18N
        parking.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        plazas.add(parking, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 140, 577, 240));

        planta0.setBackground(new java.awt.Color(102, 102, 102));
        planta0.setText("Planta 0");
        planta0.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        planta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planta0ActionPerformed(evt);
            }
        });
        plazas.add(planta0, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 120, 60));

        planta1.setBackground(new java.awt.Color(204, 204, 204));
        planta1.setText("Planta 1");
        planta1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        planta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planta1ActionPerformed(evt);
            }
        });
        plazas.add(planta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 120, 60));

        planta2.setBackground(new java.awt.Color(204, 204, 204));
        planta2.setText("Planta 2");
        planta2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        planta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planta2ActionPerformed(evt);
            }
        });
        plazas.add(planta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 120, 60));

        getContentPane().add(plazas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 960, 490));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/lavadero-de-coches (1).png"))); // NOI18N
        jLabel4.setText(" Lavadero");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/presion (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 220, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/aceite (1) (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 245, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel7.setText("Nivel de aire");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 220, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel8.setText("y aceite");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/left-arrow.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        jPanel1.add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 90, 80));

        nivelButton.setBackground(new java.awt.Color(0, 160, 160));
        nivelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nivelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(nivelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 220, 110));

        lavaderoButton.setBackground(new java.awt.Color(0, 160, 160));
        lavaderoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lavaderoButtonActionPerformed(evt);
            }
        });
        jPanel1.add(lavaderoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 220, 100));

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/plaza.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel11.setText("de plazas");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 65, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        jLabel12.setText("Reserva");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        plazasButton.setBackground(new java.awt.Color(0, 160, 160));
        plazasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plazasButtonActionPerformed(evt);
            }
        });
        jPanel1.add(plazasButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 220, 100));

        ind2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/indicador.png"))); // NOI18N
        jPanel1.add(ind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 10, -1));

        ind1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/indicador.png"))); // NOI18N
        jPanel1.add(ind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 92, 220, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        this.setVisible(false);
        /*JFrame prin= new Principal();
         prin.setLocationRelativeTo(null);
         prin.setVisible(true);*/
    }//GEN-LAST:event_atrasActionPerformed

    private void nivelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nivelButtonActionPerformed
        if (aux != niv) {
            getContentPane().remove(aux);
            aux = niv;
            getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 960, 490));
            ind1.setLocation(0, 225);
            ind2.setLocation(210, 225);
            jPanel1.remove(ind1);
            jPanel1.add(ind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 225, -1, -1));
            jPanel1.remove(ind2);
            jPanel1.add(ind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 225, 10, -1));
            revalidate();
            repaint();
            pack();
        }
    }//GEN-LAST:event_nivelButtonActionPerformed

    private void lavaderoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lavaderoButtonActionPerformed
        if (aux != lav) {
            getContentPane().remove(aux);
            aux = lav;
            getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 960, 490));
            jPanel1.remove(ind1);
            jPanel1.add(ind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));
            jPanel1.remove(ind2);
            jPanel1.add(ind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 10, -1));
            revalidate();
            repaint();
            pack();
        }
    }//GEN-LAST:event_lavaderoButtonActionPerformed

    private void accion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accion
        javax.swing.JButton aux = (javax.swing.JButton) evt.getSource();
        if (!aux.getToolTipText().equals("Ocupado")) {
            int i = Integer.parseInt(aux.getName());
            if (lib[i - 1]) {
                if (sel != null) {
                    libre(sel);
                    lib[Integer.parseInt(sel.getName()) - 1] = true;
                }
                reservado(aux);
                lib[i - 1] = false;
                sel = aux;
            } else {
                libre(aux);
                lib[i - 1] = true;
                sel = null;
            }
        }
    }//GEN-LAST:event_accion

    private void planta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planta0ActionPerformed
        planta0.setBackground(new java.awt.Color(102, 102, 102));
        planta0.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        planta1.setBackground(new java.awt.Color(204, 204, 204));
        planta1.setFont(new java.awt.Font("Roboto", 0, 14));
        planta2.setBackground(new java.awt.Color(204, 204, 204));
        planta2.setFont(new java.awt.Font("Roboto", 0, 14));
        libre(p1);
        ocupado(p2);
        ocupado(p3);
        libre(p4);
        libre(p5);
        libre(p6);
        libre(p7);
        ocupado(p8);
        libre(p9);
        ocupado(p10);
        libre(p11);
        libre(p12);
        libre(p13);
        ocupado(p14);
        libre(p15);
        ocupado(p16);
        libre(p17);
        libre(p18);
        libre(p19);
        libre(p20);
    }//GEN-LAST:event_planta0ActionPerformed

    private void planta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planta1ActionPerformed
        planta1.setBackground(new java.awt.Color(102, 102, 102));
        planta1.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        planta0.setBackground(new java.awt.Color(204, 204, 204));
        planta0.setFont(new java.awt.Font("Roboto", 0, 14));
        planta2.setBackground(new java.awt.Color(204, 204, 204));
        planta2.setFont(new java.awt.Font("Roboto", 0, 14));
        libre(p1);
        libre(p2);
        libre(p3);
        libre(p4);
        ocupado(p5);
        libre(p6);
        libre(p7);
        libre(p8);
        libre(p9);
        libre(p10);
        libre(p11);
        ocupado(p12);
        ocupado(p13);
        libre(p14);
        libre(p15);
        libre(p16);
        libre(p17);
        ocupado(p18);
        libre(p19);
        libre(p20);
    }//GEN-LAST:event_planta1ActionPerformed

    private void planta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planta2ActionPerformed
        planta2.setBackground(new java.awt.Color(102, 102, 102));
        planta2.setFont(new java.awt.Font("Roboto Medium", 1, 14));
        planta1.setBackground(new java.awt.Color(204, 204, 204));
        planta1.setFont(new java.awt.Font("Roboto", 0, 14));
        planta0.setBackground(new java.awt.Color(204, 204, 204));
        planta0.setFont(new java.awt.Font("Roboto", 0, 14));
        libre(p1);
        ocupado(p2);
        ocupado(p3);
        ocupado(p4);
        ocupado(p5);
        ocupado(p6);
        libre(p7);
        libre(p8);
        libre(p9);
        libre(p10);
        libre(p11);
        ocupado(p12);
        libre(p13);
        ocupado(p14);
        libre(p15);
        libre(p16);
        ocupado(p17);
        ocupado(p18);
        ocupado(p19);
        ocupado(p20);
    }//GEN-LAST:event_planta2ActionPerformed

    private void plazasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plazasButtonActionPerformed
        if (aux != plazas) {
            getContentPane().remove(aux);
            aux = plazas;
            getContentPane().add(aux, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 960, 490));
            jPanel1.remove(ind1);
            jPanel1.add(ind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));
            jPanel1.remove(ind2);
            jPanel1.add(ind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 10, -1));
            revalidate();
            repaint();
            pack();
        }
    }//GEN-LAST:event_plazasButtonActionPerformed

    private void libre(javax.swing.JButton but) {
        switch (but.getMnemonic()) {
            case 0:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreCoche2.png")));
                break;
            case 1:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMotos2.png")));
                break;
            case 2:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/libreMinus2.png")));
                break;
        }
        but.setToolTipText("Libre");
    }

    private void ocupado(javax.swing.JButton but) {
        switch (but.getMnemonic()) {
            case 0:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoCoche2.png")));
                break;
            case 1:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoMotos2.png")));
                break;
            case 2:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ocupadoMinus2.png")));
                break;
        }
        but.setToolTipText("Ocupado");
    }

    private void reservado(javax.swing.JButton but) {
        switch (but.getMnemonic()) {
            case 0:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reservadoCoche2.png")));
                break;
            case 1:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reservadoMotos2.png")));
                break;
            case 2:
                but.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/reservadoMinus2.png")));
                break;
        }
        but.setToolTipText("Reservado");
    }

    private boolean[] lib;
    private javax.swing.JButton sel;
    private de.craften.ui.swingmaterial.MaterialPanel aux, lav, niv;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private de.craften.ui.swingmaterial.MaterialButton atras;
    private javax.swing.JLabel ind1;
    private javax.swing.JLabel ind2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private de.craften.ui.swingmaterial.MaterialButton lavaderoButton;
    private de.craften.ui.swingmaterial.MaterialButton nivelButton;
    private javax.swing.JButton p1;
    private javax.swing.JButton p10;
    private javax.swing.JButton p11;
    private javax.swing.JButton p12;
    private javax.swing.JButton p13;
    private javax.swing.JButton p14;
    private javax.swing.JButton p15;
    private javax.swing.JButton p16;
    private javax.swing.JButton p17;
    private javax.swing.JButton p18;
    private javax.swing.JButton p19;
    private javax.swing.JButton p2;
    private javax.swing.JButton p20;
    private javax.swing.JButton p3;
    private javax.swing.JButton p4;
    private javax.swing.JButton p5;
    private javax.swing.JButton p6;
    private javax.swing.JButton p7;
    private javax.swing.JButton p8;
    private javax.swing.JButton p9;
    private javax.swing.JLabel parking;
    private de.craften.ui.swingmaterial.MaterialButton planta0;
    private de.craften.ui.swingmaterial.MaterialButton planta1;
    private de.craften.ui.swingmaterial.MaterialButton planta2;
    private de.craften.ui.swingmaterial.MaterialPanel plazas;
    private de.craften.ui.swingmaterial.MaterialButton plazasButton;
    // End of variables declaration//GEN-END:variables
}
