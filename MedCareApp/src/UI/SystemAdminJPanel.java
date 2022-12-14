/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import model.DoctorDataRecord;
import model.HospitalDataRecord;
import model.PatientDataRecord;

/**
 *
 * @author deepaksharma
 */
public class SystemAdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminJPanel
     */
    PatientDataRecord patient_history ;
    DoctorDataRecord doctor_history;
    HospitalDataRecord hospital_history;
    public SystemAdminJPanel(PatientDataRecord patient_history, DoctorDataRecord doctor_history, HospitalDataRecord hospital_history) {
        initComponents();
        this.patient_history = patient_history;
        this.doctor_history = doctor_history;
        this.hospital_history = hospital_history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        SystemAdminLabelJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        SystemAdminWorkJPanel = new javax.swing.JPanel();

        SplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SYSTEM ADMINISTRATOR");

        jButton2.setText("Patient Repository");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Doctor Repository");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton1.setText("Hospital Repository");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SystemAdminLabelJPanelLayout = new javax.swing.GroupLayout(SystemAdminLabelJPanel);
        SystemAdminLabelJPanel.setLayout(SystemAdminLabelJPanelLayout);
        SystemAdminLabelJPanelLayout.setHorizontalGroup(
            SystemAdminLabelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SystemAdminLabelJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(SystemAdminLabelJPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(123, 123, 123)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );
        SystemAdminLabelJPanelLayout.setVerticalGroup(
            SystemAdminLabelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SystemAdminLabelJPanelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(SystemAdminLabelJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        SplitPane.setTopComponent(SystemAdminLabelJPanel);

        javax.swing.GroupLayout SystemAdminWorkJPanelLayout = new javax.swing.GroupLayout(SystemAdminWorkJPanel);
        SystemAdminWorkJPanel.setLayout(SystemAdminWorkJPanelLayout);
        SystemAdminWorkJPanelLayout.setHorizontalGroup(
            SystemAdminWorkJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
        );
        SystemAdminWorkJPanelLayout.setVerticalGroup(
            SystemAdminWorkJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 737, Short.MAX_VALUE)
        );

        SplitPane.setRightComponent(SystemAdminWorkJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HospitalRepository HospitalRepo = new HospitalRepository(hospital_history);
        SplitPane.setBottomComponent(HospitalRepo);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        PatientRepository PatientRepo = new PatientRepository(patient_history);
        SplitPane.setBottomComponent(PatientRepo);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        DoctorRepository DoctorRepo = new DoctorRepository(doctor_history);
        SplitPane.setBottomComponent(DoctorRepo);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel SystemAdminLabelJPanel;
    private javax.swing.JPanel SystemAdminWorkJPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}