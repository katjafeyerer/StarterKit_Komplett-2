package org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    private ArrayList<Person> persons = new ArrayList<>();

    public PersonManager() {
    }
    public void addPerson(Person p){
        persons.add(p);
    }
    public void doAnalysis(PersonAnalyzer a){
        a.setPersons(persons);
        a.analyze();
        }

    @Override
    public String toString() {
        return "PersonManager{" +
                "persons=" + persons +
                '}';
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }
}

