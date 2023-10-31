package jaavaTutorial;

interface family{
	public void father();
	public void mother();
}

public class Revision10Interface {

	public static void main(String[] args) {
		

	}

}
class Relatives {
	String relation;
	public Relatives (String r) {
		this.relation = r;
	}
	
	
	public void displayFamily () {
		System.out.println(this.relation);
	}
}
