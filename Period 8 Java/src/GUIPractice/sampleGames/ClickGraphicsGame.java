package GUIPractice.sampleGames;

import GUIPractice.GUIApplication;

public class ClickGraphicsGame extends GUIApplication{

	public ClickGraphicsGame() 
	{
		
	}

	public static void main(String[] args) 
	{
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();
	}
	
	public void initScreen()
	{
		GraphicsClickScreen gcs = new GraphicsClickScreen(getWidth(),getHeight());
		setScreen(gcs);
	}

}
