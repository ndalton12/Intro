import java.awt.*;
import java.applet.*;

public class Lab11 extends Applet {
	public void paint(Graphics g) {
		int x = 0;
		int y = 100;
		int x2 = 750;
		int y2 = 400;
		int size = 200;
		drawSquare(x,y,g, size);
		drawSquare2(x2,y2,g,size);
	}
	
	private void drawSquare(int x, int y, Graphics g, int size) {
		g.setColor(Color.black);
		g.fillRect(x,y,size,size);
		int temp = size;
		size *= 0.75;
		if (size > 2) {
			drawSquare(x+temp+10, y+temp-size, g, size);
		}
		System.out.println(size);
	}
	
	private void drawSquare2(int x2, int y2, Graphics g, int size) {
		g.setColor(Color.red);
		g.fillRect(x2,y2,size,size);
		System.out.println(x2);
		size *= 0.75;
		if (size > 2) {
			drawSquare2(x2-size-10, y2, g, size);
		}
			
	}
} 