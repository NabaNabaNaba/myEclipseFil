package jaavaTutorial;

public class ConditionalStatement {

	public static void main(String[] args) {

		// conditional statements perform one input and multiple outcomes
		// if(conditions) {inside curly brackets code will execute}
		// only true condition should execute

		// prog1 : if conditions
		int PurchageMango = 50;

		if (PurchageMango > 0 && PurchageMango <= 25) {
			System.out.println("20 percent discount ");
		}
		if (PurchageMango > 25 && PurchageMango <= 50) {
			System.out.println("30 percent discount ");
		}
		if (PurchageMango > 50) {
			System.out.println("50 percent discount");
		}

		// prog2 : else if conditions here only the true condition will execute
		int PurchageApple = 8;

		if (PurchageApple > 0 && PurchageApple <= 5) {
			System.out.println("20 percent discount ");
		} else if (PurchageApple > 5 && PurchageMango <= 10) {
			System.out.println("30 percent discount ");
		} else if (PurchageApple > 10) {
			System.out.println("50 percent discount");
		} else {
			System.out.println("incorrect input ");
		}

		// prog3 : only if conditions here all statement will execute
		int Marks = 92;

		if (Marks > 90) {
			System.out.println("Grade A+");
		}
		if (Marks > 80) {
			System.out.println("Grade A ");
		}
		if (Marks > 60) {
			System.out.println("Grade B+");
		}
		if (Marks > 50) {
			System.out.println("Grade B");
		}

		// prog4 : if else if conditions here only the true condition will execute
		int MarksMath = 62;

		if (MarksMath > 90) {
			System.out.println("Grade A+");
		} else if (MarksMath > 80) {
			System.out.println("Grade A ");
		} else if (MarksMath > 60) {
			System.out.println("Grade B+");
		} else if (MarksMath > 50) {
			System.out.println("Grade B");
		} else {
			System.out.println("Try again");
		}

		// Prog5 two variables with if else conditions here only true condition will
		// execute
		int a = 20;
		int b = 30;

		if (a > b) {
			System.out.println("a is greater");
		} else {
			System.out.println("b is greater");
		}

		// prog6 three or more variables with if else conditions here true condition
		// will execute
		int x = 20;
		int y = 10;
		int z = 30;

		if (x > y && x > z) {
			System.out.println("x is greater");
		} else if (y > x && y > z) {
			System.out.println("y is greater");
		} else {
			System.out.println("z is greater");
		}
		
	}

}
