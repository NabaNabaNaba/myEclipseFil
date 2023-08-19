package jaavaTutorial;


import java.util.HashMap;


public class HashMapDefine {

	public static void main(String[] args) {
		
		//defining HashMap 
		HashMap<String,Integer> computer = new HashMap<>();
		//put method add the key value
		computer.put("dell", 10);
		computer.put("Mac", 15);
		computer.put("Sony", 20);
		computer.put("Acer", 25);
		
		System.out.println(computer);
		
		//accessing the value
		int a = computer.get("Mac");
		System.out.println(a);
		int b = computer.get("Acer");
		System.out.println(b);
		
		// check particular key exists 
		boolean c = computer.containsKey("Sony");
		System.out.println(c);
		boolean d = computer.containsKey("Sceptre");
		System.out.println(d);
		
		// total number of key value in HashMap() total element
		int e = computer.size();
		System.out.println(e);
		
		// remove the value 
		computer.remove("Sony");
		System.out.println(computer);
				
				
		// update the value
		computer.put("Android", 30);
		System.out.println(computer);
		
		//it prints values
		System.out.println(computer.values());
		
		//it prints keys
		System.out.println(computer.keySet());
		
		
		//for each loop for printing key
		for (String computer1 : computer.keySet()) 
            System.out.println(computer1);
		
		//for each loop for printing vlaues
		for (int  computer2 : computer.values())
		System.out.println(computer2);
		
		//if else to check element
		if (computer.containsKey("dell")){
			System.out.println("Key present");
		}
		else {
			System.out.println("Key not present.");
		}
		
		//checking value through if else condition
		if (computer.containsValue(30)) {
			System.out.println("Value present.");
		}
		else {
			System.out.println("Value not present.");
		}
		
            
	}
	

}
