package jaavaTutorial;
	
	interface library1 {
		public void dislibrary();
		public void disBooks();
		
	}
public class examB {

	//one program on interface
	
	public static void main(String[] args) {
		
		fromTheLib lib = new fromTheLib();
		lib.disBooks();
		lib.dislibrary();
		
	}

}
class fromTheLib implements library1{

	@Override
	public void dislibrary() {
		System.out.println("dfgdf");
		
	}

	@Override
	public void disBooks() {
		System.out.println("sdfsf");
		
	}
	
}