package basics;

public class SalaryCalculator {

	public static void main(String[] args) throws InterruptedException {
		String career;
		System.out.println("Program is starting");
		career = "Software engineer";
		Thread.sleep(2000);
		System.out.println("My carrer is: " + career);
		
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.5;
		
		Thread.sleep(1000);
		System.out.println("Calculating");
		Thread.sleep(500);
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My salary as a " + career + "at the rate of $ " + rate +
				" is $" + salary + " per year.");

	}

}
