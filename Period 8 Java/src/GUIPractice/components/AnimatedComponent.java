package GUIPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class AnimatedComponent extends MovingComponent
{
	private ArrayList<BufferedImage> frame;
	private ArrayList<Integer>times;
	private long displayTime;
	private int currentFrame;
	private boolean repeat;
	public AnimatedComponent(int x, int y, int w, int h) 
	{
		super(x,y,w,h);
		frame = new ArrayList<BufferedImage>();
		times = new ArrayList<Integer>();
		currentFrame = 0;
		repeat = false;
	}
	public boolean isRepeat()
	{
		return repeat;
	}
	public void setRepeat(boolean repeat)
	{
		this.repeat = repeat;
	}
	public void addFrame(BufferedImage img ,Integer time)
	{
		frame.add(img);
		times.add(time);
	}
	public void checkBehaviors()
	{
		
	}
	public void drawImage(Graphics2D g)
	{
		long currentTime= System.currentTimeMillis();
		if(frame != null && frame.size() > 0 && frame.size() == times.size() && currentTime - displayTime 
				> times.get(currentFrame));
		displayTime = currentTime;
		currentFrame = (currentFrame + 1)%frame.size();
		if(currentFrame == 0 && !repeat)
		{
			setRunning(false);
			return;
		}
		g = clear();
		BufferedImage newFrame = frame.get(currentFrame);
		g.drawImage(newFrame, 0, 0, getWidth(),getHeight(),null);
	}
	

}
