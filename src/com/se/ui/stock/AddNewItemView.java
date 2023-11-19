/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se.ui.stock;

import com.se.ui.utils.ColorPalette;
import com.se.database.entities.Items;
import com.se.database.sql.ItemSQL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;


public class AddNewItemView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddNewItemView
     */
    public AddNewItemView() {
        initComponents();
    }
    private List<Items> list;
    private ArrayList<Object> items;

    void initializeView() {
        list = ItemSQL.getAllItems();
        txtCategory.setText("");
        txtItemName.setText("");
        spinnerQty.setValue(0);
        txtPrice.setText("");
        cmbWarranty.setSelectedIndex(0);
        txtWarranty.setText("");
    }

    private void cmbWarrantyAction(int warranty) throws SQLException {
        switch (warranty) {
            case 7:
                txtWarranty.setEnabled(true);
                txtWarranty.setBorder(BorderFactory.createLineBorder(ColorPalette.BTNBORDER, 1));
                txtWarranty.setText("");
                break;
            case 0:
                txtWarranty.setEnabled(false);
                txtWarranty.setBorder(BorderFactory.createLineBorder(java.awt.Color.LIGHT_GRAY, 1));
                txtWarranty.setText("");
                break;
            default:
                txtWarranty.setEnabled(false);
                txtWarranty.setBorder(BorderFactory.createLineBorder(java.awt.Color.LIGHT_GRAY, 1));
                txtWarranty.setText((String) cmbWarranty.getSelectedItem());
                break;
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWarranty = new javax.swing.JLabel();
        lblQty = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblCategory = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        spinnerQty = new javax.swing.JSpinner();
        btnClear = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        cmbWarranty = new javax.swing.JComboBox();
        txtWarranty = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Add New Item");

        lblWarranty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblWarranty.setText("Warranty");

        lblQty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblQty.setText("Qty");

        lblItem.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblItem.setText("Item");

        lblCategory.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblCategory.setText("Category");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblPrice.setText("Unit Price");

        txtCategory.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtItemName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        spinnerQty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        spinnerQty.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerQtyStateChanged(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        cmbWarranty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        cmbWarranty.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select the Warranty>", "3 months", "4 months", "6 months", "1 year", "2 years", "4 years", "Other..." }));
        cmbWarranty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbWarrantyActionPerformed(evt);
            }
        });

        txtWarranty.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtWarranty.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtWarranty)
                        .addComponent(txtCategory)
                        .addComponent(txtItemName)
                        .addComponent(txtPrice)
                        .addComponent(cmbWarranty, 0, 276, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmbWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblQty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtWarranty, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbWarrantyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbWarrantyActionPerformed
        int cmb = cmbWarranty.getSelectedIndex();

        try {
            cmbWarrantyAction(cmb);
        } catch (SQLException ex) {
            Logger.getLogger(EdiItemDetailsView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbWarrantyActionPerformed

    private void spinnerQtyStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerQtyStateChanged
        if (Integer.parseInt(spinnerQty.getValue().toString()) < 0) {
            spinnerQty.setValue(0);
        }
    }//GEN-LAST:event_spinnerQtyStateChanged

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String categoroy = txtCategory.getText();
        String name = txtItemName.getText();
        int qty = (int) spinnerQty.getValue();
        double price = Double.valueOf(txtPrice.getText());
        String warranty = "";
        int cmb = cmbWarranty.getSelectedIndex();
        int id = 0;

        if (categoroy.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a category!", "", JOptionPane.INFORMATION_MESSAGE);
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter a name!", "", JOptionPane.INFORMATION_MESSAGE);
        } else if (qty == 0) {
            JOptionPane.showMessageDialog(this, "Please enter the qty!", "", JOptionPane.INFORMATION_MESSAGE);
        } else if (price == 0) {
            JOptionPane.showMessageDialog(this, "Please enter the unit price!", "", JOptionPane.INFORMATION_MESSAGE);
        } else if (txtWarranty.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Please select a warranty!", "", JOptionPane.INFORMATION_MESSAGE);
        } else {
            warranty = txtWarranty.getText();

            int input = JOptionPane.showConfirmDialog(this, "Do you want to add this item ?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (input == JOptionPane.YES_OPTION) {

                ItemSQL.addItem(id, categoroy, name, qty, price, warranty);
                JOptionPane.showMessageDialog(this, "Item is added successfully!", "", JOptionPane.INFORMATION_MESSAGE);

                this.dispose();
//                DashboardView.DesktopPane.remove((Component) this);
//                DashboardView.DesktopPane.add((Component) this);
//                this.initializeView();
//                this.setLocation((int) ((DesktopPane.getSize().width - this.getSize().width) / 2), (int) ((DesktopPane.getSize().height - this.getSize().height) / 2));
//                this.dispose();
//                this.setVisible(true);

            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCategory.setText("");
        txtItemName.setText("");
        spinnerQty.setValue(0);
        txtPrice.setText(String.valueOf(0));
        cmbWarranty.setSelectedIndex(0);
        txtWarranty.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox cmbWarranty;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCategory;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQty;
    private javax.swing.JLabel lblWarranty;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtWarranty;
    // End of variables declaration//GEN-END:variables
}