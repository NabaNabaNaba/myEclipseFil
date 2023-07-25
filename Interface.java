package jaavaTutorial;
//interface should have method but no body
interface WorldBankA{
	public void loan();
	public void save();
	
}


public class Interface {

	public static void main(String[] args) {
		
		//creating object for ChaseBank class  and calling methods
		ChaseBankA CB = new ChaseBankA();
		CB.loan();
		CB.save();
		PanBankB PB = new PanBankB();
		PB.loan();
		PB.save();
		
	}

}
class ChaseBankA implements WorldBankA{

	//this method autometically called because of abstraction
	public void loan() {
		System.out.println("This is loan method from ChaseBank");
		
	}

	//this method autometically called because of abstraction
	public void save() {
		System.out.println("This is save method from ChaseBank");
		
	}
	
}
class PanBankB implements WorldBankA{
	//this method autometically called because of abstraction
		public void loan() {
			System.out.println("This is loan method from PanBank");
			
		}

		//this method autometically called because of abstraction
		public void save() {
			System.out.println("This is save method from PanBank");
			
		}
}
