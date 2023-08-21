package jaavaTutorial;

import java.lang.reflect.Array;

public class Revision1Array {

	public static void main(String[] args) {
	//define array
//	int [][] array = new int [3][4];
//			array [0][0] = 12;
//			array [0][1] = 113;
//			array [0][2] = 12134;
//			array [0][3] = 122345;
//			
//			array [1][0] = 12;
//			array [1][1] = 113;
//			array [1][2] = 12134;
//			array [1][3] = 122345;
//			
//			array [2][0] = 12;
//			array [2][1] = 113;
//			array [2][2] = 12134;
//			array [2][3] = 122345;
	int [][]array = {{2,2,3,4}, {3,4,5,7},{8,6,9}};
			
			System.out.println(array[1][3]);
			for (int  i = 0; i < array.length; i++) {
				System.out.println(array[i]);
				int []obj = array[i];
				for (int j = 0; j<obj.length; j++) {
					System.out.println(obj[j]);
				}
				
				int a = 0;
				while ( a <array.length) {
					System.out.println(array[a]);
				int []obj1 = array[a];
					int b = 0;
					while (b<obj1.length) {
						System.out.println(obj1[b]);
						b++;
					}a++;
				}
			}
			
			for (int []x : array) {
				for ( int y : x) {
					System.out.println(y);
				}
			}
		}
	
	
	}


