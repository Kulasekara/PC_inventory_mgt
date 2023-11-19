/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.se.ui.contact.employee;

import com.se.database.entities.Employee;
import com.se.database.sql.EmployeeSQL;
import com.se.ui.dashboard.DashboardView;
import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;


public class EmployeeDetailsView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewEmployee
     */
    public EmployeeDetailsView() {
        initComponents();
    }
    
    Employee emp1;
    Employee aEmp;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmpid = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUname = new javax.swing.JLabel();
        lblNic = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        rbRole = new javax.swing.JLabel();
        btnChangeRole = new javax.swing.JButton();
        lblEmpidView = new javax.swing.JLabel();
        lblNameView = new javax.swing.JLabel();
        lblUnameView = new javax.swing.JLabel();
        lblNicView = new javax.swing.JLabel();
        lblEmailView = new javax.swing.JLabel();
        lblTelephoneView = new javax.swing.JLabel();
        lblRoleView = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Employee Details");
        setMaximumSize(new java.awt.Dimension(1007, 588));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpid.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEmpid.setText("Employee Id              ");
        jPanel1.add(lblEmpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 31, 177, 30));

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblName.setText("Name                        ");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 72, 177, 30));

        lblUname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblUname.setText("User Name                ");
        jPanel1.add(lblUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 177, 27));

        lblNic.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblNic.setText("NIC                           ");
        jPanel1.add(lblNic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 177, 33));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblEmail.setText("Email                        ");
        jPanel1.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 177, 31));

        lblTelephone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblTelephone.setText("Contact No   ");
        jPanel1.add(lblTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 177, 31));

        rbRole.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        rbRole.setText("Role              ");
        jPanel1.add(rbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 177, 33));

        btnChangeRole.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnChangeRole.setText("Change Role");
        btnChangeRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeRoleActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangeRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 110, -1));

        lblEmpidView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblEmpidView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 340, 30));

        lblNameView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblNameView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 340, 30));

        lblUnameView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblUnameView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 340, 29));

        lblNicView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblNicView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 340, 30));

        lblEmailView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblEmailView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 340, 31));

        lblTelephoneView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblTelephoneView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 340, 31));

        lblRoleView.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jPanel1.add(lblRoleView, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 340, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChangeRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeRoleActionPerformed
        int input = JOptionPane.showConfirmDialog(this, "Do you want to change the role?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (input == JOptionPane.YES_OPTION) {
            pfAction();
            //this.dispose();
            //DashboardView.DesktopPane.remove((Component) this);
            //DashboardView.DesktopPane.add((Component) this);
            //this.initializeView(emp1, aEmp);
            //this.setLocation((int) ((DesktopPane.getSize().width - this.getSize().width) / 2), (int) ((DesktopPane.getSize().height - this.getSize().height) / 2));
            //this.setVisible(true);

        }
    }//GEN-LAST:event_btnChangeRoleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeRole;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailView;
    private javax.swing.JLabel lblEmpid;
    private javax.swing.JLabel lblEmpidView;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameView;
    private javax.swing.JLabel lblNic;
    private javax.swing.JLabel lblNicView;
    private javax.swing.JLabel lblRoleView;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JLabel lblTelephoneView;
    private javax.swing.JLabel lblUname;
    private javax.swing.JLabel lblUnameView;
    private javax.swing.JLabel rbRole;
    // End of variables declaration//GEN-END:variables

    void initializeView(Employee emp, Employee aEmp) {
        this.emp1 = emp;
        this.aEmp = aEmp;
        lblEmpidView.setText(String.valueOf(emp.getEmp_id()));
        lblNameView.setText(emp.getName());
        lblUnameView.setText(emp.getUname());
        lblNicView.setText(emp.getNic());
        lblEmailView.setText(emp.getEmail());
        lblTelephoneView.setText(emp.getPhone());
        lblRoleView.setText(emp.getRole());
    }

    private void pfAction() {
        JPasswordField jpf = new JPasswordField();
        int action = JOptionPane.showConfirmDialog(this, jpf, "Enter your Password", JOptionPane.OK_CANCEL_OPTION);
        if (action == 0) {
            if (aEmp.getPassword().equals(new String(jpf.getPassword()))) {
                if (lblRoleView.getText().equals("Admin")) {
                    EmployeeSQL.updateRole(Integer.parseInt(lblEmpidView.getText()), "Others");
                    lblRoleView.setText("Others");
                    //JOptionPane.showMessageDialog(this, "Successfully Updated, changes will fully take effect after re-log!");
                } else {
                    EmployeeSQL.updateRole(Integer.parseInt(lblEmpidView.getText()), "Admin");
                    lblRoleView.setText("Admin");
                    //JOptionPane.showMessageDialog(this, "Successfully Updated, changes will fully take effect after re-log!");
                }
                JOptionPane.showMessageDialog(this, "Successfully Updated!");
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Password");
                pfAction();
            }
        }
    }
}