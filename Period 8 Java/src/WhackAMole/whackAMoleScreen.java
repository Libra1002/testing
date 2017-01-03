package WhackAMole;

import java.util.ArrayList;
import java.util.List;

import GUIPractice.sampleGames.ClickableScreen;
import GUIPractice.components.Action;
import GUIPractice.components.TextLabel;
import GUIPractice.components.Visible;


public class whackAMoleScreen extends ClickableScreen implements Runnable
{

	private ArrayList<moleInterface> moles;
	private playerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;

	public whackAMoleScreen(int width, int height) 
	{
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();
	}



	@Override
	public void initAllObjects(List<Visible> viewObjects)
	{
		moles = new ArrayList<moleInterface>();
		//		player = getAPlayer();
		label = new TextLabel(getWidth()/2-60, 
				getHeight()/2-30, 120, 60, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-60,
				50, 120, 60, "");
		viewObjects.add(label);
		//		viewObjects.add(player);
		viewObjects.add(timeLabel);
	}

	public void update()
	{
		super.update();
	}


	private void changeText(String s)
	{
		try
		{
			Thread.sleep(1000);
			label.setText(s);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public void run() 
	{
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft > 0)
		{
			//frame updates every 100ms
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
			disappearMoles();
			addNewMoles();
		}

	}

	private void addNewMoles()
	{
		//probability of mole appearing depends on
		//time left
		double probability = .2+.1*(30.0-timeLeft)/30;
		if(Math.random() < probability)
		{
			final moleInterface mole = getAMole();
			//between .5 and 2.5 seconds
			mole.setAppearanceTime((int)(500 
					+ Math.random() * 2000));
			mole.setAction(new Action()
			{
				public void act()
				{
					player.increaseScore(1);
					//removeMole from viewObjects
					remove(mole);
					//remove mole from "database"
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}



	private void disappearMoles() 
	{
		//each mole has a "clock"
		//when the clock counts down to zero, 
		//it disappears
		for(int i = 0; i < moles.size(); i++)
		{
			moleInterface m = moles.get(i);
			m.setAppearanceTime(m.getAppearanceTime() -100);
			if(m.getAppearanceTime() <=0)
			{
				//remove from viewObjects
				remove(m);
				//remove it from our mole database
				moles.remove(i);
				i--;//compensate for i++
				
			}
		}
	}



	/**
	 * this is a placeholder because early in the game design 
	 * process, the players aren't designed yet, so
	 * we use this method later, once we learn how 
	 * to create a Player
	 * @return
	 */
	private playerInterface getAPlayer() 
	{
		return null;
	}

	/**
	 * this is a placeholder because early in the game design 
	 * process, the enemies aren't designed yet, so
	 * we use this method later, once we learn how 
	 * to create a Enemy (Mole)
	 * @return
	 */
	private moleInterface getAMole() 
	{
		return null;
	}



	@Override
	public void initObjects(ArrayList<Visible> viewObjects) 
	{
		
	}
}