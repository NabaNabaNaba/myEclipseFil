package jaavaTutorial;

import java.io.FileWriter;
import java.io.IOException;

public class FileException {

	public static void main(String[] args) {
		
		try {
			FileWriter fwrite = new FileWriter("My file.txt", true);
			System.out.println(10/0);
			fwrite.write("Hello On my file.");
			fwrite.write("\n");
			fwrite.write("File handled");
			fwrite.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		
	}

}
