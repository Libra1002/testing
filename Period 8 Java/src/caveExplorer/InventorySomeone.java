package caveExplorer;

public class InventorySomeone 
{
	private boolean hasMap;
	private String map;
	
	public InventorySomeone() 
	{
		hasMap = true;
		updateMap();
	}

	private void updateMap() 
	{
		CaveRoomPd8[][] caves = CaveExplorer.caves;
	}

	public static void main(String[] args) 
	{

	}

	public String getDescription() 
	{
		if(hasMap)
		{
			return map;
		}
		else
			{
				return ("You have no inventory");
			}
	}
}
