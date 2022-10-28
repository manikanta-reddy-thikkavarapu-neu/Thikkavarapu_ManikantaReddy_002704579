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

    private void setCommunityData() {
        String communityId = txtCommunityId.getText();
        String communityName = txtCommunityName.getText();
        Community community = new Community();
        community.setId(communityId);
        community.setName(communityName);
        communityDirectory.addCommunity(community);
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("Community Id");

        jLabel2.setText("Community Name");

        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(62, 62, 62)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCommunityId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int communityId = Integer.parseInt(txtCommunityId.getText());
        setCommunityData();
        JOptionPane.showMessageDialog(this, "New encounter data with encounter id : " + communityId + " created");
        resetCommunityData();
        SysAdminCreateCommunitiesJFrame.refreshSysAdminViewCommunityPanel(communityDirectory);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCommunityId;
    private javax.swing.JTextField txtCommunityName;
    // End of variables declaration//GEN-END:variables
}
