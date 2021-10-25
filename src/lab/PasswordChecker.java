package lab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordChecker {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Marky\\Desktop\\Passwords.txt";
		File file = new File(fileName);
		String[] passwords = new String[10];
		String numbers = "0123456789";
		String alphabet = "qwertyuiopasdfghjklzxcvbnm";
		String specialChar = "!@#$%^&*()_+";
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(int  i = 0; i < passwords.length; i++) {
				passwords[i] = br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist");
		} catch (IOException e) {
			System.out.println("Could not read a file");
		}
		
		for(String password:passwords) {
			Boolean hasNumber = false;
			Boolean hasLetter = false;
			Boolean hasSpecialChar = false;
			System.out.println(password);
			for(int i = 0; i < password.length(); i++) {
				if(numbers.contains(password.substring(i,i+1))) {
					hasNumber = true;
					//System.out.println("password contains number at " + (i+1) + " position");
				}
				else if(alphabet.contains(password.toLowerCase().substring(i,i+1))) {
					hasLetter = true;
					//System.out.println("password contains letter at " + (i+1) + " position");
				}
				else if(specialChar.contains(password.substring(i,i+1))) {
					hasSpecialChar = true;
					//System.out.println("password contains special character at " + (i+1) + " position");
				}
				else {
					try {
						throw new InvalidCharacterException(passwords[i]);
					} catch(InvalidCharacterException e) {
						System.out.println("Password contains Invalid character");
						e.toString();
					}
				}
				
			}
			try {
				if(!hasNumber) {
					throw new NumbersException(password);
				}
				if(!hasLetter) {
					throw new LettersException(password);
				}
				if(!hasSpecialChar) {
					throw new SpecialsCharacterException(password);
				}
			} catch(NumbersException e) {
				System.out.println("Password does not have number");
				e.toString();
			} catch(LettersException e) {
				System.out.println("Password does not have letter");
				e.toString();
			} catch(SpecialsCharacterException e) {
				System.out.println("Password does not have special character");
				e.toString();
			}
			

		}
		

	}

}

class NumbersException extends Exception{

	private static final long serialVersionUID = 1L;
	String password = null;
	NumbersException(String password){
		this.password = password;
	}
	@Override
	public String toString() {
		return "Does not contain number " + password;
	}
}

class LettersException extends Exception{

	private static final long serialVersionUID = 1L;
	String password = null;
	LettersException(String password){
		this.password = password;
	}
	@Override
	public String toString() {
		return "Does not contain letter " + password;
	}
}

class SpecialsCharacterException extends Exception{

	private static final long serialVersionUID = 1L;
	String password = null;
	SpecialsCharacterException(String password){
		this.password = password;
	}
	@Override
	public String toString() {
		return "Does not contain SpecialCharacter " + password;
	}
}

class InvalidCharacterException extends Exception{

	private static final long serialVersionUID = 1L;
	String password = null;
	InvalidCharacterException(String password){
		this.password = password;
	}
	@Override
	public String toString() {
		return "Invalid character included " + password;
	}
}
