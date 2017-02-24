
public class EvenFibonacciNumbers {

	public static void main(String[] args) {
		int term1 = 1;
		int term2 = 2;
		int max = 4000000;
		int sum = 0;
		
		System.out.println("Term 1 is: " + term1 + " Term 2 is: " + term2);
		
		while (term1 < max && term2 < max) {
			if (term1 % 2 == 0)
				sum += term1;
			if (term2 % 2 == 0)
				sum += term2;
			
			System.out.println("Sum is: " + sum);
						
			term1 += term2;
			term2 += term1;
			
			System.out.println("Term 1 is: " + term1 + " Term 2 is: " + term2);
		}
		
		System.out.println("The sum of all the even fibonacci numbers from 1 to " + max + " is " + sum);
	}

}
