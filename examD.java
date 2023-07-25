package jaavaTutorial;

public class examD {
	//one program overloading
	public static void main(String[] args) {
		Kitchen kit = new Kitchen("beautiful");
		kit.wood();
		kit.plastic();
		kit.bamboo();
		
		
	}

}
class furniture{
	String type;
	public furniture (String ty) {
		this.type=ty;
	}
	public void wood () {
		System.out.println("I am a chair from wood ");
	}
	public void plastic() {
		System.out.println("I am a chair from plastic");
	}
	public void bamboo() {
		System.out.println("I am a chair from bamboo");
	}
}
class Kitchen extends furniture{

	public Kitchen(String ty) {
		super(ty);
		
	}
	public void wood () {
		System.out.println("I am a chair from wood ");
	}
	public void plastic() {
		System.out.println("I am a chair from plastic");
	}
	public void bamboo() {
		System.out.println("I am a chair from bamboo");
	}
	
}
