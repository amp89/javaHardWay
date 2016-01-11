import java.util.Scanner;

public class RunningTotal
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int current, total = 0;

		System.out.print("TYPE IN NUMBERS TO ADD ");
		System.out.println("TYPE ZERO WHEN YOU ARE DONE");

		do
		{
			System.out.print("Value: ");
			current = keyboard.nextInt();
			total = current + total;
			System.out.println("The total so far is " + total);
		} while (current != 0 && total != 20);
	System.out.println("\tFinal total is " + total);
	}

}