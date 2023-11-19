/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se.ui.purchase;

import com.se.database.entities.Employee;
import com.se.database.entities.Grn;
import com.se.database.entities.Supplier;
import com.se.database.sql.EmployeeSQL;
import com.se.database.sql.GrnSQL;
import com.se.database.sql.SupplierSQL;
import com.se.ui.dashboard.DashboardView;
import static com.se.ui.dashboard.DashboardView.DesktopPane;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class GRNListView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InvoiceListView
     */
    public GRNListView() {
        initComponents();
    }

    private DefaultTableModel dtmGrn;
    private List<Grn> list;
    private List<Employee> empList;
    private List<Supplier> supList;
    private String[] notes;

//    private int aID;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGrn = new javax.swing.JTable();
        pannelFilter = new javax.swing.JPanel();
        btnFilter = new javax.swing.JButton();
        btnSeeAll = new javax.swing.JButton();
        cbGrnID = new javax.swing.JCheckBox();
        lblGrnIDId = new javax.swing.JLabel();
        txtGrnId = new javax.swing.JTextField();
        cbDate = new javax.swing.JCheckBox();
        lblDate = new javax.swing.JLabel();
        calDate = new com.toedter.calendar.JDateChooser();
        cbSupplier = new javax.swing.JCheckBox();
        cmbSupplier = new javax.swing.JComboBox<>();

        setClosable(true);
        setTitle("GRN List");

        tblGrn.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Made Date", "GRN ID", "Net Total", "Supplier", "Employee"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGrn.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblGrn);
        if (tblGrn.getColumnModel().getColumnCount() > 0) {
            tblGrn.getColumnModel().getColumn(1).setMinWidth(0);
            tblGrn.getColumnModel().getColumn(1).setPreferredWidth(90);
            tblGrn.getColumnModel().getColumn(1).setMaxWidth(90);
            tblGrn.getColumnModel().getColumn(2).setMinWidth(0);
            tblGrn.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblGrn.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        pannelFilter.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 120, 212)), "Filter List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12))); // NOI18N

        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        btnSeeAll.setText("Clear All");
        btnSeeAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeeAllActionPerformed(evt);
            }
        });

        cbGrnID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGrnIDActionPerformed(evt);
            }
        });

        lblGrnIDId.setText("GRN ID");

        txtGrnId.setEnabled(false);

        cbDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDateActionPerformed(evt);
            }
        });

        lblDate.setText("Date");

        calDate.setEnabled(false);

        cbSupplier.setText("Supplier");
        cbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSupplierActionPerformed(evt);
            }
        });

        cmbSupplier.setEnabled(false);

        javax.swing.GroupLayout pannelFilterLayout = new javax.swing.GroupLayout(pannelFilter);
        pannelFilter.setLayout(pannelFilterLayout);
        pannelFilterLayout.setHorizontalGroup(
            pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelFilterLayout.createSequentialGroup()
                .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelFilterLayout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSeeAll, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pannelFilterLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(cbSupplier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(301, Short.MAX_VALUE))
            .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelFilterLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(cbGrnID)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblGrnIDId)
                    .addGap(18, 18, 18)
                    .addComponent(txtGrnId, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 349, Short.MAX_VALUE)
                    .addComponent(cbDate)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(lblDate)
                    .addGap(18, 18, 18)
                    .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        pannelFilterLayout.setVerticalGroup(
            pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelFilterLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSupplier)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFilter)
                    .addComponent(btnSeeAll))
                .addContainerGap())
            .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pannelFilterLayout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calDate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pannelFilterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblGrnIDId)
                                .addComponent(txtGrnId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDate)))
                        .addComponent(cbGrnID)
                        .addComponent(cbDate))
                    .addContainerGap(65, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(pannelFilter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pannelFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeeAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeeAllActionPerformed
        //initializeView(aID);
        setDtmGrn();
        resetTxt();
        list.forEach(item -> {
            String name = "";
            String sName = "";
            for (Employee emp : empList) {
                if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                    name = emp.getTitle() + " " + emp.getName();

                }
            }
            for (Supplier sup : supList) {
                if (sup.getSup_id() == item.getSupplier_sup_id()) {
                    sName = sup.getCompany();

                }
            }
            dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
        });
    }//GEN-LAST:event_btnSeeAllActionPerformed

    private void cbGrnIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGrnIDActionPerformed
        if (this.cbGrnID.isSelected()) {
            this.txtGrnId.setEnabled(true);
        } else {
            this.txtGrnId.setEnabled(false);
        }
    }//GEN-LAST:event_cbGrnIDActionPerformed

    private void cbDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDateActionPerformed
        if (this.cbDate.isSelected()) {
            this.calDate.setEnabled(true);
        } else {
            this.calDate.setEnabled(false);
        }
    }//GEN-LAST:event_cbDateActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        if (!cbGrnID.isSelected() && !cbSupplier.isSelected() && !cbDate.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select filter criteria", "", JOptionPane.ERROR_MESSAGE);
        } else {
            if (!cbGrnID.isSelected() && !cbSupplier.isSelected() && cbDate.isSelected()) {
                if (calDate.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView1();
                }
            } else if (!cbGrnID.isSelected() && cbSupplier.isSelected() && !cbDate.isSelected()) {
                if (cmbSupplier.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select the supplier", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView2();
                }
            } else if (!cbGrnID.isSelected() && cbSupplier.isSelected() && cbDate.isSelected()) {
                if (cmbSupplier.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select the supplier", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (calDate.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView3();
                }
            } else if (cbGrnID.isSelected() && !cbSupplier.isSelected() && !cbDate.isSelected()) {
                if (txtGrnId.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Please enter GRN ID", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView4();
                }
            } else if (cbGrnID.isSelected() && !cbSupplier.isSelected() && cbDate.isSelected()) {
                if (txtGrnId.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Please enter GRN ID", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (calDate.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView5();
                }
            } else if (cbGrnID.isSelected() && cbSupplier.isSelected() && !cbDate.isSelected()) {
                if (txtGrnId.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Please enter GRN ID", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (cmbSupplier.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select the supplier", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView6();
                }
            } else if (cbGrnID.isSelected() && cbSupplier.isSelected() && cbDate.isSelected()) {
                if (txtGrnId.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Please enter GRN ID", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (cmbSupplier.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(this, "Please select the supplier", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (calDate.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    filterView7();
                }
            }
            if (tblGrn.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No search results found");
                setDtmGrn();
                resetTxt();
                list.forEach(item -> {
                    String name = "";
                    String sName = "";
                    for (Employee emp : empList) {
                        if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                            name = emp.getTitle() + " " + emp.getName();

                        }
                    }
                    for (Supplier sup : supList) {
                        if (sup.getSup_id() == item.getSupplier_sup_id()) {
                            sName = sup.getCompany();

                        }
                    }
                    dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
                });
            }
        }

