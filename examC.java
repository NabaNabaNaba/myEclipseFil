package jaavaTutorial;

public class examC {
	
	//one program on inner class
	public static void main(String[] args) {
		
		Pharmacy ph = new Pharmacy("Walgreen");
		ph.disPharn();
		Pharmacy.mediciene med = ph.new mediciene();
		

	}

}
class Pharmacy{
	String PharmaName;
	public Pharmacy (String pn) {
		this.PharmaName=pn;
	
		}
	public void disPharn() {
		System.out.println("I am from pharamacy dep.");
	}
	class mediciene{
		 
			
	}
	public static void dismed() {
		System.out.println("I am from med department.");
		
	}
}