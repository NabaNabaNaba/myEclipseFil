package jaavaTutorial;

public class stringDataTypesMethod {

	public static void main(String[] args) {

		// prog 1 reverse with for loop
		String country = "Singapur";
		String reverse1 = "";

		for (int i = country.length() - 1; i >= 0; i--) {

			// System.out.println(i);
			// System.out.println(country.charAt(i));
			reverse1 = country.charAt(i) + reverse1;
		}
		System.out.println(reverse1);

		// prog 2 reverse with for loop
		String animal = "Tiger";
		String reverse2 = "";

		for (int i = animal.length() - 1; i >= 0; i--) {
			reverse2 = animal.charAt(i) + reverse2;
		}
		System.out.println(reverse2);

		// prog 3 reverse with for loop

		String firstName = "Sham";
		String reverse3 = "";
		for (int i = 0; i < firstName.length(); i++) {
			reverse3 = firstName.charAt(i) + reverse3;
		}
		System.out.println(reverse3);

		// prog4 toupperCase()
		String lastName = "Khatiwada";
		String LN = lastName.toUpperCase();
		System.out.println(LN);

		// prog 5 toLowerCase
		String yourName = "RAJ";
		String YN = yourName.toLowerCase();
		System.out.println(YN);

		// prog 6 different method with string together
		String Address = "Bhadrapur";
		String Add = Address.toLowerCase().toUpperCase();
		System.out.println(Add);

		// prog 7 it will returen char
		String street = "Flemington";
		char st = street.charAt(street.length() - 1);
		System.out.println(st);

		// Prog 8 substring string method
		String phone = "Mynumber";
		String ph = phone.substring(2, 4);
		System.out.println(ph);

		// prog 9 startsWith() method returns boolean means true or false value
		String mobile = "Iphone Promx";
		boolean bo1 = mobile.startsWith("Ip");
		System.out.println(bo1);

		String mobile2 = "Iphone Promx";
		boolean bo2 = mobile2.startsWith("llc");
		System.out.println(bo2);

		// prog 10 endsWith() method returns boolean value
		boolean bo3 = mobile.endsWith("mx");
		System.out.println(bo3);

		boolean bo4 = mobile2.endsWith("zs");
		System.out.println(bo4);
		// we can print this way tooo :- System.out.println(mobile2.endsWith("zs"));

		// prog 11 replace() replace()All method
		String library = "My favourite books are novels.";
		String lib = library.replace("M", "I");// replace method replace one character
		System.out.println(lib);

		String School = "Oxford university is top university";
		String School2 = "school";
		String sch = School.replaceAll("university", "school");// replaceAll method replace all string(word)
		System.out.println(sch);

		String sch2 = School.replaceFirst("university", "school");// replaceFirst method replace first string(word) only
		System.out.println(sch2);

		// prog 12 concat() method joins two statements or two strings
		String birth = "December 1, Sunday";
		String birthPlace = " Kathmandu, Nepal";
		String BP = birth.concat(birthPlace);// two string joins and return string
		System.out.println(BP);

		// prog 13 contains method check specific word or character in two or more
		// string and returns boolean value
		String flower = "Rose, lily are the seasonal flowers";
		boolean fl = flower.contains("seasonal");
		System.out.println(fl);
		boolean fl2 = flower.contains("natural");
		System.out.println(fl2);

		// prog 14 equal() method

		String cityA = "Pokhara";
		String cityB = "Biratnagar";
		String CityC = "Pokhara";

		boolean CityAB = cityA.equals(cityB);// checking both strings are equals or not
		System.out.println(CityAB);
		boolean CityAC = cityA.equals(CityC);// checking both string are equals or not
		System.out.println(CityAC);
		
		//prog 15 trim() method removes first starting space and last ending space
		String job = " I have been working in QA for long time. ";
		String J = job.trim();
		System.out.println(J);
		
		//prog 16 equalIgnoreCase() method ignoring the Case but check the same string
		String Family = "FATHER AND MOTHER";
		String Family2 = "father and mother";
		boolean F = Family.equalsIgnoreCase(Family2);
		System.out.println(F);
		
		
		//joining multiple string method
		String joinMethods = Family.toLowerCase().toUpperCase().concat(Family2);//first to lower case and upper case then join all 
		System.out.println(joinMethods);
		

		/*
		 * Teacher's code String firstName = "Chinmay";
		 * 
		 * // 0 1 2 3 4 5 6 // C h i n m a y String rev = "";
		 * 
		 * for (int i = 0; i < firstName.length(); i++) { // System.out.println(i); //
		 * System.out.println(firstName.charAt(i)); rev = firstName.charAt(i) + rev; //
		 * C + "" ========> C // h + C ========> hC // i + hC ========> ihC
		 * 
		 * }
		 * 
		 * System.out.println(rev);
		 * 
		 * // Program 2 String city = "Pune"; String rev2 = "";
		 * 
		 * // 0 1 2 3 // P u n e
		 * 
		 * for (int i = city.length() - 1; i >= 0; i--) { // System.out.println(i); //
		 * System.out.println(city.charAt(i));
		 * 
		 * rev2 = rev2 + city.charAt(i); // "" + e =================> e // e + n
		 * =================> en // en + u =================> enu // enu + p
		 * =================> enup }
		 * 
		 * System.out.println(rev2);
		 * 
		 * //
		 * 
		 * // Program 1 String city1 = "Pune"; String uc = city1.toUpperCase();
		 * System.out.println(uc); System.out.println(city1.toUpperCase());
		 * System.out.println("Welcome ".toUpperCase() + uc);
		 * 
		 * // Program 2
		 * 
		 * String city2 = "NAGpur"; String lc = city2.toLowerCase();
		 * System.out.println(lc);
		 * 
		 * // Program 3
		 * 
		 * String city3 = "Wardha"; int toc = city3.length(); System.out.println(toc);
		 * 
		 * // Program 4
		 * 
		 * String city4 = "Chandrapur"; int toc2 =
		 * city4.toUpperCase().toLowerCase().length(); System.out.println(toc2);
		 * 
		 * // Program 5 // 0 1 2 3 4 5 // R a j k o t
		 * 
		 * String city5 = "Rajkot"; char c = city5.charAt(city5.length() - 1);
		 * System.out.println(c);
		 * 
		 * // Program 6
		 * 
		 * String city6 = "jaipur"; // 0 1 2 3 4 5 // J a i p u r
		 * 
		 * // String s1 = city6.substring(3); // System.out.println(s1); //
		 * city6.substring(startIndex, endIndex(not included));
		 * 
		 * String s2 = city6.substring(1, 3); System.out.println(s2);
		 */

	}

}