//        try {
//            if (cbGrnID.isSelected() && !cbDate.isSelected()) {
//                if (this.txtGrnId.getText().equals("")) {
//                    JOptionPane.showMessageDialog(this, "Please enter transaction ID", "", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    filterView1();
//                }
//            } else if (!cbGrnID.isSelected() && cbDate.isSelected()) {
//                filterView2();
//            } else if (cbGrnID.isSelected() && cbDate.isSelected()) {
//                if (this.txtGrnId.getText().equals("")) {
//                    JOptionPane.showMessageDialog(this, "Please enter transaction ID", "", JOptionPane.ERROR_MESSAGE);
//                } else {
//                    filterView3();
//                }
//            }
//
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(this, "Please enter  Date", "", JOptionPane.ERROR_MESSAGE);
//
//        }

    }//GEN-LAST:event_btnFilterActionPerformed

    private void cbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSupplierActionPerformed
        if (cbSupplier.isSelected()) {
            cmbSupplier.setEnabled(true);
        } else {
            cmbSupplier.setEnabled(false);
        }
    }//GEN-LAST:event_cbSupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnSeeAll;
    private com.toedter.calendar.JDateChooser calDate;
    private javax.swing.JCheckBox cbDate;
    private javax.swing.JCheckBox cbGrnID;
    private javax.swing.JCheckBox cbSupplier;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblGrnIDId;
    private javax.swing.JPanel pannelFilter;
    private javax.swing.JTable tblGrn;
    private javax.swing.JTextField txtGrnId;
    // End of variables declaration//GEN-END:variables

    public void initializeView(int id) {
        this.notes = new String[tblGrn.getRowCount()];
//        this.aID = id;

        cmbSupplier.removeAllItems();
        cmbSupplier.addItem("<Select the Supplier>");

        List<String> supplierlist = SupplierSQL.getSuppliers();
        supplierlist.forEach(group -> {
            cmbSupplier.addItem(group);
        });

        list = GrnSQL.getAllItems();
        empList = EmployeeSQL.getAllEmployee();
        supList = SupplierSQL.getAllSuppliers();

        setDtmGrn();
        resetTxt();
        list.forEach(item -> {
            String name = "";
            String sName = "";
            for (Employee emp : empList) {
                if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                    name = emp.getTitle() + " " + emp.getName();

                }
            }
            for (Supplier sup : supList) {
                if (sup.getSup_id() == item.getSupplier_sup_id()) {
                    sName = sup.getCompany();

                }
            }
            dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
        });

        this.notes = new String[tblGrn.getRowCount()];
        int i = 0;
        for (Grn grn : list) {
            notes[i] = grn.getNote();
            i++;
        }

        tblGrn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                if (me.getClickCount() == 2) {     // to detect doble click events
                    JTable target = (JTable) me.getSource();
                    int row = target.getSelectedRow(); // select a row
                    //int column = target.getSelectedColumn(); // select a column
                    //JOptionPane.showMessageDialog(null, tblTrans.getValueAt(row, 1)); // get the value of a row and column.
                    int tblid = (Integer) tblGrn.getValueAt(row, 1);
                    String tblemp = tblGrn.getValueAt(row, 4).toString();
                    String tblsup = tblGrn.getValueAt(row, 3).toString();
                    String tbldate = tblGrn.getValueAt(row, 0).toString();
                    String tbltotal = tblGrn.getValueAt(row, 2).toString();
                    String note = notes[row];
                    GRNItemsView inv = new GRNItemsView();
                    DashboardView.DesktopPane.add((Component) inv);
                    inv.initializeView(tblid, tblemp, tblsup, note, tbldate, tbltotal);
                    inv.setLocation((int) ((DesktopPane.getSize().width - inv.getSize().width) / 2), (int) ((DesktopPane.getSize().height - inv.getSize().height) / 2));
                    inv.setVisible(true);
                }
            }

        }
        );
    }

    private void setDtmGrn() {
        dtmGrn = (DefaultTableModel) this.tblGrn.getModel();
        dtmGrn.getDataVector().removeAllElements();
        dtmGrn.fireTableDataChanged();
    }

    private void resetTxt() {
        txtGrnId.setText("");
        txtGrnId.setEnabled(false);
        cmbSupplier.setSelectedIndex(0);
        cmbSupplier.setEnabled(false);
        calDate.setDate(null);
        calDate.setEnabled(false);
        cbDate.setSelected(false);
        cbGrnID.setSelected(false);
        cbSupplier.setSelected(false);
    }

    public void filterView1() {
        try {
            Date date = this.calDate.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sdf.format(date);

            setDtmGrn();
//            resetTxt();
            list.forEach(item -> {
                String name = "";
                String sName = "";
                for (Employee emp : empList) {
                    if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                        name = emp.getTitle() + " " + emp.getName();
                    }
                }
                for (Supplier sup : supList) {
                    if (sup.getSup_id() == item.getSupplier_sup_id()) {
                        sName = sup.getCompany();

                    }
                }
                if (item.getMade_date().substring(0, 10).equals(strDate)) {
                    dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
                }
            });
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public void filterView2() {
        String s = cmbSupplier.getSelectedItem().toString();

        setDtmGrn();
//        resetTxt();
        list.forEach(item -> {
            String name = "";
            String sName = "";
            for (Employee emp : empList) {
                if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                    name = emp.getTitle() + " " + emp.getName();
                }
            }
            for (Supplier sup : supList) {
                if (sup.getSup_id() == item.getSupplier_sup_id()) {
                    sName = sup.getCompany();

                }
            }
            if (sName.equals(s)) {
                dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
            }
        });
    }

    public void filterView3() {
        try {
            String s = cmbSupplier.getSelectedItem().toString();
            Date date = this.calDate.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sdf.format(date);

            setDtmGrn();
//            resetTxt();
            list.forEach(item -> {
                String name = "";
                String sName = "";
                for (Employee emp : empList) {
                    if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                        name = emp.getTitle() + " " + emp.getName();
                    }
                }
                for (Supplier sup : supList) {
                    if (sup.getSup_id() == item.getSupplier_sup_id()) {
                        sName = sup.getCompany();

                    }
                }
                if (sName.equals(s) && item.getMade_date().substring(0, 10).equals(strDate)) {
                    dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
                }

            });
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public void filterView4() {
        String id = this.txtGrnId.getText();

        setDtmGrn();
//        resetTxt();
        list.forEach(item -> {
            String name = "";
            String sName = "";
            for (Employee emp : empList) {
                if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                    name = emp.getTitle() + " " + emp.getName();
                }
            }
            for (Supplier sup : supList) {
                if (sup.getSup_id() == item.getSupplier_sup_id()) {
                    sName = sup.getCompany();
                }
            }
            if ((item.getGrn_id() == Integer.parseInt(id))) {
                dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
            }
        });
    }

    public void filterView5() {
        String id = this.txtGrnId.getText();
        Date date = this.calDate.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String strDate = sdf.format(date);

        setDtmGrn();
//        resetTxt();
        list.forEach(item -> {
            String name = "";
            String sName = "";
            for (Employee emp : empList) {
                if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                    name = emp.getTitle() + " " + emp.getName();
                }
            }
            for (Supplier sup : supList) {
                if (sup.getSup_id() == item.getSupplier_sup_id()) {
                    sName = sup.getCompany();

                }
            }
            if ((item.getGrn_id() == Integer.parseInt(id)) && item.getMade_date().substring(0, 10).equals(strDate)) {
                dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
            }
        });
    }

    public void filterView6() {
        String id = this.txtGrnId.getText();
        String s = cmbSupplier.getSelectedItem().toString();

        setDtmGrn();
//        resetTxt();
        list.forEach(item -> {
            String name = "";
            String sName = "";
            for (Employee emp : empList) {
                if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                    name = emp.getTitle() + " " + emp.getName();
                }
            }
            for (Supplier sup : supList) {
                if (sup.getSup_id() == item.getSupplier_sup_id()) {
                    sName = sup.getCompany();

                }
            }
            if ((item.getGrn_id() == Integer.parseInt(id)) && sName.equals(s)) {
                dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
            }
        });
    }

    public void filterView7() {
        try {
            String id = this.txtGrnId.getText();
            String s = cmbSupplier.getSelectedItem().toString();
            Date date = this.calDate.getDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sdf.format(date);

            setDtmGrn();
//            resetTxt();
            list.forEach(item -> {
                String name = "";
                String sName = "";
                for (Employee emp : empList) {
                    if (emp.getEmp_id() == item.getEmployee_emp_id()) {
                        name = emp.getTitle() + " " + emp.getName();
                    }
                }
                for (Supplier sup : supList) {
                    if (sup.getSup_id() == item.getSupplier_sup_id()) {
                        sName = sup.getCompany();

                    }
                }
                if ((item.getGrn_id() == Integer.parseInt(id)) && sName.equals(s) && item.getMade_date().substring(0, 10).equals(strDate)) {
                    dtmGrn.addRow(new Object[]{item.getMade_date(), item.getGrn_id(), String.format("%.2f", item.getNet_total()), sName, name});
                }
            });
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Please select the date", "", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }
}
