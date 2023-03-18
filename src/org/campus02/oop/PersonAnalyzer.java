package org.campus02.oop;

import java.util.ArrayList;

public abstract class PersonAnalyzer {
    private ArrayList<Person> persons = new ArrayList<>();

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }
    public abstract void analyze();

    public ArrayList<Person> getPersons() {
        return persons;
    }
}

