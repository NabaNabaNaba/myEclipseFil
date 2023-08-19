package jaavaTutorial;

import java.util.ArrayList;

public class ArrayListWithMethods {

	public static void main(String[] args) {
	

				//defining array list
				ArrayList<String> stationary = new ArrayList<>();
				
				//add method array list
				stationary.add("Book");
				stationary.add("ExerciseBook");
				stationary.add("Pen");
				stationary.add("Pencill");
				stationary.add("Paper");
				
				
				System.out.println(stationary);
				
				//add position method to add new element in defined index line
				stationary.add(2, "ZipBag");//will be added ZipBag element in third position
				
				System.out.println(stationary);//added ZipBag
				
				//remove methods
				stationary.remove(2);//it removes 3rd index from the element
				System.out.println(stationary);//removes 2nd index from the element
				
				stationary.remove("Book");//it removes book from element
				System.out.println(stationary);
				
				//set method replace the index with new element
				stationary.set(1, "Novel");//element 1 Pen replaced by Novel
				System.out.println(stationary);
				
				//get method will call element by index
				String getMethod = stationary.get(2);//storing in string 
				System.out.println(getMethod);
				
				//contains method will check elements with proper case and return true or false
				boolean contaisMethod =stationary.contains("novel");//storing in boolean
				System.out.println(contaisMethod);
				boolean contaisMethod1 =stationary.contains("Novel");//storing in boolean
				System.out.println(contaisMethod1);
				
				//indexOf method return element index number
				int num =stationary.indexOf("Pencill");//storing in int
				System.out.println(num);
				
				//clear method
				stationary.clear();//it removes all element but keeps memory
				System.out.println(stationary);
				
				//defining arraylist and add method
				ArrayList<String> cities = new ArrayList<>();
				 cities.add("Kathmandu");
				 cities.add("Banepa");
				 cities.add("Charikot");
				 cities.add("Pokhara");
				 cities.add("Ilam");
				 
				 System.out.println(cities.size());
				 System.out.println(cities);
				 
				 
				 System.out.println(cities.indexOf("Banepa"));
				 System.out.println(cities.lastIndexOf("Banepa"));
	}

}
