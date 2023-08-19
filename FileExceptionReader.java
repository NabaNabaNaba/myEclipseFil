package jaavaTutorial;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExceptionReader {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("MyFile.txt");
			BufferedReader Breader = new BufferedReader(reader);//this obj help to read and while loop help to read all line from file
			
			//storing in new veriable
			String line =  Breader.readLine();
			while (line != null) {
				System.out.println(line);
				line = Breader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
