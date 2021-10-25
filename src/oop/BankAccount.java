package oop;

public class BankAccount implements IRate{

	String accountNumber;
	static final String routingNumber = "32132132";
	String name;
	String SSN;
	String accountType;
	
	BankAccount(){
		System.out.println("NEW ACCOUNT HAS BEEN CREATED");
	}
	
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	@Override
	public int setRate(int rate) {
		return rate;
		
	}

	@Override
	public void increaseRate(int increasedRate) {
		System.out.println("INCREASED RATE:" + increasedRate);
		
	}
	
}
