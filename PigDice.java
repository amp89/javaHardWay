import java.util.Scanner;

public class PigDice
{

	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int roll, total1 = 0, total2 = 0, turnTotal;

		String choice = "";

		do
		{
			turnTotal = 0;
			System.out.println("\nYOU HAVE " + total1 + " POINTS.");

			do
			{

				roll = 1 + (int)(Math.random()*6);
				System.out.println("\tYou rolled a... " + roll);
				if (roll == 1)
				{
					System.out.println("YOUR TURN IS OVER.  TOTAL SCORE: " + total1);
					turnTotal = 0;
				}
				else
				{
					turnTotal += roll;
					System.out.println("\tYou have this many points this turn: " + turnTotal);

					System.out.println("'roll' again or 'hold'?");
					System.out.print("> ");
					choice = keyboard.nextLine().toLowerCase();
				}


			} while (roll != 1 && choice.equals("roll"));
			
			total1 += turnTotal;

			if (total2 < 100)
			{
				turnTotal = 0;
				System.out.println("COMPUTER HAS THIS MANY POINTS: " + total2);

				do
				{
					roll = 1+(int)(Math.random()*6);
					System.out.println("\tCOMPUTER ROLLED A " + roll);
					if (roll == 1)
					{
						System.out.println("\tCOMPUTER'S TURN IS OVER.  TOTAL SCORE FOR COMPUTER " + total2);
						turnTotal = 0;
					}
					else
					{
						turnTotal += roll;
						System.out.println("\tCOMPUTER HAS THIS MANY POINTS THIS TURN: "+turnTotal);
						if(turnTotal < 20)
						{
							System.out.println("\tCOMPUTER IS GOING AGAIN.");
						}
					}

				}while(roll != 1 && turnTotal < 20);

			total2 += turnTotal;
			System.out.println("COMPUTER FINISHES ROUND WITH: " + total2);

			}



		}while(total1 < 100 && total2 < 100);

	if (total1>total2)
	{
		System.out.println("Human Wins");
	}
	else
	{
		System.out.println("Computer Wins");
	}

	System.out.println("Person: " + total1);
	System.out.println("Computer: " + total2);
	

	}




}