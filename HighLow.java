import java.util.Scanner;

public class HighLow
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int secret, guess;

		secret = 1 + (int)(Math.random()*100);

		System.out.println("I'm thinking of a number between 1 and 100");
		System.out.println("GUESS IT!");
		System.out.print("> ");
		guess = keyboard.nextInt();

		while (secret != guess)
		{
			if (guess < secret)
			{
				System.out.println("TO LOW");
			}
			if (guess > secret)
			{
				System.out.println("TO HIGH");
			}

			System.out.print("> ");
			guess = keyboard.nextInt();
		}

		System.out.print("CORRECT!  :D.");

	}

}