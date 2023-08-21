package jaavaTutorial;

public class OverloadingPolymorphism1 {

	public static void main(String[] args) {
		// creating object of class Maths and calling function from Addition
		Maths Add = new Maths();
		Add.Addition(5, 10);
		Add.Addition(4, 6, 8);
		Add.Addition(5, 10, 20, 30);
	}
}

class Maths {
	// overloading - multiple methods - same class , same methodName , different
	// signature
	// method 1
	public void Addition(int a, int b) {
		System.out.println(a + b);
	}

	// method 2
	public void Addition(int x, int y, int z) {
		System.out.println(x + y + z);
	}

	// method 3
	public void Addition(int i, int j, int k, int l) {
		System.out.println(i + j + k + l);
	}
}

/*
 * additionA(12,3); additionA(12,3,44); additionA(12,3,44,55); }
 * 
 * 
 * // overloading - same class , same methodName , different signature // method
 * 1 public static void additionA(int x, int y) { System.out.println(x+y); } //
 * method 2 public static void additionA(int x ,int y ,int z) {
 * System.out.println(x+y+z); } // method 3 public static void additionA(int x ,
 * int y , int z , int a ) { System.out.println(x+y+z+a); }
 * 
 */
