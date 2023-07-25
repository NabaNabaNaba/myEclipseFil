package jaavaTutorial;

public class MultipleArray {

	public static void main(String[] args) {
		
		People [] American = {new People("rabi","chandra",12345),
				new People("xabi","ojha",3434),
				new People("nabina","shah",3434), 
				new People("rita","khatri",124312)};
		
		//for loop
		for (int i = 0; i<American.length; i++) {
			American[i].displayedName();
		}
		
		//while loop
		int i = 0;
		while (i<American.length) {
			American[i].displayedName();
			i++;
		}
		
		//for each loop
		for (People Amr : American) {
			Amr.displayedName();
		}
		
		Calculator june = new Calculator();
		june.addition(2, 3); // 5
		june.addition(2, 3, 4); // 9
		june.addition(2, 3, 4, 5); //14
	
		Vehicle toyota = new Vehicle();
		Vehicle audi = new Vehicle("Audi");
		Vehicle bmw = new Vehicle("Audi","Q4");
	}
	

}
class People {
	
	String firstName;
	String lastName;
	int mobileNumber;
	
	public People (String fn, String ln, int mn) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.mobileNumber = mn;
		
	}
	
	public void displayedName () {
		System.out.println(this.firstName+this.lastName);
	}
	
}
class Calculator {

	public void addition(int x, int y) {
		System.out.println(x + y);
	}

	public void addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public void addition(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}
	
}

class Vehicle {
	
	String name;
	String model;
	
	// Default constructor is always called;
	// Class can have multiple constructor (constructor overloaded)
	// Constructor don't have return type 
	// Constructor name should be similar to class name
	
	
	public Vehicle() {
		System.out.println("Default constructor is called");
	}
	
	public Vehicle(String nm) {
		this.name = nm;
		System.out.println("The name of vehicle "+ this.name);
	}
	
	public Vehicle(String nm , String mdl) {
		this.name = nm;
		System.out.println("The name of vehicle "+ this.name + this.model);
	}
	
}
/*
 // program 1

//		Person rabindra = new Person("ranbindra","amatya",42);
		Person[] students = { new Person("ranbindra", "amatya", 42), new Person("chinmay", "deshpadne", 33),
				new Person("ravi", "sharma", 29), new Person("poorva", "vyas", 28), new Person("ashwini", "dani", 56)

		};

		// for loop
		for (int i = 0; i < students.length; i++) {
			students[i].displayName();
		}

		// while
		int t1 = 0;
		while (t1 < students.length) {
			students[t1].displayName();
			t1++;
		}

		// forEach

		for (Person student : students) {
			student.displayName();
		}

// program 2

		Calculator june = new Calculator();
		june.addition(2, 3); // 5
		june.addition(2, 3, 4); // 9
		june.addition(2, 3, 4, 5); //14

	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}

}

class Calculator {

	public void addition(int x, int y) {
		System.out.println(x + y);
	}

	public void addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	public void addition(int x, int y, int z, int a) {
		System.out.println(x + y + z + a);
	}

*/