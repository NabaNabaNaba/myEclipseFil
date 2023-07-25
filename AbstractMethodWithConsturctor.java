package jaavaTutorial;

public class AbstractMethodWithConsturctor {

	public static void main(String[] args) {
		//creating object for shoppingBag child class and calling method
		shoppingBag SB = new shoppingBag("Armani black shirt", 2);
		SB.shoppingList();
		SB.clothes();
		SB.shoes();
		System.out.println(SB.blackShirt+SB.pieces);

	}

}
	//creating parent class
	abstract class shopping {
	//defining properties for this class
	String blackShirt;
	int pieces;
	
	//abstract method has no body on below two methods
	abstract  void clothes ();
	abstract void shoes ();
	
	//creating constructor for shopping class
	public shopping (String shirt, int pcs) {
		this.blackShirt = shirt;
		this.pieces = pcs;
	}
	public void shoppingList () {
		System.out.println(this.blackShirt+this.pieces);
	}
	}
	//creating child class with inheritance
	class shoppingBag extends shopping{
		
		public shoppingBag(String shirt, int pcs) {
			super(shirt, pcs);
			
		}

		//creating method with implementation 
		public void clothes () {
			System.out.println("Armani");
		}
		public void shoes () {
			System.out.println("Addidas");
		}
		
	}
	/*
	 CarK audi = new CarK(1);
		System.out.println(audi.wheel);
		audi.brake();
	}

}

abstract class VehicleK {

	int wheel;

	public VehicleK(int w) {
		this.wheel = w;
	}

	abstract public void brake();

}

class CarK extends VehicleK {

	public CarK(int w) {
		super(w);
		
	}

	public void brake() {
		System.out.println("I am brake for cark");
	}
	
	
}
	 */
