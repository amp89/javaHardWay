import java.util.Scanner;

public class CoinFlip
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);  //i wonder if no import.

		String coin, again="y";//for do while:  again;
		int flip, streak = 0;

		do
		{
			flip = 1 + (int)(Math.random()*2);

			if ( flip == 1)
			{
				coin = "heads";
			}

			else
			{
				coin = "tails";
			}

			System.out.println("you flip a coin and its... " + coin);

			if (flip ==1 )
			{
				streak++;
				System.out.println("\t"+streak+"'s in a row!");
				System.out.print("\tFlip again? (y/n) >");
				again = keyboard.next().toLowerCase();
			}
			else
			{
				streak = 0;
				again = "n";
			}
		} while (again.equals("y"));

//Regular while loop for the study drill:
		// while(again=="y")
		// {
		// 	flip = 1 + (int)(Math.random()*2);

		// 	if ( flip == 1)
		// 	{
		// 		coin = "heads";
		// 	}

		// 	else
		// 	{
		// 		coin = "tails";
		// 	}

		// 	System.out.println("You flip a coin and its... " + coin + "!");

		// 	if (flip ==1 )
		// 	{
		// 		streak++;
		// 		System.out.println("\t"+streak+" in a row!");
		// 		System.out.print("\tFlip again? (y/n) >");
		// 		again = keyboard.next().toLowerCase();
		// 	}
		// 	else
		// 	{
		// 		streak = 0;
		// 		again = "n";
		// 	}
		// }


		System.out.println("Final score: " + streak);
	}
}