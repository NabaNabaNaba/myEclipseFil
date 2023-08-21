package jaavaTutorial;

public class Revision2Array {

	public static void main(String[] args) {
		String [][] array = { {"ram","sam","tam"},{"car","tar","kar"},{"dan","fan","lan"}};
		System.out.println(array[1][2]);
		
		for (int i = 0; i<array.length;i++) {
			String []obj = array[i]; 
			for ( int j = 0; j<obj.length; j++) {
				System.out.println("print for loop : "+obj[j]);
			}
			
		}
		int x = 0;
		while (x<array.length) {
			String []obj1 = array[x];
			int y = 0;
			while (y<obj1.length) {
				System.out.println("print while : "+obj1[y]);
				y++;
			}x++;
		}
		for (String []obj : array) {
			for (String obj1 : obj) {
				System.out.println("print for each : "+obj1 );
			}
		}

	}

}
