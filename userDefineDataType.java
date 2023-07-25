package jaavaTutorial;

public class userDefineDataType {

	public static void main(String[] args) {

		// user define data type
		// Creating object or  instance 00Human2
		Human2 Raj = new Human2("Raj Khatiwada", 40);
		Human2 Aadi = new Human2("Aadi Pandey", 25);
		System.out.println(Raj.age);
		System.out.println(Raj.name);

		System.out.println(Aadi.age);
		System.out.println(Aadi.name);

		// Calling methods from Human2 class
		Raj.walk();
		Raj.talk();

		Aadi.walk();
		Aadi.talk();

		// Calling the method from Animal class
		Animal3 Tiger = new Animal3("National Tiger", "Brown and Black", 10);
		Animal3 Cow = new Animal3("Domestic cow", "Black", 13);

		System.out.println(Tiger.name);
		System.out.println(Tiger.color);
		System.out.println(Tiger.years);

		System.out.println(Cow.name);
		System.out.println(Cow.color);
		System.out.println(Cow.years);

		Tiger.AnimalRun();
		Tiger.AnimalJump();
	}

}

//creating Human2 class
class Human2 {

	int age;
	String name;

	// defining constructor
	public Human2(String nameOfPerson, int ageOfperson) {
		this.name = nameOfPerson;
		this.age = ageOfperson;
	}

	public void talk() {
		System.out.println("I am talking with someone.");
	}

	public void walk() {
		System.out.println("I am walking on the floor.");

	}
}

//creating Animal class
class Animal3 {
	String name;
	String color;
	int years;

	public Animal3(String nameOfAnimal, String colorOfAnimal, int ageOfAnimal) {
		this.name = nameOfAnimal;
		this.color = colorOfAnimal;
		this.years = ageOfAnimal;
	}

	public void AnimalRun() {
		System.out.println("Animal is running.");
	}

	public void AnimalJump() {
		System.out.println("Animal is jumping. ");
	}
	
	

}
