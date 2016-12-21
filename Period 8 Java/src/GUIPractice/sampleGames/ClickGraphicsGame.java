package GUIPractice.sampleGames;

import GUIPractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication{

	private static ClickGraphicsGame game;
	private static GraphicsClickScreen screen;
	
	public ClickGraphicsGame() 
	{
		super();
	}

	public static void main(String[] args) 
	{
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();
	}
	@Override
	public void initScreen()
	{
		GraphicsClickScreen gcs = new GraphicsClickScreen(getWidth(),getHeight());
		setScreen(gcs);
	}

}
