package Gui;

import Program.CloudSystem;

import javax.swing.*;
import javax.swing.GroupLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/*
 * Created by JFormDesigner on Sun Jun 04 10:59:07 CST 2023
 */



/**
 * @author 30894
 */
public class Menu extends JFrame {
    public Menu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u7528\u6237\u7ba1\u7406");

        //---- button2 ----
        button2.setText("\u4e91\u5de5\u5382\u4fe1\u606f");

        //---- button3 ----
        button3.setText("\u4ea7\u54c1\u7c7b\u522b\u7ba1\u7406");

        //---- button4 ----
        button4.setText("\u4ea7\u54c1\u4fe1\u606f\u7ba1\u7406");

        //---- button5 ----
        button5.setText("\u8bbe\u5907\u7c7b\u578b\u7ba1\u7406");

        //---- button6 ----
        button6.setText("\u8bbe\u5907\u7ba1\u7406");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(91, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addComponent(button6, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button3, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button4, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button5, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                    .addGap(87, 87, 87))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(button2)
                    .addGap(18, 18, 18)
                    .addComponent(button3)
                    .addGap(18, 18, 18)
                    .addComponent(button4)
                    .addGap(18, 18, 18)
                    .addComponent(button5)
                    .addGap(18, 18, 18)
                    .addComponent(button6)
                    .addContainerGap(34, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().logIn().setVisible(true);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().accounts_menu().setVisible(true);
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().factory_menu().setVisible(true);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().product_menu1().setVisible(true);
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().product_menu2().setVisible(true);
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().device_menu1().setVisible(true);
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().system_menu().setVisible(false);
                CloudSystem.getCloudSystem().device_menu2().setVisible(true);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JButton getButton1() {
        return button1;
    }
    public JButton getButton2() {
        return button2;
    }
    public JButton getButton3() {
        return button3;
    }
    public JButton getButton4() {
        return button4;
    }
    public JButton getButton5() {
        return button5;
    }
    public JButton getButton6() {
        return button6;
    }
}
