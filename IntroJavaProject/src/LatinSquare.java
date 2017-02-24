public class LatinSquare
{
	static int n = 4; // n x n latin square
	public static void main(String args[])
	{
         int[][] square = new int[n][n];
         createLatin(square);
         displayLatin(square);
	}

     // Creates a Latin Square
     public static void createLatin(int[][] square)
	{
    	 int count;
    	 int temp;
    	 
    	 for (int r = 0; r < n; r++) {
    		 count = r;
    		 for (int c = 0; c < n; c++) {
    			 temp = count + c + 1;
    			 if (temp <= n)
    				 square[r][c] = temp;
    			 else
    				 square[r][c] = temp - n;
    			 
    		 }
    	 }

	}

     // Displays/Prints a Latin Square to the console
     public static void displayLatin(int[][] square)
	{

    	 for (int r = 0; r < n; r++) {
    		 for (int c = 0; c < n; c++) {
    			 System.out.print(" " + square[r][c]);
    		 }
    		 System.out.println();
    	 }

     }
}
