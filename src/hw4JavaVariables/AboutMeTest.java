package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		
		AboutMe aboutMe = new AboutMe();

		aboutMe.myFullName = "Tanvir Mahamood Saimoon";
		aboutMe.myAge = 28;
		aboutMe.mySalary = 52365;
		aboutMe.myBankAccount = 26546;
		aboutMe.myProperty = 585466;
		aboutMe.mySex = 'F';
		aboutMe.fullTimeEmployee = false;
		aboutMe.myHeight = 5.10f;
		aboutMe.myGpa = 3.56;
		aboutMe.aboutMe();

		AboutMe alex = new AboutMe();
		aboutMe.myFullName = "Alex Vai";
		aboutMe.myAge = 29;
		aboutMe.mySalary = 52365;
		aboutMe.myBankAccount = 26544;
		aboutMe.myProperty = 585464;
		aboutMe.mySex = 'M';
		aboutMe.fullTimeEmployee = true;
		aboutMe.myHeight = 5.11f;
		aboutMe.myGpa = 3.50;
		alex.aboutMe();

}
	

}
