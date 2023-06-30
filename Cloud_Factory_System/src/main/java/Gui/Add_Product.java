/*
 * Created by JFormDesigner on Mon Jun 12 14:02:43 CST 2023
 */

package Gui;

import Program.CloudSystem;
import Program.Product;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;

import static Program.Random_NUmber.get_R_Number;

/**
 * @author 30894
 */
public class Add_Product extends JFrame {
    public Add_Product() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        formattedTextField1 = new JFormattedTextField();
        formattedTextField4 = new JFormattedTextField();
        formattedTextField5 = new JFormattedTextField();
        label3 = new JLabel();
        label1 = new JLabel();
        comboBox1 = new JComboBox();
        label4 = new JLabel();
        label5 = new JLabel();
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

                //---- label3 ----
                label3.setText("\u4ea7\u54c1\u540d\u79f0");

                //---- label1 ----
                label1.setText("\u4ea7\u54c1\u7c7b\u522b");

                //---- label4 ----
                label4.setText("\u4ea7\u54c1\u89c4\u683c");

                //---- label5 ----
                label5.setText("\u4ea7\u54c1\u63cf\u8ff0");

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label3)
                                .addComponent(label1)
                                .addComponent(label4)
                                .addComponent(label5))
                            .addGap(27, 27, 27)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(formattedTextField1, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(formattedTextField4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(formattedTextField5, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                            .addGap(58, 58, 58))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(formattedTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label3))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label1)
                                .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(label4)
                                .addComponent(formattedTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label5)
                                .addComponent(formattedTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(21, Short.MAX_VALUE))
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
                if(formattedTextField1.getText()==null || formattedTextField4.getText()==null || formattedTextField5.getText()==null){
                    JOptionPane.showMessageDialog(null, "请填写完整信息", "提示", JOptionPane.ERROR_MESSAGE);
                    return;
                }else {
                    CloudSystem.getCloudSystem().getProducts().add(new Product(formattedTextField1.getText(), comboBox1.getSelectedItem().toString(), str, formattedTextField4.getText(), formattedTextField5.getText()));
                    try {
                        CloudSystem.getCloudSystem().Write_Product_Catalog(CloudSystem.getCloudSystem().getProducts());
                        CloudSystem.getCloudSystem().Load_Product_Catalog();
                    } catch (FileNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                    DefaultTableModel model = (DefaultTableModel) CloudSystem.getCloudSystem().product_menu2().getTable1().getModel();
                    model.addRow(new Object[]{false, model.getRowCount()+1, formattedTextField1.getText(), str, comboBox1.getSelectedItem().toString(), formattedTextField4.getText(), formattedTextField5.getText()});
                    JOptionPane.showMessageDialog(null, "添加成功", "提示", JOptionPane.INFORMATION_MESSAGE);
                    CloudSystem.getCloudSystem().product_menu2().getTable1().setModel(model);
                    CloudSystem.getCloudSystem().add_product().setVisible(false);
                }
                formattedTextField1.setText("");
                formattedTextField4.setText("");
                formattedTextField5.setText("");
            }
        });
        cancelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                formattedTextField1.setText("");
                formattedTextField4.setText("");
                formattedTextField5.setText("");
                CloudSystem.getCloudSystem().add_product().setVisible(false);
            }
        });
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Educational license - Haichen Jiang (海晨 姜)
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JFormattedTextField formattedTextField1;
    private JFormattedTextField formattedTextField4;
    private JFormattedTextField formattedTextField5;
    private JLabel label3;
    private JLabel label1;
    private JComboBox comboBox1;
    private JLabel label4;
    private JLabel label5;
    private JPanel buttonBar;
    private JButton okButton;
    private JButton cancelButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public JComboBox getComboBox1() {
        return comboBox1;
    }
    public JFormattedTextField getFormattedTextField1() {
        return formattedTextField1;
    }
    public JFormattedTextField getFormattedTextField4() {
        return formattedTextField4;
    }
    public JFormattedTextField getFormattedTextField5() {
        return formattedTextField5;
    }
    public JButton getCancelButton() {
        return cancelButton;
    }
    public JButton getOkButton() {
        return okButton;
    }
}
