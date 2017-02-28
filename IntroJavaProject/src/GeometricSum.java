
public class GeometricSum {
	public static void main(String[] args) {
		System.out.println(geometricSum(0));
	}
	
	public static double geometricSum(int k) {
		double sum = 1/Math.pow(2, k);
		
		if (k == 0)
			return 1.0;
		else
			return (sum+geometricSum(k-1));
		
	}
}
