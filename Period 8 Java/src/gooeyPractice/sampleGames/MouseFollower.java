package gooeyPractice.sampleGames;

import gooeyPractice.GUIApplication;

public class MouseFollower extends GUIApplication 
{
	private CoordinateScreen coordScreen;
	public static void main(String[] args)
	{
		new MouseFollower();
	}
	protected void initScreen()
	{
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
