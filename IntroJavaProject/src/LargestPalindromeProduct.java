
public class LargestPalindromeProduct {

	public static void main(String[] args) {
		int factor1 = 0;
		int factor2 = 0;
		int min = 111;
		int max = 999;
		int product;
		int productMax = 0;
		String s;
		String s2;
		
		for (int i = min; i <= max; ++i) {
			for (int j = min; j <= max; ++ j) {
				product = i * j;
				
				s = Integer.toString(product);
				s2 = new StringBuilder(s).reverse().toString();
				
				//System.out.println("S is " + s + " S2 is " + s2);
				
				if (s.equals(s2) && product > productMax) {
					//System.out.println("Entered here");
					productMax = product;
					factor1 = i;
					factor2 = j;
				}

			}
		}
		
		System.out.println("Factor 1 is: " + factor1 + " Factor 2 is: " + factor2 + " Product is: " + productMax);
		
		
	}

}
