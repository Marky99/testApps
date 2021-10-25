package basics;

public class Cities {

	public static void main(String[] args) {
		
		//--------------------------------
		
		String[] cities = {"Nevada", "New York", "San Francisco", "Miami"};
		
		//--------------------------------
		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Texas";
		states[2] = "Ohio";
		states[3] = "Utah";
		states[4] = "New Jersey";
		
		//---------------------------------
		
		String[] countries;
		
		countries = new String[2];
		countries[0] = "USA";
		countries[1] = "Canada";
		
		int j = 0;
		do {
			System.out.println(states[j]);
			j++;
		} while(j < 5);
		
		System.out.println("------------------");
		
		int n = 0;
		while(n < 2) {
			System.out.println(countries[n]);
			n++;
		}
		
		System.out.println("------------------");
		
		for(int i = 0; i < cities.length; i++) {
			 System.out.println(cities[i]);
		}

	}

}
