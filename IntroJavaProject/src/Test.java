import java.awt.*;
import java.applet.*;

public class Test extends Applet {

	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		resize(1100, 1000);
		drawSquares(g, 0, 100, 200);
		drawBottomSquares(g, 750, 500, 200);

	}

	public void drawSquares(Graphics g, int x, int y, int size) {

		if (size >= 4 || x < 1000) {
			g.setColor(Color.red);
			g.fillRect(x, y, size, size);
			x += size + 10;
			y += .9 + (size*.25);
			size *= .75;
			drawSquares(g, x, y, size);
		}
	}

	public void drawBottomSquares(Graphics g, int x, int y, int size) {

		if (size >= 4 || x > 0) {
			g.setColor(Color.cyan);
			g.fillRect(x, y, size, size);
			System.out.println(x);
			x -= 10 + (size * 0.75);
			size *= (0.75);
			drawBottomSquares(g, x, y, size);
		}
	}
}