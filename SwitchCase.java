package jaavaTutorial;

public class SwitchCase {

	public static void main(String[] args) {

		// Prog1----
		// Switch case without break statement

		String State = "Hillsboro"; // where the case matches statement will execute and all the below statement will execute because of no break statement

		switch (State) {
		case "Hillsboro":
			System.out.println("NJ");
		case "Manhatan":
			System.out.println("NY");
		case "Washington":
			System.out.println("VA");
		case "Charlotte":
			System.out.println("NC");
		case "Orlando":
			System.out.println("FL");
		default:
			System.out.println("Incorrect City");
		}
		
		//Prog2----
		// Switch case with break statement

		String State2 = "Manhatan"; // only those statement will execute and break others

		switch (State2) {
		case "Hillsboro":
			System.out.println("NJ");
			break;
		case "Manhatan":
			System.out.println("NY");
			break;
		case "Washington":
			System.out.println("VA");
			break;
		case "Charlotte":
			System.out.println("NC");
			break;
		case "Orlando":
			System.out.println("FL");
		default:
			System.out.println("Incorrect City");
		}

		// prog3------
		// Switch case with break statement with multiple cases

		String State3 = "Queens"; // only those statement will execute and break others

		switch (State3) {
		case "Hillsboro":
		case "Flemington":
			System.out.println("NJ");
			break;
		case "Manhatan":
		case "Queens":
			System.out.println("NY");
			break;
		case "Washington":
		case "Chantily":
			System.out.println("VA");
			break;
		case "Charlotte":
		case "Raleigh":
			System.out.println("NC");
			break;
		case "Orlando":
		case "Oviedo":
		case "Miami":
			System.out.println("FL");
			break;
		default:
			System.out.println("Incorrect City");
		}
	}

}
