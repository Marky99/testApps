package lab;
import java.util.*;

public class StudentDatabase {

	public static void main(String[] args) {
		
		SDET acc1 = new SDET("Mark", "739461294");
		SDET acc2 = new SDET("Emma", "889461294");
		SDET acc3 = new SDET("Vicky", "139661294");
		SDET acc4 = new SDET("ASDA", "255461294");
		System.out.println(acc1.getEmail());
		System.out.println(acc1.getUserID());
		
		System.out.println(acc2.getEmail());
		System.out.println(acc2.getUserID());
		
		System.out.println(acc4.getEmail());
		System.out.println(acc4.getUserID());
		
		System.out.println(acc3.getEmail());
		System.out.println(acc3.getUserID());
		
		acc1.enroll("eng12");
		acc1.enroll("sku21");
		acc1.enroll("his12");
		
		acc1.showCourses();
		acc1.checkBalance();
		acc1.pay(600);
		acc1.checkBalance();
		System.out.println(acc1.toString());
		

	}

}

class SDET {
	
	private String name;
	private String SSN;
	private static int ID = 1000;
	private String email;
	private String userID;
	private String phone;
	private String city;
	private String state;
	private String courses ="";
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	public SDET(String name, String SSN) {
		ID++;
		this.SSN = SSN;
		this.name = name;
		this.email = name.toLowerCase() + "." + ID +"@testEmail.com";
		generateUserID();
	}
	
	private void generateUserID() {
		Random random = new Random();
		int rand = random.nextInt(8000) + 1000;
		userID = ID + "" + rand + "" + SSN.substring(5);
	}
	
	public void enroll(String course) {
		this.courses += ""+course+","+"\n";
		balance -= costOfCourse;
	}
	
	public void pay(int amount) {
		balance += amount;
		System.out.println("Payment: $" + amount);
	}
	
	public void checkBalance() {
		System.out.println("Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println(courses);
	}
	
	@Override 
	public String toString() {
		return "[NAME: " + name + "]\n[Courses: \n" + courses + "]\nBalance: " + balance + "]";
	}
	
	public String getUserID() {
		return userID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	
}
