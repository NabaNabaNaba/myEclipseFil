package jaavaTutorial;

public class forLoop {
	
	public static void main(String[] args) {

		// for loop first it initialization; then it will go to check condition; then
		// increment or decrement the value and execute the statement.

		// prog 1
		for (int i = 1; i <= 3; i++) {
			System.out.println(i);
			// first i is equal to 1 here 1 is lesser than equal to 5 the condition is true
			// it will print 1,
			// i is increment by 1 that is 2 here 2 is lesser than equal to 5 the condition
			// is true then it will print 2
			// again i is increment by 1 here it will be 3 here 3 is lesser equal to 3 the
			// condition is true then it will print 3
			// again i is increment by 1 here it will be 3 here 4 is lesser equal to 3 the
			// condition is false then loops ends here.

		}

		// prog 2

		for (int i = 5; i <= 10; i++) {
			System.out.println(i);

		}

		// prog 3
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}

		for (int i = 3; i >= 1; i--) {
			System.out.println(i);
		}

		// prog 4 loop with break
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);

		}

		// prog 5
		for (int i = 3; i >= 6; i++) {
			if (i == 4) {
				break;
			}
			System.out.println(i);
		}
		// prog 6
		for (int i = 5; i < 1; i--) {
			if (i == 3) {
				System.out.println(i);
				break;
			}
			}

			// print 1 to 5
//					System.out.println(1);
//					System.out.println(2);
//					System.out.println(3);
//					System.out.println(4);
//					System.out.println(5);

			// loops - for loop and another while loop
//					for(initialization ; conditionCheck ; increment/ decrement) {
//							// statements 
//					}

			// program 1
			for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 // 6
				System.out.println(i);

				// i - 1
				// i - 2
				// i - 3
				// i - 4
				// i - 5
			}

			// print hello 3 times
			// program 2

			for (int i = 1; i <= 3; i++) { // 2 // 3 // 4

				System.out.println("hello");
				// hello
				// hello
				// hello
			}

			// program 3

			for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 // 6

				System.out.println(i); // 1 // 2 // 3 // 4 // 5

			}

			// program 4

			for (int i = 1; i <= 3; i++) { // 2 // 3 //4
				System.out.println(i); // 1 // 2 // 3
			}

			// program 5

			for (int i = 5; i >= 1; i--) { // 4 // 3 // 2 // 1 // 0
				System.out.println(i); // 5 // 4 // 3 // 2 // 1
			}

			// program 6

			for (int i = 2; i <= 20; i = i + 2) { // 4 // 6 // 8 // 10 // 12 // 14 // 16 // 18 // 20 // 22
				System.out.println(i); // 2 // 4 // 6 // 8 // 10 // 12 /// 14 // 16 // 18 // 20
			}

			// program 7
			for (int i = 3; i >= 1; i--) { // 2 // 1 // 0

				System.out.println(i); // 3 // 2 // 1

			}

			// program 8
			// for loop with break;

			for (int i = 1; i < 4; i++) { // 2
				if (i == 2) {
					break;
				}
				System.out.println(i); // 1
			}

			// program 9

			for (int i = 1; i <= 5; i++) { // 2 //3

				System.out.println(i); // 1 // 2 // 3
				if (i == 3) {
					break;
				}

			}

			// program 10

			for (int i = 5; i >= 1; i--) { // 4 // 3
				if (i == 3) {
					break;
				}
				System.out.println(i);// 5 // 4

			}

			// program 11
			for (int i = 50; i >= 5; i = i - 5) { // 45 // 40
				System.out.println(i); // 50 // 45 // 40
				if (i == 40) {
					break;
				}
			}

			// program 12

			for (int i = 1; i <= 3; i++) { // 2 // 3 // 4
				System.out.println(i); // 1 // 2 // 3
			}

			// program 13
			// continue statement with for

			for (int i = 1; i <= 5; i++) { // 2 // 3 // 4 // 5 // 6
				if (i == 3) {
					continue;
				}
				System.out.println(i); // 1 // 2 // 4 // 5

			}

			// program 14

			for (int i = 1; i <= 3; i++) { // 2 // 3 // 4
				if (i == 2) {
					continue;
				}
				System.out.println(i); // 1 // 3

			}

			// program 15

			for (int i = 5; i >= 1; i--) { // 4 // 3 // 2 // 1 // 0
				if (i == 2) {
					continue;
				}
				System.out.println(i); // 5 // 4 // 3 // 1
			}

		}

	}

