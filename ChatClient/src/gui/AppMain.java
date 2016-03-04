/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import utils.EmailValidator;
import chatclient.ClientConnection;
import java.util.ArrayList;
import java.util.Hashtable;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utils.Message;
import utils.User;
import utils.interfaces.MessageType;

/**
 *
 * @author mostafaz
 */
public class AppMain extends javax.swing.JFrame {

    private ClientConnection clientConnection;

    /**
     * Creates new form RegLogList
     */
    public AppMain() {
        initComponents();
        clientConnection = new ClientConnection(this);
        clientConnection.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelGroup = new javax.swing.JPanel();
        lognPanel = new javax.swing.JPanel();
        loginBtn = new javax.swing.JButton();
        signUpBtn = new javax.swing.JButton();
        passwordBox = new javax.swing.JTextField();
        emailBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        label3 = new java.awt.Label();
        errorLabel = new javax.swing.JLabel();
        mainPanel = new gui.MainPanel(this);
        registerPanel = new javax.swing.JPanel();
        emailReg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lastNameReg = new javax.swing.JTextField();
        firstNameReg = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        jLabel8 = new javax.swing.JLabel();
        passReg1 = new javax.swing.JPasswordField();
        passReg2 = new javax.swing.JPasswordField();
        welcomeLabel = new java.awt.Label();
        doersChat = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        ageSpinner = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mainMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGroup.setLayout(new java.awt.CardLayout());

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signUpBtn.setText("SignUp");
        signUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel11.setText("Password   :");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel12.setText("Email Address : ");

        label3.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        label3.setText("Sign in");

        javax.swing.GroupLayout lognPanelLayout = new javax.swing.GroupLayout(lognPanel);
        lognPanel.setLayout(lognPanelLayout);
        lognPanelLayout.setHorizontalGroup(
            lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lognPanelLayout.createSequentialGroup()
                .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lognPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(lognPanelLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(lognPanelLayout.createSequentialGroup()
                                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(lognPanelLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(errorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emailBox, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)))))
                    .addGroup(lognPanelLayout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        lognPanelLayout.setVerticalGroup(
            lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lognPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(errorLabel)
                .addGap(62, 62, 62)
                .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(126, 126, 126)
                .addGroup(lognPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(signUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(207, Short.MAX_VALUE))
        );

        panelGroup.add(lognPanel, "loginPanel");
        panelGroup.add(mainPanel, "mainPanel");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel6.setText("Password   :");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel7.setText("Confirm Password : ");

        firstNameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameRegActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Last Name  :");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setText("Email Address : ");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("First Name  : ");

        label1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        label1.setText("Sign up");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel8.setText("Age :");

        welcomeLabel.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        welcomeLabel.setText("Welcome to Doers Chat Messenger");

        doersChat.setFont(new java.awt.Font("UnPilgi", 0, 24)); // NOI18N
        doersChat.setText("Doers Chat");

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/resources/chat-people.png"))); // NOI18N

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(doersChat))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(picture))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(registerPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(297, 297, 297))
                                .addGroup(registerPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(291, 291, 291)))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(48, 48, 48)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNameReg)
                                    .addComponent(firstNameReg)
                                    .addComponent(emailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(registerPanelLayout.createSequentialGroup()
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passReg1)
                                    .addComponent(passReg2)
                                    .addComponent(ageSpinner)
                                    .addGroup(registerPanelLayout.createSequentialGroup()
                                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doersChat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lastNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(passReg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passReg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(ageSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );

        panelGroup.add(registerPanel, "registerPanel");

        getContentPane().add(panelGroup, java.awt.BorderLayout.CENTER);

        mainMenu.setText("Main");
        jMenuBar1.add(mainMenu);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed

        //((java.awt.CardLayout) (jPanel1.getLayout())).next(jPanel1);
        // CODE WHEN I PRESS CREATE BUTTON
        if (firstNameReg.getText().equals("") || lastNameReg.getText().equals("") || emailReg.getText().equals("") || passReg1.getText().equals("")) {
            // create a jframe
            JFrame frame = new JFrame("JOptionPane showMessageDialog example");
            // show a joptionpane dialog using showMessageDialog
            JOptionPane.showMessageDialog(frame, "Please Enter your Full information");
        } else //another check for the password itself
         if (passReg1.getText().equals(passReg2.getText())) {
                System.out.println("matched");

                //check for Email validation
                EmailValidator emailValidator = new EmailValidator();
                //trim() ->> Returns a copy of the string, with leading and trailing whitespace omitted.
                if (!emailValidator.validate(emailReg.getText().trim())) {
                    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                    JOptionPane.showMessageDialog(frame, "Invalid Email ID");
                } else {
                    //check on kage || casting the string into integer to be able to check
                    Integer age = Integer.valueOf(ageSpinner.getText());

                    if (age < 18 || age > 80) {
                        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                        JOptionPane.showMessageDialog(frame, "Age must be between 18 ~ 80");
                    } else {
                        System.out.println(firstNameReg.getText());
                        //////////////////////////////////////////////////////Testing getting the object
                        Hashtable<String, String> userData = new Hashtable<>();
                        //putting all the values into the Hashtable
                        userData.put("firstName", firstNameReg.getText());
                        userData.put("lastName", lastNameReg.getText());
                        userData.put("email", emailReg.getText());
                        userData.put("password", passReg1.getText());
                        //check for casting the integer into string
                        try {
                            userData.put("age", ageSpinner.getText());
                        } catch (Exception ex) {
                        }
                        //creating a message type
                        Message register = new Message(MessageType.REGISTER, userData);

                        //call clientConnection Class to send the message to the server through the sendClientMsg
                        clientConnection.sendClientMsg(register);
                        //it's already sent handle it through clientHandler on server
                        //////////////////////////////////////////////////////////////////////
                        ((java.awt.CardLayout) (panelGroup.getLayout())).next(panelGroup);
                    }
                }
            } else {
                System.out.println("Not matched");
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                JOptionPane.showMessageDialog(frame, "Password dosen't match");
            }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        Hashtable<String, String> credintials = new Hashtable<>();
        credintials.put("email", emailBox.getText());
        credintials.put("password", passwordBox.getText());
        passwordBox.setText("");
        Message login = new Message(MessageType.LOGIN, credintials);
        clientConnection.sendClientMsg(login);
        //((java.awt.CardLayout) (jPanel1.getLayout())).next(jPanel1);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
        ((java.awt.CardLayout) (panelGroup.getLayout())).show(panelGroup, "registerPanel");
        //((java.awt.CardLayout) (panelGroup.getLayout())).last(panelGroup);
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void firstNameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameRegActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        ((java.awt.CardLayout) (panelGroup.getLayout())).show(panelGroup, "loginPanel");
    }//GEN-LAST:event_backBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppMain().setVisible(true);
            }
        });
    }

    public void setErrorLabel(String errorMsg) {
        errorLabel.setVisible(true);
        errorLabel.setText(errorMsg);
    }

    public JPanel getPanelGroup() {
        return panelGroup;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public ClientConnection getConnection() {
        return clientConnection;
    }

    public JMenu getMainMenu() {
        return mainMenu;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageSpinner;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel doersChat;
    private javax.swing.JTextField emailBox;
    private javax.swing.JTextField emailReg;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstNameReg;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private javax.swing.JTextField lastNameReg;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel lognPanel;
    private javax.swing.JMenu mainMenu;
    private gui.MainPanel mainPanel;
    private javax.swing.JPanel panelGroup;
    private javax.swing.JPasswordField passReg1;
    private javax.swing.JPasswordField passReg2;
    private javax.swing.JTextField passwordBox;
    private javax.swing.JLabel picture;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton signUpBtn;
    private java.awt.Label welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
