import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Print the 8 digits of your credit card: ");

		int cardNum = input.nextInt();
		String stringNum = Integer.toString(cardNum);

		System.out.println("Your card number is " + stringNum);

		int val1 = 0;
		int val2 = 0;
		int val3 = 0;
		int val4 = 0;

		for (int num = 1; num < stringNum.length(); num = num + 2) {

			char c = stringNum.charAt(num);

			int val = Character.getNumericValue(c);
			val1 = val + val1;
		}

		for (int num = 0; num < stringNum.length(); num = num + 2) {

			char c = stringNum.charAt(num);

			int val = Character.getNumericValue(c);

			val2 = (val * 2);

			String valNum = Integer.toString(val2);

			for (int i = 0; i < valNum.length(); i++) {
				val3 = 0;
				char b = valNum.charAt(i);
				val3 = Character.getNumericValue(b);
				val4 = val3 + val4;
			}

		}
		
		int total = val1 + val4;
		
		System.out.println("Total equals: " + total);

		if (total % 10 == 0) {
			System.out.println("You're credit card is valid!");
		} else if (total % 10 >= 5) {
			System.out.println("You're credit card is not valid.");
			int mod1 = total % 10;
			System.out.println("The number you should subtract to make your card valid is: " + mod1);

		} else if (total % 10 <= 4) {
			int mod2 = total % 10;
			System.out.println("The number you should subtract to make your card valid is: " + mod2);
		}
	}
}
