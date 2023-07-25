package jaavaTutorial;

public class examF {
	//one program for abstraction
	public static void main(String[] args) {
		JerseyBank jb = new JerseyBank();
		jb.branchNam();
		jb.branchAdd();
		jb.disMess();

	}

}
abstract class Bank{
	abstract void branchNam();
	abstract void branchAdd();
	
	public void disMess() {
		System.out.println("Welcome to Jersey Bank.");
	}
}
 class JerseyBank extends Bank{

	@Override
	public void branchNam() {
		System.out.println("Jersey bank");
		
	}

	@Override
	public void branchAdd() {
		System.out.println("Jersey");
		
	}
	 
 }
	
