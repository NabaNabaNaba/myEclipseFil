package jaavaTutorial;

enum SizeA {
	SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Order {

	SizeA pizzaSize;

	public Order(SizeA pizzaSize) {
		this.pizzaSize = pizzaSize;
	}

	public void orderConfirmation() {

		switch (pizzaSize) {
		
		
		case SMALL:
			System.out.println("you ordered a small size pizza");
			break;
		case MEDIUM:
			System.out.println("you orderred a medium size pizza");
			break;
		case LARGE:
			System.out.println("you ordered a  large pizza");
			break;
		case EXTRALARGE:
			System.out.println("you ordered a  extra large pizza");
			break;
			
		}

	}

}

public class enumA {

	public static void main(String[] args) {	
		Order order = new Order(SizeA.SMALL);
		order.orderConfirmation();
	}
	

}