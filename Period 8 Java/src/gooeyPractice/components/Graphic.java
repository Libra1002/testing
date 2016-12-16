package gooeyPractice.components;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

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
		loadImages(imageLocation,0,0);
	}

	private void loadImages(String imageLocation, int w, int h) 
	{
		try
		{
			ImageIcon icon = new ImageIcon(imageLocation);
			
			if(w == 0 && h ==0)
			{
				//use original size
				image = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
				//draw icon onto image
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else
			{
				//custom size
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private void loadImages(String imageLocation, double scale) 
	{
		
	}

	@Override
	public BufferedImage getImage() 
	{
		
		return image;
	}

	@Override
	public int getX() 
	{
		
		return x;
	}

	@Override
	public int getY() 
	{
		
		return y;
	}

	@Override
	public int getWidth() 
	{
		
		return image.getWidth();
	}

	@Override
	public int getHeight() 
	{
		
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() 
	{
		
		return false;
	}

	@Override
	public void update() 
	{
		//does nothing, image never changes

	}

	public static void main(String[] args) 
	{
		

	}

}
