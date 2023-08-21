package jaavaTutorial;

public class Revision7Abstraction {

	public static void main(String[] args) {
			Bedroom b = new Bedroom("cooked");
			b.rice();
			b.curry();
		
	}

}
abstract class Kitchen2 {
	String cook;
	public Kitchen2(String c) {
		this.cook = c;
	}
	abstract void rice();
	abstract void curry();
	
	
	public void displayFood() {
		System.out.println(" we cook food.");
	}
}
class Bedroom extends Kitchen2{

	public Bedroom(String c) {
		super(c);
		// TODO Auto-generated constructor stub
	}
	public void rice() {
		System.out.println("this is rice from Bedroom");
	}
	public void curry () {
		System.out.println(" this is curry from Bedroom");
	}
}