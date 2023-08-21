package jaavaTutorial;

public class Revision6Overriding {

	public static void main(String[] args) {
		Mobile m = new Mobile(23);
		m.samsung();
		Television t = new Television(23);
		t.samsung();
		Oven o = new Oven(234);
		o.samsung();

	}

}
class Mobile {
	int price;
	public Mobile (int p) {
		this.price = p;
	}
	public void samsung() {
		System.out.println(" this is samsung");
	}
	public void apple() {
		System.out.println("this is apple");
	}
	public void sony() {
		System.out.println("this is sony");
	}
}

class Television extends Mobile {

	public Television(int p) {
		super(p);
		
		
	}
	public void samsung() {
		System.out.println(" this is samsung tv");
	}
	public void apple() {
		System.out.println("this is apple tv");
	}
	public void sony() {
		System.out.println("this is sony tv");
	}
}

class Oven extends Mobile {

	public Oven(int p) {
		super(p);
		
		
	}
	public void samsung() {
		System.out.println(" this is samsung oven");
	}
	public void apple() {
		System.out.println("this is apple oven");
	}
	public void sony() {
		System.out.println("this is sony oven");
	}
}