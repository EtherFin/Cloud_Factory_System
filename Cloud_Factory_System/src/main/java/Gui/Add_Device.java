/*
 * Created by JFormDesigner on Mon Jun 12 20:23:03 CST 2023
 */

package Gui;

import Program.CloudSystem;
import Program.Device;
import Program.Product;
import Program.Random_NUmber;

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
public class Add_Device extends JFrame {
    public Add_Device() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        dialogPane = new JPanel();
        contentPanel = new JPanel();
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

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addContainerGap(39, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label1)
                                .addComponent(label3)
                                .addComponent(label4)
                                .addComponent(label5)
                                .addComponent(label6))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboBox1)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                            .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addComponent(formattedTextField4, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4)
                                .addComponent(formattedTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(comboBox2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label6)
                                .addComponent(formattedTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(33, Short.MAX_VALUE))
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
                String str = "PNO"+get_R_Number(8);
                if(formattedTextField1.getText()==null || formattedTextField4.getText()==null || formattedTextField3.getText()==null){
                    JOptionPane.showMessageDialog(null, "请填写完整信息", "提示", JOptionPane.ERROR_MESSAGE);
                    return;
                }else {
                    CloudSystem.getCloudSystem().getDevices().add(new Device(comboBox1.getSelectedItem().toString(), str, formattedTextField1.getText(),
                            formattedTextField3.getText(), formattedTextField4.getText(), comboBox2.getSelectedItem().toString(), "未被租用"));
                    try {
                        CloudSystem.getCloudSystem().Write_Device_Catalog(CloudSystem.getCloudSystem().getDevices());
                        CloudSystem.getCloudSystem().Load_Device_Catalog();
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                    DefaultTableModel model = (DefaultTableModel) CloudSystem.getCloudSystem().device_menu2().getTable1().getModel();
                    model.addRow(new Object[]{false, model.getRowCount()+1, formattedTextField1.getText(), str,
                            comboBox1.getSelectedItem().toString(), formattedTextField3.getText(), comboBox2.getSelectedItem().toString(), formattedTextField4.getText(),"未被租用"});
                    JOptionPane.showMessageDialog(null, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                    CloudSystem.getCloudSystem().device_menu2().getTable1().setModel(model);
                    CloudSystem.getCloudSystem().add_device().setVisible(false);
                }
                formattedTextField1.setText("");
                formattedTextField3.setText("");
                formattedTextField4.setText("");
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CloudSystem.getCloudSystem().add_device().setVisible(false);
                formattedTextField1.setText("");
                formattedTextField3.setText("");
                formattedTextField4.setText("");
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JPanel dialogPane;
    private JPanel contentPanel;
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
    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }
    public JFormattedTextField getFormattedTextField3() {
        return formattedTextField3;
    }
    public JFormattedTextField getFormattedTextField4() {
        return formattedTextField4;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }
    public JButton getOkButton() {
        return okButton;
    }
}
