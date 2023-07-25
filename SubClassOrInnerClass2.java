package jaavaTutorial;

public class SubClassOrInnerClass2 {

	public static void main(String[] args) {
	
		Car Camry = new Car("Camry","Sedan");
		Car Rav4 = new Car("Rav4", "SUV");
		
		Car.Engine E1 = Camry.new Engine();
		Car.Engine E2 = Rav4.new Engine();
		
		E1.EngineSizes();
		E2.EngineSizes();
		
		

	}

}
class Car{
	String CarName;
	String CarType;
	//creating consturctor
	public Car(String CN, String CT) {
		this.CarName = CN;
		this.CarType = CT;
	}
	
	public void Greet() {
		System.out.println("Congrats on your new Car".concat(this.CarName));
	}
	
	//creating inner class
	
	class Engine{
		String EngineSize;
		
		public void EngineSizes() {
			if(Car.this.CarType.equals("Sedan")) {
				
				System.out.println("Small engine");
				
			}
			
			else if(Car.this.CarType.equals("SUV")) {
				System.out.println("Turbo  engine");
			}
			
	}
		

	}}
