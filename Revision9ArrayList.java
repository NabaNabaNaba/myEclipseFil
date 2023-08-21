package jaavaTutorial;

import java.util.ArrayList;
import java.util.List;

public class Revision9ArrayList {

	public static void main(String[] args) {
		
		ArrayList <String> Alist = new ArrayList<>();
		Alist.add("ram");
		Alist.add("sam");
		Alist.add("dan");
		Alist.add("han");
		System.out.println(Alist);
		
		
		Alist.get(0);
		Alist.get(1);
		Alist.get(2);
		Alist.get(3);
		
		for (int i = 0; i<Alist.size();i++) {
			System.out.println(Alist.get(i));
		}
		
	}

}
