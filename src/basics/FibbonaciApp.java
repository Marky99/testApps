package basics;

public class FibbonaciApp {

	public static void main(String[] args) {
		
		int n = 0;
		int count = 0;
		int afterCount = 0;
		int init = 1;
		
		int[] numbers = {129,3,223,12,-32};
		System.out.println(count);
		System.out.println(init);
		while(n <= 9)
		{
			afterCount = count + init;
			count = init;
			init = afterCount;
			n++;
			System.out.println(afterCount);
		}
		System.out.println("-------------------------");
		
		System.out.println(fib(12));
		
		System.out.println("-------------------------");
		
		System.out.println(fac(5));
		
		System.out.println("-------------------------");
		
		System.out.println(sum(10));
		
		System.out.println("-------------------------");
		
		sumFor(10);
		
		System.out.println("-------------------------");
		
		System.out.println(min(numbers));
		
		System.out.println("-------------------------");
		
		System.out.println(max(numbers));
		
		System.out.println("-------------------------");
		
		System.out.println(avg(numbers));

	}
	public static long fib(long n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return (fib(n-1) + fib(n-2));
	}
	
	public static long fac(long n) {
		if(n==0)
			return 1;
		return n * fac(n-1);
	}
	
	public static int sum(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return n + sum(n-1);
	}
	
	public static void sumFor(int n) {
		int count = 0;
		for(int i = n; i > 0; i--) {
			count+=i;
		}
		System.out.println(count);
	}
	
	//{1,5,3,7,8,9,0};
	
	public static int min(int[] n) {
		int number = n[0];
		for(int i = 0; i < n.length; i++) {
			if(number > n[i])
				number = n[i];
		}
		return number;
	}
	
	public static int max(int[] n) {
		int number = n[0];
		for(int i = 0; i < n.length; i++) {
			if(number < n[i])
				number = n[i];
		}
		return number;
	}
	
	public static int avg(int[] n) {
		int count = 0;
		for(int i = 0; i < n.length; i++) {
			count+=n[i];
		}
		return count/n.length;
	}

}
