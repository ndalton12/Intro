
public class SumSquareDifference {

	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSum = 0;
		
		for (int i = 1; i <= 100; ++i) {
			sumOfSquares += i * i;
			squareOfSum += i;
		}
		
		squareOfSum = squareOfSum * squareOfSum;
		
		System.out.println("Sum of squares is " + sumOfSquares + " Square of sum is " + squareOfSum);
		
		System.out.println("The difference between squares of sum and sum of squares is " + (squareOfSum - sumOfSquares));
		
	}

}
