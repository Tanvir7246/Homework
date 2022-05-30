package hw4JavaVariables;

public class AboutMe {
	public String myFullName;
	public byte myAge;
	public int mySalary;
	public short myBankAccount;
	public long myProperty;
	public char mySex;
	public boolean fullTimeEmployee;
	public float myHeight;
	public double myGpa;

	public AboutMe() {
		System.out.println("This is all about us");
	}

	public void aboutMe() {
		System.out.println("My Name is" + myFullName + "\n My age is " + " \n My salary is " + mySalary
				+ "\n My bank account is " + "\n My property is " + myProperty + "\n My sex is " + mySex
				+ "\n My employee status" + fullTimeEmployee + "\n My height" + myHeight + "\n My gpa is" + myGpa);
	}

}
