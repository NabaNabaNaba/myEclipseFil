package jaavaTutorial;

public class arraysClass1 {

	public static void main(String[] args) {

		// type[] nameOFArray = new type[lengthOfArray]
		// Array stores the value by index

		// prog 1 int array is index
		int[] numbers = new int[5];
		numbers[0] = 5;
		numbers[1] = 6;
		numbers[2] = 7;
		numbers[3] = 8;
		numbers[4] = 9;

		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);

		int[] numbers2 = { 12, 23, 34, 45, 56 };
		System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);

		// prog 2 loop method for array

		String[] countries = new String[5];
		countries[0] = "Nepal";
		countries[1] = "India";
		countries[2] = "China";
		countries[3] = "Canada";
		countries[4] = "USA";

		for (int i = 0; i < countries.length; i++) {
			System.out.println(i);// it will print index only
			System.out.println(countries[i]);// it will print the valeu
		}

		int[] marks = { 59, 69, 79, 89, 99 };
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}

		// printing reverse using for loop
		int[] marks2 = { 51, 61, 71, 81, 91 };
		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.println(marks2[i]);
		}

		int[] marks3 = { 22, 33, 44, 55, 66 };
		for (int i = marks.length - 1; i <= 0; i--) {
			System.out.println(marks[i]);
		}

		// while loop for array
		int[] course = { 50, 60, 70, 80, 90 };

		int nep = 0;

		while (nep < course.length) {
			System.out.println(course[nep]);
			nep = nep + 1;
		}

		// while loop for array again
		int[] syllabus = { 1, 2, 3, 4, 5 };

		int syl = 0;

		while (syl < syllabus.length) {
			System.out.println(syllabus[syl]);
			syl = syl + 1;
		}

		// for each loop for string array
		String[] subjects = { "nepali", "english", "math", "science", "Geo" };

		for (String sub : subjects) {
			System.out.println(sub);
		}

		String[] flowers = { "rose", "rosemarry", "lilly" };
		for (String flw : flowers) {
			System.out.println(flw);
		}

		int[] numeric = { 11, 22, 33, 44, 55 };
		for (int num : numeric) {
			System.out.println(num);
		}

		
	}

}
/*
 * here is code created by teacher //program 1
 * 
 * //type [] nameOfArray = new type[lengthOfarray] // Array stores the value by
 * index
 * 
 * int [] numbers = new int[5]; numbers[0] = 11; numbers[1] = 22; numbers[2] =
 * 33; numbers[3] = 44; numbers[4] = 55;
 * 
 * 
 * System.out.println(numbers[0]); System.out.println(numbers[1]);
 * System.out.println(numbers[2]); System.out.println(numbers[3]);
 * System.out.println(numbers[4]);
 * 
 * 
 * int [] numbers2 = {111,222,333,444,555}; System.out.println(numbers2[0]);
 * System.out.println(numbers2[1]); System.out.println(numbers2[2]);
 * System.out.println(numbers2[3]); System.out.println(numbers2[4]);
 * 
 * 
 * // program 2
 * 
 * String [] cities = new String [5];
 * 
 * cities[0] = "pune"; cities[1] = "mumbai"; cities[2] = "banglore"; cities[3] =
 * "kolkata"; cities[4] = "chennai";
 * 
 * //System.out.println(cities[0]);
 * 
 * // looping through array
 * 
 * for(int i = 0 ; i < cities.length ; i++) { System.out.println(i);
 * System.out.println(cities[i]);
 * 
 * }
 * 
 * // i ---- 0 // i ---- 1 // i ---- 2 // i ---- 3 // i ---- 4
 * 
 * // 0 1 2 3 4 5 int [] marks = {99,100,111,23,45, 55};
 * 
 * for(int i = 0 ; i < marks.length ; i++) { System.out.println(marks[i]); }
 * 
 * System.out.println("Reverse ------------");
 * 
 * for(int i = marks.length -1 ; i >= 0 ; i-- ) { System.out.println(marks[i]);
 * }
 * 
 * 
 * // program 3
 * 
 * int mks [] = {33,44,55,66,77,88,99};
 * 
 * int t1 = 0;
 * 
 * while(t1 < mks.length) { System.out.println(mks[t1]); t1 = t1 + 1; }
 * 
 * 
 * 
 * int t2 = mks.length -1 ; while(t2 >= 0) { System.out.println(mks[t2]); t2 =
 * t2 - 1; }
 * 
 * 
 * // program 4 (for each loop)
 * 
 * String [] fruits = {"apple","grapes","banana"}; int [] mks2 = {11,22,33};
 * 
 * for(String a :fruits) { System.out.println(a); }
 * 
 * for(int b :mks2) { System.out.println(b); }
 */
