/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Community;
import model.CommunityDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.VitalSigns;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class SysAdminCreateCommunityPanel extends javax.swing.JPanel {

    /**
     * Creates new form SysAdminCreateCommunityPanel
     */
    CommunityDirectory communityDirectory;
    Community community;
    String mainValidationString = "";
    String validationString1 = "";

    public SysAdminCreateCommunityPanel(CommunityDirectory communityDirectory) {
        initComponents();
        this.communityDirectory = communityDirectory;
    }

    public SysAdminCreateCommunityPanel(CommunityDirectory communityDirectory, Community community) {
        initComponents();
        this.communityDirectory = communityDirectory;
        this.community = community;
        setSysAdminCreateCommunityPanel();
    }

    private void setSysAdminCreateCommunityPanel() {
        txtCommunityId.setText(community.getId());
        txtCommunityName.setText(community.getName());
    }

    private void resetCommunityData() {
        txtCommunityId.setText("");
        txtCommunityName.setText("");
    }

    private Community setCommunityData() {
        String communityId = txtCommunityId.getText();
        String communityName = txtCommunityName.getText();
        Community community = new Community();
        community.setId(communityId);
        community.setName(communityName);
        return community;
    }

    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtCommunityId.getText().isEmpty()) {
            validationString1 += "Community Id, ";
        }
        if (txtCommunityName.getText().isEmpty()) {
            validationString1 += "Community Name, ";
        }
        return isNotValid(validationString1);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public void validationErrorMessagesDialog() {
        mainValidationString = validationString1;
        JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
    }

    public boolean communityDetailsExistence() {
        String communityId = txtCommunityId.getText();
        boolean exist = false;
        for (Community com : communityDirectory.getCommunities()) {
            if (communityId.equals(com.getId())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCommunityId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCommunityName = new javax.swing.JTextField();
        createBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Community Id");

        jLabel2.setText("Community Name");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCommunityId)
                                    .addComponent(txtCommunityName, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createBtn)
                                .addGap(18, 18, 18)
                                .addComponent(updateBtn)
                                .addGap(62, 62, 62))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(updateBtn))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:

        boolean validation1 = areDataFieldsEmpty();

        if (!validation1) {
            String communityId = txtCommunityId.getText();
            if (!communityDetailsExistence()) {
                communityDirectory.addCommunity(setCommunityData());
                JOptionPane.showMessageDialog(this, "New community with community id : " + communityId + " created");
                resetCommunityData();
                SysAdminCreateCommunitiesJFrame.refreshSysAdminViewCommunityPanel(communityDirectory);
            } else {
                JOptionPane.showMessageDialog(this, "Community details already exists with the community id : " + communityId);
            }
        } else {
            validationErrorMessagesDialog();
        }
    }//GEN-LAST:event_createBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        SysAdminCreateCommunitiesJFrame.closeFrame();
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        // TODO add your handling code here:

        String communityId = txtCommunityId.getText();

        if (!communityDetailsExistence()) {
            JOptionPane.showMessageDialog(this, "You can't update the community details since community id : " + communityId + " doesn't exist");
        } else {
            boolean validation1 = areDataFieldsEmpty();
            if (!validation1) {
                Community community = setCommunityData();
                int index = 0;
                for (Community com : communityDirectory.getCommunities()) {
                    if (com.getId().equals(communityId)) {
                        communityDirectory.updateCommunity(community, index);
                        break;
                    }
                    index++;
                }
                JOptionPane.showMessageDialog(this, "Existing community details with community id : " + communityId + " updated");
                resetCommunityData();
                SysAdminCreateCommunitiesJFrame.refreshSysAdminViewCommunityPanel(communityDirectory);
            } else {
                validationErrorMessagesDialog();
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
