package jaavaTutorial;

public class inheritanceWithMultipleChild3 {

	public static void main(String[] args) {

		// creating object for child Naba class and calling function
		Naba son1 = new Naba("Dhan", "Khatiwada", "Naba");
		son1.sonName();
		// creating object for child Bisnu class and calling function
		Bisnu son2 = new Bisnu("Dhan", "Khatiwada", "Bisnu");
		son2.son2Name();

	}
}

//creating parent class with constructor
class DhanaBahadur {

	String firstName;
	String lastName;

	// creating constructor
	public DhanaBahadur(String Fn, String Ln) {
		this.firstName = Fn;
		this.lastName = Ln;
	}

	// creating method
	public void dadName() {
		System.out.println(this.firstName + "   " + this.lastName);
	}
}

//creating child class with constructor
class Naba extends DhanaBahadur {
	String son1FirstName;

	public Naba(String Fn, String Ln, String Sfn) {
		super(Fn, Ln);
		this.son1FirstName = Sfn;
	}

	public void sonName() {
		System.out.println(this.son1FirstName + "  " + this.lastName);
	}
}

//creating child class with constructor
class Bisnu extends DhanaBahadur {
	String son2firstName;

	public Bisnu(String Fn, String Ln, String S2n) {
		super(Fn, Ln);
		this.son2firstName = S2n;
	}

	public void son2Name() {
		System.out.println(this.son2firstName + "  " + this.lastName);
	}

}

/*
 * DaughterC gauri = new DaughterC("shirish","deshpande","gauri");
 * 
 * SonC chinmay = new SonC("shirish","deshpande","chinmay");
 * 
 * chinmay.displaySName(); chinmay.displayFName();
 * 
 * gauri.displayFName(); gauri.displayDName();
 * 
 * 
 * }
 * 
 * }
 * 
 * class FatherC {
 * 
 * String firstName; String lastName ;
 * 
 * public FatherC(String fn , String ln) { this.firstName = fn; this.lastName =
 * ln; }
 * 
 * public void displayFName() { System.out.println(this.firstName +
 * this.lastName); }
 * 
 * }
 * 
 * class SonC extends FatherC {
 * 
 * String Sname; public SonC(String fn, String ln, String sn) { super(fn, ln);
 * this.Sname = sn;
 * 
 * }
 * 
 * public void displaySName() { System.out.println(this.Sname + this.lastName);
 * }
 * 
 * }
 * 
 * class DaughterC extends FatherC{ String Dname; public DaughterC(String fn,
 * String ln , String dn) { super(fn, ln); this.Dname = dn; // TODO
 * Auto-generated constructor stub }
 * 
 * public void displayDName() { System.out.println(this.Dname + this.lastName);
 * }
 */
