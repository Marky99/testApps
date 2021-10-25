package fiels;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Marky\\Desktop\\howtoguthub.txt";
		String text = null;
		
		File file = new File(fileName);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			text = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error file not found: " + fileName);
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error could not read the data: " + fileName);
			e.printStackTrace();
		} finally {
			System.out.println("Finished reading the file");
		}
		
		System.out.println(text);
		

	}

}
