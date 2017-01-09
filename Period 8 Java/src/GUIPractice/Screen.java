package GUIPractice;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import GUIPractice.components.Visible;

public abstract class Screen {

	private int width;
	private int height;
	protected ArrayList<Visible> viewObjects;

	protected BufferedImage image;

	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		this.width = width;
		this.height = height;
		initObjects(viewObjects);
		initImage();
	}

	public abstract void initObjects(ArrayList<Visible> viewObjects);

	private void initImage() {
		image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		update();
	}

	public void update() {
		//this is where you draw stuff
		Graphics2D g = image.createGraphics();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);
		//draw all visible components
		for(Visible v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		//		g.setFont(new Font("Helvetica",Font.PLAIN,20));
		//		g.drawString("Hello",	 40, 80);
		//		g.drawOval(0, 40, 120, 80);
		//		g.drawRect(20, 120, 80, 110);
		//		g.drawLine(100, 120, 110, 200);
		//		
		//		g.setColor(Color.green);
		//		for(int i = 0; i < image.getWidth(); i+=4){
		//			g.drawLine(i, 230, i, 238);
		//		}

	}
	
	public void remove(Visible v)
	{
		/** ArrayList notes
		 * While this method is very simple, 
		 * do not underestimate the trickiness of 
		 * removing items in an Array List. 
		 * It causes indices to change : 
		 * Example support you have an ArrayList<integer>
		 * and you want to remove all values greater than 5
		 * This is Bad:
		 * for (int i = 0; i < list.size(); i++)
		 * {
		 * 		if(list.get() > 5)
		 * 		{
		 * 			list.remove(i);
		 *  	}
		 * }
		 * suppose you have (4,5,6,7)
		 * the first Integer to be removed is 6, 
		 * at index 2 since it gets removed, 
		 * 7 moves from index 3 to 2, your list is now (4,5,7)
		 * after you increment i, 1 becomes 3.
		 * This is out of bounds
		 * so 7 never gets removed
		 * Instead, when an object is removed, decrease i to 
		 * compensate for change in size of array
		 * 
		 *	for (int i = 0; i < list.size();i++)
		 *	{
		 *		if(list.get(i) > 5)
		 *		{
		 *			list.remove(i);
		 *			i--;
		 *		}
		 *	}
		 *ALSO CORRECT
		 *for(int i = 0; i < list.sze;i++)
		 *{
		 *	while(i < list.size() && list.get(i) > 5)
		 *	list.remove(i);
		 *}
		 *IF you remove an index, it returns the removed obect so you can do this
		 *System.out.print(list.remove(0).toString()+" was removed" 
		 */
		
		viewObjects.remove(v);
		/**this removes the object that has the same identity as v, 
		 *not an object that is equal to v
		 */
	}
	
	public void moveToFront(Visible v)
	{
		if(viewObjects.contains(v))
		{
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
	public void moveToBack(Visible v)
	{
		if(viewObjects.contains(v))
		{
			viewObjects.remove(v);
			viewObjects.add(0,v);
		}
	}
	
	public void addObject(Visible v)
	{
		viewObjects.add(v);
	}
	
	public void remove()
	{
	
	}
	public BufferedImage getImage(){
		return image;
	}

	public MouseListener getMouseListener() 
	{
		return null;
	}

	public MouseMotionListener getMouseMotionListener() 
	{	
		return null;
	}
	public int getWidth()
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}



}