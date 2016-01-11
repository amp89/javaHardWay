import java.util.Scanner;

public class ClubBouncer
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age = 22;
		boolean onGuestList = false;
		double attractiveness = 7.5;
		String gender = "F";

		if (onGuestList || age>= 21 || ( gender.equals("F") && attractiveness >= 8))
		{
			System.out.println("YOU MAY ENTER");
		}else
		//Can't put stuff here
		{
			System.out.println("GO AWAY");
		}

	}

}