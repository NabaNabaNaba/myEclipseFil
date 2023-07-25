package jaavaTutorial;

public class examRapid {

	public static void main(String[] args) {

		// define multidimension array and loop through it
		int apple[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		for (int i = 0; i < apple.length; i++) {
			int fruit[] = apple[i];
			for (int j = 0; j < fruit.length; j++) {
				System.out.println(fruit[j]);

			}

		}
		System.out.println("sdfdsfsdfsdlkfkfdfsdfdfd");
		int j = 0;
		while (j < apple.length) {
			int fruit2[] = apple[j];
			int k = 0;
			while (k < fruit2.length) {
				System.out.println(fruit2[k]);
				k++;

			}
			j++;
		}

		for (int[] fruit3 : apple) {
			for (int fruit4 : fruit3) {
				System.out.println(fruit4);
			}
		}

	}
}