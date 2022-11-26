package GUI;

import Classes.Smartphone;
import Classes.Pembeli;
import Databases.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import database.Konfigurasi;
//import gui.dialog.InfoPengguna;
//import gui.dialog.LihatBuku;
//import gui.dialog.GuestAlert;
//import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Home extends javax.swing.JFrame implements ActionListener {

    public Home() {
        this.sp = new Smartphone[30];
        this.pembeli = new Pembeli();

//        try {
//            this.konfigurasi = new Konfigurasi();
//        } catch (IOException | FontFormatException ex) {
//            Logger.getLogger(PilihanBuku.class.getName()).log(Level.SEVERE, null, ex);
//        }

        Database db = new Database();
        sp = db.buatObjekSmartphone();

        initComponents();
    }

    public Home(Pembeli pembeli) {
        this.sp = new Smartphone[30];
        this.pembeli = pembeli;

//        try {
//            this.konfigurasi = new Konfigurasi();
//        } catch (IOException | FontFormatException ex) {
//            Logger.getLogger(PilihanBuku.class.getName()).log(Level.SEVERE, null, ex);
//        }

        Database db = new Database();
        sp = db.buatObjekSmartphone();

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

        panelHeader = new javax.swing.JPanel();
        fillerPreHeader = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        labelTitle = new javax.swing.JLabel();
        fillerMidHeader = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        labelEmail = new javax.swing.JLabel();
        fillerMid2Header = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        labelUserProfile = new javax.swing.JLabel();
        labelBeliBuku = new javax.swing.JLabel();
        fillerPosHeader = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        panelBody = new javax.swing.JPanel();
        scrollPaneMain = new javax.swing.JScrollPane();
        panelBackground = new javax.swing.JPanel();
        panelBodySupport = new javax.swing.JPanel();
        panelBodyBackground = new javax.swing.JPanel();
        panelFBSupport = new javax.swing.JPanel();
        fillerPreFB = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        labelFBTitle = new javax.swing.JLabel();
        panelABSupport = new javax.swing.JPanel();
        fillerPreAB = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        labelABTitle = new javax.swing.JLabel();
        panelAB = new javax.swing.JPanel();
        panelABBackground = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("YukBeliYuk - Katalog Buku");
        setMinimumSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        panelHeader.setBackground(new java.awt.Color(204, 213, 174));
        panelHeader.setMaximumSize(new java.awt.Dimension(32767, 60));
        panelHeader.setMinimumSize(new java.awt.Dimension(800, 60));
        panelHeader.setPreferredSize(new java.awt.Dimension(800, 60));
        panelHeader.setLayout(new javax.swing.BoxLayout(panelHeader, javax.swing.BoxLayout.LINE_AXIS));
        panelHeader.add(fillerPreHeader);

        labelTitle.setText("YukBeliYuk");
        panelHeader.add(labelTitle);
        panelHeader.add(fillerMidHeader);

        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelEmail.setText(pembeli.getNama());
        panelHeader.add(labelEmail);
        panelHeader.add(fillerMid2Header);

        labelUserProfile.setForeground(new java.awt.Color(255, 255, 255));
        labelUserProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelUserProfile.setText("\uf007");
        labelUserProfile.setMaximumSize(new java.awt.Dimension(30, 30));
        labelUserProfile.setMinimumSize(new java.awt.Dimension(30, 30));
        labelUserProfile.setPreferredSize(new java.awt.Dimension(30, 30));
        labelUserProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelUserProfileMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelUserProfileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelUserProfileMouseExited(evt);
            }
        });
        panelHeader.add(labelUserProfile);

        labelBeliBuku.setForeground(new java.awt.Color(255, 255, 255));
        labelBeliBuku.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBeliBuku.setText("\uf07a");
        labelBeliBuku.setMaximumSize(new java.awt.Dimension(30, 30));
        labelBeliBuku.setMinimumSize(new java.awt.Dimension(30, 30));
        labelBeliBuku.setPreferredSize(new java.awt.Dimension(30, 30));
        labelBeliBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelBeliBukuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelBeliBukuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelBeliBukuMouseExited(evt);
            }
        });
        panelHeader.add(labelBeliBuku);
        panelHeader.add(fillerPosHeader);

        getContentPane().add(panelHeader);

        panelBody.setMinimumSize(new java.awt.Dimension(822, 460));
        panelBody.setPreferredSize(new java.awt.Dimension(822, 460));
        panelBody.setLayout(new java.awt.BorderLayout());

        scrollPaneMain.setBorder(null);
        scrollPaneMain.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPaneMain.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPaneMain.setMinimumSize(new java.awt.Dimension(822, 460));
        scrollPaneMain.getVerticalScrollBar().setUnitIncrement(8);

        panelBackground.setBackground(new java.awt.Color(254, 250, 224));
        panelBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBackground.setLayout(new javax.swing.BoxLayout(panelBackground, javax.swing.BoxLayout.PAGE_AXIS));

        panelBodySupport.setBackground(new java.awt.Color(254, 250, 224));
        panelBodySupport.setLayout(new java.awt.BorderLayout());

        panelBodyBackground.setBackground(new java.awt.Color(233, 237, 201));
        panelBodyBackground.setLayout(new javax.swing.BoxLayout(panelBodyBackground, javax.swing.BoxLayout.PAGE_AXIS));

        panelFBSupport.setBackground(new java.awt.Color(233, 237, 201));
        panelFBSupport.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        panelFBSupport.setPreferredSize(new java.awt.Dimension(805, 50));
        panelFBSupport.setLayout(new javax.swing.BoxLayout(panelFBSupport, javax.swing.BoxLayout.LINE_AXIS));
        panelFBSupport.add(fillerPreFB);

        labelFBTitle.setText("Featured Books");
        labelFBTitle.setMaximumSize(new java.awt.Dimension(258, 50));
        labelFBTitle.setMinimumSize(new java.awt.Dimension(258, 50));
        labelFBTitle.setPreferredSize(new java.awt.Dimension(258, 50));
        panelFBSupport.add(labelFBTitle);

        panelBodyBackground.add(panelFBSupport);

        panelABSupport.setBackground(new java.awt.Color(233, 237, 201));
        panelABSupport.setMaximumSize(new java.awt.Dimension(2147483647, 50));
        panelABSupport.setMinimumSize(new java.awt.Dimension(258, 50));
        panelABSupport.setPreferredSize(new java.awt.Dimension(805, 50));
        panelABSupport.setLayout(new javax.swing.BoxLayout(panelABSupport, javax.swing.BoxLayout.LINE_AXIS));
        panelABSupport.add(fillerPreAB);

        labelABTitle.setText("All Books");
        labelABTitle.setMaximumSize(new java.awt.Dimension(164, 50));
        labelABTitle.setMinimumSize(new java.awt.Dimension(164, 50));
        labelABTitle.setPreferredSize(new java.awt.Dimension(164, 50));
        panelABSupport.add(labelABTitle);

        panelBodyBackground.add(panelABSupport);

        panelAB.setBackground(new java.awt.Color(254, 250, 224));
        panelAB.setLayout(new java.awt.BorderLayout());

        panelABBackground.setBackground(new java.awt.Color(254, 250, 224));
        panelABBackground.setMaximumSize(new java.awt.Dimension(32767, 25));
        panelABBackground.setMinimumSize(new java.awt.Dimension(0, 25));
        panelABBackground.setLayout(new javax.swing.BoxLayout(panelABBackground, javax.swing.BoxLayout.PAGE_AXIS));
        panelAB.add(panelABBackground, java.awt.BorderLayout.CENTER);
        LB();

        panelBodyBackground.add(panelAB);

        panelBodySupport.add(panelBodyBackground, java.awt.BorderLayout.CENTER);

        panelBackground.add(panelBodySupport);

        scrollPaneMain.setViewportView(panelBackground);

        panelBody.add(scrollPaneMain, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelBody);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelBeliBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBeliBukuMouseClicked

            Konfirmasi KO = new Konfirmasi(pembeli);
            KO.setLocation(getLocation());
            KO.setVisible(true);

            if (getExtendedState() == MAXIMIZED_BOTH) {
                KO.setExtendedState(MAXIMIZED_BOTH);
            } else {
                KO.setSize(getSize());
            }

            dispose();
        
    }//GEN-LAST:event_labelBeliBukuMouseClicked

    private void labelUserProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserProfileMouseClicked
