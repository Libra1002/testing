package GUIPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import GUIPractice.Screen;
import GUIPractice.components.Action;
import GUIPractice.components.ClickableGraphic;
import GUIPractice.components.Visible;

public class GraphicsClickScreen extends Screen implements MouseListener 
{
	private ClickableGraphic picture;
	
	public GraphicsClickScreen(int w, int h) 
	{
		super(w,h);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) 
	{
		picture = new ClickableGraphic(50,50, 0.25,"resources/sampleImages/megaGnar.jpg");
		picture.setAction(new Action()
				{
					public void act()
					{
						picture.setX(picture.getX() + 10);
					}
				});
		viewObjects.add(picture);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
	
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
	public MouseListener getMouseListener()
	{
		return this;
	}
	
}
