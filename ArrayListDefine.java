package jaavaTutorial;

import java.util.ArrayList;

public class ArrayListDefine {

	public static void main(String[] args) {
		//defining the array list
		//we can define array list like below 
		ArrayList<String> plant = new ArrayList<>();
		
		//adding the value to array list
		//add method which create the data with add method
		plant.add("flower");
		plant.add("Tree");
		plant.add("Vegetable");
		plant.add("grass");
		
		System.out.println(plant);//this will print all elements of array
		
		//retrive method which get the data with get method
		String w = plant.get(0);
		String x = plant.get(1);
		String y = plant.get(2);
		String z = plant.get(3);
		
		System.out.println(w+x+y+z);
		
		//loop through the array list for get method
		for (int i =0; i <plant.size();i++) {
			System.out.println(plant.get(i));
		}
		//upaditing the value form array list
		//update the value of array list with set method
		ArrayList<String> language = new ArrayList<>();
		language.add("nepali");
		language.add("Hindi");
		language.add("english");
		language.add("Spanish");
		
		System.out.println(language);
		
		String lan = language.set(1, "Newari");//this set method replace Hindi to Newari
		System.out.println(language);//this will print replaced elements
	
		
		//deleting the value from array list
		//delete the value from array list with remove method
		language.remove(2);//this will remove index 2
		language.remove(1);//this will remove index 1
		System.out.println(language);
	
	}

}
/*
 // Collection 
		
		ArrayList<String> language = new ArrayList<>();
		
		//   0      1         2          3
		// [java, python, javascript, selenium]
		
		language.add("java");
		language.add("python");
		language.add("javascript");
		language.add("selenium");
		System.out.println(language);
		
		// retrive 
		String a = language.get(0);
		String b = language.get(1);
		String c = language.get(2);
		String d = language.get(3);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		
		for(int i = 0 ; i < language.size() ; i++) {
			//System.out.println(i);
			System.out.println(language.get(i));
		}
		
		// Update the value of arrayList
		
		ArrayList<String> animals = new ArrayList<>();
		animals.add("Dog");
		animals.add("Tiger");
		animals.add("Lion");
		animals.add("Rabbit");
		System.out.println(animals);
		
		animals.set(2, "Cat");
		System.out.println(animals);
		
		animals.remove(1);
		System.out.println(animals);
		
		// Defining  the arrayList 
		// Adding the value to arrayList 
		// Updating the value from arrayList
		// Deleting the value from arrayList
		
		
		// ArrayList ------> int 
		// ArrayList ------> string 
		// ArrayList ------> boolean 
		// ArrayLIst ------> person
		 
 */
