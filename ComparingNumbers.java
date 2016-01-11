import java.util.Scanner;

public class ComparingNumbers
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.print("First Num: ");
		first = keyboard.nextDouble();
		System.out.print("Second Num: ");
		second = keyboard.nextDouble();

		if (first < second)
		{
			System.out.println(first + " is LESS THAN " +second );
		}

		if (first <= second)
		{
			System.out.println(first + " is LESS THAN or EQUAL TO " + second);
		}

		if (first == second)
		{
			System.out.println(first + " is EQUAL TO " + second);

		}

		if (first >= second)
		{
			System.out.println(first + " is GREATER THAN or EQUAL TO " + second);
		}


		if (first > second)
		{
			System.out.println(first + " is GREATER THAN " + second);
		}

		if (first != second) // if there are no braces, it only does stuff with first statement after the "if..."
		
		{
			System.out.println(first + " is NOT EQUAL TO " + second);
			System.out.println("Hey.");
		}
	}

}