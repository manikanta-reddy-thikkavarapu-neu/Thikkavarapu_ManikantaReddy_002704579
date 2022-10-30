/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class Doctor {
    private String doctorID;
    private String doctorFName;
    private String doctorLName;
    private String specialisation;
    private String hospitalID;
    private String hospitalName;

    public Doctor() {
    }

    public Doctor(String doctorID, String doctorFName, String doctorLName, String specialisation, String hospitalID, String hospitalName) {
        this.doctorID = doctorID;
        this.doctorFName = doctorFName;
        this.doctorLName = doctorLName;
        this.specialisation = specialisation;
        this.hospitalID = hospitalID;
        this.hospitalName = hospitalName;
    }
    
    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getDoctorFName() {
        return doctorFName;
    }

    public void setDoctorFName(String doctorFName) {
        this.doctorFName = doctorFName;
    }

    public String getDoctorLName() {
        return doctorLName;
    }

    public void setDoctorLName(String doctorLName) {
        this.doctorLName = doctorLName;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

   

    public String getHospitalID() {
        return hospitalID;
    }

    public void setHospitalID(String hospitalID) {
        this.hospitalID = hospitalID;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
    
    @Override
    public String toString(){
        return hospitalID;
    }
}
