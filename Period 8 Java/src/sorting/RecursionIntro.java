package sorting;

import java.lang.reflect.Array;

public class RecursionIntro 
{
	public static void main(String[] args)
	{
		int n = 40;
		System.out.println("The "+n+"th Fibonacci number is "+fibonacci(n));
		
//		hanoiSolution(7,"A","B","C");
//		System.out.println("Using a for loop");
//		for(int i = 0; i < 5; i++)
//		{
//			System.out.println("Hello world! x" + i);
//		}
//		System.out.println("Without using a for loop");
//		forLoop(5, new Action()
//		{
//			private int value = 0;
//			public void act()
//			{
//				System.out.println("Hello World! x" + value);
//				value++;
//			}
//		});
//		System.out.println("For loop factorial");
//		System.out.println("10! = " + factorial(10));
//		
	}
	private static void insertionSort(int[] x)
	{
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < i; j++)
			{
				while(j>0 && x[j-1] > x[j])
				{
					int holder = x[j-1];
					x[j-1] = x[j];
					x[j] = holder;
					break;
				}
				break;
			}
		}
	}
	private static int fibonacci(int n) 
	{
		if(n <= 1)
		{
			return 1;
		}
		else
		{
			int previous = fibonacci(n-1);
			//print("Before fibonacci " +n+ " we need to find fibonacci " + (n-1)+", which is " + previous);
			int beforePrevious = fibonacci(n-2);
			return previous+beforePrevious;
		}
	}
	public static int factorial(int x)
	{
		int factorial = 1;
		for(int i = x; i > 0; i--)
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);
		return factorial;
	}
	
	private static void forLoop(int i, Action action) 
	{
		if(i<=0)
		{
			return;
		}
		else
		{
			//standard action
			action.act();
			//recursive call
			forLoop(i-1,action);
		}
	}
	
	private static int count = 1;
	
	public static void print(String s)
	{
		System.out.println("Move #" + count + ":" + s);
		count++;
	}
	
	public static void hanoiSolution(int height, String startPeg, String midPeg, String endPeg)
	{
		if(height <= 1)
		{
			print("Move " + startPeg+ " to " + endPeg);
		}
		else
		{
			System.out.println("In order to move " + height + " over to peg " + endPeg 
					+ ", we must move " + (height-1) + " over to peg "+midPeg+ " first.");
			hanoiSolution(height-1,startPeg,endPeg, midPeg);
			hanoiSolution(1,startPeg,midPeg, endPeg);
			hanoiSolution(height-1,midPeg,startPeg,endPeg);
		}
	}
}
