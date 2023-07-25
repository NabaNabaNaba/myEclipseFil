package jaavaTutorial;

public class whileLoop {

	public static void main(String[] args) {

//		for(intialization ; conditionCheck ; increment/decrement) {
//			// statements
//		}

		// intialization

		// while(condition){
		// statements
		// increment or decrement
		// }

		// print 1 to 3

		int t1 = 1;
		while (t1 <= 3) {
			System.out.println(t1); // 1 // 2 / 3
			t1++; // 2//3// 4
		}

		// program 2

		// print 1 to 5
		int t2 = 1;
		while (t2 <= 5) {
			System.out.println(t2); // 1 // 2 // 3 // 4 // 5
			t2++; // 2 //3 // 4 // 5 // 6
		}

		// program 3

		int t3 = 5;
		while (t3 <= 50) {
			System.out.println(t3);
			t3 = t3 + 5;
		}

		// program4
		int t4 = 30;
		while (t4 >= 3) {
			System.out.println(t4);
			t4 = t4 - 3;
		}

		// program5

		int t5 = 1;
		while (t5 <= 3) {
			System.out.println("hello");
			t5++;
		}

		// program 6

		int t6 = 70;
		while (t6 >= 7) {
			System.out.println(t6);
			if (t6 == 35) {
				break;
			}
			t6 = t6 - 7;
		}

		// program 7
		int t7 = 1;
		while (t7 <= 10) {
			if (t7 == 5) {
				t7++; // 6
				continue;
			}
			System.out.println(t7); // 1 // 2 // 3 // 4 // 6
			t7++; // 2 // 3 // 4 // 5 // 7
		}

	}

}
