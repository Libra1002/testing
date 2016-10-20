package quiz;

import java.util.Scanner;

public class Quiz1 
{
	static Scanner input = new Scanner(System.in);
	public static String waitForEntry()
	{
		return input.nextLine();
	}
	//1 point , visibility private
	//1 point for data type declaration (throughout)
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point corect method
	public static void main(String[] args) 
	{
		if(correctUser())
		{
			askPassword();
		}
		else
			{
				System.out.println("Unknown username. Please contact the network administrator.");
			}
	}

	private static void askPassword() 
	{
		int attemptsLeft = 3;
		boolean loggedIn = false;
		while (attemptsLeft > 0 && loggedIn == false)
		{
			System.out.println("Please enter a valid password. You have " + attemptsLeft + " attempt(s) left.");
			//1 point use waitForEntry() correctly
			if(waitForEntry().equals(password))
			{
				System.out.println("You have logged in.");
				loggedIn = true;
			}
			else
				{
					System.out.println("Invalid password. Please try again");
					attemptsLeft --;
					if(attemptsLeft == 0 && loggedIn == false)
					{
						System.out.println("You have " + attemptsLeft + " attempts left. Please contact the network administrator");
					}
				}
		}
		
	}

	private static boolean correctUser()
	{
		System.out.println("Enter a username");
		//1 point, comparing Strings
		if(waitForEntry().equals(username))
		{
			return true;
		}
		return false;
	}
}
