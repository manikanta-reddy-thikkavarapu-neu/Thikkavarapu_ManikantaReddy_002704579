/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class PatientDirectory {

    private ArrayList<Patient> patients;

    public PatientDirectory() {
        this.patients = new ArrayList<>();
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void addPatients(Patient patient) {
        this.patients.add(patient);
    }

    public void deletePatientEncounter(Patient patient) {
        this.patients.remove(patient);
    }
}
