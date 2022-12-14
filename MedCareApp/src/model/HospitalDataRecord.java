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
public class HospitalDataRecord {
    
    private ArrayList<HospitalDetails> hospital_history;
    
    public HospitalDataRecord()
    {
        this.hospital_history = new ArrayList<HospitalDetails>();
              
    }
    
    public ArrayList<HospitalDetails> getHistory() {
        return hospital_history;
    }
    
        public void setHistory(ArrayList<HospitalDetails> history) {
        this.hospital_history = hospital_history;
    }
    
    public HospitalDetails addNewHospital(){
        
        HospitalDetails NewHospital = new HospitalDetails();
        hospital_history.add(NewHospital);
        return NewHospital;
    }
    
    public HospitalDetails UpdateHospital(){
        
        HospitalDetails NewHospital = new HospitalDetails();
        hospital_history.add(NewHospital);
        return NewHospital;
    }
    
    
    public void DeleteHospitalDetails(HospitalDetails er){
        hospital_history.remove(er);
        
    }
    
    
}
