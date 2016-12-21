package GUIPractice.sampleGames;

import GUIPractice.GUIApplication;

public class MouseFollower extends GUIApplication 
{
	public static CoordinateScreen coordScreen;
	public static MouseFollower game;
	public static MyScreen myScreen;
	public static GraphicsClickScreen move;
	
	public static void main(String[] args)
	{
		game = new MouseFollower();
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
