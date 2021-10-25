package basics;

public class NumbersCalc {

	public static void main(String[] args) {
		printName();
		int numA = 10;
		int numB = 20;
		System.out.println("Sum of numbers " + numA + " and " + numB + " is " + addNumbers(numA, numB));
		System.out.println(multiplyNumbers(numA,numB));
	}
	
	static void printName() {
		System.out.println("My name is Marek");
	}
	
	static int addNumbers(int numA, int numB) {
		return numA+numB;
	}
	
	static double multiplyNumbers(int valueA, int valueB) {
		double product = valueA*valueB;
		return product;
	}
	
}
