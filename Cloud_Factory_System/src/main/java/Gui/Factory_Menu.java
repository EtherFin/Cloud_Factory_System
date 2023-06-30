package Gui;

import Program.Account;
import Program.Catalog;
import Program.CloudSystem;
import Program.Cloud_Account;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;
/*
 * Created by JFormDesigner on Sun Jun 04 11:10:03 CST 2023
 */



/**
 * @author 30894
 */
public class Factory_Menu extends JFrame {
    public Factory_Menu() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        formattedTextField1 = new JFormattedTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button4 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u6309\u5de5\u5382\u540d\u79f0\u67e5\u8be2");

        //---- button2 ----
        button2.setText("\u91cd\u7f6e");

        //---- button3 ----
        button3.setText("\u5207\u6362");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, "", ""},
                },
                new String[] {
                    " ", "ID", "\u5de5\u5382\u540d\u79f0", "\u5de5\u5382\u7b80\u6d01", "\u8d1f\u8d23\u4eba", "\u8054\u7cfb\u65b9\u5f0f", "\u767b\u5f55\u8d26\u53f7", "\u5de5\u5382\u72b6\u6001"
                }
            ) {
                final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            scrollPane1.setViewportView(table1);
        }

        //---- button4 ----
        button4.setText("\u8fd4\u56de");

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
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                            .addComponent(button3))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 593, Short.MAX_VALUE)
                            .addComponent(button4))
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button4)
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

        table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel(CloudSystem.getCloudSystem().getCAs()));
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Check_State(CloudSystem.getCloudSystem());
                //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Factory(CloudSystem.getCloudSystem().getCAs()));
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Factory(CloudSystem.getCloudSystem().getCAs()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Search_Factory_Catalog(CloudSystem.getCloudSystem(),formattedTextField1.getText());
                formattedTextField1.setText("");
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().factory_menu().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Closing");
                CloudSystem.getCloudSystem().factory_menu().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JFormattedTextField formattedTextField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public JTable getTable1(){
        return table1;
    }
    public void Check_State(CloudSystem cloudSystem){
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
            String Account_Number = (String) table1.getValueAt(row, 6);
            for(Account account:CloudSystem.getCloudSystem().getCAs()){
                if(account.getAccount_Number().equals(Account_Number)){
                    if(account instanceof Cloud_Account){
                        ((Cloud_Account) account).getFactory().Change_State();
                        if(table1.getValueAt(row,7).equals("关停")){
                            table1.setValueAt("开启",row,7);
                        }else{
                            table1.setValueAt("关停",row,7);
                        }
                    }
                    break;
                }
            }
            //CloudSystem.getCloudSystem().getCAs().remove(CloudSystem.getCloudSystem().getCAs().get(row));
            JOptionPane.showMessageDialog(null, "修改成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            cloudSystem.Write_Account_Catalog(CloudSystem.getCloudSystem().getCAs());
            cloudSystem.Load_Account_Catalog();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Search_Factory_Catalog(CloudSystem cloudSystem, String Search_key) {
        Catalog<Account> catalog = new Catalog<>();
        for(Account account:CloudSystem.getCloudSystem().getCAs()){
            if(account instanceof Cloud_Account){
                if(((Cloud_Account) account).getFactory().getName().contains(Search_key)){
                    catalog.add(account);
                }
            }
        }
        table1.setVisible(false);
        table1.setModel(cloudSystem.LoadTableModel_Factory(catalog));
        table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table1.setVisible(true);
    }
}