package GUIPractice.sampleGames;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import GUIPractice.Screen;
import GUIPractice.components.Action;
import GUIPractice.components.AnimatedComponent;
import GUIPractice.components.Button;
import GUIPractice.components.Graphic;
import GUIPractice.components.MovingComponent;
import GUIPractice.components.TextArea;
import GUIPractice.components.TextLabel;
import GUIPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener,MouseListener
{
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	
	public CoordinateScreen(int width, int height) 
	{
		super(width, height);
	}
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) 
	{
		label = new TextLabel(40,45,760,40,"Sample Text");
		paragraph = new TextArea(40,85,760,500,
				"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge"
				+ " of the page, a new line is created.");
		button = new Button(40,200,80,40,"Button", new Color(100,100,250), new Action(){
			public void act()
			{
				MouseFollower.game.setScreen(MouseFollower.myScreen);
			}
		});
		Graphic picture = new Graphic(50,50,.5,"resources/sampleImages/gnar.jpg");
		
		viewObjects.add(picture);
		viewObjects.add(label);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		
		MovingComponent mc = new AnimatedComponent(30,60,80,80);
		viewObjects.add(mc);
		mc.setVy(3);
		mc.play();

		addAnimation(viewObjects);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) 
	{
		
	}
	@Override
	public void mouseMoved(MouseEvent m)
	{
		label.setText("Mouse at " + m.getX()+ ", "+ m.getY());
	}
	public MouseMotionListener getMouseMotionListener()
	{
		return this;
	}
	public MouseListener getMouseListener()
	{
		return this;
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		if(button.isHovered(e.getX(),e.getY()))
		{
			button.act();
		}
	}
	private void addAnimation(ArrayList<Visible> viewObjects)
	{
		AnimatedComponent a = new AnimatedComponent(40,50,150,150);
		try
		{
			int numberInRow = 9;
			int rows = 1;
			int w = 80;
			int h = 100;
			ImageIcon icon = new ImageIcon("resources/sampleImages/IceKirbyWalkSprite.png");
			for(int i = 0; i < numberInRow * rows; i++)
			{
				//declare the cropped image
				BufferedImage cropped = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
				int leftMargin = 0;
				int topMargin = 0;
				int x1 = leftMargin + w*(i%numberInRow);
				int y1 = topMargin + h*(i/numberInRow);
				Graphics2D g = cropped.createGraphics();
				g.drawImage(icon.getImage(),0,0,w,h,x1,y1,x1+w,y1+h,null);
				a.addFrame(cropped,20);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		viewObjects.add(a);
		a.play();
	}
	@Override
	public void mouseEntered(MouseEvent arg0) 
	{
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) 
	{
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) 
	{
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) 
	{
		
	}
}