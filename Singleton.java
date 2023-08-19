package jaavaTutorial;

public class Singleton {

	public static void main(String[] args) {
		/*
		 * Singleton To implement a singleton class in Java, you typically follow these
		 * steps: Private constructor: Make the constructor of the class private so that
		 * it cannot be instantiated from outside the class. Static instance variable:
		 * Create a static variable within the class to hold the single instance of the
		 * class. This variable should be private and static, so it can be accessed from
		 * within the class but not directly from outside. Static getInstance() method:
		 * Provide a public static method that allows external classes to access the
		 * single instance of the class. This method should handle the creation of the
		 * instance if it does not exist or return the existing instance.
		 */

		Store ad = Store.getInstance();
		ad.getConnection();
		ad.getInstance();
	}

}

class Store {
	// Static variable to hold the single instance
	private static Store db;

	// Private constructor
	private Store() {

	}

	// Static method to get the single instance
	public static Store getInstance() {
		if (db == null) {
			// If instance is null, create a new instance
			db = new Store();
		}
		System.out.println("database found");
		return db;
		
	}

	public void getConnection() {
		System.out.println("connected to Database");
	}

}
