package jaavaTutorial;

public class InheritanceWithConstructor {

	public static void main(String[] args) {
		
		
		//inheritance can help to call the method and properties from parent class
		// here Student1 is parent class and Teacher1 is child class 
		// to do inheritance we should use <extends> keyword when creating class
		Student1 C = new Student1("Ramesh", "Dahal", 222);
		System.out.println(C.firstName);
		System.out.println(C.lastName);
		System.out.println(C.passportNum);
		C.fullName();
		
		Teacher1 D = new Teacher1("Ramesh","Dahal",222,50000);
		System.out.println(D.firstName);
		System.out.println(D.lastName);
		System.out.println(D.passportNum);
		System.out.println(D.salary);
	
		
		D.fullName();
		D.salary();
	}

}
//creating student1 class with constructor
class Student1 {
	String firstName;
	String lastName;
	int passportNum;
	
	public  Student1 (String FN, String LN, int PN) {
		
		this.firstName = FN;
		this.lastName = LN;
		this.passportNum = PN;
		
			}
	public void fullName () {
		System.out.println(this.firstName+this.lastName);
	}
}
//creating Teacher1 class with constructor
class Teacher1 extends Student1{
	int salary;
	
	public Teacher1(String FN, String LN, int PN,int sal) {
		super(FN,LN,PN);
		this.salary = sal;
	}
	
	public void salary () {
		System.out.println(this.salary);
	}
		
	}

/*
 
		StudentC sarika = new StudentC("sarika","pansare",134);
		System.out.println(sarika.firstName);
		System.out.println(sarika.lastName);
		System.out.println(sarika.ssn);
		sarika.displayName();
		
		
		TeacherC sarikat = new TeacherC("sarikat","pansaret",123,3242);
		System.out.println(sarikat.firstName);
		System.out.println(sarikat.lastName);
		System.out.println(sarikat.ssn);
		System.out.println(sarikat.salary);
		
		sarikat.displayName();
		sarikat.displaySalary();
		
		
		
		
	}

}


class StudentC {
	
	String firstName;
	String lastName;
	int ssn;
	
	public  StudentC(String fn , String ln , int ss) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.ssn = ss;
				
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
} 

class TeacherC extends  StudentC{
	
	int salary ;
	
	// Mandatory to have child constructor as parent is having 
	// constructor
	// FirstLine of child constructor should be called to parent 
	//.. constructor
	
	
	public TeacherC(String fn , String ln , int ss ,int sal){
			super(fn,ln,ss);
			this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
	
 */
