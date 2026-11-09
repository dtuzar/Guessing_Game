import java.util.*;

public class Guessing 
{

	public static int getRandomNumber(int low, int high)
	{
		// Math.random() returns a decimal in the range [0, 1)
		// Pick a low and high value and test this out.  Can the 
		// computer choose the low and high bounds as its number?
		int rand = (int) (Math.random() * (high - low + 1)) + low;
		return rand;
	}
	
	public static String compareToSecret(int guessedNum, int secretNum)
	{
		String guessIs = "";
		if (guessedNum < secretNum)
			guessIs = "low";
		else
			guessIs = "high";
		return guessIs;
	}
	
	public static boolean inRange(int low, int high, int num)
	{
		if (low <= num && num <= high)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String[] args) 
	{
		int lowest = 1;
		int highest = 10;
		int secret = getRandomNumber(lowest, highest);
		
		int guess = 7;
		if (secret == guess)
		{
			System.out.println("You guessed right!");
			System.out.println("My number was " + secret + "!");
		}
		else 
		{
			String lowHigh = compareToSecret(guess, secret);
			System.out.println("Nope. " + guess + " is too " + lowHigh);
			System.out.println("Guess again!");
		}
				
	}

}
