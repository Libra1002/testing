package caveExplorer;

public class InventorySomeone 
{
	private boolean hasMap;
	private String map;
	
	public InventorySomeone() 
	{
		hasMap = false;
		updateMap();
	}
	
	public void setHasMap(boolean hasMap) 
	{
		this.hasMap = hasMap;
	}

	public void updateMap() 
	{
		CaveRoomPd8[][] caves = CaveExplorer.caves;
		//create top side
		map = " ";
		//horizontal line across top row, with 4
		for(int i = 0; i < caves[0].length-1;i++)
		{
			map += "____";
		}
		map+= "__\n";
		//each room
		for(CaveRoomPd8[] row : caves)
		{
			//3 rows of text
			for(int textRow = 0; textRow<3;textRow++)
			{
				//text for each room
				for(CaveRoomPd8 cr : row)
				{
					String str = "|   ";
					String contents = cr.getContents();
					if(textRow == 1 && cr.getDoor(CaveRoomPd8.WEST)!= null)
					{
						str = "  "+contents+" ";
					}
					else if(textRow == 2)
					{
						if(cr.getDoor(CaveRoomPd8.SOUTH) != null)
						{
							str = "|___";
						}
						else
						{
							str = "|_ _";
						}
					}
				}
			}
		}
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
