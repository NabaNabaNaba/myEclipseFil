package jaavaTutorial;
//creating three interface 
interface animal{
	public void eat();
	public void bite();
}
interface human {
	public void walk();
	public void talk();
}
interface bird {
	public void fly();
	public void sound();
}

public class InterfaceB {

	public static void main(String[] args) {
		
		//creating obj for methodFromAnimal and calling methods
		methodA Ani = new methodA();
		Ani.eat();
		Ani.bite();
		Ani.walk();
		Ani.talk();
		Ani.fly();
		Ani.sound();
	}

}
// more than one interface can be implemented in a class
class methodA implements animal,human,bird{

	
	public void fly() {
		System.out.println("I am flying.");
		
	}

	
	public void sound() {
		System.out.println("I am making sound");
		
	}

	
	public void walk() {
		System.out.println("I am walking.");
		
	}

	
	public void talk() {
		System.out.println("I am talking.");
		
	}

	
	public void eat() {
		System.out.println("I am eating .");
		
	}


	public void bite() {
		System.out.println("I am biting.");
		
	}
	
}
/*
 interface Three{
	public void methodThree();
	
}
interface Four{
	public void methodFour();
}

interface Five{
	public void methodFive();
}

public class Day26D {

	public static void main(String[] args) {
		
		Seven ObjSeven = new Seven();
		ObjSeven.SixA();
		ObjSeven.SixB();
		ObjSeven.methodFour();
		ObjSeven.methodThree();
		

	}

}
class Six{
	public void SixA() {
		System.out.println("This is first method for class six");
	}
	
	public void SixB() {
		System.out.println("This is second method for class six");
	}
	
	
	
}

class Seven extends Six implements Three, Four{

	
	public void methodFour() {
		System.out.println("This is the method from interface four");
		
	}

	
	public void methodThree() {
		System.out.println("This is the method from interface three");
		
	}
 */
