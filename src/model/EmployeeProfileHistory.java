/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tmani
 */
public class EmployeeProfileHistory {
    
    private ArrayList<EmployeeProfile> employeeProfileHistoryList;
    
    public EmployeeProfileHistory() {
    this.employeeProfileHistoryList = new ArrayList<EmployeeProfile>();
}

    public ArrayList<EmployeeProfile> getHistory() {
        return employeeProfileHistoryList;
    }

    public void setHistory(ArrayList<EmployeeProfile> history) {
        this.employeeProfileHistoryList = history;
    }
    
    public void addNewEmployeeProfile(EmployeeProfile ep) {
        this.employeeProfileHistoryList.add(ep);
    }
    
    public void deleteEmployeeProfile(EmployeeProfile ep) {
        this.employeeProfileHistoryList.remove(ep);
    }
    
}
