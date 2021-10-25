package exepctionsfiles;

import java.util.Scanner;

public class PaymentsApp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double payment = 0;
		boolean positivePayment = true;
		Scanner scanner;
		
		do {
			System.out.print("Enter the payment amount: ");
			scanner = new Scanner(System.in);
			
			try {
				payment = scanner.nextDouble();
				if(payment < 0) {
					throw new NegativePaymentException(payment);
				}
				else {
					positivePayment = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println(e.toString());
				System.out.println("Pleas try again");
				positivePayment = false;
			}
		}	while(!positivePayment);
		scanner.close();
		System.out.println("Thank you for your payment of: " + payment);

	}

}
