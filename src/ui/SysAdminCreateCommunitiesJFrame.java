/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.Community;
import model.CommunityDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import static ui.DoctorJFrame.personDirectory;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class SysAdminCreateCommunitiesJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SysAdminCreateCommunitiesJFrame
     */
    CommunityDirectory communityDirectory;

    public SysAdminCreateCommunitiesJFrame() {
        initComponents();
    }

    public SysAdminCreateCommunitiesJFrame(CommunityDirectory communityDirectory) {
        initComponents();
        this.communityDirectory = communityDirectory;
        splitPane1 = splitPane;

        SysAdminCreateCommunityPanel sysAdminCreateCommunityPanel = new SysAdminCreateCommunityPanel(communityDirectory);
        splitPane1.setLeftComponent(sysAdminCreateCommunityPanel);

        SysAdminViewCommunityPanel sysAdminViewCommunityPanel = new SysAdminViewCommunityPanel(communityDirectory);
        splitPane1.setRightComponent(sysAdminViewCommunityPanel);
    }

    public static void refreshSysAdminCreateCommunityPanel(CommunityDirectory communityDirectory) {
        splitPane1.setLeftComponent(new SysAdminCreateCommunityPanel(communityDirectory));
    }

    public static void refreshSysAdminViewCommunityPanel(CommunityDirectory communityDirectory) {
        splitPane1.setRightComponent(new SysAdminViewCommunityPanel(communityDirectory));
        MainFrame.persistCommunityData(communityDirectory);
    }

    public static void setSysAdminViewCommunityPanel(CommunityDirectory communityDirectory, Community com) {
        splitPane1.setLeftComponent(new SysAdminCreateCommunityPanel(communityDirectory, com));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        splitPane.setRightComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        splitPane.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
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
            java.util.logging.Logger.getLogger(SysAdminCreateCommunitiesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SysAdminCreateCommunitiesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SysAdminCreateCommunitiesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SysAdminCreateCommunitiesJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SysAdminCreateCommunitiesJFrame().setVisible(true);
            }
        });
    }

    private static javax.swing.JSplitPane splitPane1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}
