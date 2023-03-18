package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalzyer extends PersonAnalyzer{
    private HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (Person p: super.getPersons()) {
            if(result.containsKey(p.getCountry())){
                result.put(p.getCountry(), result.get(p.getCountry())+1);
            }else{
                result.put(p.getCountry(), 1);
            }
        }
    }

    @Override
    public String toString() {
        return "CountryAnalzyer{" +
                "result=" + result +
                '}';
    }
}
