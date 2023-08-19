package jaavaTutorial;

import java.util.ArrayList;

public class ArrayListWithLoop {

	public static void main(String[] args) {
	
		//defining array list 
		ArrayList<String> fruits  = new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("grapes");
		fruits.add("papaya");
		System.out.println(fruits);
		
		//if else condition with containts method to check element
		String userInput = "apple";//it return true 
		if (fruits.contains(userInput)) {
			System.out.println("Available");
		}
		else {
			System.out.println("NotAvailable");
		}
		
		String userInput1 = "Cherry";//it returns false
		if (fruits.contains(userInput1)) {
			System.out.println("Available");
		}
		else {
			System.out.println("NotAvailable");
		}
		
		//contains method with if else condition 
		String userInput2 = "apple";//it return true 
		if (fruits.contains(userInput2)) {
			System.out.println("this is available.");
		}
		else {
			System.out.println("this is not available.");
			
		}
		
		String userInput3 = "Mango";//it return false
		if (fruits.contains(userInput3)){
			System.out.println("This is available.");
		}
		else {
			System.out.println("This is not available.");
		}
	}

}
