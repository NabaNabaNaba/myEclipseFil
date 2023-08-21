package jaavaTutorial;

public class Revision5Overloading {

	public static void main(String[] args) {
		
		Mathematics m = new Mathematics();
		m.unit(5);
		m.unit(3.3, 5);
		m.unit("one", "two");
		m.unit(4.34, 5.5);

		
		Books b = new Books();
		b.library(5, 6);
		b.library("price", 10);
		b.library(3.333, 4.443534);
	}

}
//program 1
class Mathematics {
	
	public void unit (int a) {
		System.out.println("this is overloading");
	}
	public void unit (float b, int c) {
		System.out.println("this has multiple method with same name");
	}
	public void unit (double d, double e ) {
		System.out.println("every method has different signature");
	}
	public void unit (String f, String g ) {
		System.out.println("it can be called in same method name with different parameter.");
	}
}

//program 2
class Books {
	public void  library (int x, int y) {
		System.out.println(x+y);
	}
	public void  library (String  x, int y) {
		System.out.println(x+y);
	}
	public void  library (double x, double y) {
		System.out.println(x+y);
	}
}