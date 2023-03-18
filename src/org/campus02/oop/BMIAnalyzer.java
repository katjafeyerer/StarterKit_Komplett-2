package org.campus02.oop;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();


    private double calcBMI(Person p){
        double bmi = p.getWeight() / ((p.getSize() / 100.0) * (p.getSize() / 100));
        return bmi;
    }

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }

    public void setResult(ArrayList<Pair<Person, Double>> result) {
        this.result = result;
    }

    @Override
    public void analyze() {
        for (Person p: super.getPersons()) {
            double bmi = calcBMI(p);
            Pair<Person, Double> bmiPair = new Pair<>(p, bmi);
            result.add(bmiPair);

        }
    }
}
