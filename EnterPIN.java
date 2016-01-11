import java.util.Scanner;

public class EnterPIN
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;

		pin = 12345;

		System.out.println("WELCOME TO BANK");
		System.out.print("PIN: ");
		entry = keyboard.nextInt();

		while(entry!= pin)
		{
			System.out.println("WRONG PIN, Try again.");
			System.out.print("PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\n\nACCEPTED\t:D");

	}
}