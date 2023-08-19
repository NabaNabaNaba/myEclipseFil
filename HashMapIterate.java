package jaavaTutorial;

import java.util.HashMap;

public class HashMapIterate {

	public static void main(String[] args) {
		
		// Creating a HashMap
        HashMap<String, String> foodTable
            = new HashMap<String, String>();
 
        // Inserting elements to the adobe HashMap
        // Elements- Key value pairs using put() method
        foodTable.put("M", "MoMo");
        foodTable.put("R", "Rice");
        foodTable.put("C", "Curry");
        foodTable.put("S", "Salad");
 
        // Iterating HashMap through for loop
        for (HashMap.Entry<String, String> dinner :
             foodTable.entrySet()) {
 
            // Printing all elements of a Map
            System.out.println(dinner.getKey() + " = " + dinner.getValue());
        }
       
       
	}

}
