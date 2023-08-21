package jaavaTutorial;
enum size{
	SMALL,MEDIUM,LARGE,EXTRALARGE
}
class OrderSize {
	size pizzaSize;
	public OrderSize (size pzzs) {
		this.pizzaSize = pzzs;
	}
	public void orderMyPizza () {
		
		System.out.println(" I order pizza .");
	
	
	switch (pizzaSize) {
	case SMALL:
		System.out.println("small pizza");
		break;
	case MEDIUM:
		System.out.println("medium pizza");
		break;
	case LARGE:
		System.out.println("large pizza");
		break;
	case EXTRALARGE:
		System.out.println("extra large pizza");
		break;
	}
}
}
public class Enum {
	
	
	public static void main(String[] args) {
		
		OrderSize order = new OrderSize(size.LARGE);
		order.orderMyPizza();
		order.orderMyPizza();
		
	}

}
