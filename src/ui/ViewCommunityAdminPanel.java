/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.CommunityDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class ViewCommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCommunityAdminPanel
     */
    Person person;
    HospitalDirectory hospitalDirectory;
    PersonDirectory personDirectory;
    CommunityDirectory communityDirectory;
    
    public ViewCommunityAdminPanel(Person person,HospitalDirectory hospitalDirectory,PersonDirectory personDirectory, CommunityDirectory communityDirectory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
        this.person = person;
        this.personDirectory = personDirectory;
        this.communityDirectory = communityDirectory;
        setCommunityAdminProfileData();
    }
    
    public void setCommunityAdminProfileData() {
        if(person!=null){
            lblCommunityAdminName.setText(this.person.getFirstName() + " " + this.person.getLastName());
            lblCommunityNameValue.setText(this.person.getHouse().getCommunity());
        } else {
            lblCommunityAdminName.setText("NA");
            lblCommunityNameValue.setText("NA");
        }
        
    }
    
     public void populateHospitalTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Hospital hospital : hospitalDirectory.getHospitals()) {
            Object[] row = new Object[4];
            row[0] = hospital;
            row[1] = hospital.getHospitalID();
            row[2] = hospital.getHospitalName();
            row[3] = hospital.getHospitalAddress();

            model.addRow(row);
        }
    }
     
    public void filteredHospitalTable(ArrayList<Hospital> hospitalList) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (Hospital hospital : hospitalList) {
            Object[] row = new Object[4];
            row[0] = hospital;
            row[1] = hospital.getHospitalID();
            row[2] = hospital.getHospitalName();
            row[3] = hospital.getHospitalAddress();

            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtCommunityName = new javax.swing.JTextField();
        btnPopulateTable = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCommunityAdminName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCommunityNameValue = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Community Name", "Hospital Id", "Hospital Name", "Hospital Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnPopulateTable.setText("POPULATE TABLE");
        btnPopulateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopulateTableActionPerformed(evt);
            }
        });

        btnView.setText("VIEW");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Community Name :");

        jLabel2.setText("Community Admin Name :");

        lblCommunityAdminName.setText("NA");

        jLabel3.setText("Community Name :");

        lblCommunityNameValue.setText("NA");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("COMMUNITY ADMIN DETAILS :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPopulateTable)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCommunityNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(107, 107, 107))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnView)
                        .addGap(72, 72, 72)
                        .addComponent(btnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCommunityAdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(298, 298, 298))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblCommunityAdminName)
                    .addComponent(jLabel3)
                    .addComponent(lblCommunityNameValue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPopulateTable)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPopulateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopulateTableActionPerformed
        // TODO add your handling code here:
        String communityName = txtCommunityName.getText();
        if (communityName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter code");
        }
        else if (this.person != null && !(this.person.getAssCommunity().equalsIgnoreCase(txtCommunityName.getText())) && this.person.getRoleType() == "Community Admin") {
            JOptionPane.showMessageDialog(this, "Restricted Access");
        } else {
            ArrayList<Hospital> hospitalList = new ArrayList<>();
            for (Hospital hospital : hospitalDirectory.getHospitals()) {
                if (hospital.getCommunity().equals(communityName)) {
                    hospitalList.add(hospital);
                }
            }
            filteredHospitalTable(hospitalList);
        }


    }//GEN-LAST:event_btnPopulateTableActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        CommunityAdminJFrame.setCommunityAdminViewCommunityPanel(person,hospitalDirectory, selectedHospital, communityDirectory);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Hospital selectedHospital = (Hospital) model.getValueAt(selectedRowIndex, 0);
        hospitalDirectory.deleteHospital(selectedHospital);
        JOptionPane.showMessageDialog(this, "Hospital deleted");
        btnPopulateTableActionPerformed(evt);
        CommunityAdminJFrame.refreshCommunityAdminCreateCommunityPanel(person,hospitalDirectory,personDirectory, communityDirectory);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnPopulateTable;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCommunityAdminName;
    private javax.swing.JLabel lblCommunityNameValue;
    private javax.swing.JTextField txtCommunityName;
    // End of variables declaration//GEN-END:variables
}
