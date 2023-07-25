package jaavaTutorial;

public class OverloadingPolymorphism {

	public static void main(String[] args) {

		// creating object of school class
		schoolX Sch = new schoolX("dfsdf");
		Sch.register();
		Sch.attend();

		campus cam = new campus("RR campus");
		cam.register();
		cam.attend();
		cam.message();

	}

}

class universityX {
	// overloading : multiple method in a same class - method name different
	// same method name can use in different class but functionality is different
	String studentName;

	public universityX(String StN) {
		this.studentName = StN;
	}

	public void register() {
		System.out.println("Student is registered for university.");
	}

	public void attend() {
		System.out.println("Student is attended for university.");
	}

	public void message() {
		System.out.println("Welcome to the journey of your life.");
	}
}

//creating child class and inheritance with parent class 
class campus extends universityX {

	public campus(String StN) {
		super(StN);

	}

	public void register() {
		System.out.println("Student is registerd for campus.");
	}

	public void attend() {
		System.out.println("Student is attended for campus");
	}
}

//creating child class and inheritance with parent class
class schoolX extends universityX {

	public schoolX(String StN) {
		super(StN);

	}

	public void register() {
		System.out.println("Student is registerd for school.");
	}

	public void attend() {
		System.out.println("Student is attended for school");
	}

}

/*
 * SBI pune = new SBI("India", "pune"); pune.loan(); pune.save();
 * pune.displayMessage(); }
 * 
 * 
 * 
 * 
 * }
 * 
 * class WorldBank { String country; // constructor public WorldBank(String cnt)
 * { this.country = cnt; }
 * 
 * public void save() {
 * System.out.println(" i am save method from the worldbank"); }
 * 
 * public void loan() {
 * System.out.println(" i am loan method from the worldbank"); }
 * 
 * public void displayMessage() { System.out.println("welcome to WorldBank"); }
 * 
 * 
 * }
 * 
 * class PNB extends WorldBank { String branchName;
 * 
 * public PNB(String cnt,String bn) { super(cnt); this.branchName = bn; } //
 * Overriding the parent methods loan and save
 * 
 * public void save() { System.out.println("I am save from PNB pune");
 * 
 * }
 * 
 * public void loan() { System.out.println("I am loan from PNB pune"); }
 * 
 * }
 * 
 * class SBI extends WorldBank {
 * 
 * String branchName;
 * 
 * public SBI(String cnt,String bn) { super(cnt); this.branchName = bn;
 * 
 * }
 * 
 * // Overriding the parent methods loan and save
 * 
 * 
 * public void save() { System.out.println("I am save from SBI pune");
 * 
 * }
 * 
 * public void loan() { System.out.println("I am loan from SBI pune"); }
 */
