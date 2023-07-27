package jaavaTutorial;

public class AbstractionWithoutConstructor {

	public static void main(String[] args) {
		// creating object for abstract class worldBank is not allowed
		// creating object for chaseBank
		chaseBank CB = new chaseBank();
		CB.loan();
		CB.save();
		CB.displayBankName();
		// creating object for TDBank
		TDBank TD = new TDBank();
		TD.loan();
		TD.save();
		TD.displayBankName();

	}

}


abstract class WorldBank {
	// abstract method have hidden implementation
	
	//abstract method has no body means no implementation {  }
	abstract void loan();
	abstract void save();

	// again it has public method
	public void displayBankName() {
		System.out.println("This is a bank from country .");

	}

}

class chaseBank extends WorldBank {
	// adding implemented method for parent class
	public void loan() {
		System.out.println("loan is provided by chase bank");
	}

	public void save() {
		System.out.println("save account is provided by chase bank");
	}

}

class TDBank extends WorldBank {
	// adding implemented method for parent class
	public void loan() {
		System.out.println("loan is close by TD bank");
	}

	public void save() {
		System.out.println("save account is close by TD bank");
	}
}

/*
// you cannot create the object of abstract class
		//WorldBankA a = new WorldBankA();
		
		SBIA pune = new SBIA();
		
		pune.loan();
		pune.save();
		pune.displayCountry();
		pune.branchName();

	}
	
	

}

abstract class WorldBankA {
	
	// abstract method
	abstract void loan();
	abstract void save();
	public void displayCountry() {
		System.out.println("I am from india");
	}
	
}

// you cannot create object of abstract class

class SBIA extends WorldBankA {
	
	public void loan() {
		System.out.println("I am loan from sbi");
	}
	public void save() {
		System.out.println("I am save sbi");
	}
	
	public void branchName() {
		System.out.println("I am  pune branch");
	}

}

class PNBA extends  WorldBankA {
	
	public void loan() {
		System.out.println("I am loan from pnbA");
	}
	public void save() {
		System.out.println("I am save from pnbA");
	}
	
	public void branchName() {
		System.out.println("I am  pune branch -pnba");
	}
*/