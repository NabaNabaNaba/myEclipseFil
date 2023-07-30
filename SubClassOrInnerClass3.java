package jaavaTutorial;

import jaavaTutorial.OuterClass.InnerClass;

public class SubClassOrInnerClass3 {

	public static void main(String[] args) {
		OuterClass OC = new OuterClass();
		OuterClass.InnerClass IC = OC.new InnerClass();
		System.out.println(OC.a);
		System.out.println(IC.b);
		
		OC.displayOuterClass();
		IC.displayInnerClass();
		

	}

}
class OuterClass {
	int a=0;
	public void displayOuterClass () {
		System.out.println("this is class from outside");
	}
	class InnerClass{	
	int b=5;
	public void displayInnerClass() {
		System.out.println("this is class form inside.");
	}
	
	}
	
}
