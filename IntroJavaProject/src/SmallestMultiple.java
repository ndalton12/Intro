
public class SmallestMultiple {

	public static void main(String[] args) {
		
		int i = 2520;
		Boolean flag  = true;
		int c;
		
		while (flag) {
			++i;
			c = 0;
			
			for (int j = 1; j <= 20; ++j) {
				if (i % j == 0)
					c++;
			}
			
			if (c == 20)
				flag = false;
		}
		
		System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is " + i);
		
	}

}