//        if (pembeli.getNama().equals("Guest")) {
//            GuestAlert dSI = new GuestAlert(this);
//
//            dSI.setLocationRelativeTo(null);
//            dSI.setVisible(true);
//        } else {
//            InfoPengguna dIP = new InfoPengguna(this, pembeli);
//            dIP.setLocationRelativeTo(null);
//            dIP.setVisible(true);
//        }
    }//GEN-LAST:event_labelUserProfileMouseClicked

    private void labelUserProfileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserProfileMouseEntered
        labelUserProfile.setForeground(new java.awt.Color(233, 237, 201));
    }//GEN-LAST:event_labelUserProfileMouseEntered

    private void labelUserProfileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelUserProfileMouseExited
        labelUserProfile.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelUserProfileMouseExited

    private void labelBeliBukuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBeliBukuMouseEntered
        labelBeliBuku.setForeground(new java.awt.Color(233, 237, 201));
    }//GEN-LAST:event_labelBeliBukuMouseEntered

    private void labelBeliBukuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelBeliBukuMouseExited
        labelBeliBuku.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_labelBeliBukuMouseExited


    private void LB() {
        int size = 20;

        panelLBLoop = new javax.swing.JPanel[size];
        fillerLBLoopPre = new javax.swing.Box.Filler[size];
        labelLBLoop1 = new javax.swing.JLabel[size];
        fillerLBLoop = new javax.swing.Box.Filler[size];
        labelLBLoop2 = new javax.swing.JLabel[size];
        fillerLBLoopPos = new javax.swing.Box.Filler[size];
        buybtnLoop = new javax.swing.JButton[size];

        for (int i = 0; i < size; i++) {
            panelLBLoop[i] = new javax.swing.JPanel();
            fillerLBLoopPre[i] = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
            labelLBLoop1[i] = new javax.swing.JLabel();
            fillerLBLoop[i] = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
            //labelLBLoop2[i] = new javax.swing.JLabel();
            fillerLBLoopPos[i] = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
            buybtnLoop[i] = new javax.swing.JButton();

            panelLBLoop[i].setBackground(new java.awt.Color(254, 250, 224));
            panelLBLoop[i].setMaximumSize(new java.awt.Dimension(32767, 30));
            panelLBLoop[i].setMinimumSize(new java.awt.Dimension(0, 30));
            panelLBLoop[i].setLayout(new javax.swing.BoxLayout(panelLBLoop[i], javax.swing.BoxLayout.LINE_AXIS));
            panelLBLoop[i].add(fillerLBLoopPre[i]);

            //labelLBLoop1[i].setFont(konfigurasi.getRoboto(14));
            labelLBLoop1[i].setText(sp[i].getNama() + " by " + sp[i].getMerek());
            labelLBLoop1[i].setMaximumSize(new java.awt.Dimension(600, 30));
            labelLBLoop1[i].setMinimumSize(new java.awt.Dimension(500, 30));
            panelLBLoop[i].add(labelLBLoop1[i]);
            panelLBLoop[i].add(fillerLBLoop[i]);

            //labelLBLoop2[i].setFont(konfigurasi.getAwesome(18));
//            labelLBLoop2[i].setForeground(new java.awt.Color(204, 213, 174));
//            labelLBLoop2[i].setText("beli");
//            labelLBLoop2[i].setMinimumSize(new java.awt.Dimension(50, 25));
//            labelLBLoop2[i].setPreferredSize(new java.awt.Dimension(105, 25));
//            panelLBLoop[i].add(labelLBLoop2[i]);
//            panelLBLoop[i].add(fillerLBLoopPos[i]);

              buybtnLoop[i].setText("beli");
              buybtnLoop[i].setMinimumSize(new java.awt.Dimension(50, 25));
              buybtnLoop[i].setPreferredSize(new java.awt.Dimension(100, 50));
              panelLBLoop[i].add(buybtnLoop[i]);
              panelLBLoop[i].add(fillerLBLoopPos[i]);
              
              buybtnLoop[i].addActionListener(this);

              buybtnLoop[i].setName("" + i);
            panelLBLoop[i].setName("" + i);

            panelLBLoop[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    panelLBLoopMouseClicked(evt);
                }
            });

            panelABBackground.add(panelLBLoop[i]);
        }
    }

    private String getStar(double rating) {
        String stars = "";

        for (int i = 0; i < (int) rating; i++) {
            stars += "\uf005";
        }

        if (rating - (int) rating == 0.5) {
            stars += "\uf089";
        }

        return stars;
    }

    private void panelLBLoopMouseClicked(java.awt.event.MouseEvent evt) {
        javax.swing.JPanel panel = (javax.swing.JPanel) evt.getSource();
        int num = Integer.parseInt(panel.getName());

        LihatSmartphone dLB = new LihatSmartphone(this, sp[num], pembeli);
        dLB.setLocationRelativeTo(null);
        dLB.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        javax.swing.JButton button = (javax.swing.JButton) e.getSource();
        int num = Integer.parseInt(button.getName());
        
        LihatSmartphone dLB = new LihatSmartphone(this, sp[num], pembeli);
        dLB.beli();
    }

