package WhackAMole;

import java.awt.Color;
import java.awt.Graphics2D;

import GUIPractice.components.Component;

public class Player extends Component implements playerInterface{
	private int score;
	
	public Player(int x, int y)
	{
		super(x,y,100,100);
		int score = 0;
	}

	@Override
	public void increaseScore(int i) 
	{
		score += i;
		update();
	}

	@Override
	public void update(Graphics2D g) 
	{
		g.setColor(Color.white);
		g.fillRect(0,0,getWidth(),getHeight());
		g.setColor(Color.black);
		g.drawOval(0, 0, 100,100);
		g.drawString(""+score,45,55);
	}
	
	public boolean isAnimated()
	{
		return true;
	}
}
