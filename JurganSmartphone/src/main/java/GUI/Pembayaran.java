package GUI;

import Classes.Pembeli;


public class Pembayaran extends javax.swing.JDialog {

    public Pembayaran(Pembeli pembeli) {
        this.pembeli = pembeli;
        this.status = false;

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
        java.awt.GridBagConstraints gridBagConstraints;

        panelPS = new javax.swing.JPanel();
        panelPSHeader = new javax.swing.JPanel();
        labelSIHeader1 = new javax.swing.JLabel();
        panelPSBody = new javax.swing.JPanel();
        panelPSEmail = new javax.swing.JPanel();
        labelPSEmail = new javax.swing.JLabel();
        fieldPSEmail = new javax.swing.JTextField();
        panelPSEmailSupport = new javax.swing.JPanel();
        panelPSEPass = new javax.swing.JPanel();
        labelPSPass = new javax.swing.JLabel();
        fieldPSPass = new javax.swing.JPasswordField();
        panelPSPassSupport = new javax.swing.JPanel();
        panelPSEmpty = new javax.swing.JPanel();
        labelSalah = new javax.swing.JLabel();
        panelPSFooter = new javax.swing.JPanel();
        buttonPSBayar = new javax.swing.JButton();
        buttonPSKembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Juragan Smartphone - Konfirmasi Pembayaran");
        setModal(true);
        setSize(new java.awt.Dimension(600, 450));

        panelPS.setMaximumSize(new java.awt.Dimension(600, 450));
        panelPS.setMinimumSize(new java.awt.Dimension(600, 450));
        panelPS.setPreferredSize(new java.awt.Dimension(600, 450));
        panelPS.setLayout(new javax.swing.BoxLayout(panelPS, javax.swing.BoxLayout.PAGE_AXIS));

        panelPSHeader.setBackground(new java.awt.Color(254, 250, 224));
        panelPSHeader.setMaximumSize(new java.awt.Dimension(2147483647, 60));
        panelPSHeader.setLayout(new java.awt.GridBagLayout());

        labelSIHeader1.setText("Konfirmasi Pembayaran");
        labelSIHeader1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        labelSIHeader1.setMaximumSize(new java.awt.Dimension(540, 60));
        labelSIHeader1.setMinimumSize(new java.awt.Dimension(540, 60));
        labelSIHeader1.setPreferredSize(new java.awt.Dimension(540, 60));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 30, 0, 30);
        panelPSHeader.add(labelSIHeader1, gridBagConstraints);

        panelPS.add(panelPSHeader);

        panelPSBody.setBackground(new java.awt.Color(254, 250, 224));
        panelPSBody.setLayout(new java.awt.GridBagLayout());

        panelPSEmail.setBackground(new java.awt.Color(254, 250, 224));
        panelPSEmail.setMaximumSize(new java.awt.Dimension(600, 60));
        panelPSEmail.setMinimumSize(new java.awt.Dimension(600, 60));
        panelPSEmail.setPreferredSize(new java.awt.Dimension(600, 60));
        panelPSEmail.setLayout(new java.awt.GridBagLayout());

        labelPSEmail.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPSEmail.setText("Email:");
        labelPSEmail.setMaximumSize(new java.awt.Dimension(100, 60));
        labelPSEmail.setMinimumSize(new java.awt.Dimension(100, 60));
        labelPSEmail.setPreferredSize(new java.awt.Dimension(100, 60));
        panelPSEmail.add(labelPSEmail, new java.awt.GridBagConstraints());

        fieldPSEmail.setEditable(false);
        fieldPSEmail.setBackground(new java.awt.Color(254, 250, 224));
        fieldPSEmail.setText(pembeli.getEmail());
        fieldPSEmail.setBorder(null);
        fieldPSEmail.setMaximumSize(new java.awt.Dimension(425, 50));
        fieldPSEmail.setMinimumSize(new java.awt.Dimension(425, 50));
        fieldPSEmail.setPreferredSize(new java.awt.Dimension(425, 50));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPSEmail.add(fieldPSEmail, gridBagConstraints);

