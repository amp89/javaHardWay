import java.util.Scanner;

public class KeepGuessing
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int secret, guess;

		secret = 1 + (int)(Math.random()*10);

		System.out.println("Guess the number between 1 and 10");
		System.out.print("> ");
		guess = keyboard.nextInt();

		while (secret != guess)
		{
			System.out.println("NOPE");
			System.out.print("> ");
			guess = keyboard.nextInt(); //added
		}

		System.out.println("That's right!!!");
	}
}