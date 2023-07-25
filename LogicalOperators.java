package jaavaTutorial;

public class LogicalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// boolean data types always perform true or false
		// logical operator

		// AND --- && ------it always aspect true when both the tables are true

		// true && true -------> true
		// false && true -------> false
		// true && false -------> false
		// false && false -------> false

		System.out.println(5 == 5 && 7 == 7);
		System.out.println(6 != 6 && 3 == 3);
		System.out.println(2 == 2 && 9 != 9);
		System.out.println(4 != 4 && 10 != 10);

		// OR --- || ------it always aspect false when both the tables are false 

		// true || true -------> true
		// false || true -------> true
		// true || false -------> true
		// false || false -------> false

		System.out.println(6 == 7 || 5 == 6);
		System.out.println(3 == 3 || 2 == 3);
		System.out.println(5 == 3 || 5 == 5);
		System.out.println(11 == 11 || 12 == 12);

		// NOT --- ! ------it always aspect not

		// true ---- false
		// false ---- true

		System.out.println(!(15 == 15));
		System.out.println(!(20 == 15));

		// logical operator

		// AND --- &&

		// true && true -------> true
		// false && true -------> false
		// true && false -------> false
		// false && false -------> false

		System.out.println(7 == 7 && 8 == 8);
		System.out.println(7 != 7 && 8 == 8);
		System.out.println(7 == 7 && 8 != 8);
		System.out.println(7 != 7 && 8 != 8);

		// OR --- ||

		// true || true -------> true
		// false || true -------> true
		// true || false -------> true
		// false || false -------> false

		System.out.println(8 == 9 || 8 == 9);
		System.out.println(8 == 8 || 8 == 9);
		System.out.println(8 == 1 || 8 == 8);
		System.out.println(8 == 8 || 8 == 8);

		// NOT --- !

		// true ---- false
		// false ---- true

		System.out.println(!(8 == 8));
		System.out.println(!(9 == 8));
	}

}
