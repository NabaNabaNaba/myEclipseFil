package jaavaTutorial;

public class exam3 {

	public static void main(String[] args) {

		// calling classA
		addA a = new addA();
		a.addB();
		// calling sub method--this is the right way
		int aa = a.sub(9, 4);
		System.out.println(aa);

		// calling constructionA method with creating object
		constructionA con = new constructionA("Aashutosh", "Rane");
		con.disName();

		// creating object for mulEnheritance A,B,C and calling method
		mulEnheritanceA grandfather = new mulEnheritanceA("Raju", "Yadav");
		grandfather.disGFname();
		mulEnheritanceB father = new mulEnheritanceB("raju", "yadav", "Prem");
		father.disFname();
		mulEnheritanceC daughter = new mulEnheritanceC("raju", "yadav", "Preeti");
		daughter.disDname();

		// creating object for overriding and calling method
		overidingA overRide = new overidingA();
		overRide.animal("cow");
		overRide.animal("tiger", "fox");
		overRide.animal("I'm", "not a", "animal");

		// creating object for overloading and calling method
		overloadingB overLoad = new overloadingB();
		overLoad.plant();
		overLoad.human();
		overLoad.water();

	}

}

//write a function which accepts two int , add them and retun int .
class addA {
	int x;
	int y;

	public void addB() {
		System.out.println(x + y);
		return;
	}

//write a function which accepts two int , add them and retun int .
	public static int sub(int y, int z) {
		return y - z;

	}
}

//write a class using construction with two property (fields) and m1 method and create object of the same class
class constructionA {
	String fName;
	String lName;

	public constructionA(String fn, String ln) {
		this.fName = fn;
		this.lName = ln;
	}

	public void disName() {
		System.out.println(this.fName + "  " + this.lName);
	}
}

//write an example for Multiple level inheritance a-b-c

class mulEnheritanceA {
	String gfName;
	String gfLastName;

	public mulEnheritanceA(String gfn, String gfln) {
		this.gfName = gfn;
		this.gfLastName = gfln;
	}

	public void disGFname() {
		System.out.println(this.gfName + "  " + this.gfLastName);
	}
}

class mulEnheritanceB extends mulEnheritanceA {
	String fname;

	public mulEnheritanceB(String gfn, String gfln, String fna) {
		super(gfn, gfln);
		this.fname = fna;
	}

	public void disFname() {
		System.out.println(this.fname + "  " + this.gfLastName);
	}
}

class mulEnheritanceC extends mulEnheritanceA {
	String daughterName;

	public mulEnheritanceC(String gfn, String gfln, String dn) {
		super(gfn, gfln);
		this.daughterName = dn;
	}

	public void disDname() {
		System.out.println(this.daughterName + "  " + this.gfLastName);
	}

}

//write an example of method overriding
class overidingA {

	public void animal(String A) {
		System.out.println("I am a domestic animal.");
	}

	public void animal(String A, String B) {
		System.out.println("I am a wild animal.");
	}

	public void animal(String A, String B, String C) {
		System.out.println("I am not a animal.");
	}
}

//write an example of method overloading
class overloadingB {
	public void human() {
		System.out.println("I love humanity.");
	}

	public void plant() {
		System.out.println("I love plant.");
	}

	public void water() {
		System.out.println("I love water.");
	}
}
