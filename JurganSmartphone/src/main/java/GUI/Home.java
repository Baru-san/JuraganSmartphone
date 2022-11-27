package GUI;

import Classes.Smartphone;
import Classes.Pembeli;
import Databases.Database;
import Databases.Fonts.ExFont;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Home extends javax.swing.JFrame implements ActionListener {

    public Home(Pembeli pembeli) {
        this.sp = new Smartphone[30];
        this.pembeli = pembeli;

        try {
            this.Xfont = new ExFont();
        } catch (IOException | FontFormatException ex) {}


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

        PanelGradient = new keeptoo.KGradientPanel();
        fillerPreHeader = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        labelTitle = new javax.swing.JLabel();
        fillerMidHeader = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Email = new javax.swing.JLabel();
        fillerMid2Header = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        logoutlabel = new javax.swing.JLabel();
        IconKeranjang = new javax.swing.JLabel();
        fillerPosHeader = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        jPanel2 = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();
        scrollPaneMain = new javax.swing.JScrollPane();
        panelBackground = new javax.swing.JPanel();
        panelBodySupport = new javax.swing.JPanel();
        panelBodyBackground = new javax.swing.JPanel();
        panelAB = new javax.swing.JPanel();
        panelABBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juragan Smartphone - Produk");
        setMinimumSize(new java.awt.Dimension(600, 500));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        PanelGradient.setkGradientFocus(1500);
        PanelGradient.setkStartColor(new java.awt.Color(0, 230, 204));
        PanelGradient.setPreferredSize(new java.awt.Dimension(286, 60));
        PanelGradient.setLayout(new javax.swing.BoxLayout(PanelGradient, javax.swing.BoxLayout.LINE_AXIS));
        PanelGradient.add(fillerPreHeader);

        labelTitle.setFont(Xfont.getOmegle(25)
        );
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setText("JuraganSmartphone");
        PanelGradient.add(labelTitle);
        labelTitle.getAccessibleContext().setAccessibleName("");

        PanelGradient.add(fillerMidHeader);

        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Email.setText(pembeli.getNama());
        PanelGradient.add(Email);
        PanelGradient.add(fillerMid2Header);

        logoutlabel.setForeground(new java.awt.Color(255, 255, 255));
        logoutlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutlabel.setText("Log out");
        logoutlabel.setToolTipText("");
        logoutlabel.setMaximumSize(new java.awt.Dimension(100, 50));
        logoutlabel.setMinimumSize(new java.awt.Dimension(100, 50));
        logoutlabel.setPreferredSize(new java.awt.Dimension(100, 50));
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutlabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutlabelMouseExited(evt);
            }
        });
        PanelGradient.add(logoutlabel);

        IconKeranjang.setFont(Xfont.getIcons(25)
        );
        IconKeranjang.setForeground(new java.awt.Color(255, 255, 255));
        IconKeranjang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconKeranjang.setText("c");
        IconKeranjang.setMaximumSize(new java.awt.Dimension(30, 30));
        IconKeranjang.setMinimumSize(new java.awt.Dimension(30, 30));
        IconKeranjang.setPreferredSize(new java.awt.Dimension(30, 30));
        IconKeranjang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconKeranjangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconKeranjangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconKeranjangMouseExited(evt);
            }
        });
        PanelGradient.add(IconKeranjang);
        PanelGradient.add(fillerPosHeader);

        getContentPane().add(PanelGradient);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel2);

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

        panelAB.setBackground(new java.awt.Color(254, 250, 224));
        panelAB.setLayout(new java.awt.BorderLayout());

        panelABBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelABBackground.setMaximumSize(new java.awt.Dimension(32767, 25));
        panelABBackground.setMinimumSize(new java.awt.Dimension(0, 25));
        panelABBackground.setLayout(new javax.swing.BoxLayout(panelABBackground, javax.swing.BoxLayout.PAGE_AXIS));
        panelAB.add(panelABBackground, java.awt.BorderLayout.CENTER);
        ListSmartphone();

        panelBodyBackground.add(panelAB);

        panelBodySupport.add(panelBodyBackground, java.awt.BorderLayout.CENTER);

        panelBackground.add(panelBodySupport);

        scrollPaneMain.setViewportView(panelBackground);

        panelBody.add(scrollPaneMain, java.awt.BorderLayout.CENTER);

        jPanel1.setPreferredSize(new java.awt.Dimension(0, 0));
        panelBody.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(panelBody);

        getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IconKeranjangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconKeranjangMouseClicked

            DaftarBelanja KO = new DaftarBelanja(pembeli);
            KO.setLocation(getLocation());
            KO.setVisible(true);

            if (getExtendedState() == MAXIMIZED_BOTH) {
                KO.setExtendedState(MAXIMIZED_BOTH);
            } else {
                KO.setSize(getSize());
            }

            dispose();
        
    }//GEN-LAST:event_IconKeranjangMouseClicked

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        Login lg = new Login();
        lg.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutlabelMouseClicked

    private void logoutlabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseEntered
        logoutlabel.setForeground(new java.awt.Color(233, 237, 201));
    }//GEN-LAST:event_logoutlabelMouseEntered

    private void logoutlabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseExited
        logoutlabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_logoutlabelMouseExited

    private void IconKeranjangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconKeranjangMouseEntered
        IconKeranjang.setForeground(new java.awt.Color(233, 237, 201));
    }//GEN-LAST:event_IconKeranjangMouseEntered

    private void IconKeranjangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconKeranjangMouseExited
        IconKeranjang.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_IconKeranjangMouseExited


    private void ListSmartphone() {
        int size = 20;

        panelLSLoop = new javax.swing.JPanel[size];
        fillerLSLoopPre = new javax.swing.Box.Filler[size];
        labelLSLoop1 = new javax.swing.JLabel[size];
        fillerLSLoop = new javax.swing.Box.Filler[size];
        fillerLSLoopPos = new javax.swing.Box.Filler[size];
        buybtnLoop = new javax.swing.JButton[size];

        for (int i = 0; i < size; i++) {
            panelLSLoop[i] = new javax.swing.JPanel();
            fillerLSLoopPre[i] = new javax.swing.Box.Filler(new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 0), new java.awt.Dimension(250, 32767));
            labelLSLoop1[i] = new javax.swing.JLabel();
            fillerLSLoop[i] = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
            fillerLSLoopPos[i] = new javax.swing.Box.Filler(new java.awt.Dimension(250, 0), new java.awt.Dimension(250,0), new java.awt.Dimension(250, 32767));
            buybtnLoop[i] = new javax.swing.JButton();

            panelLSLoop[i].setBackground(new java.awt.Color(255, 255, 255));
            panelLSLoop[i].setMaximumSize(new java.awt.Dimension(32767, 30));
            panelLSLoop[i].setMinimumSize(new java.awt.Dimension(0, 30));
            panelLSLoop[i].setLayout(new javax.swing.BoxLayout(panelLSLoop[i], javax.swing.BoxLayout.LINE_AXIS));
            panelLSLoop[i].add(fillerLSLoopPre[i]);

            labelLSLoop1[i].setText(sp[i].getNama() + " by " + sp[i].getMerek());
            labelLSLoop1[i].setFont(Xfont.getBaxoe(15));
            labelLSLoop1[i].setMaximumSize(new java.awt.Dimension(600, 30));
            labelLSLoop1[i].setMinimumSize(new java.awt.Dimension(500, 30));
            panelLSLoop[i].add(labelLSLoop1[i]);
            panelLSLoop[i].add(fillerLSLoop[i]);

            buybtnLoop[i].setText("Beli");
            buybtnLoop[i].setMinimumSize(new java.awt.Dimension(50, 25));
            buybtnLoop[i].setPreferredSize(new java.awt.Dimension(100, 50));
            buybtnLoop[i].setBackground(new java.awt.Color(0,200,255));
            buybtnLoop[i].setForeground(new java.awt.Color(255,255,255));
            buybtnLoop[i].setFont(Xfont.getBaxoe(10));
            panelLSLoop[i].add(buybtnLoop[i]);
            panelLSLoop[i].add(fillerLSLoopPos[i]);
              
              buybtnLoop[i].addActionListener(this);

              buybtnLoop[i].setName("" + i);
            panelLSLoop[i].setName("" + i);

            panelLSLoop[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    panelLBLoopMouseClicked(evt);
                }
            });

            panelABBackground.add(panelLSLoop[i]);
        }
    }

    private void panelLBLoopMouseClicked(java.awt.event.MouseEvent evt) {
        javax.swing.JPanel panel = (javax.swing.JPanel) evt.getSource();
        int num = Integer.parseInt(panel.getName());

        PreviewSmartphone dLB = new PreviewSmartphone(this, sp[num], pembeli);
        dLB.setLocationRelativeTo(null);
        dLB.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        javax.swing.JButton button = (javax.swing.JButton) e.getSource();
        int num = Integer.parseInt(button.getName());
        
        PreviewSmartphone dPS = new PreviewSmartphone(this, sp[num], pembeli);
        dPS.beli();
        int kondisi = 1;
        PopUp popbeli = new PopUp(kondisi);
        popbeli.setLocationRelativeTo(null);
        popbeli.setVisible(true);
    }

    
    // Variables for Looping Listed Books
    private javax.swing.JPanel[] panelLSLoop;
    private javax.swing.Box.Filler[] fillerLSLoop;
    private javax.swing.Box.Filler[] fillerLSLoopPre;
    private javax.swing.Box.Filler[] fillerLSLoopPos;
    private javax.swing.JLabel[] labelLSLoop1;
    private javax.swing.JButton[] buybtnLoop;

    private Smartphone[] sp;
    private final Pembeli pembeli;
    private ExFont Xfont;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Email;
    private javax.swing.JLabel IconKeranjang;
    private keeptoo.KGradientPanel PanelGradient;
    private javax.swing.Box.Filler fillerMid2Header;
    private javax.swing.Box.Filler fillerMidHeader;
    private javax.swing.Box.Filler fillerPosHeader;
    private javax.swing.Box.Filler fillerPreHeader;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel panelAB;
    private javax.swing.JPanel panelABBackground;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelBodyBackground;
    private javax.swing.JPanel panelBodySupport;
    private javax.swing.JScrollPane scrollPaneMain;
    // End of variables declaration//GEN-END:variables
}
