/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class CreateDoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctor
     */
    Person person;
    PatientDirectory patientDirectory;
    Patient patient;
    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";

    public CreateDoctorPanel(Person person, PatientDirectory patientDirectory) {
        initComponents();
        this.person = person;
        this.patientDirectory = patientDirectory;
    }

    public CreateDoctorPanel(Person person, PatientDirectory patientDirectory, Patient patient, int selectedRowIndex) {
        initComponents();
        this.person = person;
        this.patientDirectory = patientDirectory;
        this.patient = patient;
        setCreateDoctorPanel(selectedRowIndex);
    }

    private void setCreateDoctorPanel(int selectedRowIndex) {

        int index = 0;
        for (Encounter enc : this.patient.getEncounterHistory().getEncounters()) {
            if (index == selectedRowIndex) {
                txtEncounterId.setText(enc.getEncounterId().toString());
                txtEncounterDate.setText(enc.getDate());
                txtBloodPressure.setText(Double.toString(enc.getVitalSigns().getBloodPressure()));
                txtHeartRate.setText(Double.toString(enc.getVitalSigns().getHeartRate()));
                txtTemperature.setText(Double.toString(enc.getVitalSigns().getTemperature()));
                txtWeight.setText(Double.toString(enc.getVitalSigns().getWeight()));
                txtPatientName.setText(patient.getName());
                break;
            }
            index++;
        }
    }

    private boolean setEncounterData() {
        String encounterId = txtEncounterId.getText();
        String patientName = txtPatientName.getText();
        String encounterDate = txtEncounterDate.getText();
        double heartRate = Double.parseDouble(txtHeartRate.getText());
        double temperature = Double.parseDouble(txtTemperature.getText());
        double bloodPressure = Double.parseDouble(txtBloodPressure.getText());
        double weight = Double.parseDouble(txtWeight.getText());

        Encounter enc = new Encounter();
        VitalSigns vs = new VitalSigns();
        EncounterHistory encH = new EncounterHistory();
        Patient patient = new Patient();

        enc.setEncounterId(encounterId);
        enc.setDate(encounterDate);

        vs.setBloodPressure(bloodPressure);
        vs.setHeartRate(heartRate);
        vs.setTemperature(temperature);
        vs.setWeight(weight);

        enc.setVitalSigns(vs);

        boolean proceed = false;

        for (Patient pa : patientDirectory.getPatients()) {
            int index = 0;
            if (pa.getName().equals(patientName)) {
                pa.getEncounterHistory().addEncounters(enc);
                patientDirectory.updatePatients(pa, index);
                proceed = true;
                break;
            }
            index++;
        }

        if (!proceed) {
//            patient.setName(patientName);
//
//            ArrayList<Encounter> encounterList = new ArrayList<>();
//            encounterList.add(enc);
//            encH.setEncounters(encounterList);
//
//            patient.setEncounterHistory(encH);
//
//            patientDirectory.addPatients(patient);

            JOptionPane.showMessageDialog(this, "Patient with the name : " + patientName + " don't exist in the system");

        }

        return proceed;
    }

    private boolean updateEncounterData() {
        String encounterId = txtEncounterId.getText();
        String patientName = txtPatientName.getText();
        String encounterDate = txtEncounterDate.getText();
        double heartRate = Double.parseDouble(txtHeartRate.getText());
        double temperature = Double.parseDouble(txtTemperature.getText());
        double bloodPressure = Double.parseDouble(txtBloodPressure.getText());
        double weight = Double.parseDouble(txtWeight.getText());

        Encounter enc = new Encounter();
        VitalSigns vs = new VitalSigns();
        EncounterHistory encH = new EncounterHistory();
        Patient patient = new Patient();

        enc.setEncounterId(encounterId);
        enc.setDate(encounterDate);

        vs.setBloodPressure(bloodPressure);
        vs.setHeartRate(heartRate);
        vs.setTemperature(temperature);
        vs.setWeight(weight);

        enc.setVitalSigns(vs);

        boolean proceed = false;

        for (Patient pa : patientDirectory.getPatients()) {
            if (pa.getName().equals(patientName)) {
                int index = 0;
                for (Encounter encounter : pa.getEncounterHistory().getEncounters()) {
                    if (encounter.getEncounterId() == encounterId) {
                        pa.getEncounterHistory().updateEncounters(enc, index);
                        proceed = true;
                        break;
                    }
                    index++;
                }
            }
        }

        return proceed;
    }

    private void resetEncounterData() {
        txtEncounterId.setText("");
        txtEncounterDate.setText("");
        txtBloodPressure.setText("");
        txtHeartRate.setText("");
        txtTemperature.setText("");
        txtWeight.setText("");
        txtPatientName.setText("");
    }

    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtPatientName.getText().isEmpty()) {
            validationString1 += "Patient, ";
        }
        if (txtEncounterId.getText().isEmpty()) {
            validationString1 += "Encounter Id, ";
        }
        if (txtEncounterDate.getText().isEmpty()) {
            validationString1 += "EncounterDate, ";
        }
        if (txtBloodPressure.getText().isEmpty()) {
            validationString1 += "Blood Pressure, ";
        }
        if (txtHeartRate.getText().isEmpty()) {
            validationString1 += "Heart Rate, ";
        }
        if (txtTemperature.getText().isEmpty()) {
            validationString1 += "Temperature, ";
        }
        if (txtWeight.getText().isEmpty()) {
            validationString1 += "Weight, ";
        }
        return isNotValid(validationString1);
    }

    public boolean areDataTypesCorrect() {
        validationString2 = "";
        if (!validateDoubleDataType(txtBloodPressure.getText())) {
            validationString2 += "Blood Pressure, ";
        }
        if (!validateDoubleDataType(txtHeartRate.getText())) {
            validationString2 += "Heart Rate, ";
        }
        if (!validateDoubleDataType(txtTemperature.getText())) {
            validationString2 += "Temperature, ";
        }
        if (!validateDoubleDataType(txtWeight.getText())) {
            validationString2 += "Weight, ";
        }
        return isNotValid(validationString2);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateDoubleDataType(String str) {
        try {
            Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void validationErrorMessagesDialog(boolean validation1, boolean validation2) {
        if (validation1) {
            mainValidationString = validationString1;
            JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
        } else if (validation2) {
            mainValidationString = validationString2;
            JOptionPane.showMessageDialog(this, "Please enter only numbers for these fields: " + mainValidationString);
        }
    }

    private boolean encounterDetailsExistence() {
        String encounterId = txtEncounterId.getText();
        boolean exist = false;
        for (Patient pa : patientDirectory.getPatients()) {
            if (txtPatientName.getText().equals(pa.getName())) {
                for (Encounter enc : pa.getEncounterHistory().getEncounters()) {
                    if (encounterId.equals(enc.getEncounterId())) {
                        exist = true;
                        break;
                    }
                }
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
        txtPatientName = new javax.swing.JTextField();
        txtEncounterId = new javax.swing.JTextField();
        txtEncounterDate = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        txtTemperature = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Patient Name");

        txtPatientName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientNameActionPerformed(evt);
            }
        });

        txtEncounterId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncounterIdActionPerformed(evt);
            }
        });

        jLabel2.setText("Encounter Id");

        jLabel3.setText("Encounter Date");

        jLabel4.setText("Heart Rate");

        jLabel5.setText("Blood Pressure");

        jLabel6.setText("Temperature");

        jLabel7.setText("Weight");

        create.setText("Create");
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(create)
                                .addGap(18, 18, 18)
                                .addComponent(update)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(26, 26, 26)
                                .addComponent(txtTemperature))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtBloodPressure))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHeartRate)
                            .addComponent(txtEncounterDate)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtEncounterId))))
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncounterId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(update))
                .addContainerGap(414, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientNameActionPerformed

    private void txtEncounterIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncounterIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncounterIdActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:                

        boolean validation1 = areDataFieldsEmpty();
        boolean validation2 = areDataTypesCorrect();

        if (!validation1 && !validation2) {
            String encounterId = txtEncounterId.getText();
            if (!encounterDetailsExistence()) {
                if (setEncounterData()) {
                    JOptionPane.showMessageDialog(this, "New encounter data with encounter id : " + encounterId + " created");
                    resetEncounterData();
                    DoctorJFrame.refreshViewDoctorPanel(person, patientDirectory);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Encounter details already exists with the encounter id : " + encounterId);
            }
        } else {
            validationErrorMessagesDialog(validation1, validation2);
        }

        int encounterId = Integer.parseInt(txtEncounterId.getText());
        setEncounterData();
        JOptionPane.showMessageDialog(this, "New encounter data with encounter id : " + encounterId + " created");
        resetEncounterData();
        DoctorJFrame.refreshViewDoctorPanel(person, patientDirectory);
    }//GEN-LAST:event_createActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        String encounterId = txtEncounterId.getText();
        if (updateEncounterData()) {
            JOptionPane.showMessageDialog(this, "Existing patient with encounter id : " + encounterId + " updated");
        }
        resetEncounterData();
        DoctorJFrame.refreshViewDoctorPanel(person, patientDirectory);
    }//GEN-LAST:event_updateActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        DoctorJFrame.closeFrame();
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton create;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtEncounterDate;
    private javax.swing.JTextField txtEncounterId;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTemperature;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
