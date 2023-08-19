package jaavaTutorial;

import java.io.FileWriter;
import java.io.IOException;

public class FileExceptionWriter {

	public static void main(String[] args) {
		
		String fileName = "MyFile.txt";
		try {
			FileWriter write = new FileWriter(fileName);//first create obj FileWriter and add try catch block
			write.write("hey buddy!");
			write.write("\n");
			write.write("how are you doing?");
			write.write("\n");
			write.write("I am good so far.");
			write.write("\n");
			write.write("great to hear this.");
			write.write("\n");
			write.write("file got created.");
			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
