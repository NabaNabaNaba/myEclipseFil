package jaavaTutorial;

public class Revision2 {

	public static void main(String[] args) {

		// single dimensional array for integer and using all three loops
		int[] num = new int[4];

		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		num[3] = 400;

		System.out.println(num[2]);

		// int using for loop

		int number[] = { 1, 2, 4, 42, 43 };

		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}

		// int using while loop
		int i1 = 0;
		while (i1 < number.length) {
			System.out.println(number[i1]);
			i1++;
		}

		// using for each loop

		for (int abc : number) {
			System.out.println(abc);
		}

		// multidimensional array for integer
		int num2[][] = { { 1, 3, 2 }, { 21, 323, 54 }, { 43, 76, 12 } };

		for (int p = 0; p < num2.length; p++) {
			int[] NewArray = num2[p];
			for (int q = 0; q < num2.length; q++) {
				System.out.println(NewArray[q]);
			}
		}

		// for string array using all three loops

		String fruits[] = { "apple", "banana", "orange", "kiwi" };
		for (int i5 = 0; i5 < fruits.length; i5++) {
			System.out.println(fruits[i5]);
		}

		// while loop
		int r = 0;
		while (r < fruits.length) {
			System.out.println(fruits[r]);
			r++;
		}

		// for each
		for (String Nfruits : fruits) {
			System.out.println(Nfruits);
		}

	}
}
