package Gui;

import Program.Account;
import Program.Catalog;
import Program.CloudSystem;
import Program.Cloud_Account;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;
/*
 * Created by JFormDesigner on Sun Jun 04 10:06:19 CST 2023
 */



/**
 * @author 30894
 */
public class SignIn extends JFrame {
    public SignIn() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        passwordField2 = new JPasswordField();
        radioButton1 = new JRadioButton();
        radioButton2 = new JRadioButton();
        button1 = new JButton();
        button2 = new JButton();
        formattedTextField1 = new JFormattedTextField();
        formattedTextField2 = new JFormattedTextField();
        formattedTextField3 = new JFormattedTextField();
        formattedTextField4 = new JFormattedTextField();
        formattedTextField5 = new JFormattedTextField();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u767b\u9646\u8d26\u53f7");
        label1.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- label2 ----
        label2.setText("\u767b\u5f55\u5bc6\u7801");
        label2.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- label3 ----
        label3.setText("\u771f\u5b9e\u59d3\u540d");
        label3.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- label4 ----
        label4.setText("\u8054\u7cfb\u65b9\u5f0f");
        label4.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- label5 ----
        label5.setText("\u6ce8\u518c\u65b9\u5f0f");
        label5.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- label6 ----
        label6.setText("\u5de5\u5382\u540d\u79f0");
        label6.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- label7 ----
        label7.setText("\u5de5\u5382\u7b80\u4ecb");
        label7.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 14));

        //---- radioButton1 ----
        radioButton1.setText("\u4e91\u5de5\u5382");

        //---- radioButton2 ----
        radioButton2.setText("\u7ecf\u9500\u5546");

        //---- button1 ----
        button1.setText("\u786e\u5b9a");

        //---- button2 ----
        button2.setText("\u8fd4\u56de");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button1)
                            .addGap(37, 37, 37)
                            .addComponent(button2))
                        .addGroup(GroupLayout.Alignment.LEADING, contentPaneLayout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label7)
                                    .addGap(18, 18, 18)
                                    .addComponent(formattedTextField5, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label6)
                                    .addGap(18, 18, 18)
                                    .addComponent(formattedTextField4, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label5)
                                    .addGap(31, 31, 31)
                                    .addComponent(radioButton1)
                                    .addGap(56, 56, 56)
                                    .addComponent(radioButton2))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label4)
                                    .addGap(18, 18, 18)
                                    .addComponent(formattedTextField3, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label3)
                                    .addGap(18, 18, 18)
                                    .addComponent(formattedTextField2, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label2)
                                    .addGap(18, 18, 18)
                                    .addComponent(passwordField2))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(18, 18, 18)
                                    .addComponent(formattedTextField1, GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)))))
                    .addContainerGap(35, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label1)
                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2)
                        .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3)
                        .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label4)
                        .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label5)
                        .addComponent(radioButton1)
                        .addComponent(radioButton2))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label6)
                        .addComponent(formattedTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label7)
                        .addComponent(formattedTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(16, 16, 16))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SIGN_in(CloudSystem.getCloudSystem());
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().signIn().setVisible(false);
                CloudSystem.getCloudSystem().logIn().setVisible(true);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JPasswordField passwordField2;
    private JRadioButton radioButton1;
    private JRadioButton radioButton2;
    private JButton button1;
    private JButton button2;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField2;
    private JFormattedTextField formattedTextField3;
    private JFormattedTextField formattedTextField4;
    private JFormattedTextField formattedTextField5;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JButton getButton1(){
        return button1;
    }

    public JButton getButton2(){
        return button2;
    }

    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }

    public JFormattedTextField getFormattedTextField2() {
        return formattedTextField2;
    }

    public JFormattedTextField getFormattedTextField3() {
        return formattedTextField3;
    }

    public JFormattedTextField getFormattedTextField4() {
        return formattedTextField4;
    }

    public JFormattedTextField getFormattedTextField5() {
        return formattedTextField5;
    }

    public JPasswordField getPasswordField2() {
        return passwordField2;
    }

    public JRadioButton getRadioButton1() {
        return radioButton1;
    }

    public JRadioButton getRadioButton2() {
        return radioButton2;
    }

    public int SIGN_in(CloudSystem cloudSystem){
        if(getRadioButton2().isSelected()){
            JOptionPane.showMessageDialog(null, "禁止注册为经销商", null, JOptionPane.WARNING_MESSAGE);
            try {
                Thread.sleep(700);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }else if(getRadioButton1().isSelected()) {
            for(Account CA : cloudSystem.getCAs()) {
                if (CA.getAccount_Number().equals(getFormattedTextField1().getText())) {
                    JOptionPane.showMessageDialog(null, "账号已被注册", null, JOptionPane.WARNING_MESSAGE);
                    getFormattedTextField1().setText("");
                    getFormattedTextField2().setText("");
                    getFormattedTextField3().setText("");
                    getFormattedTextField4().setText("");
                    getFormattedTextField5().setText("");
                    getPasswordField2().setText("");
                    getRadioButton1().setSelected(false);
                    getRadioButton2().setSelected(false);
                    setVisible(false);
                    try {
                        Thread.sleep(700);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    return 0;
                }
            }
            cloudSystem.getCAs().add(new Cloud_Account(
                    getFormattedTextField1().getText(),
                    getFormattedTextField2().getText(),
                    getPasswordField2().getText(),
                    getFormattedTextField3().getText(),
                    getFormattedTextField4().getText(),
                    getFormattedTextField5().getText(),
                    false)
            );
            try {
                cloudSystem.Write_Account_Catalog(cloudSystem.getCAs());
                cloudSystem.accounts_menu().getTable1().setModel(cloudSystem.LoadTableModel_Account(cloudSystem.getCAs()));
                cloudSystem.accounts_menu().getTable1().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            JOptionPane.showMessageDialog(null, "注册成功", null, JOptionPane.INFORMATION_MESSAGE);
            getFormattedTextField1().setText("");
            getFormattedTextField2().setText("");
            getFormattedTextField3().setText("");
            getFormattedTextField4().setText("");
            getFormattedTextField5().setText("");
            getPasswordField2().setText("");
            getRadioButton1().setSelected(false);
            getRadioButton2().setSelected(false);
            setVisible(false);
            return 1;
        }
        return 0;
    }
}
