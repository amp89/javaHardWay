import java.util.Scanner;

public class ForgetfulMachine
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("What is the capital of France?");
		keyboard.next();

		System.out.println("6 x 7?");
		keyboard.nextInt();

		System.out.println("# between 0.0 and 1.0?");
		keyboard.nextDouble();

		System.out.println("Other stuff?");
		keyboard.next();


	}



}