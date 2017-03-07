package quiz;

public class Item 
{
	private String desc;
	private boolean purchased;
	
	public Item(String description) 
	{
		this.desc = description;
		purchased = false;
	}
	
	public void setPurchased(boolean b)
	{
		this.purchased = b;
	}
	
	public boolean isPurchased()
	{
		return purchased;
	}

	public String getDescription() 
	{
		return desc;
	}
}
