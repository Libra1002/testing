package guiPractice.sampleGames;

import gooey.GUIApplication;

public class MouseFollower extends GUIApplication 
{
	private CoordinateScreen coordScreen;
	protected void initScreen()
	{
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
