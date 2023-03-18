package org.campus02.oop;

import java.util.ArrayList;

public class DemoApp {

	public static void main(String[] args) {
		PersonManager pm = new PersonManager();
		for (int i = 1; i < 101; i++) {
			pm.addPerson(createTestPerson());
		}
		GenderAnalyzer ga = new GenderAnalyzer();
		pm.doAnalysis(ga);
		System.out.println(ga.toString());
		ga.analyze();

		CountryAnalzyer ca = new CountryAnalzyer();
		pm.doAnalysis(ca);
		System.out.println(ca.toString());

		MaxSalaryAnalyzer msa = new MaxSalaryAnalyzer();
		//pm.doAnalysis(msa);
		

		System.out.println();
		BMIAnalyzer bmi = new BMIAnalyzer();
		pm.doAnalysis(bmi);
		ArrayList<Pair<Person, Double>> result = bmi.getResult();
		for (Pair<Person, Double> personBMIPair: result) {
			System.out.println(personBMIPair.getKey() + " : " + personBMIPair.getValue());
		}


	}
	
	
	public static Person createTestPerson()
	{
		String[] firstnames = new String[] {"John", "Max", "Susi", "Georg", "Gerald", "Michael", "Steve", "J�rg", "Sebastian", "Louis", "Thomas", "Tom", "Sandra", "Beate", "Birgit"};
		String[] lastnames = new String[] {"Muster", "Doe", "Schultz", "Cuevas", "Rhodes", "Mckenzie", "Taylor", "Glenn", "Reilly", "Morris", "Herman", "Beltran", "Swanson", "Roth"};
		String[] eyeColors = new String[] {"blau", "braun", "gr�n", "gelb"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI"};
		char[] genders = new char[] {'M', 'F'};
		
		Person p = new Person(
				getRandom(firstnames), getRandom(lastnames), 
				getRandom(genders), 
				(int) (Math.random()* 100.0), 
				getRandom(countries), (int) (Math.random() * 5900) + 1000, 
				getRandom(eyeColors), (int) (Math.random() * 50) + 50,
				(int)(Math.random() * 50) + 160);
		
		
	
		return p;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
	
	public static char getRandom(char[] arr)
	{
		return arr[(int) (Math.random() * 100) % arr.length];		
	}
	
}
