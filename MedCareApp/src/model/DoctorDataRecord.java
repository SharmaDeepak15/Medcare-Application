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
public class DoctorDataRecord {
    
    private ArrayList<DoctorDetails> doctor_history;
    
    public DoctorDataRecord()
    {
        this.doctor_history = new ArrayList<DoctorDetails>();
              
    }
    
    public ArrayList<DoctorDetails> getHistory() {
        return doctor_history;
    }
    
        public void setHistory(ArrayList<DoctorDetails> history) {
        this.doctor_history = doctor_history;
    }
    
    public DoctorDetails addNewDoctor(){
        
        DoctorDetails NewDoctor = new DoctorDetails();
        doctor_history.add(NewDoctor);
        return NewDoctor;
    }
    
    public DoctorDetails UpdateDoctor(){
        
        DoctorDetails NewDoctor = new DoctorDetails();
        doctor_history.add(NewDoctor);
        return NewDoctor;
    }
    
    
    public void DeleteDoctorDetails(DoctorDetails er){
        doctor_history.remove(er);
        
    }
}
