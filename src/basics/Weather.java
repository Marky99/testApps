package basics;

public class Weather {

	public static void main(String[] args) {
		int temperature = 61;
		String sunCondition = "OverCast";
		
		if(temperature > 80) {
			System.out.println("Hot");
		}
		else if (temperature > 60 && sunCondition == "Sunny") {
			System.out.println("it's cooler");
		}
		else if (temperature > 50 || sunCondition == "OverCast") {
			System.out.println("HELL");
		}
		else {
			System.out.println("Cold");
		}

	}

}
