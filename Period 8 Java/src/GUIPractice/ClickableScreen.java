package GUIPractice;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import GUIPractice.components.Clickable;
import GUIPractice.components.Visible;



public abstract class ClickableScreen extends Screen implements MouseListener {

	private ArrayList<Clickable> clickables;
	
	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	public abstract void initAllObjects(List<Visible> viewObjects);
	
	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		initAllObjects(viewObjects);
		clickables = new ArrayList<Clickable>();
		for(Visible v: viewObjects){
			if(v instanceof Clickable){
				clickables.add((Clickable)v);
			}
		}
	}

	public void mouseClicked(MouseEvent m) {
		for(int i = 0; i < clickables.size(); i++){
			Clickable c = clickables.get(i);
			if(c.isHovered(m.getX(), m.getY())){
				c.act();
				break;
			}
		}
	}
	
	public void addObject(Visible v){
		super.addObject(v);
		if(v instanceof Clickable){
			clickables.add((Clickable)v);
		}
	}
	

	
	public void remove(Visible v){
		super.remove(v);
		clickables.remove(v);
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public MouseListener getMouseListener(){
		return this;
	}
	
}