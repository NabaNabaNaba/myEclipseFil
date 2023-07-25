package jaavaTutorial;
//creating multiple interface with method but no body
interface School {
	public void nameOfStudent();
	public void addOfStudent();
	
}
interface College{
	public void displayCollege();
}
interface University{
	public void displayUniversity();
}

public class InterfaceC {

	public static void main(String[] args) {
	//creating object for oxford class and calling methods
		Oxford oxf = new Oxford();
		oxf.nameOfStudent();
		oxf.addOfStudent();
		oxf.displayUniversity();
		oxf.displayCollege();
		

	}

}
class CopperHill {
	public void studentProfele() {
		System.out.println("Student A is very active.");
	}
}
//inheritating from cppperhill class and implementing from multiple interface and defining method
class Oxford extends CopperHill implements School,College, University  {

	@Override
	public void displayUniversity() {
		System.out.println("This is world class university.");
		
	}

	@Override
	public void displayCollege() {
		System.out.println("This is world class College.");
		
	}

	@Override
	public void nameOfStudent() {
		System.out.println("Robin Max.");
		
	}

	@Override
	public void addOfStudent() {
		System.out.println("New York.");
		
	}
	
}