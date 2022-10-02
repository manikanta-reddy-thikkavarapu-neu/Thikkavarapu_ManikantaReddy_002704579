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
    private ArrayList<EmployeeProfile> searchEmployeeProfileHistoryList;
    
    public EmployeeProfileHistory() {
    this.employeeProfileHistoryList = new ArrayList<>();
    this.searchEmployeeProfileHistoryList = new ArrayList<>();
}

    public ArrayList<EmployeeProfile> getEmployeeProfileHistoryList() {
        return employeeProfileHistoryList;
    }
    
    public ArrayList<EmployeeProfile> getSearchEmployeeProfileHistoryList() {
        return searchEmployeeProfileHistoryList;
    }

    public void setEmployeeProfileHistoryList(ArrayList<EmployeeProfile> history) {
        this.employeeProfileHistoryList = history;
    }
    
    public void setSearchEmployeeProfileHistoryList(ArrayList<EmployeeProfile> searchHistory) {
        this.searchEmployeeProfileHistoryList = searchHistory;
    }
    
    public void addNewEmployeeProfile(EmployeeProfile ep) {
        this.employeeProfileHistoryList.add(ep);
    }
    
    public void updateExistingEmployeeProfile(EmployeeProfile ep, int index) {
        this.employeeProfileHistoryList.set(index, ep);
    }
    
    public void deleteEmployeeProfile(EmployeeProfile ep) {
        this.employeeProfileHistoryList.remove(ep);
    }
    
}
