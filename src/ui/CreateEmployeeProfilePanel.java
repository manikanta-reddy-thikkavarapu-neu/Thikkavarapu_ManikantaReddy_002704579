/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.EmployeeProfile;
import model.EmployeeProfileHistory;

/**
 *
 * @author tmani
 */
public class CreateEmployeeProfilePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateEmployeeProfilePanel
     */
    EmployeeProfileHistory history;
    EmployeeProfile employee;
    String photoPath;
    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";
    String validationString3 = "";

    public CreateEmployeeProfilePanel(EmployeeProfileHistory history) {
        initComponents();
        this.history = history;
    }

    public CreateEmployeeProfilePanel(EmployeeProfileHistory history, EmployeeProfile employee) {
        initComponents();
        this.employee = employee;
        this.history = history;
        setCreateEmployeeProfilePanel();
    }

    private void setCreateEmployeeProfilePanel() {
        txtName.setText(employee.getName());
        txtEmployeeId.setText(employee.getEmployeeId().toString());
        txtAge.setText(employee.getAge().toString());
        txtGender.setText(employee.getGender());
        txtStartDate.setText(employee.getStartDate());
        txtLevel.setText(employee.getLevel());
        txtTeamInfo.setText(employee.getTeamInfo());
        txtPositionTitle.setText(employee.getPositionTitle());
        txtCellPhoneNumber.setText(employee.getCellPhoneNumber().toString());
        txtEmailAddress.setText(employee.getEmailAddress());
        photoDisplay.setIcon(reShape(employee.getPhotoPath()));
    }

    private boolean employeeProfileExistence() {
        int employeeId = Integer.parseInt(txtEmployeeId.getText());

        boolean exist = false;

        for (EmployeeProfile ep : history.getEmployeeProfileHistoryList()) {
            if (employeeId == ep.getEmployeeId()) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    private EmployeeProfile setEmployeeProfile() {
        int employeeId = Integer.parseInt(txtEmployeeId.getText());
        String name = txtName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = txtGender.getText();
        String startDate = txtStartDate.getText();
        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String positionTitle = txtPositionTitle.getText();
        int cellPhoneNumber = Integer.parseInt(txtCellPhoneNumber.getText());
        String emailAddress = txtEmailAddress.getText();

        EmployeeProfile ep = new EmployeeProfile();
        ep.setName(name);
        ep.setEmployeeId(employeeId);
        ep.setAge(age);
        ep.setGender(gender);
        ep.setStartDate(startDate);
        ep.setLevel(level);
        ep.setTeamInfo(teamInfo);
        ep.setPositionTitle(positionTitle);
        ep.setCellPhoneNumber(cellPhoneNumber);
        ep.setEmailAddress(emailAddress);
        ep.setPhotoPath(photoPath);

        return ep;
    }

    private void resetCreateEmployeeProfileFields() {
        txtName.setText("");
        txtEmployeeId.setText("");
        txtAge.setText("");
        txtGender.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtCellPhoneNumber.setText("");
        txtEmailAddress.setText("");
        photoPath = "";
        photoDisplay.setIcon(null);
    }

    public ImageIcon reShape(String imagePath) {
        ImageIcon path = new ImageIcon(imagePath);
        Image img = path.getImage();
        Image newImg = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtName.getText().isEmpty()) {
            validationString1 += "Name, ";
        }
        if (txtEmployeeId.getText().isEmpty()) {
            validationString1 += "Employee Id, ";
        }
        if (txtAge.getText().isEmpty()) {
            validationString1 += "Age, ";
        }
        if (txtGender.getText().isEmpty()) {
            validationString1 += "Gender, ";
        }
        if (txtStartDate.getText().isEmpty()) {
            validationString1 += "Start Date, ";
        }
        if (txtLevel.getText().isEmpty()) {
            validationString1 += "Level, ";
        }
        if (txtTeamInfo.getText().isEmpty()) {
            validationString1 += "Team Info, ";
        }
        if (txtPositionTitle.getText().isEmpty()) {
            validationString1 += "Position Title, ";
        }
        if (txtCellPhoneNumber.getText().isEmpty()) {
            validationString1 += "Cell Phone Number, ";
        }
        if (txtEmailAddress.getText().isEmpty()) {
            validationString1 += "Email Address, ";
        }
        if (photoDisplay.getIcon() == null) {
            validationString1 += "Photo";
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

    public boolean areDataTypesCorrect() {
        validationString2 = "";
        if (!onlyDigits(txtEmployeeId.getText())) {
            validationString2 += "Employee Id, ";
        }
        if (!onlyDigits(txtAge.getText())) {
            validationString2 += "Age, ";
        }
        if (!onlyDigits(txtCellPhoneNumber.getText())) {
            validationString2 += "Cell Phone Number, ";
        }
        return isNotValid(validationString2);
    }

    public boolean areRegexValidationsCorrect() {
        return true;
    }

    public boolean onlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0'
                    || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jFileChooser1 = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        create = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtCellPhoneNumber = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        uploadPhoto = new javax.swing.JButton();
        photoDisplay = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel12.setText("jLabel12");

        jLabel1.setText("Name");

        jLabel2.setText("Employee Id");

        jLabel3.setText("Age");

        jLabel4.setText("Gender");

        jLabel5.setText("Start Date");

        jLabel6.setText("Level");

        jLabel7.setText("Team Info");

        jLabel8.setText("Position Title");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Employee Profile Management Portal");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtStartDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStartDateActionPerformed(evt);
            }
        });

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

        jLabel10.setText("Cell Phone Numer");

        jLabel11.setText("Email Address");

        jLabel13.setText("Photo");

        uploadPhoto.setText("Upload Photo");
        uploadPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadPhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmployeeId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLevel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uploadPhoto, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(photoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(create)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(update)))))
                .addContainerGap(617, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(uploadPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(photoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(update))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        int employeeId = Integer.parseInt(txtEmployeeId.getText());
        if (!employeeProfileExistence()) {
            JOptionPane.showMessageDialog(this, "You can't update the employee profile since employee with employee id : " + employeeId + " doesn't exist");
        } else {
            EmployeeProfile updatedEmployeeProfileData = setEmployeeProfile();
            int index = 0;
            for (EmployeeProfile ep : history.getEmployeeProfileHistoryList()) {
                if (employeeId == ep.getEmployeeId()) {
                    history.updateExistingEmployeeProfile(updatedEmployeeProfileData, index);
                    break;
                }
                index++;
            }
            JOptionPane.showMessageDialog(this, "Existing employee profile with employee id : " + employeeId + " updated");

            resetCreateEmployeeProfileFields();

            MainJFrame.refreshViewEmployeeProfileHistory(history);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void txtStartDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStartDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStartDateActionPerformed

    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed

        boolean validation1 = areDataFieldsEmpty();
        boolean validation2 = areDataTypesCorrect();
        boolean validation3 = areRegexValidationsCorrect();

        if (!validation1 && !validation2 && !validation3) {
            int employeeId = Integer.parseInt(txtEmployeeId.getText());
            if (!employeeProfileExistence()) {

                history.addNewEmployeeProfile(setEmployeeProfile());

                JOptionPane.showMessageDialog(this, "New employee profile with employee id : " + employeeId + " created");

                resetCreateEmployeeProfileFields();

                MainJFrame.refreshViewEmployeeProfileHistory(history);
            } else {
                JOptionPane.showMessageDialog(this, "Employee profile already exists with the employee id : " + employeeId);
            }
        } else {
            if (validation1) {
                mainValidationString = validationString1;
                JOptionPane.showMessageDialog(this, "Please fill the data for these fields: " + mainValidationString);
            } else if (validation2) {
                mainValidationString = validationString2;
                JOptionPane.showMessageDialog(this, "Please enter only numbers for these fields: " + mainValidationString);
            } else {

            }
        }
    }//GEN-LAST:event_createActionPerformed

    private void uploadPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadPhotoActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & PNG Images", "jpg", "png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String path = chooser.getSelectedFile().getAbsolutePath();
            photoDisplay.setIcon(reShape(path));
            photoPath = path;
        }
    }//GEN-LAST:event_uploadPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel photoDisplay;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JButton update;
    private javax.swing.JButton uploadPhoto;
    // End of variables declaration//GEN-END:variables
}
