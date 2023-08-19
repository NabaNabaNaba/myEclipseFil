package jaavaTutorial;

interface FirstInterface {

	public void myMethod(); // interface method does not have body

}

interface SecondInterface {

	public void myOtherMethod(); // interface method does not have body
}

// implementing two interface in one class
class DemoInterface implements FirstInterface, SecondInterface {

	public void myMethod() {
		System.out.println("Some text..");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

public class InterfaceMultiple {

	public static void main(String[] args) {

		DemoInterface myObj = new DemoInterface();
		myObj.myMethod();
		myObj.myOtherMethod();

	}

}
