/*
 * Created by JFormDesigner on Tue Jun 13 00:38:40 CST 2023
 */

package Gui;

import Program.CloudSystem;
import Program.Device;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

import static Program.Random_NUmber.get_R_Number;

/**
 * @author 30894
 */
public class Add_Device1 extends JFrame {
    public Add_Device1() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        contentPanel2 = new JPanel();
        formattedTextField1 = new JFormattedTextField();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label3 = new JLabel();
        label4 = new JLabel();
        formattedTextField3 = new JFormattedTextField();
        label5 = new JLabel();
        comboBox2 = new JComboBox();
        label6 = new JLabel();
        formattedTextField4 = new JFormattedTextField();
        label2 = new JLabel();
        formattedTextField2 = new JFormattedTextField();
        buttonBar = new JPanel();
        okButton = new JButton();
        cancelButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {

                //======== contentPanel2 ========
                {

                    //---- label1 ----
                    label1.setText("\u8bbe\u5907\u540d\u79f0");

                    //---- label3 ----
                    label3.setText("\u8bbe\u5907\u7c7b\u522b");

                    //---- label4 ----
                    label4.setText("\u8bbe\u5907\u89c4\u683c");

                    //---- label5 ----
                    label5.setText("\u8bbe\u5907\u72b6\u6001");

                    //---- label6 ----
                    label6.setText("\u8bbe\u5907\u63cf\u8ff0");

                    //---- label2 ----
                    label2.setText("\u8bbe\u5907\u63cf\u8ff0");

                    GroupLayout contentPanel2Layout = new GroupLayout(contentPanel2);
                    contentPanel2.setLayout(contentPanel2Layout);
                    contentPanel2Layout.setHorizontalGroup(
                        contentPanel2Layout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, contentPanel2Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(label1)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(label6)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(formattedTextField4)))
                                .addGap(55, 55, 55))
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(label3)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(label4)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(label5)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanel2Layout.createSequentialGroup()
                                        .addComponent(label2)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(formattedTextField2)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    contentPanel2Layout.setVerticalGroup(
                        contentPanel2Layout.createParallelGroup()
                            .addGroup(contentPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label1)
                                    .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label3))
                                .addGap(18, 18, 18)
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4)
                                    .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label5)
                                    .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(contentPanel2Layout.createParallelGroup()
                                    .addComponent(label2)
                                    .addComponent(formattedTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contentPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label6)
                                    .addComponent(formattedTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(contentPanel2, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(25, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(contentPanel2, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(37, Short.MAX_VALUE))
                );
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 85, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- cancelButton ----
                cancelButton.setText("Cancel");
                buttonBar.add(cancelButton, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        okButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String str = "PNO" + get_R_Number(8);
                if(formattedTextField1.getText()==null || formattedTextField2.getText()==null || formattedTextField3.getText()==null){
                    JOptionPane.showMessageDialog(null, "请填写完整信息", "提示", JOptionPane.ERROR_MESSAGE);
                    return;
                }else {
                    Device device = new Device(comboBox1.getSelectedItem().toString(), formattedTextField1.getText(),
                            str, formattedTextField3.getText(),formattedTextField2.getText(), comboBox2.getSelectedItem().toString(), "工厂设备");
                    device.getFactories().add(CloudSystem.getCloudSystem().getCurrent_account().getFactory().getName());
                    CloudSystem.getCloudSystem().getDevices().add(device);
                    CloudSystem.getCloudSystem().getCurrent_account().getFactory().getDevices().add(device);
                    try {
                        CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
                        CloudSystem.getCloudSystem().Load_Device_Catalog();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    //DefaultTableModel model = (DefaultTableModel) CloudSystem.getCloudSystem().device_menu2().getTable1().getModel();
                    DefaultTableModel model1 = CloudSystem.getCloudSystem().LoadTableModel_Normal(CloudSystem.getCloudSystem().getDevices());
                    JOptionPane.showMessageDialog(null, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                    CloudSystem.getCloudSystem().normal_menu().getTable1().setModel(model1);
                    CloudSystem.getCloudSystem().add_device1().setVisible(false);
                }
                formattedTextField1.setText("");
                formattedTextField2.setText("");
                formattedTextField3.setText("");
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().add_device1().setVisible(false);
                formattedTextField1.setText("");
                formattedTextField2.setText("");
                formattedTextField3.setText("");
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JPanel contentPanel2;
    private JFormattedTextField formattedTextField1;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label3;
    private JLabel label4;
    private JFormattedTextField formattedTextField3;
    private JLabel label5;
    private JComboBox comboBox2;
    private JLabel label6;
    private JFormattedTextField formattedTextField4;
    private JLabel label2;
    private JFormattedTextField formattedTextField2;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JComboBox getComboBox1() {
        return comboBox1;
    }
    public JComboBox getComboBox2() {
        return comboBox2;
    }
}
