/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Pembeli;
import Classes.Registrasi;


import java.awt.Frame;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class InfoPengguna extends javax.swing.JFrame {

    /**
     * Creates new form InfoPengguna
     */
    public InfoPengguna(java.awt.Frame parent, Pembeli pembeli) {
        this.parent = parent;
        this.pembeli = pembeli;
        
        initComponents();
    }
    
    public InfoPengguna(java.awt.Frame parent, Registrasi regis){
        this.parent = parent;
        this.pembeli = regis;
        this.regis = regis;
        
        initComponents();
        
        emailField.setText(regis.getEmail());
        emailField.setEditable(false);
        
        namaField.setEditable(true);
        namaField.setBackground(java.awt.Color.white);
        panelNamaSupport.setBackground(namaField.getBackground());
        Logoutbtn.setText("Create Account");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        emailField = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        EmailLabel = new javax.swing.JLabel();
        panelNamaSupport = new javax.swing.JPanel();
        namaField = new javax.swing.JTextField();
        Logoutbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(102, 0, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 255, 204));

        emailField.setBorder(null);
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Info pengguna");

        namaLabel.setForeground(new java.awt.Color(255, 255, 255));
        namaLabel.setText("Nama :");
        namaLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email  :");

        panelNamaSupport.setBackground(new java.awt.Color(255, 255, 255));

        namaField.setBorder(null);
        namaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaFieldActionPerformed(evt);
            }
        });
        namaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namaFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panelNamaSupportLayout = new javax.swing.GroupLayout(panelNamaSupport);
        panelNamaSupport.setLayout(panelNamaSupportLayout);
        panelNamaSupportLayout.setHorizontalGroup(
            panelNamaSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNamaSupportLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelNamaSupportLayout.setVerticalGroup(
            panelNamaSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(namaField, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        Logoutbtn.setText("Log out");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmailLabel)
                            .addComponent(namaLabel))
                        .addGap(37, 37, 37)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelNamaSupport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addContainerGap(119, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title)
                            .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Title)
                .addGap(58, 58, 58)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelNamaSupport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaLabel))
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logoutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        Logoutbtn.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        if (regis != null){
            if(regis.getNama().equals("")){
                createAccountAction();
            }
        }
        else {
            Login log = new Login();
            log.setLocation(parent.getLocation());
            log.setVisible(true);
            
            if(parent.getExtendedState() == Frame.MAXIMIZED_BOTH) {
                log.setExtendedState(Frame.MAXIMIZED_BOTH);
            }
            else {
                log.setSize(parent.getSize());
            }
            parent.dispose();
            dispose();
        }
    }//GEN-LAST:event_LogoutbtnActionPerformed

    private void namaFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaFieldKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            createAccountAction();
        }
    }//GEN-LAST:event_namaFieldKeyPressed

    private void createAccountAction() {
        String nama = namaField.getText().trim();
        if(nama.equals("")) {
            nama = "User-" + regis.getEmail();
        }
        
        regis.setNama(nama);
        
        try{
            regis.registrasiUser();
        } catch (IOException ex) {
            Logger.getLogger(InfoPengguna.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Home home = new Home();
        home.setLocation(parent.getLocation());
        home.setVisible(true);
        
        if (parent.getExtendedState() == Frame.MAXIMIZED_BOTH) {
            home.setExtendedState(Frame.MAXIMIZED_BOTH);
        } else {
            home.setSize(parent.getSize());
        }
        
        parent.dispose();
        dispose();
    }
    
    private final java.awt.Frame parent;
    private Pembeli pembeli;
    private Registrasi regis;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JButton Logoutbtn;
    private javax.swing.JLabel Title;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailField;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JPanel panelNamaSupport;
    // End of variables declaration//GEN-END:variables
}
