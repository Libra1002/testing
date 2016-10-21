package arrays;

public class AdvancedArrayMethods
{
	static int[] array;
	public static void main(String [] args)
	{
		String[] array = {"a","b","c","d","e","f","g","h"};
		swap(array,0,array.length - 1);
		
	}
	private static void shuffle(Object [] array)
	{
		for (int i = 0; i< array.length;i++)
		{
			int random  = (int)(Math.random()*6);
			swap(array,i,random);
		}
	}
	private static void swap(Object[] array2, int a, int b)
	{
		String placeHolder = (String) array2[b];
		array2[b] = array2[a];
		array2[a] = placeHolder;
	}
	private static void methodA(int[] someArray) 
	{
		int[] newArray = new int[someArray.length];
	}
	public static void copyArray(int[] original, int[] target)
	{
		target = original;
	
	/*
		if(original.length == target.lenth)
		{
			for(int i = 0; i < original .length; i++)
			{
				target[i] = original [i];
			}
		}
		else
			{
				System.out.println("ERROR: tried to copy arrays of two different lengths");
			}
	*/
	}
}
