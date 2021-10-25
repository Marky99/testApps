package fiels;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Marky\\Desktop\\FileToWrite.txt";
		String msg = "I'm writing data that will be placed to a file";
		
		File file = new File(fileName);
		try {
			FileWriter fw = new FileWriter(file);
			fw.write(msg);
			fw.close();
		} catch (IOException e) {
			System.out.println("Error: Could not read file: " + fileName);
			e.printStackTrace();
		} finally {
			System.out.println("Closing the fileWriter");
		}

	}

}
