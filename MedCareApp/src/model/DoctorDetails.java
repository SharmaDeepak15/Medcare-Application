/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author deepaksharma
 */
public class DoctorDetails {

    public int getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(int doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getDoctor_gender() {
        return doctor_gender;
    }

    public void setDoctor_gender(String doctor_gender) {
        this.doctor_gender = doctor_gender;
    }

    public String getDoctor_speciality() {
        return doctor_speciality;
    }

    public void setDoctor_speciality(String doctor_speciality) {
        this.doctor_speciality = doctor_speciality;
    }

    public int getDoctor_assigned_hospital_id() {
        return doctor_assigned_hospital_id;
    }

    public void setDoctor_assigned_hospital_id(int doctor_assigned_hospital_id) {
        this.doctor_assigned_hospital_id = doctor_assigned_hospital_id;
    }

    public long getDoctor_contact() {
        return doctor_contact;
    }

    public void setDoctor_contact(long doctor_contact) {
        this.doctor_contact = doctor_contact;
    }

    public String getDoctor_email() {
        return doctor_email;
    }

    public void setDoctor_email(String doctor_email) {
        this.doctor_email = doctor_email;
    }
    
    @Override
    public String toString(){
        return doctor_name;
    }
    
    private int doctor_id;
    private String doctor_name;
    private String doctor_gender;
    private String doctor_speciality;
    private int doctor_assigned_hospital_id;
    private long doctor_contact;
    private String doctor_email;

}
