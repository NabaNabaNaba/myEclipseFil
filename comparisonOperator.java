package jaavaTutorial;

public class comparisonOperator {

	public static void main(String[] args) {

		// Comparison Operators (<,>,<=,>=,!=,==)

		// < -- less than
		// > -- greater than
		// <= -- less than or equal to
		// >= -- greater than or equal to
		// != -- not equal
		// == -- equal to

		System.out.println(5 < 9); // 5 is less than(<) 9 : this statement should print true
		System.out.println(9 < 5); // 5 is less than(<) 9 : this statement should print false

		System.out.println(5 > 9); // 5 is greater than(>)9 : this statement should print false
		System.out.println(9 > 5); // 5 is greater than(>)9 : this statement should print true

		System.out.println(5 <= 9); // 5 is less than or equal to(<=) : this statement should print true
		System.out.println(9 <= 5); // 5 is less than or equal to(<=) : this statement should print false

		System.out.println(5 >= 9); // 5 is greater than or equal to (<=) : this statement should print false
		System.out.println(9 >= 5); // 5 is greater than or equal to (<=) : this statement should print true

		System.out.println(5 != 9); // 5 is not equal to (!=) : this statement should print true
		System.out.println(9 != 5); // 5 is not equal to (!=) : this statement should print true

		System.out.println(5 == 9); // 5 is equal to (==) : this statement should print false
		System.out.println(10 == 11); // 5 is equal to (==) : this statement should print false

	}

}
