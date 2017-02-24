

import java.util.Scanner;

public class Test6 {
	
	static int MAX = 0;

	public static void main(String[] args) {
		System.out.println("\n     Sieve of Eratosthenes\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the primes upper bound  ===>>  ");
		MAX = input.nextInt();
		boolean primes[] = new boolean[MAX + 1];
		computePrimes(primes);
		displayPrimes(primes);
		input.close();
	}

	public static void computePrimes(boolean primes[]) {

		for (int i = 2; i <= MAX; i++) 
			primes[i] = true;
		

		for (int a = 2; a * a <= MAX; a++) {
			if (primes[a]) 
				for (int j = a; a * j <= MAX; j++) {
					primes[a * j] = false;
				}
		}
			
		
		
	}

	public static void displayPrimes(boolean primes[]) {
		for (int i = 2; i <= MAX; i++) 
			if (primes[i] == true)
				System.out.println(i);
		
	}

}
