package GUIPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import GUIPractice.Screen;
import GUIPractice.components.Visible;

public class ClickableScreen extends Screen implements MouseListener
{

	public ClickableScreen(int w, int h) 
	{
		super(w,h);
	}
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) 
	{		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{		
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{		
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		
	}
	
	@Override
	public MouseListener getMouseListener()
	{
		return this;
	}

	
}
