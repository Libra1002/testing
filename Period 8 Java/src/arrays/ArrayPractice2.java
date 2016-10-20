package arrays;

public class ArrayPractice2 {

	public static void main(String[] args) 
	{
		//how do you time a process
		long currentTime = System.currentTimeMillis();initializingArraysExample();
		
		int[] fiftyNumbers = new int[50];
		populate(fiftyNumbers);
		print(fiftyNumbers);
		randomize(fiftyNumbers,50);
		print(fiftyNumbers);
		rollDice(fiftyNumbers,2);
		print(fiftyNumbers);
		countResult(fiftyNumbers,3);
		print(fiftyNumbers);
		long endTime = System.currentTimeMillis();
		System.out.println("The process took " + (endTime - currentTime) + " milliseconds.");

	}
	
	private static void populate(int[] nums) 
	{
		System.out.println("populate");
		for (int i = 0; i < nums.length; i++)
		{
			nums[i] = i+1;
		}
	}
	
	private static void randomize(int[] nums,int max) 
	{
		System.out.println("Random");
		for (int i = 0; i<nums.length; i++)
		{
			int randomNumber = (int) (1+(max*Math.random()));
			nums[i] = randomNumber;
		}
	}

	private static void rollDice(int[] nums, int numOfDice)
	{
		System.out.println("Random Dice");
		for(int i = 0; i < nums.length; i++)
		{
			int dice = 0;
			for(int j = 0; j < numOfDice; j++)
			{
				dice = dice + (int)(1+6*Math.random());
				nums[i] = dice;
			}
		}
	}
	
	private static void countResult(int[] nums, int numOfDice) 
	{
		System.out.println("Count Result");
		int counter[] = new int[numOfDice*6];
		for(int n:nums)
		{
			counter[n-1] = counter [n-1] + 1;
			
		}
		 /*for (int i = numOfDice-1;i<counter.length;i++)
		{
			System.out.println(i+1 + "was rolled");
		}*/
		
	}

	private static void print(int[] nums)
	{
		for (int i = 0; i < nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}
	
	private void demonstratePassByValue()
	{
		int x = 10;
		increase(x);
		System.out.println(x);
		
		String[] someStrings = new String[1000];
		standardPopulate(someStrings);
		String s = someStrings[999];
		makeSpecial(s);
		print(someStrings);
	}
	
	private static void increase(int i) 
	{
		i++;
	}

	private static void makeSpecial(String s) 
	{
		s = "This string is.... special?";
		
	}

	private static void print(String[] s) 
	{
		for(int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}
		
	}

	private static void standardPopulate(String[] s) 
	{
		for (int i = 0; i<s.length;i++)
		{
			s[i] = "String #" +i;
		}
		/*changes everything to null
		int i = 0;
		for (String x: s)
		{
			i++;
			x= "String #"+i;
		}*/
		
		
		
	}

	private static void initializingArraysExample() 
	{
		//2 different ways to instantiate an array
		boolean[] boos1 = new boolean[3];
		//can ONLY be done at the declaration because it sets size and content
		boolean[] boos2 = {false,false,false};
		
		//boos3 = {false,true,true};
		//boos3 = new boolean[3];
		
		
		/**2 ways to iterate through an array
		Standard For Loop
			- the index is important to keep track of
			- you need to customize the order
		*/
		for(int i = 0; i < boos1.length; i++)
		{
		System.out.println(boos1[i]);
		}
		/**
		 For each Loop
		 	- index is not important
		 	- you don't need to customize
		 	- automatically assigns a handle -> identifier
		 */
		for(boolean b: boos1)
		{
			System.out.println(b);
		}
		
		//object arrays
		String[] someStrings1 = new String[3];
		String[] someStrings2 = {"a","b","c"};
		
		//repetitive
		someStrings1[0] = "a";
		someStrings1[1] = "b";
		someStrings1[2] = "c";
		
		for(int i = 0; i <someStrings1.length;i++)
		{
			someStrings1[i] = "a new String";
		}
		
		for (String s:someStrings1)
		{
			System.out.println(s);
		}
	}
}
