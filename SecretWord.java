import java.util.Scanner;

public class SecretWord
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String secret = "please", guess;

		System.out.print("What's the secret word? ");
		guess = keyboard.next();

		if (guess == secret)
		{
			System.out.println("THIS WON'T EVER PRINT");
		}
		if (guess.equals(secret))
		{
			System.out.println("CORRECT!");
		}
		else
		{
			System.out.println("NOPE! It is not \"" + guess + " \"");
		}

	}
	

}