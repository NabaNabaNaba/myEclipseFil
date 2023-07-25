package jaavaTutorial;

public class MultidimensionArray {

	public static void main(String[] args) {
	
		
		//multidimension array ---- its a two dimension array
		int [][] value = new int [3][4];
		value [0][0]= 12;
		value [0][1]= 13;
		value [0][2]= 12;
		value [0][3]= 13;
		
		value [1][0]= 12;
		value [1][1]= 13;
		value [1][2]= 12;
		value [1][3]= 13;
		
		value [2][0]= 12;
		value [2][1]= 13;
		value [2][2]= 12;
		value [2][3]= 13;
		
		System.out.println(value[0][3]);
		
		//for loop for the multidimension array
		for (int i=0; i<value.length;i++) {
			int [] ValMarks = value[i];
			for (int ii = 0; ii <ValMarks.length; ii++) {
			System.out.println(ValMarks[ii]);
			}
		}
	
		
		//while loop for the multidimension array
		int iii = 0;
		while (iii < value.length) {
			int MarksVal[] = value[iii];
			int arr = 0;
			while (arr<MarksVal.length) {
				System.out.println(MarksVal[arr]);
				arr++;
			}
			iii++;
		}
		
		//for each loop 
		for (int [] MarVal : value) {
			for (int MarVal2 : MarVal) {
				System.out.println(MarVal2);
			}
		}
		
		/* code created by teacher
		 int marks[] = new int[5];
		marks[0] = 1;
		marks[1] = 2;
		marks[2] = 3;
		marks[3] = 4;
		marks[4] = 5;

		// 0 1 2 3 4
		int marks2[] = { 1, 2, 3, 4, 5 };
		String cities[] = { "mumbai", "pune", "banglore", "kolkalta" };

		// Array stores the value by index

		// for loop

		for (int i = 0; i < marks2.length; i++) {
			System.out.println();
			System.out.println(marks2[i]);
		}

		// while loop

		int t1 = 0;

		while (t1 < marks.length) {
			// System.out.println(t1);
			System.out.println(marks2[t1]);
			t1 = t1 + 1;
		}

		// forEach
		for (int a : marks2) {
			System.out.println(a);
		}

		// Multi- dimensional array

		int[][] marks3 = new int[3][4];

		marks3[0][0] = 1;
		marks3[0][1] = 2;
		marks3[0][2] = 3;
		marks3[0][3] = 4;

		marks3[1][0] = 11;
		marks3[1][1] = 22;
		marks3[1][2] = 33;
		marks3[1][3] = 44;

		marks3[2][0] = 555;
		marks3[2][1] = 666;
		marks3[2][2] = 777;
		marks3[2][3] = 888;

		System.out.println(marks3[1][2]);

//		{
//			{1,2,3,4},
//			{11,22,33,44},
//			{555,666,777,888}
//		}
		
		// program 1
		// for loop

		for (int i = 0; i < marks3.length; i++) {
			// System.out.println(i);
			int[] arr = marks3[i]; // {1,2,3,4}, //{11,22,33,44} , {555,666,777,888}
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}

		}

		// program 2

		int[][] numbers2 = {

				{ 11, 22, 33 },
				{ 44, 55, 66 }, 
				{ 77, 88, 99 } 
			};

		for (int i = 0; i < numbers2.length; i++) {
			int[] arr = numbers2[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}

		// while loop
		// program 3

		int r1 = 0;

		while (r1 < numbers2.length) {
			int arr[] = numbers2[r1];
			int c1 = 0;
			while (c1 < arr.length) {
				System.out.println(arr[c1]);
				c1 = c1 + 1;
			}
			r1++;
		}

	
		// program 4
		
		for(int [] row:numbers2) {
			for(int col : row) {
				System.out.println(col);
			}
		}
		 */
	}

}
