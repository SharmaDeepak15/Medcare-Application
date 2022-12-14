/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.JOptionPane;
import model.DoctorDataRecord;
import model.DoctorDetails;
import model.HospitalDataRecord;
import model.MedcareDataRecord;

/**
 *
 * @author deepaksharma
 */
public class AddNewDoctorDetails extends javax.swing.JPanel {

    /**
     * Creates new form AddNewDoctorDetails
     */
    DoctorDataRecord doctor_history;
    public AddNewDoctorDetails(DoctorDataRecord doctor_history) {
        initComponents();
        this.doctor_history = doctor_history;
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
        DoctorAssignedHospitalIDTxt = new javax.swing.JTextField();
        DoctorContactLabel = new javax.swing.JLabel();
        DoctorEmailLabel = new javax.swing.JLabel();
        DoctorContactTxt = new javax.swing.JTextField();
        DoctorIDLabel = new javax.swing.JLabel();
        DoctorIDTxt = new javax.swing.JTextField();
        DoctorNameLabel = new javax.swing.JLabel();
        DoctorNameTxt = new javax.swing.JTextField();
        DoctorGenderLabel = new javax.swing.JLabel();
        DoctorGenderTxt = new javax.swing.JTextField();
        DoctorSpecialityLabel = new javax.swing.JLabel();
        DoctorSpecialityTxt = new javax.swing.JTextField();
        DoctorAssignedHospitalIDLabel = new javax.swing.JLabel();
        DoctorEmailTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Doctor Details");

        DoctorAssignedHospitalIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorAssignedHospitalIDTxtActionPerformed(evt);
            }
        });

        DoctorContactLabel.setText("Contact:");

        DoctorEmailLabel.setText("Email:");

        DoctorContactTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorContactTxtActionPerformed(evt);
            }
        });

        DoctorIDLabel.setText("ID*:");

        DoctorIDTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorIDTxtActionPerformed(evt);
            }
        });

        DoctorNameLabel.setText("Name*:");

        DoctorNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorNameTxtActionPerformed(evt);
            }
        });

        DoctorGenderLabel.setText("Gender:");

        DoctorSpecialityLabel.setText("Speciality:");

        DoctorAssignedHospitalIDLabel.setText("Assigned Hospital ID*:");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 3, 12)); // NOI18N
        jLabel2.setText("* Mandatory Parameters");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorAssignedHospitalIDLabel)
                            .addComponent(DoctorSpecialityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorEmailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorContactLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DoctorEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorAssignedHospitalIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorSpecialityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DoctorGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(260, 260, 260))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorIDLabel))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorNameLabel)
                    .addComponent(DoctorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorGenderLabel)
                    .addComponent(DoctorGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorSpecialityLabel)
                    .addComponent(DoctorSpecialityTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorAssignedHospitalIDLabel)
                    .addComponent(DoctorAssignedHospitalIDTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorEmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DoctorContactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DoctorContactTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addContainerGap(266, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DoctorAssignedHospitalIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorAssignedHospitalIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorAssignedHospitalIDTxtActionPerformed

    private void DoctorContactTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorContactTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorContactTxtActionPerformed

    private void DoctorIDTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorIDTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorIDTxtActionPerformed

    private void DoctorNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DoctorNameTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         String validate_doctor_id = String.valueOf(DoctorIDTxt.getText());
         if (validate_doctor_id.length() == 0 ){
            JOptionPane.showMessageDialog(this,"The 'ID' is a mandatory field, please provide required value.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (validate_doctor_id.length() > 0 ){
            try 
                { 
                Integer.parseInt(DoctorIDTxt.getText()); 
                }  
            catch (NumberFormatException e)  
                { 
                JOptionPane.showMessageDialog(this,"The ID is invalid, please provide the integer value only.", "Invalid Value", JOptionPane.WARNING_MESSAGE);
                return;}          
        } 
              
        String name = DoctorNameTxt.getText();
        if (name.length() == 0 ){
            JOptionPane.showMessageDialog(this,"The 'Name' is a mandatory field, please provide required value.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String validate_doctor_assigned_doctor_id = String.valueOf(DoctorAssignedHospitalIDTxt.getText());
        if (validate_doctor_assigned_doctor_id.length() == 0 ){
            JOptionPane.showMessageDialog(this,"The 'Assigned Hospital ID' is a mandatory field, please provide required value.", "Empty Field", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (validate_doctor_assigned_doctor_id.length() > 0 ){
            try 
                { 
                Integer.parseInt(DoctorAssignedHospitalIDTxt.getText()); 
                }  
            catch (NumberFormatException e)  
                { 
                JOptionPane.showMessageDialog(this,"The Assigned Hospital ID is invalid, please provide the integer value only.", "Invalid Value", JOptionPane.WARNING_MESSAGE);
                return;}          
        } 
        
        String validate_doctor_contact = String.valueOf(DoctorContactTxt.getText());
        if (validate_doctor_contact.length() > 0 ){
            try 
                { 
                Integer.parseInt(DoctorContactTxt.getText()); 
                }  
            catch (NumberFormatException e)  
                { 
                JOptionPane.showMessageDialog(this,"The Contact is invalid, please provide the integer value only.", "Invalid Value", JOptionPane.WARNING_MESSAGE);
                return;}          
        } 
        
        
        int doctor_id = Integer.parseInt(DoctorIDTxt.getText());
        String doctor_name = DoctorNameTxt.getText();
        long doctor_contact = Long.parseLong(DoctorContactTxt.getText());
        String doctor_email = DoctorEmailTxt.getText();
        String doctor_gender = DoctorGenderTxt.getText();
        String doctor_speciality = DoctorSpecialityTxt.getText();
        int doctor_assigned_hosp_id = Integer.parseInt(DoctorAssignedHospitalIDTxt.getText());

        for (DoctorDetails ed : doctor_history.getHistory()){
        int history_doctor_id = ed.getDoctor_id();
        if (doctor_id == history_doctor_id){     
            JOptionPane.showMessageDialog(this,"The 'ID' is already exist, please provide the another value.", "Invalid Value", JOptionPane.WARNING_MESSAGE);
            return;
            }
        }
        
        DoctorDetails DocRec = doctor_history.addNewDoctor();       
        DocRec.setDoctor_name(doctor_name);
        DocRec.setDoctor_id(doctor_id);
        DocRec.setDoctor_contact(doctor_contact);
        DocRec.setDoctor_email(doctor_email);
        DocRec.setDoctor_gender(doctor_gender);
        DocRec.setDoctor_speciality(doctor_speciality);
        DocRec.setDoctor_assigned_hospital_id(doctor_assigned_hosp_id);
        
        JOptionPane.showMessageDialog(this, "The Doctor Details has been saved");

        DoctorIDTxt.setText("");
        DoctorNameTxt.setText("");
        DoctorGenderTxt.setText("");
        DoctorSpecialityTxt.setText("");
        DoctorAssignedHospitalIDTxt.setText("");
        DoctorEmailTxt.setText("");
        DoctorContactTxt.setText("");
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoctorAssignedHospitalIDLabel;
    private javax.swing.JTextField DoctorAssignedHospitalIDTxt;
    private javax.swing.JLabel DoctorContactLabel;
    private javax.swing.JTextField DoctorContactTxt;
    private javax.swing.JLabel DoctorEmailLabel;
    private javax.swing.JTextField DoctorEmailTxt;
    private javax.swing.JLabel DoctorGenderLabel;
    private javax.swing.JTextField DoctorGenderTxt;
    private javax.swing.JLabel DoctorIDLabel;
    private javax.swing.JTextField DoctorIDTxt;
    private javax.swing.JLabel DoctorNameLabel;
    private javax.swing.JTextField DoctorNameTxt;
    private javax.swing.JLabel DoctorSpecialityLabel;
    private javax.swing.JTextField DoctorSpecialityTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}