package arrays;
public class TwoDArrays {

	/**
	 * This class provides functions to search in arrays.
	 * 
	 */


	/**
	 * 1) Given a 2 dimensional array of unique ints write a method that will return the maximum distance between any 2 ints in the 2D array.
	 * 
	 * EXAMPLE 1
	    int[][] g1 ={{9, 8, 7, 6},           
	        	{5, 4, 12, 1},
	   	        {3, 19, 2, 13}};

	    maxDistBetweenAny2(g1)returns 18
	    
	    EXAMPLE 2
	    int[][] g2 ={{-3, 4, -8, 16},           
	   	            {15, 14, 2, 21},
	            	{5, 19, 32, -1}};

	    maxDistBetweenAny2(g2)  returns 40
	    
	*/
	    public static int maxDistBetweenAny2(int[][] nums)
	    {
	    	int max = 0;
	    	int min = 0;
	        for(int row = 0; row < nums.length;row++)
	        {
	        	for(int col = 0; col < nums[0].length;col++)
	        	{
	        		if(nums[row][col] > max)
	        		{
	        			max = nums[row][col];
	        		}
	        		if(nums[row][col] < min)
	        		{
	        			min = nums[row][col];
	        		}
	        	}
	        }
			return max - min;
	    }
	    
	    /**
	     * Given a 2D array of Strings and a non-empty array of 
	     * Strings where each string is of length 2 or more.  
	     * Write a method that will place the first 2 chars of each 
	     * String into a 2D array in row major order.  If the 1D array 
	     * runs out of strings then fill in the rest of the elements with "$$".  
	       (This method is definitely an AP level question)


	     *   String[][] t = new String[2][3];						        //This is a 2d Array
	     *   twoCharsTo2D(t, {"hello", "blah",  "boom", "elephant"})  ?       "he", "bl", "bo"
			                                								 "el", "$$", "$$"


	//Preconditions:  1.  words.length > 0
//			  2.  words.length<=(table.length * table[0].length)
//			  3.  Each element in words will be a string of length 2 or more
	*/

	    public static String[][] twoCharsTo2D(String[][] table, String[] words)
	    {
	    	int i = 0;
	        for(int row = 0; row < table.length;row++)
	        {
	        	for(int col = 0; col < table[0].length;col++)
	        	{
	        		table[row][col] = words[i].substring(0, 2);
	        		i++;
	        	}
	        }
	        
	        for(int row = 0; row < table.length;row++)
	        {
	        	for(int col = 0; col < table[0].length;col++)
	        	{
	        		if(table[row][col] == "" )
	        		{
	        			table[row][col] = "$$";
	        		}
	        	}
	        }
	        return table;
	    }

	/**
	 * 3)  Given an array of Strings containing unique names, and a 2D array of ints where each row 
	 * represents the test grades of the person at a specific index, write the method that will return 
	 * the name of the person with the greatest test average(mean).

	String[] r = {"Joe", "Kim", "Chris"};
	int[][] g = {{80, 90, 90, 100, 70},
			 {90, 60, 75, 80, 80},
			 {100, 90, 96, 98, 99}};

	bestAverage(r, g) returns "Chris"

	Preconditions:  
	1.  roster.length > 0
	2.  roster.length == grades.length
	*/
	    public static String bestAverage(String[] roster, int[][] grades)
	    {
	    	String best = "";
	    	int avg = 0;
	    	int bestAvg = 0;
	    	for(int i = 0; i < roster.length;i++)
	    	{
	    		for(int row = i; row < i;row++)
		        {
		        	for(int col = 0; col < grades[i].length;col++)
		        	{
		        		avg = avg + grades[row][col];
		        	}
		        	avg = avg/grades.length;
		        	if (avg > bestAvg)
		        	{
		        		best = roster[i];
		        		bestAvg = avg;
		        	}
		        }
	    	}
	        return best;
	    }
	    
	    /**
	     * Given a non-empty 2D array of ints and 2 ints that represent a row and a column that 
	     * exists in the 2D array return a 2D array without the given row and without the given column.  
	     * 
	     * Example 1
	     * int[][] g1 ={{9, 8, 7, 6},           
	     *              {5, 4, 12, 1},
	     *              {3, 19, 2, 13}};
	     * 
	     * removeRowCol(g1, 0, 1) returns {{5, 12, 1},
	                                        {3, 2, 13}};
	                             
	    *Example 2
	    *int[][] g2 ={{-3, 4, -8},           
	    *          	{14, 2, 21},
	   	*          {3, 32, -3}};

	    * removeRowCol(g2, 1, 1) returns {{-3, -8},
	   	                                {3, -3}};


	        Preconditions:  
	          1.  mat.length >=3
			  2.  mat[0].length>=3
			  3.  0 <= row <= mat.length-1 and 0 <= col <= mat[0].length-1
	*/
	    public static int[][] removeRowCol(int[][] mat, int row, int col)
	    {
	    	for(int r = 0; r < mat.length;r++)
	        {
	        	for(int c = 0; c < mat[0].length;c++)
	        	{
	        		if(c == col || r == row)
	        		{
	        			mat[row][col] = 0;
	        		}
	        	}
	        }
	    	return mat;
//	        int[][] nothing = {{},{}};
//	        return nothing;
	    }


	/**
	 * Given a non-empty 2D array of ints and 2 ints that represent a row and a column that 
	 * exists in the 2D array return an array of all the neighboring elements to the 
	 * element located at (row, col).  A neighboring element is an element that is 
	 * next to another element horizontally, vertically OR DIAGONALLY.  
	 * 
	 * (Note: if this sounds like something similar (but not identical) to an assignment you have done in the past, then you are right!)


	 int[][] g ={{9, 8, 7, 6},           
	   	         {5, 4, 2, 1},
	   	         {3, 9, 2, 3}};

	    getNeighbors(g, 0, 0) returns {8, 5, 4}
	    getNeighbors(g, 1, 1) returns {9, 8, 7, 5, 2, 3, 9, 2}
	    getNeighbors(g, 0, 2) returns {8, 6, 4, 2, 1}
	    getNeighbors(g, 2, 3) returns {2, 1, 2}
	    getNeighbors(g, 2, 2) returns {4, 2, 1, 9, 3}
	*/
	    public static int[] getNeighbors(int[][] grid, int row, int col)
	    {
	    	int[] nothing = new int[8];
	    	int index = 0;
	    	if(row - 1 > -1)
	    	{
	    		if(col - 1 > -1)
	    		{
	    			nothing[index] = grid[row-1][col-1];
	    			index++;
	    		}
	    		nothing[index] = grid[row-1][col];
	    		index++;
	    		nothing[index] = grid[row-1][col+1];
	    		index++;
	    	}
	    	if(col - 1 > -1)
	    	{
	    		nothing[index] = grid[row][col-1];
	    		index++;
	    		if(row + 1 < grid.length)
	    		{
	    			nothing[index] = grid[row+1][col-1];
	    			index++;
	    		}
	    	}
	    	if(row + 1 > grid.length)
	    	{
	    		nothing[index] = grid[row+1][col];
	    		index++;
	    		if(col + 1 < grid[0].length)
	    		{
	    			nothing[index] = grid[row+1][col+1];
	    			index++;
	    		}
	    	}
	    	if(col + 1 > grid[0].length)
	    	{
	    		nothing[index] = grid[row+1][col+1];
	    		index++;
	    	}
	        return nothing;
	    }
	}