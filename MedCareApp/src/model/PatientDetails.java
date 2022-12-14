/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author deepaksharma
 */
public class PatientDetails {

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_gender() {
        return patient_gender;
    }

    public void setPatient_gender(String patient_gender) {
        this.patient_gender = patient_gender;
    }

    public int getPatient_age() {
        return patient_age;
    }

    public void setPatient_age(int patient_age) {
        this.patient_age = patient_age;
    }

    public long getPatient_contact() {
        return patient_contact;
    }

    public void setPatient_contact(long patient_contact) {
        this.patient_contact = patient_contact;
    }

    public String getPatient_email() {
        return patient_email;
    }

    public void setPatient_email(String patient_email) {
        this.patient_email = patient_email;
    }

    public String getPatient_diagnosis() {
        return patient_diagnosis;
    }

    public void setPatient_diagnosis(String patient_diagnosis) {
        this.patient_diagnosis = patient_diagnosis;
    }

    public int getPatient_house_no() {
        return patient_house_no;
    }

    public void setPatient_house_no(int patient_house_no) {
        this.patient_house_no = patient_house_no;
    }

    public String getPatient_street_name() {
        return patient_street_name;
    }

    public void setPatient_street_name(String patient_street_name) {
        this.patient_street_name = patient_street_name;
    }

    public String getPatient_city() {
        return patient_city;
    }

    public void setPatient_city(String patient_city) {
        this.patient_city = patient_city;
    }

    public String getPatient_country() {
        return patient_country;
    }

    public void setPatient_country(String patient_country) {
        this.patient_country = patient_country;
    }

    public String getPatient_postal_code() {
        return patient_postal_code;
    }

    public void setPatient_postal_code(String patient_postal_code) {
        this.patient_postal_code = patient_postal_code;
    }

    public int getPatient_bloodpressure() {
        return patient_bloodpressure;
    }

    public void setPatient_bloodpressure(int patient_bloodpressure) {
        this.patient_bloodpressure = patient_bloodpressure;
    }

    public int getPatient_bodytemp() {
        return patient_bodytemp;
    }

    public void setPatient_bodytemp(int patient_bodytemp) {
        this.patient_bodytemp = patient_bodytemp;
    }

    public String getPatient_bloodgroup() {
        return patient_bloodgroup;
    }

    public void setPatient_bloodgroup(String patient_bloodgroup) {
        this.patient_bloodgroup = patient_bloodgroup;
    }

    public String getPatient_medicalhistory() {
        return patient_medicalhistory;
    }

    public void setPatient_medicalhistory(String patient_medicalhistory) {
        this.patient_medicalhistory = patient_medicalhistory;
    }
    
    @Override
    public String toString(){
        return patient_name;
    }
    
    private int patient_id;
    private String patient_name;
    private String patient_gender;
     private int patient_age;
    private long patient_contact;
    private String patient_email;
    private String patient_diagnosis;
    private int patient_house_no;
    private String patient_street_name;
    private String patient_city;
    private String patient_country;
    private String patient_postal_code;
    private int patient_bloodpressure;
    private int patient_bodytemp;
    private String patient_bloodgroup;
    private String patient_medicalhistory;
}
    