package exepctionsfiles;

public class NegativePaymentException extends Exception{
	
	private static final long serialVersionUID = 1L;

	double payment;
	
	public NegativePaymentException(double payment) {
		System.out.println("ERROR: Negative payment");
		this.payment = payment;
	}
	
	@Override
	public String toString() {
		return "Error: Cannot take negative payment " + payment;
	}

}
