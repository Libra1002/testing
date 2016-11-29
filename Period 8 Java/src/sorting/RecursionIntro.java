package sorting;

public class RecursionIntro 
{
	public static void main(String[] args)
	{
		hanoiSolution(4,"A","B","C");
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
	
	public static void hanoiSolution(int height, String startPeg, String midPeg, String endPeg)
	{
		if(height <= 1)
		{
			System.out.println("Move " + startPeg+ " to " + endPeg);
		}
		else
		{
			hanoiSolution(height-1,startPeg,endPeg, midPeg);
			hanoiSolution(1,startPeg,midPeg, endPeg);
			hanoiSolution(height-1,midPeg,startPeg,endPeg);
		}
	}
}
