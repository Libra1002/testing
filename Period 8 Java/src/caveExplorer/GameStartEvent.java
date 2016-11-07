package caveExplorer;

public class GameStartEvent implements Playable {

	private static final String[] SEQUENCE_1 = {"Greetings.... traveler. Let's play a game."};
	private static final String[] SEQUENCE_2 = {"While you're here, let's have some fun. Take this map."};
	public GameStartEvent() 
	{
		
	}

	@Override
	public void play() 
	{
		readSequence(SEQUENCE_1);
		while(CaveExplorer.in.nextLine().toLowerCase().indexOf("yes") < 0)
		{
			CaveExplorer.print("Don't be like that, it won't last long.");
		}
		readSequence(SEQUENCE_2);
		CaveExplorer.inventory.setHasMap(true);
	}

	public static void readSequence(String[] seq)
	{
		for(String s : seq)
		{
			CaveExplorer.print(s);
			CaveExplorer.print("- - - press enter - - -");
			CaveExplorer.in.nextLine();
		}
	}
}
