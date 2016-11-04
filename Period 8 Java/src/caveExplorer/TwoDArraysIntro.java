package caveExplorer;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDArraysIntro
{
	public static Scanner in = new Scanner (System.in);
	static int starti;
	static int startj;
	static int treasurej;
	static int treasurei;
	static String[][] arr2D;
	public static void main(String[] args)
	{
		arr2D = new String [5][5];
		for (int row = 0; row<arr2D.length; row++)
		{
			for(int col = 0; col<arr2D[row].length;col++)
			{
				arr2D[row][col] = "(" + row + ", " + col + ")";
			}
		}
//		starti = 2;
//		startj = 2;
//		treasurei = 4;
//		treasurej = 3;
		giantGrid();
		//startExploring();
	}
	private static void startExploring() 
	{
		while(true)
		{
			System.out.println("You are in room" + arr2D[starti][startj] + ".");
			System.out.println("What do you want to do?");
			String input = in.nextLine();
			int[] newCoordinates = interpretInput(input);
			starti = newCoordinates[1];
			startj = newCoordinates[1];
			if(starti == treasurei && startj == treasurej)
			{
				break;
			}
		}
		
	}
	private static int[] interpretInput(String input) 
	{
		while(!isValid(input))
		{
			System.out.println("Sorry, in this game, you can only use the w, a, s, d controls");
			System.out.println("Tell me what you want to do");
			input = in.nextLine();
		}
		int currenti = starti;
		int currentj = startj;
		input = input.toLowerCase();
		if(input.equals("w"))currenti--;
		if(input.equals("s"))currenti++;
		if(input.equals("a"))currentj--;
		if(input.equals("d"))currentj++;
		int[]newCoordinates = {starti,startj};
		if(currenti >= 0 && currenti<arr2D.length && currentj >= 0 && currentj < arr2D[0].length)
		{
			newCoordinates[0] = currenti;
			newCoordinates[1] = currentj;
		}
		else
			{
				System.out.println("You've reached a wall. Go somewhere else");
			}
		return newCoordinates;
	}
	private static boolean isValid(String input) 
	{
		String[] validKeys = {"w","a","s","d"};
		for(String key: validKeys)
		{
			if(input.toLowerCase().equals(key))
			{
				return true;
			}
		}
		return false;
	}
	private static void giantGrid() 
	{	
		
		String pic [][] = new String[12][17];
		for(int row = 0; row < pic.length; row++)
		{
			pic[row][0] = "|";
			pic[row][1] = " ";
			pic[row][2] = "|";
			pic[row][3] = " ";
			pic[row][4] = "|";
			pic[row][5] = " ";
			pic[row][6] = "|";
			pic[row][7] = " ";
			pic[row][8] = "|";
			pic[row][9] = " ";
			pic[row][10] = "|";
			pic[row][11] = " ";
			pic[row][12] = "|";
			pic[row][13] = " ";
			pic[row][14] = "|";
			pic[row][15] = " ";
			pic[row][16] = "|";
		}
		for(int col = 0; col < pic[0].length;col++)
		{
			pic[3][col] = "-";
			pic[7][col] = "-";
			pic[11][col] = "-";
		}
		printPic(pic);
		
	}
	private static String[][] createField(boolean[][] mines) 
	{
		String[][] field = new String[mines.length][mines[0].length];
		for(int row = 0; row < field.length; row++)
		{
			for(int col = 0; col < field[0].length;col++)
			{
				if(mines[row][col])
				{
					field[row][col] = "X";
				}
				else
					{
						field[row][col] = countNearby(mines,row,col);
					}
			}
		}
		return field;
	}
	private static String countNearby(boolean[][] mines, int row, int col) 
	{
//		for(int r = row - 1; r <= row + 1; r++)
//		{
//			for(int c = col - 1; c <= col + 1; c++)
//			{
//				//checks that this element exists
//				if(r >= 0 && r < mines.length && c >= 0 && c < mines[0].length)
//				{
//					
//				}
//			}
//		}
		//only considers elements that are there
		
//		int count = 0;
//		for(int r = 0; r<mines.length;r++)
//		{
//			for(int c = 0; c < mines[r].length; c++)
//			{
//				if(Math.abs(r-row)+ Math.abs(c - col) == 1 &&mines[r][c])
//				{
//					count++;
//				}
//			}
//		}
//		
//		return "" + count;
		//this method alows you to be most specific, ex. only want north and east
		int count = 0;
		count += isValidAndTrue(mines, row-1, col);//above
		count += isValidAndTrue(mines, row+1, col);//below
		count += isValidAndTrue(mines, row, col-1);//left
		count += isValidAndTrue(mines, row, col+1);//right
		//diagonals?
		count += isValidAndTrue(mines, row+1, col+1);//NE
		count += isValidAndTrue(mines, row+1, col-1);//NW
		count += isValidAndTrue(mines, row-1, col+1);//SE
		count += isValidAndTrue(mines, row-1, col-1);//SW
		return "" + count;
	}
	private static int isValidAndTrue(boolean[][] mines, int i, int j) 
	{
		if(i >= 0 && i < mines.length && j >= 0 && j < mines[0].length && mines[i][j])
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	private static void plantMines(boolean[][] mines) 
	{
		int numberOfMines = 10;
		while(numberOfMines > 0)
		{
			int row = (int)(Math.random()*mines.length);
			int col = (int)(Math.random()*mines[0].length);
			//prevents the same mine from being selected twice
//			while (mines[row][col])
//			{
//				row = (int)(Math.random()*mines.length);
//				col = (int)(Math.random()*mines[0].length);
//			}
			if(!mines[row][col])
			{
				mines[row][col] = true;
				numberOfMines --;
			}
		}
		
	}
	public static void printPic(String[][] pic)
	{
		for(String[] row:pic)
		{
			for(String col:row)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void picture()
	{
		String[][] pic = new String[10][10];
		for (int row = 0; row < pic.length; row++)
		{
			for(int col = 0; col < pic[row].length;col++)
			{
				pic[row][col] = " ";
			}
		}
		//sun
		pic[1][2] = "\\"; pic[1][3] = "|"; pic[1][4] = "/";
		pic[2][2] = "-"; pic[2][3] = "O";pic[2][4] = "-";
		pic[3][2] = "/"; pic[3][3] = "|";pic[3][4] = "\\";
		
		for(int col = 0;col<pic[0].length;col++)
		{
			pic[0][col] = "_";
			pic[pic.length-1][col] = "_";
		}
		
		for(int row = 0; row < pic.length;row++)
		{
			pic[row][0] = "|";
			pic[row][pic[0].length-1] = "|";
		}
		//grassy field
		for(int row = 5; row < pic.length;row++)
		{
			for(int col = 0; col<pic[row].length; col++)
			{
				pic[row][col] = "M";
			}
		}
		
		for(String[] row : pic)
		{
			for(String col:row)
			{
				System.out.print(col);
			}
			System.out.println();
		}
	}
	public static void intro() 
	{
		String[] xox = {"x", "o","x", "o","x"};
		System.out.println(Arrays.toString(xox));
		String[][]arr2D = new String[5][4];
		System.out.println("The height is "+arr2D.length);
		System.out.println("The weight is "+arr2D[0].length);
		for(int row = 0; row < arr2D.length; row++)
		{
			for(int col = 0; col<arr2D[row].length;col++)
			{
				arr2D[row][col]="(" + row+", "+col+")";
			}
		}
		//Every element in a 2D array IS itself an array, so a for-each loop looks like this:
		for(String[] row:arr2D)
		{
			System.out.println(Arrays.toString(row));
		}
	}

}
