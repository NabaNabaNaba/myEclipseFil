package jaavaTutorial;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapRevise {

	public static void main(String[] args) {
		
		HashMap<String , Integer> fruits = new HashMap();
		
		//add       key and value
		fruits.put("apple", 5);
		fruits.put("mango", 10);
		fruits.put("banana", 15);
		fruits.put("orange", 20);
		System.out.println(fruits);
		
		//update
		fruits.put("banana", 45);
		
		fruits.put("mango", 35);
		
		System.out.println(fruits);
		
		//retrive 
		int a =fruits.get("apple");
		int b = fruits.get("banana");
		System.out.println(a+"  "+b);
		
		//remove
		fruits.remove("orange");
		System.out.println(fruits);
		
		//check size
		 int x = fruits.size();
		 System.out.println(x);
		 
		 //duplicate (HashMap doesn't allowed duplicate instead of that it will update)
		 fruits.put("banana", 47);
		 System.out.println(fruits);
		
		 HashMap<String, String> student = new HashMap();
		 student.put("ramesh", "BK");
		 student.put("prakash", "BC");
		 student.put("amit", "GC");
		 student.put("bikash", "KC");
		 System.out.println(student);
		 
		 //contains method --boolean
		 //if else condition
		 if (student.containsKey("ramesh")) {
			 System.out.println("student name ramesh is avaible.");
		 }
		 else {
			 System.out.println("student name is not available.");
		 }
		 if (student.containsValue("MN")) {
			 System.out.println("Student surname is available.");
		 }
		 else {
			 System.out.println("Student surname is not available.");
		 }
		 
		 //for loop
		 for (String Key : student.keySet()) {
			 System.out.println(Key); //keyset print all the keys
		 }
		 for (String value : student.values()) {
			 System.out.println(value);  // value print all the values
		 }
		 
		 //Iterator ??
		 }
		 
		 
	}


/*

  HashMap<String , Integer> hashMapone = new HashMap<>(); 
  System.out.println(hashMapone); 
   
  // add 
  //               key - value 
  hashMapone.put("one", 1); 
  hashMapone.put("two", 2); 
  hashMapone.put("three", 3); 
  System.out.println(hashMapone); 
   
  // update  
  hashMapone.put("three",77); 
  System.out.println(hashMapone); 
   
  // getting the value (retrive ) 
  int a = hashMapone.get("one"); 
  System.out.println(a); 
   
  hashMapone.remove("one"); 
  System.out.println(hashMapone); 
   
  // Allow duplicate keys ?? 
  
  hashMapone.put("three", 4); 
  System.out.println(hashMapone); 
   
  // how many key-values are there  
   
  System.out.println(hashMapone.size()); 
   
  HashMap<String , String> hashMapTwo = new HashMap<>(); 
   
  hashMapTwo.put("MH", "pune"); 
  hashMapTwo.put("RJ", "jaipur"); 
  hashMapTwo.put("UP", "lucknow"); 
  hashMapTwo.put("RJ", "udaipur"); 
  // To check whether a key exist or not ?? 
   
  if(hashMapTwo.containsKey("MH")) { 
   System.out.println(hashMapTwo.get("MH")); 
  } 
   
  if(hashMapTwo.containsValue("pune")) { 
   System.out.println("value available ..."); 
  } 
   
  // containskey() and containsvalue -- return boolea values  
   
  for(String key:hashMapTwo.keySet()) { 
    System.out.println(key); 
    System.out.println(hashMapTwo.get(key)); 
  } 
   
  System.out.println(hashMapTwo.keySet()); 
  System.out.println(hashMapTwo.values()); 
   
  for(Map.Entry<String, String>entry:hashMapTwo.entrySet()) { 
   System.out.println(entry.getKey()+" "+entry.getValue()); 
  } 
   
   
  HashMap<String , String> hashMapThree = new HashMap<>(); 
  hashMapThree.put("chinmay","deshpande"); 
  hashMapThree.put("poorva","vyas"); 
  hashMapThree.put("mayuri","rao"); 
  hashMapThree.put("mayuri","katwe"); 
  hashMapThree.put("komal","lende"); 
  System.out.println(hashMapThree); 
   
  Iterator<Map.Entry<String, String>> abc = 
    hashMapThree.entrySet().iterator(); 
   
  while(abc.hasNext()) { 
   Map.Entry<String, String> entry = abc.next(); 
   System.out.println(entry.getKey()); 
   System.out.println(entry.getValue()); 
  } 
*/