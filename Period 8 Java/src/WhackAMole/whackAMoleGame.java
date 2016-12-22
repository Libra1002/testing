package WhackAMole;

import GUIPractice.GUIApplication;

public class whackAMoleGame extends GUIApplication {

	public whackAMoleGame() 
	{
		
	}

	@Override
	protected void initScreen() 
	{
		whackAMoleScreen wams = new whackAMoleScreen(getWidth(),getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) 
	{
		whackAMoleGame game = new whackAMoleGame();
		Thread app = new Thread(game);
		app.start();
	}

}
