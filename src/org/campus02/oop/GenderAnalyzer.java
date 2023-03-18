package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer{
    @Override
    public String toString() {
        return "GenderAnalyzer{}";
    }

    @Override
    public void analyze() {
        int countM = 0;
        int countW = 0;
        int heightM = 0;
        int heightW = 0;

        for (Person p:super.getPersons()){
            if(p.getGender() == 'M'){
                countM++;
                heightM += p.getSize();
            }
            if(p.getGender() =='F'){
                countW++;
                heightW += p.getSize();
            }
        }
        int avgW = heightW / countW;
        int avgM = heightM / countM;

        System.out.println("In der Liste existieren " + countM + " Männer mit einer " +
                "durchschnittlichen Größe von " + avgM + " cm");
        System.out.println("In der Liste existieren " + countW + " Frauen mit einer " +
                "durchschnittlichen Größe von " + avgW + " cm");

    }

}
