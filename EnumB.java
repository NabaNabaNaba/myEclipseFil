package jaavaTutorial;

public class EnumB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarA audi = new CarA("q4","sedane");
		CarA Thar = new CarA("XU700","SUV");
		
		
		CarA.Engine i = audi.new Engine();
		CarA.Engine k = Thar.new Engine();
		
		i.engineSize();
		k.engineSize();
		

	}

}

class CarA {

	String carName;
	String CarType;

	public CarA(String name, String type) {
		this.carName = name;
		this.CarType = type;
	}

	public void Greet() {
		System.out.println("congrats on new car ".concat(this.carName));
	}
	
	// inner class 
	
	class Engine {
		
		String engineSize;
		
		// Accessing the outer class fields into inner class
		public void engineSize() {
			
			if(CarA.this.CarType.equals("sedane")) {
				this.engineSize = "smaller";
				System.out.println(this.engineSize);
			}
			else if(CarA.this.CarType.equals("SUV")) {
				this.engineSize = "bigger";
				System.out.println(this.engineSize);
			}
			
		}
		
		
	}

}