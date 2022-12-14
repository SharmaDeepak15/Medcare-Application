/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author deepaksharma
 */
public class PatientDataRecord {
    
    private ArrayList<PatientDetails> patient_history;
    
    public PatientDataRecord()
    {
        this.patient_history = new ArrayList<PatientDetails>();
              
    }
    
    public ArrayList<PatientDetails> getHistory() {
        return patient_history;
    }
    
        public void setHistory(ArrayList<PatientDetails> history) {
        this.patient_history = patient_history;
    }
    
    public PatientDetails addNewPatient(){
        
        PatientDetails NewPatient = new PatientDetails();
        patient_history.add(NewPatient);
        return NewPatient;
    }
    
    public PatientDetails UpdatePatient(){
        
        PatientDetails NewPatient = new PatientDetails();
        patient_history.add(NewPatient);
        return NewPatient;
    }
    
    
    public void DeletePatientDetails(PatientDetails er){
        patient_history.remove(er);
        
    }
    
}
