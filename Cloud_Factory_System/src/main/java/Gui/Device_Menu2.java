/*
 * Created by JFormDesigner on Sun Jun 11 11:02:52 CST 2023
 */

package Gui;

import Program.Catalog;
import Program.CloudSystem;
import Program.Device;
import Program.Product;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author 30894
 */
public class Device_Menu2 extends JFrame {
    public Device_Menu2() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        formattedTextField1 = new JFormattedTextField();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button7 = new JButton();
        button8 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u6309\u540d\u79f0\u67e5\u8be2");

        //---- button2 ----
        button2.setText("\u91cd\u7f6e");

        //---- button3 ----
        button3.setText("\u8bbe\u5907\u72b6\u6001");

        //---- button4 ----
        button4.setText("\u65b0\u5efa");

        //---- button5 ----
        button5.setText("\u5220\u9664");

        //---- button6 ----
        button6.setText("\u4fee\u6539");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, "", null, null, null, "", null, null},
                },
                new String[] {
                    " ", " ID", "\u8bbe\u5907\u540d\u79f0", "\u8bbe\u5907\u7f16\u53f7", "\u8bbe\u5907\u7c7b\u522b", "\u8bbe\u5907\u89c4\u683c", "\u8bbe\u5907\u72b6\u6001", "\u8bbe\u5907\u63cf\u8ff0", "\u79df\u7528\u72b6\u6001", "\u6240\u5c5e\u5de5\u5382"
                }
            ) {
                final Class<?>[] columnTypes = new Class<?>[] {
                    Boolean.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
                };
                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }
            });
            scrollPane1.setViewportView(table1);
            table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        }

        //---- button7 ----
        button7.setText("\u8fd4\u56de");

        //---- button8 ----
        button8.setText("\u786e\u5b9a");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addGroup(contentPaneLayout.createParallelGroup()
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button1)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button2))
                                .addGroup(contentPaneLayout.createSequentialGroup()
                                    .addComponent(button4)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button5)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                            .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(button3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(button6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 600, Short.MAX_VALUE)
                            .addComponent(button8)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button7)))
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
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button4)
                        .addComponent(button5)
                        .addComponent(button6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button7)
                        .addComponent(button8))
                    .addContainerGap())
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

        table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);


        this.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent e) {
                CloudSystem.getCloudSystem().device_menu2().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Search_Device_Catalog(CloudSystem.getCloudSystem(), formattedTextField1.getText());
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                table1.setVisible(false);
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices()));
                table1.setVisible(true);
                //table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Change_State(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Delete(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Add_Device(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Change_information(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().device_menu2().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
        button8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().device_menu2().setVisible(false);
                CloudSystem.getCloudSystem().system_menu().setVisible(true);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JFormattedTextField formattedTextField1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button7;
    private JButton button8;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JTable getTable1() {
        return table1;
    }
    public void Delete(CloudSystem cloudSystem) throws FileNotFoundException {
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要删除的行", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            String device_Number = (String) table1.getValueAt(row, 3);
            for(Device device:CloudSystem.getCloudSystem().getDevices()){
                if(device.getNumber().equals(device_Number)){
                    System.out.println(device.toString());
                    if(device.getRentState().equals("已被出租")){
                        JOptionPane.showMessageDialog(null, "设备已借出，无法删除", null, JOptionPane.WARNING_MESSAGE);
                        System.out.println(device.toString());
                        break;
                    } else if (device.getRentState().equals("工厂设备")) {
                        JOptionPane.showMessageDialog(null, "设备已借出，无法删除", null, JOptionPane.WARNING_MESSAGE);
                        System.out.println(device.toString());
                        break;
                    } else{
                        CloudSystem.getCloudSystem().getDevices().remove(device);
                        JOptionPane.showMessageDialog(null, "删除成功", null, JOptionPane.INFORMATION_MESSAGE);
                        //System.out.println(device.toString());
                        break;
                    }
                }
            }
            //CloudSystem.getCloudSystem().getCAs().remove(CloudSystem.getCloudSystem().getCAs().get(row));

        }
        try {
            cloudSystem.Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            System.out.println("doodood");
            cloudSystem.Load_Device_Catalog();
            table1.setVisible(false);
            table1.setModel(cloudSystem.LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices()));
            table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            System.out.println("hello");
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
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices());
            JTable table = new JTable(model);
            String device_Number = table.getValueAt(row, 3).toString();
            System.out.println(device_Number);
            for(Device device:CloudSystem.getCloudSystem().getDevices()){
                if(device.getNumber().equals(device_Number)){
                    device.setState();
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "修改成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            cloudSystem.Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            cloudSystem.Load_Device_Catalog();
            //table1.setModel(cloudSystem.LoadTableModel1_Device(CloudSystem.getCloudSystem().getDevice_types()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void Change_State(CloudSystem cloudSystem) throws IOException {
        int[] selectedRows = table1.getSelectedRows();
        if (selectedRows.length == 0) {
            JOptionPane.showMessageDialog(null, "请选择要修改的行", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.length - 1; i >= 0; i--) {
            int row = selectedRows[i];
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices());
            JTable table = new JTable(model);
            DefaultTableModel modEL = CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices());
            String device_Number = table.getValueAt(row, 3).toString();
            System.out.println(device_Number);
            for(Device device:CloudSystem.getCloudSystem().getDevices()){
                if(device.getNumber().equals(device_Number)){
                    device.setState();
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "修改成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            CloudSystem.getCloudSystem().Load_Device_Catalog();
            //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(false);
            table1.setModel(CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
            //table1.setModel(cloudSystem.LoadTableModel1_Device(CloudSystem.getCloudSystem().getDevice_types()));
    }
    public void Search_Device_Catalog(CloudSystem cloudSystem, String Search_key) {
        Catalog<Device> catalog = new Catalog<>();
        for(Device device:CloudSystem.getCloudSystem().getDevices()){
            if(device.getName().contains(Search_key)){
                catalog.add(device);
            }
        }
        formattedTextField1.setText("");
        table1.setVisible(false);
        table1.setModel(cloudSystem.LoadTableModel2_Device(catalog));
        table1.getSelectionModel().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table1.setVisible(true);
    }
    public void Add_Device(CloudSystem cloudSystem) throws IOException {
        if(cloudSystem.add_device().getComboBox1().getItemCount()==0){
            for(String device_type:cloudSystem.getDevice_types()){
                cloudSystem.add_device().getComboBox1().addItem(device_type);
            }
        }
        if(cloudSystem.add_device().getComboBox2().getItemCount()==0){
            cloudSystem.add_device().getComboBox2().addItem("关闭");
            cloudSystem.add_device().getComboBox2().addItem("开启");
        }
        cloudSystem.add_device().setVisible(true);
    }
}