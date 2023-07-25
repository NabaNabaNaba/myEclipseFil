package jaavaTutorial;

public class inheritanceMultipleChild2 {

	public static void main(String[] args) {
		//calling Grandfather class arguments
		Grandfather Abhi = new Grandfather("Abhichandra","Dahal");
		
		Abhi.displayName();
		//calling Father class with arguments
		Father Dhan = new Father("Abhichandra","Dahal","Dhanchandra");
		Dhan.displayFname();
		Dhan.displayName();
		//calling Son class with arguments
		Son Ram = new Son ("Abhichandra","Dahal","Dhanchandra","Ramchandra");
		Ram.displayFname();
		Ram.displayName();
		Ram.displaySname();

	}

}
//creating Grandfather parent class 
class Grandfather {
	String GFname;
	String GFcast;
	//creating constructor
	public Grandfather(String GFN, String GFC) {
		this.GFname = GFN;
		this.GFcast = GFC;

	}

	public void displayName() {
		System.out.println(this.GFname + this.GFcast);
	}
}
//creating Father child class
class Father extends Grandfather {
	String Fname;
	//creating constructor
	public Father(String GFN, String GFC, String FN) {
		super(GFN, GFC);
		this.Fname = FN;
	}
	
	public void displayFname () {
		System.out.println(this.Fname+this.GFcast);
	}

}
//creating Son child class inside father child class
class Son extends Father{
	String Sname;
	//creating constructor
	public Son(String GFN, String GFC, String FN, String SN) {
		
		super(GFN, GFC, FN);
		this.Sname = SN;
	}
	public void displaySname () {
		System.out.println(this.Sname+this.GFcast);
	}
}

/*
Son chinmay = new Son("manohar","deshpane","shirsh","chinmay");
		System.out.println(chinmay.firstName);
		System.out.println(chinmay.lastName);
		System.out.println(chinmay.fFirstName);
		System.out.println(chinmay.Sname);
		
		chinmay.displayFName();
		chinmay.displayGName();
		chinmay.displaySName();
		
	}

}


class GrandFather {
	String firstName;
	String lastName;
	
	public GrandFather(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void displayGName(){
		System.out.println(this.firstName + this.lastName);
	}
}

class Father extends GrandFather {

	String fFirstName;
	public Father(String firstName, String lastName , String ffn) {
		super(firstName, lastName);
		this.fFirstName = ffn;
	}
	
	public void displayFName(){
		System.out.println(this.fFirstName + this.lastName );
	}
}

class Son extends Father {
	String Sname ;
	public Son(String firstName, String lastName, String ffn ,String ssn) {
		super(firstName, lastName, ffn);
		this.Sname = ssn;
		
	}
		
	public void displaySName() {
		System.out.println(this.Sname + this.lastName);
	}
	
*/