package jaavaTutorial;

public class Test1 {

	public static void main(String[] args) {

		int sum = addition(22, 33);// store return in variable
		System.out.println(sum);
		System.out.println(sum+6);
		variables();
		variables1();	
		switchcase();
	}
	// prog 1 Write a function for addition of two numbers.
	public static int addition(int f, int g) {
		return f+g;
		

	}
	//prog 2 Define two variables and perform arithmetic operation
	public static void variables() {
		int q = 10;
		int r = 11;
		System.err.println(q + r);
		System.err.println(q - r);
		System.err.println(q * r);
		System.err.println(q / r);
		System.err.println(q % r);
	}
	// prog 3 Define 3 variables and print greatest variable out of three
	public static void variables1() {

		int m = 5;
		int n = 7;
		int o = 9;
		if (m > n && m <= o) {
		System.out.println(" m is greater");
		}
		else if (n > o && n <= m) {
			System.out.println("n is greater");
		}
		else {
			System.out.println("o is greater");
		}
		
	}
	
	// prog 4 Write a program for switch case (case for city and print respective state.
	public static void switchcase() {
		String SW = "Kath";
		switch (SW) {
		case "bagmati":
			System.out.println("NP");
			break;
			
		case "gandaki":
			System.out.println("NR");
			break;
			default:
				System.out.println("incorrect city");
		// not able to complete
		}
	}
}