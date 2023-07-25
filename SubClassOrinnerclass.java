package jaavaTutorial;

import jaavaTutorial.flower.rose;

public class SubClassOrinnerclass {

	public static void main(String[] args) {
	
		//creating object for parents class
		flower lily = new flower("Pink", "Shrubs");
		lily.displayFlower1();
		//creating object for sub class/inner class
		//parent class   subClass    reference veriable       ref ver of parent class          subClass
		// flower        .rose           flr              =    lily                  .    new    rose();
		 
		flower.rose flr = lily.new rose();
		
		flr.displayFlower2();
		flr.displayFlower3();
		
	}

}
class flower {
	//creating parent class with constructor 
	String color;
	String type;
	//constructor
	public flower (String col, String typ){
		this.color = col;
		this.type = typ;
	}
	//method
	public void displayFlower1() {
		System.out.println(this.color+this.type);
	}
	
	//creating inner class/sub class or child class inside parent flower class
	class rose {
		int price;
		public void displayFlower2() {
		if (flower.this.type.equals("Shrubs")) {
			this.price = 500;
			System.out.println(price);
		}
		else if (flower.this.type.equals("Tree")) {
			this.price = 1000;
			System.out.println(price);
		}
		
		}
		int price2;
		public void displayFlower3() {
			if (flower.this.color.equals("Red")) {
				this.price2 = 1500;
				System.out.println(price);
			}
			else if (flower.this.color.equals("Pink")) {
				this.price2 = 2500;
				System.out.println(price2);
			}
		}
	}
	
}
