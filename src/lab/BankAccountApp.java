package lab;


public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("637834472", 1000);
		new BankAccount("548392012", 2000);
		new BankAccount("123748290", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest{
	
	private static int iD = 1000;				  // Internal ID
	private String accountNumber; // iD _ 2-digit number + 2 of SSN
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance = 0;
	
	public BankAccount(String SSN, double initDeposit) {
		balance += initDeposit;
		System.out.println("New Account Created");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0,2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		stateOfMoney();
		balance -= amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		stateOfMoney();
		balance += amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Current Balance: " + balance);
	}
	
	public void stateOfMoney() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance *= (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Account Number: " + accountNumber 
				+ "]\n[Routing Number: " + routingNumber + "]\n[Balance: " 
				+ balance + "]"  ;
	}
	
	
}
