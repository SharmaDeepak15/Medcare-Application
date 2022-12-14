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
public class MedcareDataRecord {
    
    
    private ArrayList<MedcareDataRecord> history;
    
    public MedcareDataRecord()
    {
        this.history = new ArrayList<MedcareDataRecord>();
    }
    
    public ArrayList<MedcareDataRecord> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<MedcareDataRecord> history) {
        this.history = history;
    }
    
    public MedcareDataRecord addNewEmployee(){
        
        MedcareDataRecord NewEmployee = new MedcareDataRecord();
        history.add(NewEmployee);
        return NewEmployee;
    }
    
    public MedcareDataRecord UpdateEmployee(){
        
        MedcareDataRecord NewEmployee = new MedcareDataRecord();
        history.add(NewEmployee);
        return NewEmployee;
    }
    
    
    public void DeleteEmpDetails(MedcareDataRecord er){
        history.remove(er);
        
    }
}
