/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Community;
import model.CommunityDirectory;
import model.Hospital;
import model.HospitalDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class CreateCommunityAdminPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateCommunityAdminPanel
     */
    HospitalDirectory hospitalDirectory;
    Hospital hospital;
    Person person;
    PersonDirectory personDirectory;
    CommunityDirectory communityDirectory;
    String mainValidationString = "";
    String validationString1 = "";

    public CreateCommunityAdminPanel(Person person, HospitalDirectory hospitalDirectory, PersonDirectory personDirectory, CommunityDirectory communityDirectory) {
        initComponents();
        this.hospitalDirectory = hospitalDirectory;
        this.person = person;
        this.personDirectory = personDirectory;
        this.communityDirectory = communityDirectory;
    }

    public CreateCommunityAdminPanel(Person person, HospitalDirectory hospitalDirectory, Hospital hospital, CommunityDirectory communityDirectory) {
        initComponents();
        this.person = person;
        this.hospitalDirectory = hospitalDirectory;
        this.hospital = hospital;
        this.communityDirectory = communityDirectory;
        setSysAdminCreateCommunityPanel();
    }

    public CreateCommunityAdminPanel() {
        initComponents();
    }

    private void setSysAdminCreateCommunityPanel() {
        txtCommunityName.setText(hospital.getCommunity());
        txtHospitalId.setText(hospital.getHospitalID());
        txtHospitalName.setText(hospital.getHospitalName());
        txtHospitalAddress.setText(hospital.getHospitalAddress());
    }

    private void resetHospitalData() {
        txtCommunityName.setText("");
        txtHospitalId.setText("");
        txtHospitalName.setText("");
        txtHospitalAddress.setText("");
    }

    private Hospital setHospitalData() {
        String communityName = txtCommunityName.getText();
        String hospitalId = txtHospitalId.getText();
        String hospitalName = txtHospitalName.getText();
        String hospitalAddress = txtHospitalAddress.getText();

        Hospital hospital = new Hospital();
        hospital.setCommunity(communityName);
        hospital.setHospitalID(hospitalId);
        hospital.setHospitalName(hospitalName);
        hospital.setHospitalAddress(hospitalAddress);

        return hospital;
    }

    public boolean communityDetailsExistence() {
        String communityName = txtCommunityName.getText();
        boolean exist = false;
        for (Community com : communityDirectory.getCommunities()) {
            if (communityName.equals(com.getName())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public boolean hospitalDetailsExistence() {
        String hospitalId = txtHospitalId.getText();
        boolean exist = false;
        for (Hospital hos : hospitalDirectory.getHospitals()) {
            if (hospitalId.equals(hos.getHospitalID())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtCommunityName.getText().isEmpty()) {
            validationString1 += "Community Name, ";
        }
        if (txtHospitalId.getText().isEmpty()) {
            validationString1 += "Hospital Id, ";
        }
        if (txtHospitalName.getText().isEmpty()) {
            validationString1 += "Hospital Name, ";
        }
        if (txtHospitalAddress.getText().isEmpty()) {
            validationString1 += "Hospital Address, ";
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCommunityName = new javax.swing.JTextField();
        txtHospitalId = new javax.swing.JTextField();
        txtHospitalName = new javax.swing.JTextField();
        txtHospitalAddress = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Community Name");

        jLabel2.setText("Hospital ID");

        jLabel3.setText("Hospital Name");

        jLabel4.setText("Hospital Address");

        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("DETAILS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCommunityName)
                            .addComponent(txtHospitalId)
                            .addComponent(txtHospitalName)
                            .addComponent(txtHospitalAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnUpdate))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btnBack)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCommunityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate))
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(447, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String hospitalId = txtHospitalId.getText();
        boolean validation1 = areDataFieldsEmpty();

        if (!validation1) {
            if (this.person != null && !(this.person.getAssCommunity().equalsIgnoreCase(txtCommunityName.getText())) && this.person.getRoleType().equalsIgnoreCase("Community Admin")) {
                JOptionPane.showMessageDialog(this, "Restricted Access");
            } else {
                if (communityDetailsExistence()) {
                    if (!hospitalDetailsExistence()) {
                        hospitalDirectory.addHospital(setHospitalData());
                        JOptionPane.showMessageDialog(this, "New hospital data with hospital id : " + hospitalId + " created");
                        resetHospitalData();
                        CommunityAdminJFrame.refreshCommunityAdminViewCommunityPanel(person, hospitalDirectory, personDirectory, communityDirectory);
                    } else {
                        JOptionPane.showMessageDialog(this, "Hospital data with hospital id : " + hospitalId + " already exists in the system");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Community entered doesn't exists in the system");
                }
            }
        } else {
            validationErrorMessagesDialog();
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String hospitalId = txtHospitalId.getText();
        boolean validation1 = areDataFieldsEmpty();

        if (!validation1) {
            if (this.person != null && !(this.person.getAssCommunity().equalsIgnoreCase(txtCommunityName.getText())) && this.person.getRoleType().equalsIgnoreCase("Community Admin")) {
                JOptionPane.showMessageDialog(this, "Restricted Access");
            } else {
                if (communityDetailsExistence()) {
                    if (hospitalDetailsExistence()) {
                        Hospital hospital = setHospitalData();
                        int index = 0;
                        for (Hospital hosp : hospitalDirectory.getHospitals()) {
                            if (hosp.getHospitalID().equals(hospitalId)) {
                                hospitalDirectory.updateHospital(hospital, index);
                                break;
                            }
                            index++;
                        }
                        JOptionPane.showMessageDialog(this, "Existing hospital with hospital id : " + hospitalId + " updated");
                        resetHospitalData();
                        CommunityAdminJFrame.refreshCommunityAdminViewCommunityPanel(person, hospitalDirectory, personDirectory, communityDirectory);
                    } else {
                        JOptionPane.showMessageDialog(this, "Hospital data with hospital id : " + hospitalId + " doesn't exists in the system");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Community entered doesn't exists in the system");
                }
            }
        } else {
            validationErrorMessagesDialog();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CommunityAdminJFrame.closeFrame();
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCommunityName;
    private javax.swing.JTextField txtHospitalAddress;
    private javax.swing.JTextField txtHospitalId;
    private javax.swing.JTextField txtHospitalName;
    // End of variables declaration//GEN-END:variables
}
