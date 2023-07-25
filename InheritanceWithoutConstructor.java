package jaavaTutorial;

public class InheritanceWithoutConstructor {

	public static void main(String[] args) {
		
		//creating object of students class
		Student A = new Student();
		System.out.println(A.firstName);
		System.out.println(A.lastName);
		System.out.println(A.passportNumber);
		A.name();
		
		//creating object of teacher class
		Teacher B = new Teacher();
		System.out.println(B.firstName);
		System.out.println(B.lastName);
		System.out.println(B.passportNumber);
		B.salary();
		B.name();
		
		
	}

}

class Student {
	String firstName = "Sabin";
	String lastName = "Karki";
	int passportNumber = 246;

	public void name() {
		System.out.println(this.firstName + this.lastName);
	}
}

class Teacher extends Student {
	int salary = 100000;
	
	public void salary () {
		System.out.println(this.salary);
	}
}
/*
  
  StudentB ninad = new StudentB();
		System.out.println(ninad.firstName);
		System.out.println(ninad.lastName);
		System.out.println(ninad.ssn);
		ninad.displayName();
		
		
		
		TeacherB ninadb = new TeacherB();
		System.out.println(ninadb.salary);
		System.out.println(ninadb.firstName);
		System.out.println(ninadb.lastName);
		System.out.println(ninadb.ssn);
		
		ninadb.displaySalary();
		ninadb.displayName();
		
	}
	
	
	

}

class StudentB {
	String firstName = "chinmay";
	String lastName = "deshpande";
	int ssn = 123;

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class TeacherB  extends StudentB{
	int salary = 1000;
	public void displaySalary() {
		System.out.println(this.salary);
	}

 */
