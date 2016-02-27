/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import utils.EmailValidator;
import chatclient.ClientConnection;
import java.util.Hashtable;
import javax.swing.JFrame;
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

    ClientConnection clientConnection;

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
        mainPanel = new javax.swing.JPanel();
        createGroupChatBtn = new javax.swing.JButton();
        deleteFriendBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        nameLabel = new javax.swing.JLabel();
        addFriendBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        contactsList = new javax.swing.JList<>();
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
        ageSpinner = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
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
                .addContainerGap(95, Short.MAX_VALUE))
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
                .addContainerGap(201, Short.MAX_VALUE))
        );

        panelGroup.add(lognPanel, "loginPanel");

        createGroupChatBtn.setText("Create Group Chat");
        createGroupChatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupChatBtnActionPerformed(evt);
            }
        });

        deleteFriendBtn.setText("Delete friend");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel14.setText("Friends list");

        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Online", "Away", "Busy", " " }));
        statusComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusComboBoxActionPerformed(evt);
            }
        });

        nameLabel.setText("Mostafa Medhat");

        addFriendBtn.setText("Add Friend");
        addFriendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFriendBtnActionPerformed(evt);
            }
        });

        contactsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(contactsList);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(addFriendBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteFriendBtn))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(createGroupChatBtn))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(68, 68, 68)
                            .addComponent(jLabel14))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(statusComboBox)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addFriendBtn)
                            .addComponent(deleteFriendBtn))
                        .addGap(61, 61, 61)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addComponent(createGroupChatBtn)
                .addGap(58, 58, 58))
        );

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

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/chat-people.png"))); // NOI18N

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
                                    .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passReg1)
                                    .addComponent(passReg2, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(ageSpinner))))))
                .addContainerGap(59, Short.MAX_VALUE))
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
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        panelGroup.add(registerPanel, "registerPanel");

        getContentPane().add(panelGroup, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
    //((java.awt.CardLayout) (jPanel1.getLayout())).next(jPanel1);
    // CODE WHEN I PRESS CREATE BUTTON
                 
        if(firstNameReg.getText().equals("") || lastNameReg.getText().equals("") || emailReg.getText().equals("") || passReg1.getText().equals("")){
        // create a jframe
        JFrame frame = new JFrame("JOptionPane showMessageDialog example");
        // show a joptionpane dialog using showMessageDialog
        JOptionPane.showMessageDialog(frame,"Please Enter your Full information");
        }else{ 
                 //another check for the password itself
                 if(passReg1.getText().equals(passReg2.getText())){
                    System.out.println("matched");
                    
                            //check for Email validation
                            EmailValidator emailValidator = new EmailValidator();
                            //trim() ->> Returns a copy of the string, with leading and trailing whitespace omitted.
                            if(!emailValidator.validate(emailReg.getText().trim())) {
                              JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                              JOptionPane.showMessageDialog(frame,"Invalid Email ID");   
                               } else {           
                                                //check on age
                                                int age = (Integer) ageSpinner.getValue();
                                                System.out.println(age);
                                                
                                                if(age < 18 || age > 80){
                                                    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                                                    JOptionPane.showMessageDialog(frame,"Age must be between 18 ~ 80");
                                                }else {
                                                System.out.println(firstNameReg.getText());  
                                                ((java.awt.CardLayout)(panelGroup.getLayout())).next(panelGroup);
                                                      }
                                      }    
                   }else{
                         System.out.println("Not matched");
                         JFrame frame = new JFrame("JOptionPane showMessageDialog example");
                         JOptionPane.showMessageDialog(frame,"Password dosen't match");
                   }
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

    private void addFriendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFriendBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addFriendBtnActionPerformed

    private void statusComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusComboBoxActionPerformed

    private void signUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpBtnActionPerformed
        // TODO add your handling code here:
        ((java.awt.CardLayout) (panelGroup.getLayout())).next(panelGroup);
    }//GEN-LAST:event_signUpBtnActionPerformed

    private void firstNameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameRegActionPerformed

    private void createGroupChatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createGroupChatBtnActionPerformed
        // TODO add your handling code here:
        ((java.awt.CardLayout) (panelGroup.getLayout())).next(panelGroup);
    }//GEN-LAST:event_createGroupChatBtnActionPerformed

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

    public void setNameLabel(User user) {
        nameLabel.setText(user.getFirstName() + " " + user.getLastName());
    }

    public void setErrorLabel(String errorMsg) {
        errorLabel.setVisible(true);
        errorLabel.setText(errorMsg);
    }

    public JPanel getPanelGroup() {
        return panelGroup;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFriendBtn;
    private javax.swing.JSpinner ageSpinner;
    private javax.swing.JList<String> contactsList;
    private javax.swing.JButton createGroupChatBtn;
    private javax.swing.JButton deleteFriendBtn;
    private javax.swing.JLabel doersChat;
    private javax.swing.JTextField emailBox;
    private javax.swing.JTextField emailReg;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JTextField firstNameReg;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label1;
    private java.awt.Label label3;
    private javax.swing.JTextField lastNameReg;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel lognPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel panelGroup;
    private javax.swing.JPasswordField passReg1;
    private javax.swing.JPasswordField passReg2;
    private javax.swing.JTextField passwordBox;
    private javax.swing.JLabel picture;
    private javax.swing.JButton registerBtn;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton signUpBtn;
    private javax.swing.JComboBox<String> statusComboBox;
    private java.awt.Label welcomeLabel;
    // End of variables declaration//GEN-END:variables
}
