import java.util.Scanner;

public class RudeQuestions
{

	public static void main(String[] args)
	{
		String name;
		int age;
		double weight,income;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Hey what's yoru name?");
		name = keyboard.next();

		System.out.println("Hey " + name + ", how old are you?");
		age = keyboard.nextInt();

		System.out.println("You are " + age + " years old.");
		System.out.print("How much do you weigh?");
		weight = keyboard.nextDouble();

		System.out.print(weight + "!  Wow.  How much money do you make?");
		income = keyboard.nextDouble();

		System.out.println("Hopefully, " + income + "per hour.");
		System.out.println("Thanks, bye " + name + " !");
	}

}