package jaavaTutorial;

public class exam1 {

	public static void main(String[] args) {

		// Write a function which add two numbers and return a integers with parameter
		int English = 65;
		int Maths = 75;
		System.out.println(English + Maths);

		// write a program of reverse a string
		String country = "UnitedStates";
		for (int i = country.length() - 1; i >= 0; i--) {
			System.out.println(country.charAt(i));

		}

		// Define a String array and loop using while loop:

		String[] family = { "Father", "Mother", "Son", "Daughter" };

		int FM = 0;
		while (FM < family.length) {
			System.out.println(family[FM]);
			FM++;
		}

		// Write a program with multi dimensional array of int and loop using for each
		// loop
		int[][] multiDMarray = new int[2][2];
		multiDMarray[0][0] = 5;
		multiDMarray[0][1] = 10;

		multiDMarray[1][0] = 15;
		multiDMarray[1][1] = 20;

		for (int[] MDA : multiDMarray) {
			for (int MDA2 : MDA) {
				System.out.println(MDA2);
			}

		}

		Vehicle1 car = new Vehicle1("Black", "Sports");
		Vehicle1 car2 = new Vehicle1("White", "Sedan");

		System.out.println(car.color);
		System.out.println(car2.type);

		car.start();

	}
}

//unable to complete without seeing the example but done after previous example
//define a class vehicle with two property color and type and one method start() and create a object using constructor
class Vehicle1 {
	String color;
	String type;

	public Vehicle1 (String Col, String Typ) {
		this.color = Col;
		this.type = Typ;

	}

	public void start() {
		System.out.println("Car will starts.");
	}
}

	