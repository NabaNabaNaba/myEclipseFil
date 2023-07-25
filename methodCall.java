package jaavaTutorial;

public class methodCall {

	public static void main(String[] args) {
		// call all functions inside the main method

		Calculator(9, 3); // call function inside the main method
		Calculator(5, 7); // call function inside the main method
		Addition();
		subtraction(6, 7);
		int sum = ReturnType(20, 30);// store return in variable
		System.out.println(sum);
		System.out.println(sum - 25);// reuse of called function)

	}

	// prog 1 creating the function 
	public static void Calculator(int x, int y) {
		System.out.println(x);
		System.out.println(y);
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);

	}

	//  prog 2 writing a function without parameter and without return type - this function is not useful because it's not returning the value)
	public static void Addition() {
		System.out.println(12 + 12);
		System.out.println("Im calling function without return type.");
	}

	// prog 3 writing a function with parameter and without return type
	public static void subtraction(int x, int y) {
		System.out.println(x - y);
	}

	//prog 4 writing a function with parameter(int x, int y) and with return type(int)
	public static int ReturnType(int x, int y) {
		return x + y; //here using <retutn> keyword 
	}

}



