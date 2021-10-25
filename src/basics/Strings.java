package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle = "LOTR";
		String wordChoice = "tr";
		if(bookTitle.toLowerCase().contains(wordChoice)) {
			System.out.println("IT IS THERE");
		}
		
		String browser = "Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "75842798";
		
		System.out.print(firstName.substring(0,1));
		System.out.print(lastName.substring(0,1));
		System.out.print(" " + SSN.substring(5));

	}

}
