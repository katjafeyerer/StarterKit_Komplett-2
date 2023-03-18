package org.campus02.oop;

import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer{
    @Override
    public void analyze() {
        HashSet<Person> personWithHighestSalary = new HashSet<>();
        int highestSalary = 0;

        for (Person p : super.getPersons()) {
            if(p.getSalary() > highestSalary){
                highestSalary = p.getSalary();
                personWithHighestSalary.clear();
                personWithHighestSalary.add(p);
            }
            else if(p.getSalary() == highestSalary){
                personWithHighestSalary.add(p);
            }
        }
        for (Person p: super.getPersons()) {
            System.out.println(p);
        }
    }
}
