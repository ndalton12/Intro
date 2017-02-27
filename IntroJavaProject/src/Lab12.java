import java.awt.*;
import java.applet.*;

public class Lab12 extends Applet {
	public void paint(Graphics g) {
		drawSquare1(g,1024,768);
	}
	
	public void drawSquare1(Graphics g, int maxX, int maxY) {
		int midX = maxX/2;
		int midY = maxY/2;
		int startWidth = maxX/4;
		int startHeight = maxY/4;
		int tlX = midX - (startWidth/2);
		int tlY = midY - (startHeight/2);
		g.fillRect(tlX, tlY, startWidth, startHeight);
		g.fillRect(tlX-(startWidth/2), tlY-(startHeight/2), startWidth/2, startHeight/2);
		g.fillRect(tlX+startWidth, tlY-(startHeight/2), startWidth/2, startHeight/2);
		g.fillRect(tlX-(startWidth/2), tlY+startHeight, startWidth/2, startHeight/2);
		g.fillRect(tlX+startWidth, tlY+startHeight, startWidth/2, startHeight/2);
		
		drawSquare2(g, tlX, tlY, startWidth, startHeight);
		
	}
	
	public void drawSquare2(Graphics g, int tlX, int tlY, int width, int height) {
		if (height >= 1) {
			g.fillRect(tlX, tlY, width, height);
			drawSquare2(g, tlX-(width/2), tlY-(height/2), width/2, height/2);
			drawSquare2(g, tlX+width, tlY-(height/2), width/2, height/2);
			drawSquare2(g, tlX-(width/2), tlY+height, width/2, height/2);
			drawSquare2(g, tlX+width, tlY+height, width/2, height/2);
		}
	}
	
	public void delay(long n) {
		n *= 1000;
		long startDelay = System.nanoTime();
		long endDelay = 0;
		while (endDelay - startDelay < n)
			endDelay = System.nanoTime();
	}
} 