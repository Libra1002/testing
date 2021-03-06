package quiz;

import java.util.ArrayList;

public class ListRunner 
{
	static ArrayList<Item> shoppingList;

	public static void main(String[] args)
	{
		String[] justDescriptions = getDescriptions();
		initLists(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}

	private static void doSomeShopping() 
	{
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
	}

	private static String[] getDescriptions() 
	{
		String[] test = {"coffee","video games","potato chips","a life"};
		return test;
	}

	private static void initLists(String[] justDescriptions) 
	{
		shoppingList = new ArrayList<Item>();
		for(String s: justDescriptions)
		{
			Item temp = new Item(s);
			shoppingList.add(temp);
		}
		
//		for(int i = 0; i < justDescriptions.length;i++)
//		{
//			shoppingList.add(new Item(justDescriptions[i]));
//		}
	}
	private static void printPurchasedItems() 
	{
		for(int i = 0;i<shoppingList.size();i++)
		{
			if(shoppingList.get(i).isPurchased())
			{
				System.out.println(shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
		}
	}

}
