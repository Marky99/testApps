package exepctionsfiles;

public class Demo {

	public static void main(String[] args) {
		System.out.println("Starts");
		doMath(12,0);
		System.out.println("Continues");
	}
	
	public static void doMath(int a, int b) {
		answer(a,b);
	}
	
	public static double answer(int x, int y) {
		return x/y;
	}

}
