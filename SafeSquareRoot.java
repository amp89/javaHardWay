import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main(String[] args)
	{
	// 	Scanner keyboard = new Scanner(System.in);
	// 	double x,y;

	// 	System.out.print("Give me a number, sqrt");

	// 	System.out.print("pos only >> ");
	// 	x = keyboard.nextDouble();

	// 	while(x<0)
	// 	{
	// 		System.out.print("POSITIVE ONLY.... : ");
	// 		x = keyboard.nextDouble();
	// 	}

	// 	y = Math.sqrt(x);

	// 	System.out.println("The sqrt of " + x + " is " + y);

		Scanner keyboard = new Scanner(System.in);
		double x,y;

		System.out.print("Give me a number to sqrt");
		x = keyboard.nextDouble();

		if (x>=0)
		{
			y = Math.sqrt(x);
			System.out.println("Sqrt is: " + y);
		}

		else
		{
			x = Math.abs(x);
			y = Math.sqrt(x);
			System.out.println("Sqrt is: " + y + "i");
		}


    }




}