package GUIPractice.components;

public class ClickableGraphic extends Graphic implements Clickable
{
	private Action action;

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation)
	{
		super(x,y,w,h,imageLocation);
	}
	
	public void setAction(Action a)
	{
		this.action= a;
	}
	
	
	@Override
	public boolean isHovered(int x, int y) 
	{
		return x > getX() && x < getX() + getWidth() && y > getY() && y < getY() + getHeight();
	}

	@Override
	public void act() 
	{
		if(action!= null)
		{
			action.act();
		}
	}
}
