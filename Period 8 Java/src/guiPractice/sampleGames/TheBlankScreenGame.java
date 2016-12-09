package guiPractice.sampleGames;

import gooey.GUIApplication;
import gooey.Screen;

public class TheBlankScreenGame extends GUIApplication
{
	protected void initScreen()
	{
		Screen s = new BlankScreen(getWidth(), getHeight());
		setScreen(s);
	}
	public static void main(String[] args) 
	{
		new TheBlankScreenGame();
	}

}
