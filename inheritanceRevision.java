package jaavaTutorial;

public class inheritanceRevision {

	public static void main(String[] args) {
		// creating objects for parent class
		Medicine Med = new Medicine("Citamol", "Antibacterial", 10);
		Med.displayMedTab(4);
		Med.displayMedTab(5, "D-cold");
		Med.displayMedTab(6, "Cough-syrup", 20);
		// creating objects for child class
		PainKiller Pkill = new PainKiller("fever", "headache", 22, "Antibiotic");
		Pkill.displayCapsule();
		Pkill.displayMedTab(23);
		Pkill.displayMedTab(45, "dfsdfsdf");
		Pkill.displayMedTab(56, "dfsdfsdfdsfsdfsd", 50);
		Pkill.UseOfMedicine();
		Pkill.greetMessage();
		// creating object for privateKeyword class
		privateKeyword Marks = new privateKeyword("Distinction", 9, 9.99);
		Marks.displayMarks();
		// we can't call private properties from the class like -
		// Marks.Marks();/Marks.Nepali();/Marks.Science();

		// creating object for person class
		PersonForProcted A = new PersonForProcted("Rohit", "Sharma", 35);
		A.displayNameAge();
		// we can call protected properties outside of class but not outside of the
		// package

	}
}

// creating parent class with constructor
class Medicine {
	// defining properties
	String Tablet;
	String Ointment;
	private int Patient;

	// creating constructor
	public Medicine(String Tab, String Oint, int Pat) {
		this.Tablet = Tab;
		this.Ointment = Oint;
		this.Patient = Pat;
	}

	// overloading -- same class , same method , different signature
	public void displayMedTab(int mg) {
		System.out.println(this.Tablet);
	}

	public void displayMedTab(int mg, String ointments) {
		System.out.println(this.Ointment);
	}

	public void displayMedTab(int mg, String ointments, int pats) {
		System.out.println(this.Patient);
	}

	public void UseOfMedicine() {
		System.out.println("Every day three tabs for selected patient");
	}

	public void greetMessage() {
		System.out.println("Wel come to the cvs pharmacy.");
	}
}

// Override -- same method as parent class , same signature , different class
// creating child class
class PainKiller extends Medicine {
	String Capsule;

	// creating constructor
	public PainKiller(String Tab, String Oint, int Pat, String cap) {
		super(Tab, Oint, Pat);
		this.Capsule = cap;
	}

	public void displayCapsule() {
		System.out.println(this.Capsule);
	}

	// creating same method name from parent class
	public void UseOfMedicine() {
		System.out.println("Not a prescibed medicine.");
	}

	// creating same method name from parent class
	public void greetMessage() {
		System.out.println("Wel come to the walgreen inc.");
		super.greetMessage();// this keyword used for parent class method
	}

}

// creating class for private --
class privateKeyword {
	// defining properties
	private String Marks;
	private int Nepali;
	private double Science;

	// creating constructor
	public privateKeyword(String Mar, int Nep, double Sci) {
		this.Marks = Mar;
		this.Nepali = Nep;
		this.Science = Sci;
	}

	// creating method--we can call private method inside the same class but not
	// other class
	public void displayMarks() {
		System.out.println(this.Marks);
		System.out.println(this.Nepali);
		System.out.println(this.Science);
	}

}

// creating class for protected
class PersonForProcted {
	protected String fname = "John";
	protected String lname = "Doe";

	protected int age = 24;

	// creating constructor
	public PersonForProcted(String f, String l, int a) {
		this.fname = f;
		this.lname = l;
		this.age = a;
	}

	// creating method
	public void displayNameAge() {
		System.out.println(this.fname + this.lname + this.age);
	}
}
