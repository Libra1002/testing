package arrays;

public class ArraysPractice 
{
		static boolean[] boos3;
		public static void main(String[] args) 
		{
			/*arrays are kind of like lists
			 * have fixed lengths
			 * start at index 0
			 * ex. Student[Joe, Jimmy, Bob] Index [0] = Joe
			 * All items in an array MUST be an object
			 * if you want to put different primitive types into an array, you must use their wrapper class
			 */
			
			//2 different ways to instantiate an array
			boolean[] boos1 = new boolean[3];
			//can ONLY be done at the declaration because it sets size and content
			boolean[] boos2 = {false,false,false};
			
			//boos3 = {false,true,true};
			boos3 = new boolean[3];
			
			
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
