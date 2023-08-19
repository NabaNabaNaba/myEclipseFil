package jaavaTutorial;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterate2 {

	public static void main(String[] args) {
		
		
		Map<String, String> course = new HashMap<String, String>();
		course.put("course", "javascript");
		course.put("courseTwo", "html");
		course.put("courseThree", "css");
		course.put("courseFour", "python");
		course.put("courseFive", "selenium");
		System.out.println(course);

		for (Map.Entry<String, String> entry : course.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
		
		

		
		Map<String, String> students = new HashMap<String, String>();
		students.put("firstName", "Ramesh");
		students.put("lastName", "Roy");
		students.put("rollNo", "12");
		students.put("age", "33");
		students.put("skills", "Talking");
		
		for(String StdDetail:students.keySet()) {
			System.out.println(StdDetail);
		}
		
		for(String StdDetail:students.values()) {
			System.out.println(StdDetail);
		}
		
		
		Map<String, String> vehicle = new HashMap<String, String>();
		vehicle.put("color","red");
		vehicle.put("type","SUV");
		vehicle.put("company","tata");
		System.out.println(vehicle);
		
		System.out.println(vehicle.get("color"));
		for(String key :vehicle.keySet()) {
			System.out.println(key);
			System.out.println(vehicle.get(key));
		}
		

	}

}