//    private void panelFBLoopMouseClicked(java.awt.event.MouseEvent evt) {
//        javax.swing.JPanel panel = (javax.swing.JPanel) evt.getSource();
//        int num = Integer.parseInt(panel.getName());
//
//        LihatBuku dLB = new LihatBuku(this, buku[num], pembeli);
//        dLB.setLocationRelativeTo(null);
//        dLB.setVisible(true);
//    }

    // Variables for Looping Featured books
    private javax.swing.JPanel[] panelFB;
    private javax.swing.JPanel[] panelFBLoop;
    private javax.swing.Box.Filler[] fillerFBLoop;
    private javax.swing.Box.Filler[] fillerFBLoopPre;
    private javax.swing.Box.Filler[] fillerFBLoopPos;
    private javax.swing.JLabel[] labelFBLoop;
    private java.awt.Image[] FB;

    // Variables for Looping Listed Books
    private javax.swing.JPanel[] panelLBLoop;
    private javax.swing.Box.Filler[] fillerLBLoop;
    private javax.swing.Box.Filler[] fillerLBLoopPre;
    private javax.swing.Box.Filler[] fillerLBLoopPos;
    private javax.swing.JLabel[] labelLBLoop1;
    private javax.swing.JLabel[] labelLBLoop2;
    private javax.swing.JButton[] buybtnLoop;

    private Smartphone[] sp;
    private final Pembeli pembeli;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler fillerMid2Header;
    private javax.swing.Box.Filler fillerMidHeader;
    private javax.swing.Box.Filler fillerPosHeader;
    private javax.swing.Box.Filler fillerPreAB;
    private javax.swing.Box.Filler fillerPreFB;
    private javax.swing.Box.Filler fillerPreHeader;
    private javax.swing.JLabel labelABTitle;
    private javax.swing.JLabel labelBeliBuku;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFBTitle;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelUserProfile;
    private javax.swing.JPanel panelAB;
    private javax.swing.JPanel panelABBackground;
    private javax.swing.JPanel panelABSupport;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelBodyBackground;
    private javax.swing.JPanel panelBodySupport;
    private javax.swing.JPanel panelFBSupport;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JScrollPane scrollPaneMain;
    // End of variables declaration//GEN-END:variables
}
