package jaavaTutorial;

public class Inheritance2 {

	public static void main(String[] args) {
		
	
		
		ShopperA Roma = new ShopperA("Romaa", "Sherpa");
		System.out.println(Roma.firstName+Roma.lastName);
		Roma.displayName();
		ShopperB Doma = new ShopperB("Romaa", "Domaa", "Sherpa");
		System.out.println(Doma.SBfirstName+Doma.lastName);
		Doma.displaySBName();


	}

}

class ShopperA {
	String firstName;
	String lastName;
	
	
	public ShopperA(String FN,String LN) {
		this.firstName = FN;
		this.lastName = LN;
		
	}
	public void displayName () {
		System.out.println(this.firstName+this.lastName);
	}
}

class ShopperB extends ShopperA {
	String SBfirstName;
	public ShopperB(String FN, String LN, String SBfn) {
		super(FN, LN);
		
		this.SBfirstName= SBfn;
		
		
	}
	public void displaySBName () {
		System.out.println(this.SBfirstName);
	}
	
}

/*
TeacherN chinmayBN = new TeacherN("chi","desh",12,1244);
		
		System.out.println(chinmayBN.firstName);
		System.out.println(chinmayBN.lastName);
		System.out.println(chinmayBN.age);
		System.out.println(chinmayBN.salary);
		
		chinmayBN.displayName();
		chinmayBN.displaySalary();
		
	}

}


class StudentN {
	
	String firstName;
	String lastName ;
	int age;
	
	public StudentN(String fn , String ln , int ag) {
			
		this.firstName  = fn;
		this.lastName  = ln;
		this.age  = ag;
		
	}
	
	public void displayName() {
		System.out.println(this.firstName + this.lastName);
	}
	
}
class TeacherN  extends StudentN{
	
	int salary;
	public TeacherN(String fn , String ln , int ag, int sal) {
		super(fn,ln,ag);
		this.salary = sal;
	}
	
	public void displaySalary() {
		System.out.println(this.salary);
	}
*/