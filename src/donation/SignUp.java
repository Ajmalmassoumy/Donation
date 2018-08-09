package donation;

import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        Passwordtxt = new javax.swing.JPasswordField();
        FemaleB = new javax.swing.JRadioButton();
        MaleB = new javax.swing.JRadioButton();
        CreateB = new javax.swing.JButton();
        BLoginB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Countrytxt = new javax.swing.JTextField();
        Usernametxt = new javax.swing.JTextField();
        Emailtxt = new javax.swing.JTextField();
        Lnametxt = new javax.swing.JTextField();
        Fnametxt = new javax.swing.JTextField();
        Citytxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ResetB = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MCombob = new javax.swing.JComboBox<>();
        YCombob = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        label1.setText("Sign Up");

        Passwordtxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        FemaleB.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        FemaleB.setForeground(new java.awt.Color(0, 0, 102));
        FemaleB.setText("Female");
        FemaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleBActionPerformed(evt);
            }
        });

        MaleB.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        MaleB.setForeground(new java.awt.Color(0, 0, 102));
        MaleB.setText("Male");
        MaleB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleBActionPerformed(evt);
            }
        });

        CreateB.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        CreateB.setForeground(new java.awt.Color(0, 0, 102));
        CreateB.setText("Create an account");
        CreateB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateBActionPerformed(evt);
            }
        });

        BLoginB.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        BLoginB.setForeground(new java.awt.Color(0, 0, 102));
        BLoginB.setText("I have an account! let me log in");
        BLoginB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoginBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Country");

        Countrytxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Usernametxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Emailtxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Lnametxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Fnametxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Citytxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("City");

        ResetB.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        ResetB.setForeground(new java.awt.Color(0, 0, 102));
        ResetB.setText("Reset");
        ResetB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ResetB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Firstname");

        jLabel6.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Lastname");

        jLabel7.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setText("Username");

        jLabel10.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("Birthday");

        MCombob.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        MCombob.setForeground(new java.awt.Color(0, 0, 102));
        MCombob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan(01)", "Feb(02)", "Mar(03)", "Apr(04)", "May(05)", "Jun(06)", "Jul(07)", "Agu(08)", "Sep(09)", "Oct(10)", "Nov(11)", "Dec(12)" }));
        MCombob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCombobActionPerformed(evt);
            }
        });

        YCombob.setFont(new java.awt.Font("Superclarendon", 0, 13)); // NOI18N
        YCombob.setForeground(new java.awt.Color(0, 0, 102));
        YCombob.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addComponent(MaleB)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(BLoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ResetB, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(90, 90, 90)
                                    .addComponent(CreateB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Countrytxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Citytxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(FemaleB)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(MCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(YCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(YCombob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MaleB)
                    .addComponent(FemaleB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Citytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Countrytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CreateB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLoginB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BLoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoginBActionPerformed
        setVisible(false);
        Login info = new Login();
        info.setVisible(true);
    }//GEN-LAST:event_BLoginBActionPerformed

    private void CreateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateBActionPerformed

        String Fname = Fnametxt.getText();
        String Lname = Lnametxt.getText();
        String Email = Emailtxt.getText();
        String Username = Usernametxt.getText();
        String Password = Passwordtxt.getText();
        String City = Citytxt.getText();
        String Country = Countrytxt.getText();

        try {
            FileWriter fw = new FileWriter("DataBase.text", true);
            try (PrintWriter pw = new PrintWriter(fw)) {
                pw.println("First name: \t\t" + Fname);
                pw.println("Last name: \t\t" + Lname);
                pw.println("Email: \t\t\t" + Email);
                pw.println("Username: \t\t" + Username);
                pw.println("Password: \t\t" + Password);
                if (MCombob.getSelectedItem().equals("Jan(01)")) {
                    pw.print("Expiration date:\tJan (01)");
                }
                if (MCombob.getSelectedItem().equals("Feb(02)")) {
                    pw.print("Expiration date:\tFeb (02");
                }
                if (MCombob.getSelectedItem().equals("Mar(03)")) {
                    pw.print("Expiration date:\tMar (03)");
                }
                if (MCombob.getSelectedItem().equals("Apr(04)")) {
                    pw.print("Expiration date:\tApr (04)");
                }
                if (MCombob.getSelectedItem().equals("May(05")) {
                    pw.print("Expiration date:\t(05");
                }
                if (MCombob.getSelectedItem().equals("Jun(06)")) {
                    pw.print("Expiration date:\tJun (06)");
                }
                if (MCombob.getSelectedItem().equals("Jul(07)")) {
                    pw.print("Expiration date:\tJul (07)");
                }
                if (MCombob.getSelectedItem().equals("Agu(08)")) {
                    pw.print("Expiration date:\tAgu (08)");
                }
                if (MCombob.getSelectedItem().equals("Sep(09)")) {
                    pw.print("Expiration date:\tSep (09)");
                }
                if (MCombob.getSelectedItem().equals("Oct(10)")) {
                    pw.print("Expiration date:\tOct (10)");
                }
                if (MCombob.getSelectedItem().equals("Nov(11)")) {
                    pw.print("Expiration date:\tNov (11)");
                }
                if (MCombob.getSelectedItem().equals("Dec(12)")) {
                    pw.print("Expiration date:\tDec (12)");
                }
                if (YCombob.getSelectedItem().equals("2001")) {
                    pw.print("  " + "2001");
                }
                if (YCombob.getSelectedItem().equals("2000")) {
                    pw.print("  " + "2000");
                }
                if (YCombob.getSelectedItem().equals("1999")) {
                    pw.print("  " + "1999");
                }
                if (YCombob.getSelectedItem().equals("1998")) {
                    pw.print("  " + "1998");
                }
                if (YCombob.getSelectedItem().equals("1997")) {
                    pw.print("  " + "1997");
                }
                if (YCombob.getSelectedItem().equals("1996")) {
                    pw.print("  " + "1996");
                }
                if (YCombob.getSelectedItem().equals("1995")) {
                    pw.print("  " + "1995");
                }
                if (YCombob.getSelectedItem().equals("1994")) {
                    pw.print("  " + "1994");
                }
                if (YCombob.getSelectedItem().equals("1993")) {
                    pw.print("  " + "1993");
                }
                if (YCombob.getSelectedItem().equals("1992")) {
                    pw.print("  " + "1992");
                }
                if (YCombob.getSelectedItem().equals("1991")) {
                    pw.print("  " + "1991");
                }
                if (YCombob.getSelectedItem().equals("1990")) {
                    pw.print("  " + "1990");
                }
                if (YCombob.getSelectedItem().equals("1989")) {
                    pw.print("  " + "1989");
                }
                if (YCombob.getSelectedItem().equals("1988")) {
                    pw.print("  " + "1988");
                }
                if (YCombob.getSelectedItem().equals("1987")) {
                    pw.print("  " + "1987");
                }
                if (YCombob.getSelectedItem().equals("1986")) {
                    pw.print("  " + "1986");
                }
                if (YCombob.getSelectedItem().equals("1985")) {
                    pw.print("  " + "1985");
                }
                if (YCombob.getSelectedItem().equals("1984")) {
                    pw.print("  " + "1984");
                }
                if (YCombob.getSelectedItem().equals("1983")) {
                    pw.print("  " + "1983");
                }
                if (YCombob.getSelectedItem().equals("1982")) {
                    pw.print("  " + "1982");
                }

                if (YCombob.getSelectedItem().equals("1981")) {
                    pw.print("  " + "1981");
                }
                if (YCombob.getSelectedItem().equals("1980")) {
                    pw.print("  " + "1980");
                }
                if (YCombob.getSelectedItem().equals("1979")) {
                    pw.print("  " + "1979");
                }
                if (YCombob.getSelectedItem().equals("1978")) {
                    pw.print("  " + "1978");
                }
                pw.println();

                if (MaleB.isSelected()) {
                    pw.println("Male: \t\t\t" + "Male");
                } else if (FemaleB.isSelected()) {
                    pw.println("Female: \t\t" + "Female");
                }
                pw.println("City: \t\t\t" + City);
                pw.println("Country: \t\t" + Country);
                pw.close();
            }
        } catch (IOException ex) {
            JOptionPane.showInputDialog(null, "The file not found", "Error", JOptionPane.PLAIN_MESSAGE);
        }
        setVisible(false);
        Login info = new Login();
        info.setVisible(true);
    }//GEN-LAST:event_CreateBActionPerformed

    private void MaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleBActionPerformed
        if (MaleB.isSelected()) {
            FemaleB.setSelected(false);
        }
    }//GEN-LAST:event_MaleBActionPerformed

    private void ResetBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBActionPerformed
        Fnametxt.setText(null);
        Lnametxt.setText(null);
        Emailtxt.setText(null);
        Usernametxt.setText(null);
        Passwordtxt.setText(null);
        MaleB.setSelected(false);
        FemaleB.setSelected(false);
        Citytxt.setText(null);
        Countrytxt.setText(null);

    }//GEN-LAST:event_ResetBActionPerformed

    private void FemaleBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleBActionPerformed
        if (FemaleB.isSelected()) {
            MaleB.setSelected(false);

        }

    }//GEN-LAST:event_FemaleBActionPerformed

    private void MCombobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCombobActionPerformed

    }//GEN-LAST:event_MCombobActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BLoginB;
    private javax.swing.JTextField Citytxt;
    private javax.swing.JTextField Countrytxt;
    private javax.swing.JButton CreateB;
    private javax.swing.JTextField Emailtxt;
    private javax.swing.JRadioButton FemaleB;
    private javax.swing.JTextField Fnametxt;
    private javax.swing.JTextField Lnametxt;
    private javax.swing.JComboBox<String> MCombob;
    private javax.swing.JRadioButton MaleB;
    private javax.swing.JPasswordField Passwordtxt;
    private javax.swing.JButton ResetB;
    private javax.swing.JTextField Usernametxt;
    private javax.swing.JComboBox<String> YCombob;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    private void systemExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    }
}
