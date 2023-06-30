package Gui;

import Program.*;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.DefaultTableModel;
/*
 * Created by JFormDesigner on Sun Jun 04 10:06:31 CST 2023
 */



/**
 * @author 30894
 */
public class LogIn extends JFrame {
    public LogIn() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) {
        // TODO add your code here
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        passwordField2 = new JPasswordField();
        button1 = new JButton();
        button2 = new JButton();
        formattedTextField1 = new JFormattedTextField();

        //======== this ========
        var contentPane = getContentPane();

        //---- label1 ----
        label1.setText("\u4e91\u5e73\u53f0\u5236\u9020");
        label1.setFont(new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 28));

        //---- label2 ----
        label2.setText("\u8d26\u53f7");
        label2.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));

        //---- label3 ----
        label3.setText("\u5bc6\u7801");
        label3.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));

        //---- button1 ----
        button1.setText("\u767b\u5f55");
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                button1MouseClicked(e);
            }
        });

        //---- button2 ----
        button2.setText("\u6ce8\u518c");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(button1)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                    .addComponent(button2)
                    .addGap(63, 63, 63))
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(label2, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                .addComponent(label3, GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(passwordField2, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                .addComponent(formattedTextField1, GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(label1)))
                    .addContainerGap(39, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(passwordField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(16, 16, 16))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

        //登录界面logIn
        formattedTextField1.setEditable(true);
        passwordField2.setEditable(true);
        //在登录界面中监听登录按钮，在登录按钮被按时,调用LOG_in方法，并检查是否键盘按下enter来登录
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().logIn().LOG_in(CloudSystem.getCloudSystem());
            }
        });
        // 添加文本字段和密码字段的键盘监听器
        formattedTextField1.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    CloudSystem.getCloudSystem().logIn().LOG_in(CloudSystem.getCloudSystem());
                }
            }
        });
        passwordField2.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    CloudSystem.getCloudSystem().logIn().LOG_in(CloudSystem.getCloudSystem());
                }
            }
        });
        //在登录界面中监听注册按钮，在注册按钮被按时
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().signIn().setVisible(true);//打开注册界面signIn
            }
        });
        //为登录界面加应该窗口关闭监听器，否则关闭登录界面后，程序停止运行
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
                //super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JPasswordField passwordField2;
    private JButton button1;
    private JButton button2;
    private JFormattedTextField formattedTextField1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }
    public JPasswordField getPasswordField2() {
        return passwordField2;
    }

    public void LOG_in(CloudSystem cloudSystem){
        String accountNumber = getFormattedTextField1().getText();
        String password = new String(getPasswordField2().getPassword());
        formattedTextField1.setText("");
        passwordField2.setText("");
        int j = 0;
        for(Account account:cloudSystem.getCAs()){
            //System.out.println(account.getAccount_Number()+" "+account.getPassword());
            if(account.getAccount_Number().equals(accountNumber)&&account.getPassword().equals(password)){
                JOptionPane.showMessageDialog(null, "登录成功", null, JOptionPane.INFORMATION_MESSAGE);
                j = 1;
                setVisible(false);
                if (account instanceof System_Account){
                    System.out.println("System_Account have login");
                    cloudSystem.system_menu().setVisible(true);
                    break;
                }else if (account instanceof Cloud_Account){
                    System.out.println("Normal_Account have login");
                    cloudSystem.setCurrent_account((Cloud_Account) account);
                    for(Device device: cloudSystem.getDevices()){
                        for(String factory:device.getFactories()){
                            if(factory.equals(cloudSystem.getCurrent_account().getFactory().getName())){
                                cloudSystem.getCurrent_account().getFactory().getDevices().add(device);
                                System.out.println("add device to factory");
                            }
                        }
                    }
                    //cloudSystem.normal_menu().getTable1().setModel(cloudSystem.LoadTableModel_Normal(cloudSystem.getCurrent_account().getFactory().getDevices()));
                    //System.out.println("hello");
                    DefaultTableModel model1 = CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices());
                    //JOptionPane.showMessageDialog(null, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                    CloudSystem.getCloudSystem().normal_menu().getTable1().setModel(model1);
                    cloudSystem.normal_menu().setVisible(true);
                    break;
                }else{
                    break;
                }
            }
        }
        if(j==0){
            JOptionPane.showMessageDialog(null, "账号或密码错误", null, JOptionPane.ERROR_MESSAGE);
        }
    }
}
