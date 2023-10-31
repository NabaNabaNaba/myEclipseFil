package jaavaTutorial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethod2 {

	public static void main(String[] args) {
		// creating array list and adding people
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("David", "Trump", 22));
		people.add(new Person("Sam", "Jolly", 45));
		people.add(new Person("Robin", "Hunter", 32));
		people.add(new Person("Christina", "Suri", 16));
		people.add(new Person("Rohan", "Tyagi", 28));
		people.add(new Person("Saral", "Jindal", 22));
		people.add(new Person("Carlos", "Hulas", 67));
		people.add(new Person("Saral", "Dahal", 43));

		// filtering people age above 30
		List<Person> age = people.stream().filter(a -> a.dispayAge() > 30).collect(Collectors.toList());
		// looping
		age.forEach(a -> System.out.println(a.displayName()));

		// filtering people age below 30
		List<Person> ageB = people.stream().filter(b -> b.dispayAge() < 30).collect(Collectors.toList());
		// age.forEach(b->b.displayName());
		age.forEach(b -> System.out.println(b.displayName()));

		// filtering people based on first names
		List<Person> name = people.stream().filter(c -> c.displayName().contains("Saral")).collect(Collectors.toList());
		name.forEach(c -> System.out.println(c.displayName()));

		// filtering and collecting only names
		List<String> fName = people.stream().map(d -> d.firstName).collect(Collectors.toList());
		fName.forEach(d -> System.out.println(d));

		// filtering and collecting only last names
		List<String> lName = people.stream().map(e -> e.lastName).collect(Collectors.toList());
		lName.forEach(e -> System.out.println(e));

		// filtering and collecting age only
		List<Integer> ag = people.stream().map(f -> f.age).collect(Collectors.toList());
		ag.forEach(f -> System.out.println(f));

		// filtering average age of everyone
		List<Integer> allAge = people.stream().map(g -> g.dispayAge()).collect(Collectors.toList());
		int sumOfAge = allAge.stream().reduce(0, (x, y) -> x + y);// this formula will add all age and give sum
		System.out.println("Average age : " + sumOfAge / 8);// divide by total number of age

		// sorting in ascending order by age
		List<Person> sortedByAge = people.stream().sorted(Comparator.comparingInt(Person::dispayAge))
				.collect(Collectors.toList());
		sortedByAge.forEach(Person -> System.out.println(Person.displayName() + Person.dispayAge()));

		// name of first 3 people where age > 30
		List<Person> firstThreeAbove30 = people.stream().filter(person -> person.dispayAge() > 30).limit(3)
				.collect(Collectors.toList());
		firstThreeAbove30.forEach(person -> System.out.println(person.displayName()));

		// distinct name list
		List<String> distinctNames = people.stream().map(person -> person.firstName).distinct()
				.collect(Collectors.toList());
		distinctNames.forEach(h -> System.out.println(h));

	}

}

// creating class with constructor for above main method where below method will
// be called
class Person {
	// properties
	String firstName;
	String lastName;
	int age;

	// constructor
	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	// this method returns String
	public String displayName() {
		return (this.firstName + this.lastName);
	}

	// this method returns Integer
	public int dispayAge() {
		return (this.age);
	}
}