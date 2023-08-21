package jaavaTutorial;

public class Revision {

	public static void main(String[] args) {

		int x = 10;
		int y = 5;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		int a = 8;
		int b = 4;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);

		// calling the function
		Calculator(12, 2);
		Calculator(10, 5);
		Calculator(8, 4);

		addA();
		addA();
		addA();

		addB(12, 4); // 16
		addB(12, 1); // 13
		addB(12, 8); // 20
		addB(12, 1); // 13

		int q1 = addC(12, 4);
		System.out.println(q1);
		System.out.println(q1 + q1);
		System.out.println(q1 - 4);
		System.out.println(q1 * 0.10);

		// comparison operator
		// < , > , <= , >= , == , !=

		System.out.println(7 > 6); // true
		System.out.println(5 < 3); // false
		System.out.println(7 == 7); // true
		System.out.println(7 != 8); // true
		System.out.println(7 >= 6); // true
		System.out.println(7 <= 6); // false
		System.out.println(7 <= 7); // true
		System.out.println(7 >= 7); // true

		// Logical operator
		
		// AND - &&

		// true && true ======> true
		// false && true ======> false
		// true && false ======> false
		// false && false =====> false

		System.out.println(12 == 12 && 11 == 11); // true
		System.out.println(12 != 12 && 11 == 11); // false
		System.out.println(12 == 12 && 11 != 11); // false
		System.out.println(12 != 12 && 11 != 11); // false

		// OR - ||

		// true || true ======> true
		// false || true ======> true
		// true || false ======> true
		// false || false ======> false

		System.out.println(12 == 12 || 11 == 11); // true
		System.out.println(12 != 12 || 11 == 11); // true
		System.out.println(12 == 12 || 11 != 11); // true
		System.out.println(12 != 12 || 11 != 11); // false

		// NOT - !

		// true ---- false
		// false ---- true

		System.out.println(!(2 == 2));
		System.out.println(!(2 != 2));

		// conditional statement

		int numT = 70;
		if (numT > 0 && numT <= 5) {
			System.out.println("10 % discount");
		}
		if (numT > 5 && numT <= 10) {
			System.out.println("20 % discount");
		}
		if (numT > 10) {
			System.out.println("30 % discount");
		}

		// program 2
		int numTa = -70;

		if (numTa > 0 && numTa <= 5) {
			System.out.println("10 % discount");
		} else if (numTa > 5 && numTa <= 10) {
			System.out.println("20 % discount");
		} else if (numTa > 10) {
			System.out.println("30 % discount");
		} else {
			System.out.println("please have correct input");
		}

		// program 3

		int marks = 55;

//				if(marks > 90) {
//					System.out.println("Grade A");
//				}
//				if(marks > 75) {
//					System.out.println("Grade B");
//				}
//				if(marks > 60) {
//					System.out.println("Grade C");
//				}

		if (marks > 90) {
			System.out.println("Grade A");
		} else if (marks > 75) {
			System.out.println("Grade B");
		} else if (marks > 60) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail please try again");
		}

		// program 3

		int t = 10;
		int s = 5;

		if (s > t) {
			System.out.println("S is greater");
		} else {
			System.out.println("T is greater");
		}

		int a1 = 10;
		int a2 = 5;
		int a3 = 3;

		if (a1 > a2 && a1 > a3) {
			System.out.println("a1 is greater");
		} else if (a2 > a1 && a2 < a3) {
			System.out.println("a2 is greater");
		} else {
			System.out.println("a3 is greater");
		}

		// program 4

		// Ternary operator

		int j = 60;
		int k = 300;
		String j2 = j > k ? "j is greater" : "k is greater";
		System.out.println(j2);

		String city = "indore";

//				switch (city) {
//				case "pune":
//					System.out.println("MH");
//				case "jaipur":
//					System.out.println("RJ");
//				case "bhopal":
//					System.out.println("MP");
//				case "varanasi":
//					System.out.println("UP");
//				default:
//					System.out.println("In correct city name");
//
//				}

//				switch (city) {
//				case "pune":
//					System.out.println("MH");
//					break;
//				case "jaipur":
//					System.out.println("RJ");
//					break;
//				case "bhopal":
//					System.out.println("MP");
//					break;
//				case "varanasi":
//					System.out.println("UP");
//					break;
//				default:
//					System.out.println("In correct city name");
//
//				}

		switch (city) {
		case "pune":
		case "nagpur":
			System.out.println("MH");
			break;
		case "jaipur":
		case "udaipur":
			System.out.println("RJ");
			break;
		case "bhopal":
		case "indore":
			System.out.println("MP");
			break;
		case "varanasi":
		case "lucknow":
			System.out.println("UP");
			break;
		default:
			System.out.println("In correct city name");

		}

		// loops

//				for(intialzation ; conditionCheck ; increment/decrement) {
//					// statement
//				}
//				

		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
		}

		for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 //6
			System.out.println(i); // 1 // 2 // 3 // 4 // 5
		}

		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
		}

		for (int i = 50; i >= 5; i = i - 5) {
			System.out.println(i);
		}

		// break with for

		for (int i = 1; i <= 5; i++) { // 2 // 3
			if (i == 3) {
				break;
			}
			System.out.println(i); // 1 // 2
		}

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break;
			}

		}

		// for with continue
		for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 // 6
			if (i == 3) {
				continue;
			}

			System.out.println(i); // 1 // 2 // 4 // 5
		}

		// while

		// intialization
//				while(condition) {
//					// stataments
//					
//					// increment / decrement
//				}

		int t1 = 1;

		while (t1 <= 3) {
			System.out.println("hello");
			t1++;
		}

		int t2 = 1;
		while (t2 <= 3) {
			System.out.println(t2);
			t2++;
		}

		int t3 = 5;
		while (t3 >= 1) {
			System.out.println(t3);
			t3--;
		}

		int t4 = 2;
		while (t4 <= 20) {
			System.out.println(t4);
			t4 = t4 + 2;
		}

		int t5 = 50;
		while (t5 >= 5) {
			System.out.println(t5);
			t5 = t5 - 5;
		}

		int t6 = 10;
		while (t6 >= 1) {
			if (t6 == 5) {
				break;
			}
			System.out.println(t6);
			t6--;
		}

		int t7 = 1;
		while (t7 <= 5) {
			if (t7 == 3) {
				t7++; // 4
				continue;
			}
			System.out.println(t7); // 1 // 2 // 4 // 5
			t7++; // 2 // 3 // 5 //6
		}

	}

	public static void Calculator(int x, int y) {
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
	}

	// function without parameter and without return type

	public static void addA() {
		System.out.println(9 + 9);
	}

	// function with parameter and without return type

	public static void addB(int q, int r) {
		System.out.println(q + r);
	}

	// function with parameter and with return type

	public static int addC(int a, int b) {
		return a + b;
	}

}
