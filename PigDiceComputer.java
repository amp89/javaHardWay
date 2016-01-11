import java.util.Scanner;

public class PigDiceComputer
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int roll, total;

		total = 0;

		do
		{
			roll = 1 + (int)(Math.random()*6);
			System.out.println("The computer rolled a **" + roll + "**");

			if (roll == 1 )
			{
				System.out.println("COMPUTER TURN IS DONE");
				total = 0;
			}
			else
			{
				total += roll;
				System.out.println("COMPUTER HAS TOTAL OF " + total + " THIS ROUND");
				if (total < 20)
					System.out.println("COMPUTER WILL ROLL AGAIN");
			}
		} while (roll != 1 && total < 20);

		System.out.println("COMP DONE WITH " + total + " POINTS");


	}
	

}