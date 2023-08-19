package jaavaTutorial;

//creating interface with method
interface mediciene{
	public void citamole();
	public void dcold();
	public void synax();
	public void painRelief();
}


public class InterfaceOverrideMethod {

	
	public static void main(String[] args) {
		
		//initializing mediciene variable to dailiMed variable
		mediciene dailyMed;
		
		//creating object and calling method
		dailyMed = new ChildMed();
		dailyMed.citamole();
		dailyMed.dcold();
		dailyMed.synax();
		dailyMed.painRelief();
		dailyMed = new AdultMed();
		dailyMed.citamole();
		dailyMed.dcold();
		dailyMed.synax();
		dailyMed.painRelief();
		
	}

}
//creating class with implimenting interface
class ChildMed implements mediciene {

	@Override
	public void citamole() {
		System.out.println("Citamole for child.");
		
	}

	@Override
	public void dcold() {
		System.out.println("Dcold for child.");
		
	}

	@Override
	public void synax() {
		System.out.println("Synax for child.");
		
	}

	@Override
	public void painRelief() {
		System.out.println("PainRelief for child.");
		
	}
	
}
//creating class with implimenting interface
class AdultMed implements mediciene {

	@Override
	public void citamole() {
		System.out.println("Citamole for adult.");
		
	}

	@Override
	public void dcold() {
		System.out.println("Decold for adult.");
		
	}

	@Override
	public void synax() {
		System.out.println("Synax for adult.");
		
	}

	@Override
	public void painRelief() {
		System.out.println("PainRelief for adult.");
		
	}
	
}
/*
 interface Course{
	
		public void courseOne();
		public void courseTwo();
		public void courseThree();
		public void courseFour();
		public void courseFive();
		public void courseSix();
}

class Zorba implements  Course{
	@Override
	public void courseOne() {
		// TODO Auto-generated method stub
		System.out.println("Zorba one");
	}

	@Override
	public void courseTwo() {
		// TODO Auto-generated method stub
		System.out.println("Zorba two");
	}

	@Override
	public void courseThree() {
		// TODO Auto-generated method stub
		System.out.println("Zorba three");
	}

	@Override
	public void courseFour() {
		// TODO Auto-generated method stub
		System.out.println("Zorba four");
	}

	@Override
	public void courseFive() {
		// TODO Auto-generated method stub
		System.out.println("Zorba five");
	}

	@Override
	public void courseSix() {
		// TODO Auto-generated method stub
		System.out.println("Zorba six");
	}
	

}

class Minskole implements Course {

	@Override
	public void courseOne() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	@Override
	public void courseTwo() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}

	@Override
	public void courseThree() {
		// TODO Auto-generated method stub
		System.out.println("three");
	}

	@Override
	public void courseFour() {
		// TODO Auto-generated method stub
		System.out.println("four");
	}

	@Override
	public void courseFive() {
		// TODO Auto-generated method stub
		System.out.println("five");
	}

	@Override
	public void courseSix() {
		// TODO Auto-generated method stub
		System.out.println("six");
	}
	
}

public class day34 {

	public static void main(String[] args) {
		
		
		Course firm;
	
		firm = new Zorba();
		firm.courseFive();
		
		firm = new Minskole();
		firm.courseThree();
		
		
	}
	
}
 */
