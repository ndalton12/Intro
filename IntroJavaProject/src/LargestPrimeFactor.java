
public class LargestPrimeFactor {

	public static void main(String[] args) {
		
		double num = 600851475143.0;
		double largestPrimeFactor = 0;
		int j;
		Boolean isPrime = false;
		
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				//System.out.println("Factor is: " + i);
				num /= i;
				for (j = 2; j <= i - 1; ++j) {
					if (i % j == 0)
						isPrime = false;
					else 
						isPrime = true;
				}
				
				if (isPrime) {
					//System.out.println("Entered here");
					largestPrimeFactor = i;
				}
			}
		}
		
		System.out.println(largestPrimeFactor);
		
	}

}
