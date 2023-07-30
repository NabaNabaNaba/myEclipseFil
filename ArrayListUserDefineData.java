package jaavaTutorial;

import java.util.ArrayList;

public class ArrayListUserDefineData {

	public static void main(String[] args) {
		//creating object for userdefine data type for array list
		Language lang = new Language("Nepali", "English");
		Language lang2 = new Language("Hindi","Spanish");
		Language lang3 = new Language("Newari","gujarati");
		Language lang4 = new Language ("Marathi","Panjabi");
		
		//Creating array list for user define data type ,
		ArrayList<Language> ln = new ArrayList<>();
		ln.add(lang);
		ln.add(lang2);
		ln.add(lang3);
		ln.add(lang4);
		
		//this get method retrive the data from language class
		ln.get(0).displaylang();
		ln.get(1).displaylang();
		ln.get(2).displaylang();
		ln.get(3).displaylang();
		System.out.println("***************");
		//for loop
		for (int i =0; i<ln.size();i++) {
			System.out.println(ln.get(i).firstLang);//this will print first lang
			System.out.println(ln.get(i).secondLang);//this will print second lang
			ln.get(i).displaylang();//this will print displaylang method
		}
		System.out.println("***************");
		//while loop
		int j = 0;
		while (j<ln.size()) {
			System.out.println(ln.get(j).firstLang);//this will print first lang
			System.out.println(ln.get(j).secondLang);//this will print second lang
			ln.get(j).displaylang();//this will print displaylang method
			j++;
		}
		System.out.println("***************");
		//for each loop
		for( Language lng : ln) {
			System.out.println(lng.firstLang);
			System.out.println(lng.secondLang);
			lng.displaylang();
		}
	
	}

}
class Language {
	String firstLang;
	String secondLang;
	public Language(String fl, String sl) {
		this.firstLang = fl;
		this.secondLang = sl;
	}
	public void displaylang () {
		System.out.println(this.firstLang);
		System.out.println(this.secondLang);
	}
}
/*
public static void main(String[] args) {
		// TODO Auto-generated method stu

		Person13 amol = new Person13("amol", "rao");
		Person13 amol1 = new Person13("amol1", "rao");
		Person13 amol2 = new Person13("amol2", "rao");
		Person13 amol3 = new Person13("amol3", "rao");
		Person13 amol4 = new Person13("amol4", "rao");

		ArrayList<Person13> students = new ArrayList<>();
		students.add(amol);
		students.add(amol1);
		students.add(amol2);
		students.add(amol3);
		students.add(amol4);

		students.get(0).display();

		// for

		for (int i = 0; i < students.size(); i++) {
			// System.out.println(i);
			System.out.println(students.get(i).firstName);
			System.out.println(students.get(i).lastName);
			students.get(i).display();

		}

		// while loop
		int t1 = 0;
		while (t1 < students.size()) {
			System.out.println(students.get(t1).firstName);
			System.out.println(students.get(t1).lastName);
			students.get(t1).display();
			t1++;
		}

		// forEach
		
		for(Person13 a : students) {
			System.out.println(a.firstName);
			System.out.println(a.lastName);
			a.display();
		}

	}

}

class Person13 {
	String firstName;
	String lastName;

	public Person13(String fn, String ln) {
		this.firstName = fn;
		this.lastName = ln;
	}

	public void display() {
		System.out.println(this.firstName + this.lastName);
	}

}
*/