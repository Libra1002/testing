package GUIPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUIPractice.Screen;
import GUIPractice.components.Action;
import GUIPractice.components.Button;
import GUIPractice.components.Graphic;
import GUIPractice.components.Visible;

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
		mega = new Graphic(200,200,.25,"resources/sampleImage/megaGnar.jpg");
		back = new Button(50,50,100,60,"Back",Color.GRAY,new Action()
		{
			public void act()
			{						
				MouseFollower.game.setScreen(MouseFollower.coordScreen);
			}
		});
		viewObjects.add(back);
		viewObjects.add(mega);
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{		
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
		}
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
	public void mouseDragged(MouseEvent e) 
	{		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{	
		
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
}
