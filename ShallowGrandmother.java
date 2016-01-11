import java.util.Scanner;

public class ShallowGrandmother 
{
	public static void main (String[] args)
	{
		//make scanner 'keyboard'
		Scanner keyboard = new Scanner(System.in);

		//make variables
		int age;
		double income, attrativeness;
		boolean allowed;

		System.out.print("Enter your age: ");
		age = keyboard.nextInt();

		System.out.print("Yearly Income: ");
		income = keyboard.nextDouble();

		System.out.print("how attrative, from 0.0 to 10.0: ");
		attrativeness = keyboard.nextDouble();
		// over 25 AND less than 40 AND (high income OR attractive)
		allowed = ( age > 25 && age < 40 && (income > 50000 || attrativeness >= 8.5) );

		System.out.println("You are allowed to date: " + allowed);

		//for study drill question (& and |) see ShallowGrandmotherSD.java
	}



}