package gooeyPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import gooeyPractice.Screen;
import gooeyPractice.components.Action;
import gooeyPractice.components.Button;
import gooeyPractice.components.Graphic;
import gooeyPractice.components.Visible;

public class MyScreen extends Screen implements MouseMotionListener,MouseListener
{
	private Graphic mega;
	private Button back;
	
	public MyScreen(int width, int height) 
	{
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) 
	{
		back = new Button(50,50,100,60,"Back",Color.GRAY,new Action()
		{
			public void act()
			{						
				MouseFollower.game.setScreen(MouseFollower.coordScreen);	
			}
		});
		mega = new Graphic(200,200,.25,"resources/sampleImage/megaGnar.jpg");
		viewObjects.add(back);
		viewObjects.add(mega);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) 
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

	@Override
	public void mouseDragged(MouseEvent arg0) 
	{		
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) 
	{	
		
	}

}
