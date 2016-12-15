package gooeyPractice.components;

import java.awt.image.BufferedImage;

public class Graphic implements Visible {

	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;
	
	public Graphic(int x, int y,String imageLocation) 
	{
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation,0.0);
	}

	@Override
	public BufferedImage getImage() 
	{
		
		return null;
	}

	@Override
	public int getX() 
	{
		
		return 0;
	}

	@Override
	public int getY() 
	{
		
		return 0;
	}

	@Override
	public int getWidth() 
	{
		
		return 0;
	}

	@Override
	public int getHeight() 
	{
		
		return 0;
	}

	@Override
	public boolean isAnimated() 
	{
		
		return false;
	}

	@Override
	public void update() 
	{
		

	}

	public static void main(String[] args) 
	{
		

	}

}