        panelPSEmailSupport.setBackground(fieldPSEmail.getBackground());
        panelPSEmailSupport.setMaximumSize(new java.awt.Dimension(450, 50));
        panelPSEmailSupport.setMinimumSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout panelPSEmailSupportLayout = new javax.swing.GroupLayout(panelPSEmailSupport);
        panelPSEmailSupport.setLayout(panelPSEmailSupportLayout);
        panelPSEmailSupportLayout.setHorizontalGroup(
            panelPSEmailSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPSEmailSupportLayout.setVerticalGroup(
            panelPSEmailSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPSEmail.add(panelPSEmailSupport, gridBagConstraints);

        panelPSBody.add(panelPSEmail, new java.awt.GridBagConstraints());

        panelPSEPass.setBackground(new java.awt.Color(254, 250, 224));
        panelPSEPass.setMaximumSize(new java.awt.Dimension(600, 60));
        panelPSEPass.setMinimumSize(new java.awt.Dimension(600, 60));
        panelPSEPass.setPreferredSize(new java.awt.Dimension(600, 60));
        panelPSEPass.setLayout(new java.awt.GridBagLayout());

        labelPSPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelPSPass.setText("Pass:");
        labelPSPass.setMaximumSize(new java.awt.Dimension(100, 60));
        labelPSPass.setMinimumSize(new java.awt.Dimension(100, 60));
        labelPSPass.setPreferredSize(new java.awt.Dimension(100, 60));
        panelPSEPass.add(labelPSPass, new java.awt.GridBagConstraints());

        fieldPSPass.setBackground(new java.awt.Color(255, 255, 254));
        fieldPSPass.setBorder(null);
        fieldPSPass.setMaximumSize(new java.awt.Dimension(425, 50));
        fieldPSPass.setMinimumSize(new java.awt.Dimension(425, 50));
        fieldPSPass.setPreferredSize(new java.awt.Dimension(425, 50));
        fieldPSPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldPSPassFocusGained(evt);
            }
        });
        fieldPSPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPSPassKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPSEPass.add(fieldPSPass, gridBagConstraints);

        panelPSPassSupport.setBackground(fieldPSPass.getBackground());
        panelPSPassSupport.setMaximumSize(new java.awt.Dimension(450, 50));
        panelPSPassSupport.setMinimumSize(new java.awt.Dimension(450, 50));

        javax.swing.GroupLayout panelPSPassSupportLayout = new javax.swing.GroupLayout(panelPSPassSupport);
        panelPSPassSupport.setLayout(panelPSPassSupportLayout);
        panelPSPassSupportLayout.setHorizontalGroup(
            panelPSPassSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelPSPassSupportLayout.setVerticalGroup(
            panelPSPassSupportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        panelPSEPass.add(panelPSPassSupport, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        panelPSBody.add(panelPSEPass, gridBagConstraints);

        panelPSEmpty.setBackground(new java.awt.Color(254, 250, 224));
        panelPSEmpty.setMinimumSize(new java.awt.Dimension(600, 155));
        panelPSEmpty.setPreferredSize(new java.awt.Dimension(600, 175));
        panelPSEmpty.setLayout(new java.awt.BorderLayout());

        labelSalah.setForeground(new java.awt.Color(255, 0, 0));
        labelSalah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSalah.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        panelPSEmpty.add(labelSalah, java.awt.BorderLayout.CENTER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        panelPSBody.add(panelPSEmpty, gridBagConstraints);

        panelPS.add(panelPSBody);

        panelPSFooter.setBackground(new java.awt.Color(250, 237, 205));
        panelPSFooter.setMaximumSize(new java.awt.Dimension(32767, 75));
        panelPSFooter.setMinimumSize(new java.awt.Dimension(600, 75));

        buttonPSBayar.setBackground(new java.awt.Color(212, 163, 115));
        buttonPSBayar.setText("Bayar");
        buttonPSBayar.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonPSBayar.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonPSBayar.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonPSBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPSBayarActionPerformed(evt);
            }
        });

        buttonPSKembali.setBackground(new java.awt.Color(212, 163, 115));
        buttonPSKembali.setText("Kembali");
        buttonPSKembali.setMaximumSize(new java.awt.Dimension(175, 50));
        buttonPSKembali.setMinimumSize(new java.awt.Dimension(175, 50));
        buttonPSKembali.setPreferredSize(new java.awt.Dimension(175, 50));
        buttonPSKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPSKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPSFooterLayout = new javax.swing.GroupLayout(panelPSFooter);
        panelPSFooter.setLayout(panelPSFooterLayout);
        panelPSFooterLayout.setHorizontalGroup(
            panelPSFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPSFooterLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(buttonPSKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonPSBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(199, 199, 199))
        );
        panelPSFooterLayout.setVerticalGroup(
            panelPSFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPSFooterLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(panelPSFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonPSBayar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPSKembali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );

        panelPS.add(panelPSFooter);

        getContentPane().add(panelPS, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPSBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPSBayarActionPerformed
        cekPassword();
    }//GEN-LAST:event_buttonPSBayarActionPerformed

    private void buttonPSKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPSKembaliActionPerformed
        dispose();
    }//GEN-LAST:event_buttonPSKembaliActionPerformed

    private void fieldPSPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPSPassKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            cekPassword();
        }
    }//GEN-LAST:event_fieldPSPassKeyPressed

    private void fieldPSPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPSPassFocusGained
        labelSalah.setText("");
    }//GEN-LAST:event_fieldPSPassFocusGained

    private void cekPassword() {
        String passW = String.valueOf(fieldPSPass.getPassword());
        if (passW.equals(pembeli.getPassword())) {
            status = true;
            dispose();
        } else {
            labelSalah.setText("\nPassword yang anda masukkan salah.");
            fieldPSPass.setText("");
        }
    }

    public boolean getStatus() {
        return status;
    }

    private Pembeli pembeli;
    private boolean status;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPSBayar;
    private javax.swing.JButton buttonPSKembali;
    private javax.swing.JTextField fieldPSEmail;
    private javax.swing.JPasswordField fieldPSPass;
    private javax.swing.JLabel labelPSEmail;
    private javax.swing.JLabel labelPSPass;
    private javax.swing.JLabel labelSIHeader1;
    private javax.swing.JLabel labelSalah;
    private javax.swing.JPanel panelPS;
    private javax.swing.JPanel panelPSBody;
    private javax.swing.JPanel panelPSEPass;
    private javax.swing.JPanel panelPSEmail;
    private javax.swing.JPanel panelPSEmailSupport;
    private javax.swing.JPanel panelPSEmpty;
    private javax.swing.JPanel panelPSFooter;
    private javax.swing.JPanel panelPSHeader;
    private javax.swing.JPanel panelPSPassSupport;
    // End of variables declaration//GEN-END:variables
}
