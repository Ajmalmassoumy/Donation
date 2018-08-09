package donation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class Contributed1 extends javax.swing.JFrame {

    public Contributed1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Fnametxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Lnametxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CNtxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ZibCtxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        SCtxt = new javax.swing.JTextField();
        SC1 = new javax.swing.JLabel();
        Emailtxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        MCombob = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        SubmitB = new javax.swing.JButton();
        Amounttxt = new javax.swing.JTextField();
        YCombob = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setForeground(new java.awt.Color(0, 0, 102));

        jLabel8.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Contribute amount");

        jLabel10.setIcon(new javax.swing.ImageIcon("/Users/ajmalmassoumy/Desktop/FinaleProject/Imges/Credit-Card-Symbols.jpg")); // NOI18N

        jLabel11.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("First name on card");

        jLabel12.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 102));
        jLabel12.setText("Last name on card");

        jLabel13.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 102));
        jLabel13.setText("Card number");

        jLabel14.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 102));
        jLabel14.setText("Expiration date");

        jLabel15.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 102));
        jLabel15.setText("Zip Code");

        SC1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        SC1.setForeground(new java.awt.Color(0, 0, 102));
        SC1.setText("Security Code");

        jLabel16.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 102));
        jLabel16.setText("Email Address");

        MCombob.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        MCombob.setForeground(new java.awt.Color(0, 0, 102));
        MCombob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan (01)", "Feb (02)", "Mar (03)", "Apr (04)", "May (05)", "Jun (06)", "Jul (07)", "Agu (08)", "Sep (09)", "Oct (10)", "Nov (11)", "Dec (12)" }));
        MCombob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCombobActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Mshtakan", 1, 18)); // NOI18N
        jLabel17.setText("Contribution Information");

        jButton1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SubmitB.setBackground(new java.awt.Color(153, 153, 153));
        SubmitB.setFont(new java.awt.Font("Superclarendon", 0, 14)); // NOI18N
        SubmitB.setForeground(new java.awt.Color(0, 0, 102));
        SubmitB.setText("Submit");
        SubmitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBActionPerformed(evt);
            }
        });

        Amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmounttxtActionPerformed(evt);
            }
        });

        YCombob.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        YCombob.setForeground(new java.awt.Color(0, 0, 102));
        YCombob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(SC1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(YCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SubmitB, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                                    .addComponent(ZibCtxt)
                                    .addComponent(SCtxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CNtxt)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(Amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 6, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lnametxt)
                            .addComponent(Fnametxt))))
                .addGap(149, 149, 149))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(Amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CNtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(YCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ZibCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SCtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SC1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Mshtakan", 1, 16)); // NOI18N
        jButton5.setText("<");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setText("Log out");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setFont(new java.awt.Font("Mshtakan", 1, 16)); // NOI18N
        jButton7.setText(">");
        jButton7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton5)
                                .addComponent(jButton7))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(649, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MCombobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCombobActionPerformed

    }//GEN-LAST:event_MCombobActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Amounttxt.setText(null);
        Fnametxt.setText(null);
        Lnametxt.setText(null);
        CNtxt.setText(null);
        ZibCtxt.setText(null);
        SCtxt.setText(null);
        Emailtxt.setText(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void SubmitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBActionPerformed

        String CAmount = Amounttxt.getText();
        String Fname = Fnametxt.getText();
        String Lname = Lnametxt.getText();
        String CardN = CNtxt.getText();
        String Zibcode = ZibCtxt.getText();
        String SecurityC = SCtxt.getText();
        String Email = Emailtxt.getText();

        if (Fname.isEmpty() || Lname.isEmpty() || CardN.isEmpty()
                || Zibcode.isEmpty() || SecurityC == null || Email == null) {
            JOptionPane.showMessageDialog(null, "Please fill all the feilds", "Submit Error",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            try {

                FileWriter fw = new FileWriter("Contrubited1.text", true);
                try (PrintWriter pw = new PrintWriter(fw)) {
                    pw.println();
                    pw.println("Contributed to General Raziq\n");
                    pw.println("Contributed amount:\t$ " + CAmount);//Integer.toString(CAmount));
                    pw.println("First name: \t\t" + Fname);
                    pw.println("Last name: \t\t" + Lname);
                    pw.println("Card Number: \t\t" + CardN);

                    if (MCombob.getSelectedItem().equals("Jan (01)")) {
                        pw.print("Expiration date:\tJan (01)");
                    }
                    if (MCombob.getSelectedItem().equals("Feb (02)")) {
                        pw.print("Expiration date:\tFeb (02");
                    }
                    if (MCombob.getSelectedItem().equals("Mar (03)")) {
                        pw.print("Expiration date:\tMar (03)");
                    }
                    if (MCombob.getSelectedItem().equals("Apr (04)")) {
                        pw.print("Expiration date:\tApr (04)");
                    }
                    if (MCombob.getSelectedItem().equals("May (05")) {
                        pw.print("Expiration date:\t(05");
                    }
                    if (MCombob.getSelectedItem().equals("Jun (06)")) {
                        pw.print("Expiration date:\tJun (06)");
                    }
                    if (MCombob.getSelectedItem().equals("Jul (07)")) {
                        pw.print("Expiration date:\tJul (07)");
                    }
                    if (MCombob.getSelectedItem().equals("Agu (08)")) {
                        pw.print("Expiration date:\tAgu (08)");
                    }
                    if (MCombob.getSelectedItem().equals("Sep (09)")) {
                        pw.print("Expiration date:\tSep (09)");
                    }
                    if (MCombob.getSelectedItem().equals("Oct (10)")) {
                        pw.print("Expiration date:\tOct (10)");
                    }
                    if (MCombob.getSelectedItem().equals("Nov (11)")) {
                        pw.print("Expiration date:\tNov (11)");
                    }
                    if (MCombob.getSelectedItem().equals("Dec (12)")) {
                        pw.print("Expiration date:\tDec (12)");
                    }
                    if (YCombob.getSelectedItem().equals("2017")) {
                        pw.print("  " + "2017");
                    }
                    if (YCombob.getSelectedItem().equals("2018")) {
                        pw.print("  " + "2018");
                    }
                    if (YCombob.getSelectedItem().equals("2019")) {
                        pw.print("  " + "2019");
                    }
                    if (YCombob.getSelectedItem().equals("20120")) {
                        pw.print("  " + "2020");
                    }
                    if (YCombob.getSelectedItem().equals("2021")) {
                        pw.print("  " + "2021");
                    }
                    if (YCombob.getSelectedItem().equals("22")) {
                        pw.print("  " + "22");
                    }
                    if (YCombob.getSelectedItem().equals("2023")) {
                        pw.print("  " + "2023");
                    }
                    if (YCombob.getSelectedItem().equals("2024")) {
                        pw.print("  " + "2024");
                    }
                    pw.println();
                    pw.println("Zip code:\t\t" + Zibcode);
                    pw.println("Security Code:\t\t" + SecurityC);
                    pw.println("Email: \t\t\t" + Email);
                    pw.close();
                }

            } catch (IOException ex) {
                JOptionPane.showInputDialog(null, "The file not found", "Error", JOptionPane.PLAIN_MESSAGE);
            }

            setVisible(false);
            Lastpage info = new Lastpage();
            info.setVisible(true);
        }
    }//GEN-LAST:event_SubmitBActionPerformed

    private void AmounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmounttxtActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_AmounttxtActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        Logedin Info = new Logedin();
        Info.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        setVisible(false);
        Lastpage Info = new Lastpage();
        Info.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contributed1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contributed1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contributed1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contributed1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Contributed1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amounttxt;
    private javax.swing.JTextField CNtxt;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JTextField Fnametxt;
    private javax.swing.JTextField Lnametxt;
    private javax.swing.JComboBox<String> MCombob;
    private javax.swing.JLabel SC1;
    private javax.swing.JTextField SCtxt;
    private javax.swing.JButton SubmitB;
    private javax.swing.JComboBox<String> YCombob;
    private javax.swing.JTextField ZibCtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
