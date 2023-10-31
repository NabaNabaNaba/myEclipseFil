package jaavaTutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main (String[]Args) {
		
		//Program =1 : stream.filter method to filter arrays
	
		//defining and storing from array list 
		List<String> student = Arrays.asList("David","Alexender","Rosa","Mat","Navina","Alex","Kim");
		//storing from filtered list
		List<String> filterStudent = student.stream().filter(st->st.length()>4).collect(Collectors.toList());
		//printing filtered list
		System.out.println(filterStudent);
		
		//Program =2 : stream.filter method to filter arrays
		
		//defining and storing from array list 
		List<Integer> numbers = Arrays.asList(23,45,43,64,26,-23,-86,-35,34,86,-32);
		//filtering negative numbers from list
		List<Integer>num = numbers.stream().filter(nm->nm<0).collect(Collectors.toList());
		System.out.println(num);
		//filtering positive numbers from list
		List<Integer>num2 = numbers.stream().filter(nm->nm>0).collect(Collectors.toList());
		System.out.println(num2);
		
		//Program =3 : stream.map method to filter arrays//this method used for(+,-,*,/)
		
		//Subtraction
		List<Integer> birthYear = Arrays.asList(1992,1974,1998,2002,2003);
		List<Integer>age = birthYear.stream().map(x->2023-x).collect(Collectors.toList());
		System.out.println(age);
		//Addition
		List<Integer> madeYear = Arrays.asList(1992,1974,1998,2002,2003);
		List<Integer>my = birthYear.stream().map(y->y+10).collect(Collectors.toList());
		System.out.println(my);
		
		//Multiplication
		List<Integer> tables = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	    List<Integer> twoTable = tables.stream().map(z -> z * 2).collect(Collectors.toList());
	    System.out.println(twoTable);
		
		//Program =4 : stream.reduce method to add all  arrays in total
		// add total arrays
	    List<Integer> addNum = Arrays.asList(1,2,3,4,5);
		int sum = addNum.stream().reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
		
	}
}
