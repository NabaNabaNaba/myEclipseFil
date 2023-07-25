package jaavaTutorial;

public class InheritanceWithMultipleChild {

	public static void main(String[] args) {

		StudentX David = new StudentX("David", "Noel");
		System.out.println(David.firstName + David.lastName);
		David.displaySXname();
		TeacherX David2 = new TeacherX("David", "Noel", 321243);
		
		System.out.println(David2.firstName + David2.lastName + David2.Salary);
		David2.displaySXname();
		David2.displayTXname();

		
	}

}

class StudentX {
	String firstName;
	String lastName;

	public StudentX(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;

	}

	public void displaySXname() {
		System.out.println(this.firstName + this.lastName);
	}
}

class TeacherX extends StudentX {
	int Salary;

	public TeacherX(String fn, String ln, int Sl) {
		super(fn, ln);
		this.Salary = Sl;
	}

	public void displayTXname() {
		System.out.println(this.Salary);
	}

}