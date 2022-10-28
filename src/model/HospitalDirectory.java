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
public class HospitalDirectory {

    private ArrayList<Hospital> hospitals;

    public HospitalDirectory() {
        this.hospitals = new ArrayList<>();
    }

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public void addHospital(Hospital newHospital) {
        this.hospitals.add(newHospital);
    }

    public void deleteHospital(Hospital hosp) {
        this.hospitals.remove(hosp);
    }

    public void updateHospital(Hospital hosp, int index) {
        this.hospitals.set(index, hosp);
    }

}
