import java.util.Scanner;

public class AgeMessages
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print("How old are you? ");
		age = keyboard.nextInt();

		if (age < 13)
		{
			System.out.println("You're too young for a facebook account.");
		}else{
			System.out.println("You are old enough to create a facebook account.");
		}

		if (age < 16)
		{
			System.out.println("You're too young to drive.");
		}else{
			System.out.println("You are old enough to drive");
		}

		if (age < 18)
		{
			System.out.println("You're too young for a tattoo.");

		}else{
			System.out.println("You are old enough for a tattoo");
		}

		if (age < 21)
		{
			System.out.println("You're too young for alcohol.");
		}else{
			System.out.println("You are old enough for alcohol.");
		}

		if (age < 35)
		{
			System.out.println("You're too young to be president.");
			System.out.println("Sad :(");
		}else{
			System.out.println("You are old enough to be president.");
		}

		if (age>=65)
		{
			System.out.println("You are old enough to retire.");
		}else{
			System.out.println("You are not old enough to retire yet.");
		}
		//Study Drills
		//1. In the original program, nothing gets printed age 35 or older because nothing gets printed if none of the "if" conditions are met, and there are only "if" conditions for less than 35.


	}


}