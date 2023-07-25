package jaavaTutorial;

public class Test2 {

	public static void main(String[] args) {
		// call for function one
		int sum = addFunction(15, 25);
		System.out.println(sum);

		// call for function two
		arithOperation(8, 9);

		// call for function three
		PrintVariables();

		// call for function four
		switchCase();

	}

	// prog 1 Write a function for addition of two numbers.
	public static int addFunction(int x, int y) {
		return x + y;

	}

	// prog 2 Define two variables and perform arithmetic operation
	public static void arithOperation(int a, int b) {
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}

	// prog 3 Define 3 variables and print greatest variable out of three
	public static void PrintVariables() {
		int j = 11;
		int k = 22;
		int l = 33;

		if (j > k && j <= l) {
			System.out.println("j variable is greater.");

		} else if (k > j && k <= l) {
			System.out.println("k variable is greater");

		} else {
			System.out.println("l variable is greater");

		}
	}

	// prog 4 Write a program for switch case (case for city and print respective
	// state.
	public static void switchCase() {

		String SwCs = "Dharan";
		switch (SwCs) {
		case "Biratnagar":
			System.out.println("Koshi");
			break;
		case "Kathmandu":
			System.out.println("Bagmati");
			break;
		case "rautahat":
			System.out.println("Janakput");
		default:
			System.out.println("Incorrect input");
		}

	}

}
