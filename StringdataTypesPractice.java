package jaavaTutorial;

public class StringdataTypesPractice {

	public static void main(String[] args) {
		
		//int  would be whole number positive or negative
		//string what written inside the inverted coma "fjdlkfdkflj2131232" is a collection of characters
		
		
		//prog 1
		String firstName = "Sudhir";
		System.out.println(firstName);
		
		String lastName = "Khatiwada";
		System.out.println(lastName);
		
		//prog 2
		//charAt(); method for String
		String Address = "Kathmandu";
		char fourthChar =Address.charAt(4);
		System.out.println(fourthChar);
		
		//prog 3
		//lenth(); method for String 
		int lenthOfLetter = Address.length();
		System.out.println(lenthOfLetter);
		
		//prog 4 
		//for loop for String
		for (int i = 0; i<=lenthOfLetter; i++) {
			System.out.println(i);
			
		}
		
		// prog 5
		// for loop for string
		String city = "Charikot";
		for (int i = 0; i<city.length(); i++) {
			System.out.println(city.charAt(i));
		}
		
		String city1 = "Charikot";
		for (int i = 0; i<city1.length(); i++) {
			System.out.println(city.charAt(i));
		}
		//prog 6
		//for loop reverse order
		String City2 = "Pokhara";
		for (int i = City2.length()-1; i >=0; i--) {
			System.out.println(City2.charAt(i));
			//System.out.println(i);
		}
		
		//prog 7
		//upperCase(); method for String
		String upperCase = "saturday";
		String UP = upperCase.toUpperCase();
		System.out.println(UP);
		
		//prog 8
		//lowerCase(); method for string
		String lowerCase = "MONDAY";
		String LC = lowerCase.toLowerCase();
		System.out.println(LC);
		
		System.out.println(lowerCase.toLowerCase());// we can execute  this way but we can not reuse it .
		
	}
	

}
