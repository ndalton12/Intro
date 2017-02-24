import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Color;

public class Pacman extends Applet
{
	public void paint(Graphics g)
	{
		// draw maze
		g.setColor(Color.black);
		g.fillRect(0,0,800,600);
		g.setColor(Color.cyan);
		g.fillRect(0,80,800,20);
		g.fillRect(0,500,800,20);
		
		// draw 3 snacks
		g.setColor(Color.white);
		g.fillOval(450, 260, 80, 80);
		g.fillOval(550, 260, 80, 80);
		g.fillOval(650, 260, 80, 80);

		// draw PAC-MAN
	
		g.setColor(Color.yellow);
		g.fillArc(250, 150, 300, 300, 45, 270);
	
	}
}
