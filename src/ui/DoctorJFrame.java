/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Patient;
import model.PatientDirectory;
import model.Person;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class DoctorJFrame extends javax.swing.JFrame {

    /**
     * Creates new form DoctorJFrame
     */
    Person person;
    PatientDirectory patientDirectory;
    static DoctorJFrame doctorJFrame;
    

    public DoctorJFrame() {
        initComponents();
    }
    
    public DoctorJFrame(DoctorJFrame doctorJFrame) {
        this.doctorJFrame = doctorJFrame;
    }

    public DoctorJFrame(Person person, PatientDirectory patientDirectory) {
        initComponents();
        this.person = person;
        this.patientDirectory = patientDirectory;
        doctorSplitPane1 = doctorSplitPane;

        CreateDoctorPanel createDoctorPanel = new CreateDoctorPanel(person, patientDirectory);
        doctorSplitPane1.setLeftComponent(createDoctorPanel);

        ViewDoctorPanel viewDoctorPanel = new ViewDoctorPanel(person, patientDirectory);
        doctorSplitPane1.setRightComponent(viewDoctorPanel);

    }

    public static void closeFrame() {
        doctorJFrame.dispose();
    }

    public static void refreshViewDoctorPanel(Person person, PatientDirectory patientDirectory) {
        doctorSplitPane1.setRightComponent(new ViewDoctorPanel(person, patientDirectory));
        MainFrame.persistPatientData(patientDirectory);
    }

    public static void refreshCreateDoctorPanel(Person person, PatientDirectory patientDirectory) {
        doctorSplitPane1.setLeftComponent(new CreateDoctorPanel(person, patientDirectory));
        MainFrame.persistPatientData(patientDirectory);
    }

    public static void setCreateDoctorPanel(Person person, PatientDirectory patientDirectory, Patient patient, int selectedRowIndex) {
        doctorSplitPane1.setLeftComponent(new CreateDoctorPanel(person, patientDirectory, patient, selectedRowIndex));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorSplitPane = new javax.swing.JSplitPane();
        doctorControlPanel = new javax.swing.JPanel();
        doctorDataHistoryPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout doctorControlPanelLayout = new javax.swing.GroupLayout(doctorControlPanel);
        doctorControlPanel.setLayout(doctorControlPanelLayout);
        doctorControlPanelLayout.setHorizontalGroup(
            doctorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        doctorControlPanelLayout.setVerticalGroup(
            doctorControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        doctorSplitPane.setLeftComponent(doctorControlPanel);

        javax.swing.GroupLayout doctorDataHistoryPanelLayout = new javax.swing.GroupLayout(doctorDataHistoryPanel);
        doctorDataHistoryPanel.setLayout(doctorDataHistoryPanelLayout);
        doctorDataHistoryPanelLayout.setHorizontalGroup(
            doctorDataHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 395, Short.MAX_VALUE)
        );
        doctorDataHistoryPanelLayout.setVerticalGroup(
            doctorDataHistoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        doctorSplitPane.setRightComponent(doctorDataHistoryPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(doctorSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorJFrame().setVisible(true);
            }
        });
    }

    private static javax.swing.JSplitPane doctorSplitPane1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel doctorControlPanel;
    private javax.swing.JPanel doctorDataHistoryPanel;
    private javax.swing.JSplitPane doctorSplitPane;
    // End of variables declaration//GEN-END:variables
}
