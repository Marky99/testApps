package lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberChecker {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Marky\\Desktop\\PhoneNumber.txt";
		File file = new File(fileName);
		String[] numbers = new String[8];
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int i = 0; i < numbers.length; i++)
				numbers[i] = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exits");
		} catch (IOException e) {
			System.out.println("Could not read the file");
		}
		for(int i = 0; i < numbers.length; i++) {
			try {
				if(numbers[i].length() != 10) {
					throw new TenDigitException(numbers[i]);
				}
				if(numbers[i].substring(0,1).equals("0") || 
						numbers[i].substring(0,1).equals("9")) {
					throw new AreaCheckException(numbers[i]);
				}
				for(int j = 0; j < numbers[i].length()-2; j++) {
					if(numbers[i].substring(j,j+1).equals("9"))
						if(numbers[i].substring(j+1,j+2).equals("1") && 
								numbers[i].substring(j+2,j+3).equals("1")) {
							throw new InvalidSequence(numbers[i]);
						}
				}
				System.out.println(numbers[i]);
			} catch(TenDigitException e) {
				System.out.println("ERROR: Not enough digits");
				System.out.println(e.toString());
			} catch(AreaCheckException e) {
				System.out.println("ERROR: Area digits has been detected");
				System.out.println(e.toString());
			} catch (InvalidSequence e) {
				System.out.println("ERROR: Number contains invalid sequence of numbers: 911");
				System.out.println(e.toString());
			}
		}
		
		
		

	}

}

class TenDigitException extends Exception {

	private static final long serialVersionUID = 1L;
	String num = null;
	public TenDigitException(String num){
		this.num = num;
	}
	@Override
	public String toString() {
		return "Number does not have 10-digits: " + num;
	}
}
class AreaCheckException extends Exception {
	
	private static final long serialVersionUID = 1L;
	String num = null;
	public AreaCheckException(String num){
		this.num = num;
	}
	@Override
	public String toString() {
		return "Number does include area invalid numbers: " + num;
	}
}
class InvalidSequence extends Exception {
	
	private static final long serialVersionUID = 1L;
	String num = null;
	public InvalidSequence(String num){
		this.num = num;
	}
	@Override
	public String toString() {
		return "Number contains invalid sequence: " + num;
	}
}
