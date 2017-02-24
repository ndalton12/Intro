import java.util.Random;

public class  Test2
{
	public static void main(String[]args)
	{
		int numChrom = 10;
		Random rand = new Random(System.currentTimeMillis());
		double[] fitness = {0.0322, 0.0435, 0.0455, 0.0526, 0.0666, 0.05, 0.05, 0.0714, 0.0833, 0.0476};
		double[] roulette = new double[2];
		double[] probability = new double[numChrom];
		double random;
		int chosenChrom = 0;
		double partialSum = 0;
		double totalFitness = 0;
		int zero = 0; int one = 0; int two = 0; int three = 0; int four = 0; int five = 0; int six = 0; int seven = 0; int eight = 0; int nine = 0; int ten = 0;
		
		for (int i = 0; i < numChrom; ++i) {
			totalFitness += fitness[i];
		}
		
		System.out.println("The total fitness is: " + totalFitness);
		
		for (int j = 0; j < numChrom; ++j) {
			probability[j] = (fitness[j] / totalFitness);
			System.out.println("The proportion of chromosome " + j + " is " + probability[j]);
		}
		
		for (int i = 0; i < 100000; ++i) {
			
			chosenChrom = 0;
			partialSum = 0;
			random = rand.nextDouble() * totalFitness;
			
			while (random > partialSum) {
				partialSum += fitness[chosenChrom];
				
				chosenChrom++;
			}
			
			chosenChrom--;
			
			switch (chosenChrom) {
				case 0:
					zero++;
				break;
				
				case 1:
					one++;
				break;
				
				case 2:
					two++;
				break;
				
				case 3:
					three++;
				break;
				
				case 4:
					four++;
				break;
				
				case 5:
					five++;
				break;
				
				case 6:
					six++;
				break;
				
				case 7:
					seven++;
				break;
				
				case 8:
					eight++;
				break;
				
				case 9:
					nine++;
				break;
				
				case 10:
					ten++;
				break;
			}
			
			//System.out.println("The chosen chrom is: " + chosenChrom);
		
		}
		
		System.out.println("");
		System.out.println("Zero was chosen: " + zero + " times");
		System.out.println("One was chosen: " + one + " times");
		System.out.println("Two was chosen: " + two + " times");
		System.out.println("Three was chosen: " + three + " times");
		System.out.println("Four was chosen: " + four + " times");
		System.out.println("Five was chosen: " + five + " times");
		System.out.println("Six was chosen: " + six + " times");
		System.out.println("Seven was chosen: " + seven + " times");
		System.out.println("Eight was chosen: " + eight + " times");
		System.out.println("Nine was chosen: " + nine + " times");
		System.out.println("Ten was chosen: " + ten + " times");
		
	}
	
}
