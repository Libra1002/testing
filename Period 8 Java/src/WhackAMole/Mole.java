package WhackAMole;

import GUIPractice.components.ClickableGraphic;

public class Mole extends ClickableGraphic implements moleInterface{

	private int appearanceTime;
	public Mole(int x,int y) 
	{
		super(x, y, .50,"resources/sampleImages/diglett.png");
	}

	@Override
	public int getAppearanceTime() 
	{
		
		return appearanceTime;
	}

	public void setAppearanceTime(int i)
	{
		this.appearanceTime = i;
	}

}
