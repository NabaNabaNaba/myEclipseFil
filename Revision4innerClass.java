package jaavaTutorial;

public class Revision4innerClass {

	public static void main(String[] args) {
		Food f = new Food("mild");
		f.displayTest();
		
		Food.Lunch l = f.new Lunch(5);
		l.displayLunchP();
		
		Coffee c = new Coffee("Americano",4);
		c.displayCoffee();
		Coffee.Tea t = c.new Tea("Capachino",5);
		t.displayTea();

	}

}
//program 1
class Food {
	String test;
	public Food (String t) {
		this.test = t;
	}
	public void displayTest() {
		System.out.println("Food is delicious.");
	}
	
	//nested class
	//can be extend from parent class 
	class  Lunch{
		int price;
		public Lunch (int p) {
			
		}
		public void displayLunchP() {
			System.out.println("Lunch is in good price.");
		}
	}
}
//program 2
class Coffee {
	String Type;
	int price;
	public Coffee (String t, int p) {
		this.Type = t;
		this.price = p;
	}
	public void displayCoffee() {
		System.out.println(this.price+ "  "+this.Type);
	}
	
	//nested class
	//can be extend from parent class 
	class Tea {
		String Type;
		int price;
		public Tea (String t, int p) {
			this.Type = t;
			this.price = p;
		}
		public void displayTea () {
			System.out.println("This is Tea.");
		}
	}
}

