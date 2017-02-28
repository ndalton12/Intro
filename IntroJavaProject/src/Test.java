import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		count(10,20);
		
	}
	
	public static void count(int a, int b) {
		if (a <= b) {
			count(a+1,b);
			System.out.println(a+"");
		}
	}

}

