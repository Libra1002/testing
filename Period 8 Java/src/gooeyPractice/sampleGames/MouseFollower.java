package gooeyPractice.sampleGames;

import gooeyPractice.GUIApplication;

public class MouseFollower extends GUIApplication 
{
	private CoordinateScreen coordScreen;
	
	public static MyScreen myScreen;
	
	public static void main(String[] args)
	{
		GUIApplication game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}
	protected void initScreen()
	{
		myScreen = new MyScreen(getWidth(),getHeight());
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
