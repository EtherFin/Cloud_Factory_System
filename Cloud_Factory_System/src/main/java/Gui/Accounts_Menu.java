package Gui;

import Program.Account;
import Program.Catalog;
import Program.CloudSystem;
import Program.System_Account;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/*
 * Created by JFormDesigner on Sun Jun 04 11:03:47 CST 2023
 */



/**
 * @author 30894
 */
public class Accounts_Menu extends JFrame {
    public Accounts_Menu() {
        initComponents();
    }
    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        button2 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        formattedTextField1 = new JFormattedTextField();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button2 ----
        button2.setText("\u5220\u9664");

        //---- button3 ----
        button3.setText("\u4fee\u6539");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {false, "", "", "", "", ""},
                },
                new String[] {
                    " ", "ID", "\u767b\u9646\u8d26\u53f7", "\u59d3\u540d", "\u8054\u7cfb\u65b9\u5f0f", "\u767b\u9646\u65b9\u5f0f"
                }
            ) {
                Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            scrollPane1.setViewportView(table1);
        }

        //---- button4 ----
        button4.setText("\u6309\u7528\u6237\u540d\u67e5\u8be2");

        //---- button5 ----
        button5.setText("\u91cd\u7f6e");

        //---- button6 ----
        button6.setText("\u8fd4\u56de");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 126, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button5)
                            .addGap(0, 355, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 541, Short.MAX_VALUE)
                            .addComponent(button3))
                        .addComponent(scrollPane1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 611, Short.MAX_VALUE)
                            .addComponent(button6)))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button5)
                        .addComponent(button4)
                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button3)
                        .addComponent(button2))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button6)
                    .addContainerGap(4, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

//        table1.setModel(CloudSystem.getCloudSystem().LoadTableModel(CloudSystem.getCloudSystem().getCAs()));
        table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Delete(CloudSystem.getCloudSystem());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Account(CloudSystem.getCloudSystem().getCAs()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                CloudSystem.getCloudSystem().accounts_menu().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().accounts_menu().setVisible(false);
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Account(CloudSystem.getCloudSystem().getCAs()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            //JTable table = table1;
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Change_information(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
                try {
                    CloudSystem.getCloudSystem().Write_Account_Catalog(CloudSystem.getCloudSystem().getCAs());
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().accounts_menu().setVisible(false);
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Account(CloudSystem.getCloudSystem().getCAs()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                CloudSystem.getCloudSystem().accounts_menu().setVisible(true);
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Search_Account_Catalog(CloudSystem.getCloudSystem(),formattedTextField1.getText());
                formattedTextField1.setText("");
            }
        });
        formattedTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_ENTER){
                    Search_Account_Catalog(CloudSystem.getCloudSystem(),formattedTextField1.getText());
                    formattedTextField1.setText("");
                }
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JButton button2;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JFormattedTextField formattedTextField1;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JTable getTable1() {
        return table1;
    }
    public void Delete(CloudSystem cloudSystem) throws FileNotFoundException {
        ArrayList<Integer> rows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                rows.add(col);
            }
        }
        if (rows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要删除的行", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = rows.size() - 1; i >= 0; i--) {
            int row = rows.get(i);
            String Account_Number = (String) table1.getValueAt(row, 2);
            if (Account_Number.equals("3")) {
                JOptionPane.showMessageDialog(null, "系统账号禁止删除", null, JOptionPane.WARNING_MESSAGE);
                continue;
            }
            for(Account account:CloudSystem.getCloudSystem().getCAs()){
                if(account.getAccount_Number().equals(Account_Number)){
                    CloudSystem.getCloudSystem().getCAs().remove(account);
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "删除成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            cloudSystem.Write_Account_Catalog(CloudSystem.getCloudSystem().getCAs());
            cloudSystem.Load_Account_Catalog();
            table1.setVisible(false);
            table1.setModel(cloudSystem.LoadTableModel_Account(CloudSystem.getCloudSystem().getCAs()));
            table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            table1.setVisible(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Change_information(CloudSystem cloudSystem) throws IOException {
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要修改的行", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel_Account(CloudSystem.getCloudSystem().getCAs());
            JTable table = new JTable(model);
            String Account_Number = table.getValueAt(row, 2).toString();
            System.out.println(Account_Number);
            if (Account_Number.equals("3")) {
                JOptionPane.showMessageDialog(null, "系统账号禁止修改", null, JOptionPane.WARNING_MESSAGE);
                continue;
            }
            for(Account account:CloudSystem.getCloudSystem().getCAs()){
                if(account.getAccount_Number().equals(Account_Number)){
                    account.setAccount_Number(table1.getValueAt(row,2).toString());
                    account.setName(table1.getValueAt(row,3).toString());
                    account.setContact_Way(table1.getValueAt(row,4).toString());
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "修改成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            cloudSystem.Write_Account_Catalog(CloudSystem.getCloudSystem().getCAs());
            cloudSystem.Load_Account_Catalog();
            cloudSystem.factory_menu().getTable1().setModel(cloudSystem.LoadTableModel_Factory(CloudSystem.getCloudSystem().getCAs()));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Search_Account_Catalog(CloudSystem cloudSystem, String Search_key) {
        Catalog<Account> catalog = new Catalog<>();
        for(Account account:CloudSystem.getCloudSystem().getCAs()){
            if(account.getAccount_Number().contains(Search_key) ){
                catalog.add(account);
            }
        }
        table1.setVisible(false);
        table1.setModel(cloudSystem.LoadTableModel_Account(catalog));
        table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table1.setVisible(true);
    }
}