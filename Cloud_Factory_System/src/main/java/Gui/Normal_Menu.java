/*
 * Created by JFormDesigner on Thu Jun 08 21:17:32 CST 2023
 */

package Gui;

import Program.Account;
import Program.Catalog;
import Program.CloudSystem;
import Program.Device;

import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 30894
 */
public class Normal_Menu extends JFrame {
    public Normal_Menu() {
        initComponents();
    }
    private int ClickCount1 = 0;
    private final int ClickCount2 = 0;

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();

        //======== this ========
        var contentPane = getContentPane();

        //---- button1 ----
        button1.setText("\u65b0\u5efa");

        //---- button2 ----
        button2.setText("\u79df\u7528\u8bbe\u5907");

        //---- button3 ----
        button3.setText("\u8bbe\u5907\u72b6\u6001");

        //---- button4 ----
        button4.setText("\u5220\u9664");

        //======== scrollPane1 ========
        {

            //---- table1 ----
            table1.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, null, null, null, null, null, null},
                },
                new String[] {
                    " ", "ID", "\u8bbe\u5907\u540d\u79f0", "\u8bbe\u5907\u7f16\u53f7", "\u8bbe\u5907\u7c7b\u522b", "\u8bbe\u5907\u89c4\u683c", "\u8bbe\u5907\u72b6\u6001", "\u8bbe\u5907\u63cf\u8ff0", "\u79df\u7528\u72b6\u6001", "\u6240\u5c5e\u5de5\u5382"
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
            table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            scrollPane1.setViewportView(table1);
        }

        //---- button5 ----
        button5.setText("\u8fd4\u56de");

        //---- button6 ----
        button6.setText("\u91cd\u7f6e");

        //---- button7 ----
        button7.setText("\u5f52\u8fd8\u8bbe\u5907");

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(button1)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(button7)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button6)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                            .addComponent(button4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button3))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                            .addGap(0, 671, Short.MAX_VALUE)
                            .addComponent(button5))
                        .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 741, Short.MAX_VALUE))
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(button2)
                        .addComponent(button3)
                        .addComponent(button4)
                        .addComponent(button7)
                        .addComponent(button6))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 287, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(button5)
                    .addContainerGap(14, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    Add_Device(CloudSystem.getCloudSystem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        button2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ClickCount1++;
                if(ClickCount1%2==1){
                    System.out.println(e.getClickCount());
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                button2.setText("租用");
                }else{
                    System.out.println(e.getClickCount());
                    Rent();
                    button2.setText("租用设备");
                    table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
                    table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                }
                CloudSystem.getCloudSystem().device_menu2().getTable1().setModel(CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices()));
                CloudSystem.getCloudSystem().device_menu2().getTable1().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
        });
        button3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Change_State();
            }
        });
        button4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getClickCount());
                Delete();
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
        });
        button5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().normal_menu().setVisible(false);
                CloudSystem.getCloudSystem().logIn().setVisible(true);
            }
        });
        button6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().normal_menu().setVisible(false);
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                CloudSystem.getCloudSystem().normal_menu().setVisible(true);
            }
        });
        button7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(e.getClickCount());
                Return();
                table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
                table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
                CloudSystem.getCloudSystem().device_menu2().getTable1().setModel(CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices()));
                CloudSystem.getCloudSystem().device_menu2().getTable1().setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            }
        });
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CloudSystem.getCloudSystem().normal_menu().setVisible(false);
                CloudSystem.getCloudSystem().logIn().setVisible(true);
            }
        });
        table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off

    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JTable getTable1() {
        return table1;
    }
    public void Rent() {
        //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
        System.out.println("Renting");
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要租借的设备", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices());
            JTable table = new JTable(model);
            String Device_Number = table.getValueAt(row, 3).toString();
            System.out.println(Device_Number);
            for(Device device:CloudSystem.getCloudSystem().getDevices()){
                if(device.getNumber().equals(Device_Number)){
                    System.out.println(device.getNumber());
                    device.setRentState();
                    device.getFactories().add(CloudSystem.getCloudSystem().getCurrent_account().getFactory().getName());
                    System.out.println(device.getRentState());
                    CloudSystem.getCloudSystem().getCurrent_account().getFactory().getDevices().add(device);
                }
            }
            JOptionPane.showMessageDialog(null, "租借成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            CloudSystem.getCloudSystem().Load_Device_Catalog();
            //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(false);
            table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
            table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            table1.setVisible(true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Return() {
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要归还的设备", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            //DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices());
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices());
            JTable table = new JTable(model);
            String Device_Number = table.getValueAt(row, 3).toString();
            System.out.println(Device_Number);
            for(Device device:CloudSystem.getCloudSystem().getDevices()){
                if(device.getNumber().equals(Device_Number)){
                    System.out.println(device.getNumber());
                    device.setRentState();
                    device.getFactories().remove(CloudSystem.getCloudSystem().getCurrent_account().getFactory().getName());
                    System.out.println(device.getRentState());
                    CloudSystem.getCloudSystem().getCurrent_account().getFactory().getDevices().remove(device);
                }
            }
            JOptionPane.showMessageDialog(null, "归还成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            CloudSystem.getCloudSystem().Load_Device_Catalog();
            //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(false);
            table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Delete() {
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要删除的设备", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices());
            JTable table = new JTable(model);
            String Device_Number = table.getValueAt(row, 3).toString();
            System.out.println(Device_Number);
            Catalog<Device> devices = CloudSystem.getCloudSystem().getDevices();
            Device device1 = null;
            Iterator<Device> iterator = CloudSystem.getCloudSystem().getDevices().iterator();
            while (((Iterator<?>) iterator).hasNext()) {
                Device device = iterator.next();
                if (device.getNumber().equals(Device_Number)) {
                    System.out.println(device.getNumber());
                    if (device.getRentState().equals("工厂设备")) {
                        CloudSystem.getCloudSystem().getCurrent_account().getFactory().getDevices().remove(device);
                        CloudSystem.getCloudSystem().getCurrent_account().getFactory().getDevices().remove(device1);
                        CloudSystem.getCloudSystem().setDevices(devices);
                        JOptionPane.showMessageDialog(null, "删除成功", null, JOptionPane.INFORMATION_MESSAGE);
                        iterator.remove();
                    } else {
                        JOptionPane.showMessageDialog(null, "该设备为云工厂设备无法删除", null, JOptionPane.WARNING_MESSAGE);
                    }
                }
            }

        }
        try {
            CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            CloudSystem.getCloudSystem().Load_Device_Catalog();
            //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(false);
            CloudSystem.getCloudSystem().device_menu2().getTable1().setModel(CloudSystem.getCloudSystem().LoadTableModel2_Device(CloudSystem.getCloudSystem().getDevices()));
            table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
            table1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            table1.setVisible(true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Change_State() {
        ArrayList<Integer> selectedRows = new ArrayList<>();
        for (int col = 0; col < table1.getRowCount(); col++) {
            if (((Boolean) table1.getValueAt(col, 0))) {
                selectedRows.add(col);
            }
        }
        if (selectedRows.size() == 0) {
            JOptionPane.showMessageDialog(null, "请选择要开启或关闭的设备", null, JOptionPane.WARNING_MESSAGE);
            return;
        }
        for (int i = selectedRows.size() - 1; i >= 0; i--) {
            int row = selectedRows.get(i);
            DefaultTableModel model = CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices());
            JTable table = new JTable(model);
            String Device_Number = table.getValueAt(row, 3).toString();
            System.out.println(Device_Number);
            for(Device device:CloudSystem.getCloudSystem().getDevices()){
                if(device.getNumber().equals(Device_Number)){
                    device.setState();
                }
            }
            JOptionPane.showMessageDialog(null, "修改成功", null, JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
            CloudSystem.getCloudSystem().Load_Device_Catalog();
            //table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Rent(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(false);
            table1.setModel(CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices()));
            table1.setVisible(true);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    public void Add_Device(CloudSystem cloudSystem) throws IOException {
        if(cloudSystem.add_device1().getComboBox1().getItemCount()==0){
            for(String device_type:cloudSystem.getDevice_types()){
                cloudSystem.add_device1().getComboBox1().addItem(device_type);
            }
        }
        if(cloudSystem.add_device1().getComboBox2().getItemCount()==0){
            cloudSystem.add_device1().getComboBox2().addItem("关闭");
            cloudSystem.add_device1().getComboBox2().addItem("开启");
        }
        cloudSystem.add_device1().setVisible(true);
    }
}
