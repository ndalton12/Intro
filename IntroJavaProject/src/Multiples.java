
public class Multiples {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int max = 1000;
		int total;

		for (int i = 0; i < max; i = i + 3) {
			if (!(i % 5 == 0))
				sum1 += i;
			System.out.println("Sum 1 is: " + sum1 + ". Multiple is " + i);
		}

		System.out.println("");

		for (int i = 0; i < max; i = i + 5) {
			sum2 += i;
			System.out.println("Sum 2 is: " + sum2 + ". Multiple is " + i);
		}

		total = sum1 + sum2;

		System.out.println("Sum 1 is: " + sum1);
		System.out.println("Sum 2 is: " + sum2);

		System.out.println("The sum of all the multiples of 3 and 5 below 1000 is " + total);

	}

}
