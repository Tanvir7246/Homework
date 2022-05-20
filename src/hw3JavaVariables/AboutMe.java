package hw3JavaVariables;

import hw1JavaBasics.MySelf;

public class AboutMe {
	// Variable declared below
	public int age ;

	// Variables initialized below
	public String name = "Tanvir Mahamood Saimoon";
	public float gpa = 3.56f;
	public char firstNameStartsWith = 'T';
	public boolean bangladeshiCitizenship = false;
	public double tenDividedBy3 = 3.33333333333333;
	public long phoneNumber = 92250358566985l;
	public byte pinNumber = 126;

	public static void main(String[] args) {
		AboutMe aboutMe = new AboutMe();
		System.out.println(aboutMe.name);
		System.out.println(aboutMe.gpa);
		System.out.println(aboutMe.age);
		// Concatenation
		System.out.println("My name starts with " + aboutMe.firstNameStartsWith
				+ "\nMy Bangladeshi citizenship status is " + aboutMe.bangladeshiCitizenship);
		System.out.println(aboutMe.phoneNumber);
		System.out.println("My pin number is " + aboutMe.pinNumber + "\nMy Gpa is " + aboutMe.gpa);
     
	}

}
