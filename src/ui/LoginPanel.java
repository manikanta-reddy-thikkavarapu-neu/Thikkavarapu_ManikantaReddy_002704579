/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.CommunityDirectory;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class LoginPanel extends javax.swing.JPanel {
    private PersonDirectory personDirectory;
    private CommunityDirectory communityDirectory;
    private DoctorDirectory doctorDirectory;
    private HospitalDirectory hospitalDirectory;
    private PatientDirectory patientDirectory;
    
    /**
     * Creates new form LoginPanel
     */
    public LoginPanel(PersonDirectory personDirectory, PatientDirectory patientDirectory, HospitalDirectory hospitalDirectory,
            DoctorDirectory doctorDirectory, CommunityDirectory communityDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
        this.patientDirectory = patientDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.communityDirectory = communityDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEUserName = new javax.swing.JTextField();
        txtEPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 250, 250));

        btnLoginUser.setText("LOGIN USER");
        btnLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginUserActionPerformed(evt);
            }
        });

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("LOGIN PAGE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(txtEUserName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLoginUser))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(108, 108, 108)
                .addComponent(btnLoginUser)
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginUserActionPerformed
        // TODO add your handling code here:
        String userName = txtEUserName.getText();
        String password = txtEPassword.getText();
        ArrayList<Person> list = personDirectory.getPersons();
        
         if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all the details !!");
        } else {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "You have not registered !!");
            } else {
                int index = 0;
                for (Person temp : list) {
                    if (userName.equalsIgnoreCase(temp.getUserName()) && password.equalsIgnoreCase(temp.getPassword())) {
                        if (temp.getRoleType().equalsIgnoreCase("Patient")) {
                            PatientJFrame patientFrame = new PatientJFrame(temp,hospitalDirectory,doctorDirectory,communityDirectory);
                            patientFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            patientFrame.setVisible(true);
                            new PatientJFrame(patientFrame);
                        } else if (temp.getRoleType().equalsIgnoreCase("Doctor")) {
                            DoctorJFrame doctor = new DoctorJFrame(temp, patientDirectory, personDirectory);
                            doctor.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            doctor.setVisible(true);
                            new DoctorJFrame(doctor);
                        } else if (temp.getRoleType().equalsIgnoreCase("Hospital Admin")) {
                            HospitalJFrame hospitalFrame = new HospitalJFrame(temp, doctorDirectory, personDirectory,hospitalDirectory);
                            hospitalFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            hospitalFrame.setVisible(true);
                            new HospitalJFrame(hospitalFrame);
                        } else if (temp.getRoleType().equalsIgnoreCase("Community Admin")) {
                            CommunityAdminJFrame communityadminFrame = new CommunityAdminJFrame(temp, hospitalDirectory, personDirectory, communityDirectory);
                            communityadminFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
                            communityadminFrame.setVisible(true);
                            new CommunityAdminJFrame(communityadminFrame);
                        }
                    } else {
                        index++;
                    }
                }
                if (index == list.size()) {
                    JOptionPane.showMessageDialog(this, "You have not registered !!");
                }
            }
        }
                        
//                JOptionPane.showMessageDialog(this, "Invalid User");
    }//GEN-LAST:event_btnLoginUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEPassword;
    private javax.swing.JTextField txtEUserName;
    // End of variables declaration//GEN-END:variables
}
