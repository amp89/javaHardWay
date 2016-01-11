import java.util.Scanner;

public class WeaselOrNot
{
	public static void main(String[] args)
	{
		//make a scanner keyboard
		Scanner keyboard = new Scanner(System.in);

		//decare variables
		String word;
		boolean yup, nope;

		System.out.println("Type \" weasel \"  please!");
		word = keyboard.next();

		yup = word.equals("weasel");
		nope = ! word.equals("weasel");

		System.out.println("YOU TYPED THE RIGHT THING: " + yup);
		System.out.println("YOU IGNORED INTRUCTIONS: " + nope);

		//study drill, does this work:

		yup = "weasel".equals(word);

		System.out.println("again... TYPED THE RIGHT THING: " + yup + " (This one is for the Study Drill)");



	}



}