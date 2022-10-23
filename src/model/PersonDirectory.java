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
public class PersonDirectory {
    private ArrayList<Person> personList;

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public PersonDirectory() {
        this.personList = new ArrayList<>();
    }
    
//    public void addPersons(Person person){
//        personList.add(person);
//    }
}
