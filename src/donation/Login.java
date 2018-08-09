package donation;

import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import static org.apache.commons.io.FileUtils.readFileToString;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Passwordtext = new javax.swing.JPasswordField();
        Usernametext = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RegisterB = new javax.swing.JButton();
        RegisterB1 = new javax.swing.JButton();
        RegisterB2 = new javax.swing.JButton();
        RegisterB3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Phosphate", 1, 20)); // NOI18N
        jLabel4.setText("Support  Afghan Army");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, -1));

        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("=============================================");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 470, -1));

        jLabel7.setFont(new java.awt.Font("Superclarendon", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 0));
        jLabel7.setText("Ministry of Interior Affairs, Government of Afghanistan");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, 25));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        Passwordtext.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Passwordtext.setName(""); // NOI18N
        jPanel2.add(Passwordtext);
        Passwordtext.setBounds(80, 140, 138, 20);

        Usernametext.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(Usernametext);
        Usernametext.setBounds(80, 80, 138, 20);

        jLabel2.setFont(new java.awt.Font("Seravek", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("Username");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(8, 81, 60, 16);

        jLabel3.setFont(new java.awt.Font("Seravek", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setText("Password");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(8, 135, 56, 20);

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Mshtakan", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Login");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 20, 80, 27);

        RegisterB.setBackground(new java.awt.Color(204, 204, 204));
        RegisterB.setFont(new java.awt.Font("Seravek", 1, 13)); // NOI18N
        RegisterB.setForeground(new java.awt.Color(0, 153, 0));
        RegisterB.setText("Register");
        RegisterB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterB);
        RegisterB.setBounds(80, 210, 70, 44);

        RegisterB1.setBackground(new java.awt.Color(153, 153, 153));
        RegisterB1.setFont(new java.awt.Font("Seravek", 1, 13)); // NOI18N
        RegisterB1.setForeground(new java.awt.Color(0, 153, 0));
        RegisterB1.setText("Login");
        RegisterB1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterB1ActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterB1);
        RegisterB1.setBounds(10, 210, 70, 44);

        RegisterB2.setBackground(new java.awt.Color(153, 153, 153));
        RegisterB2.setFont(new java.awt.Font("Seravek", 1, 13)); // NOI18N
        RegisterB2.setForeground(new java.awt.Color(0, 153, 0));
        RegisterB2.setText("Reset");
        RegisterB2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterB2ActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterB2);
        RegisterB2.setBounds(10, 260, 70, 44);

        RegisterB3.setBackground(new java.awt.Color(153, 153, 153));
        RegisterB3.setFont(new java.awt.Font("Seravek", 1, 13)); // NOI18N
        RegisterB3.setForeground(new java.awt.Color(0, 153, 0));
        RegisterB3.setText("Exit");
        RegisterB3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        RegisterB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterB3ActionPerformed(evt);
            }
        });
        jPanel2.add(RegisterB3);
        RegisterB3.setBounds(80, 260, 70, 44);

        jLabel6.setIcon(new javax.swing.ImageIcon("/Users/ajmalmassoumy/Desktop/Donation/Imges/Afghanflag.png")); // NOI18N
        jLabel6.setAutoscrolls(true);
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(0, 0, 550, 330);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 550, 330));

        jLabel9.setIcon(new javax.swing.ImageIcon("/Users/ajmalmassoumy/Desktop/Donation/Imges/afghanlogo.png")); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 70, 70));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBActionPerformed
        setVisible(false);
        SignUp Info = new SignUp();
        Info.setVisible(true);
    }//GEN-LAST:event_RegisterBActionPerformed

    private void RegisterB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterB1ActionPerformed
        String username = Usernametext.getText();
        String password = Passwordtext.getText();
        if (username.isEmpty() && username.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please check your username, password \nor register please", "Login Error",
                    JOptionPane.INFORMATION_MESSAGE);
            Login info = new Login();
            info.setVisible(true);

        } else {
            File fr = new File("DataBase.text");
            try {
                if (readFileToString(fr).contains(username) && (readFileToString(fr).contains(password))) {
                    setVisible(false);
                    Logedin info = new Logedin();
                    info.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please check your username, password \nor register please", "Login Error",
                            JOptionPane.INFORMATION_MESSAGE);
                    Passwordtext.setText(null);
                    Usernametext.setText(null);
                }
            } catch (IOException ex) {
                JOptionPane.showInputDialog(null, "The file not found", "Error", JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_RegisterB1ActionPerformed

    private void RegisterB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterB2ActionPerformed
        Passwordtext.setText(null);
        Usernametext.setText(null);

    }//GEN-LAST:event_RegisterB2ActionPerformed

    private void RegisterB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterB3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_RegisterB3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Passwordtext;
    private javax.swing.JButton RegisterB;
    private javax.swing.JButton RegisterB1;
    private javax.swing.JButton RegisterB2;
    private javax.swing.JButton RegisterB3;
    private javax.swing.JTextField Usernametext;
    private javax.swing.JLabel jLabel1;
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
    // End of variables declaration//GEN-END:variables

    private void systemExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
    }

}
