import java.util.Scanner;

public class ThirtyDays
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String monthName = "ERROR";
		int days;

		System.out.print("Type the number of the month: ");
		int month = keyboard.nextInt();

		switch(month)
		{
			case 1: monthName = "January";
			//break;

			case 2: monthName = "February";
			//break;

			case 3: monthName = "March";
			//break;

			case 4: monthName = "April";
			break;

			case 5: monthName = "May";
			break;

			case 6: monthName = "June";
			break;

			case 7: monthName = "July";
			break;

			case 8: monthName = "August";
			break;

			case 9: monthName = "September";
			break;

			case 10: monthName = "October";
			break;

			case 11: monthName = "November";
			break;

			case 12: monthName = "December";
			break;
		}//end swtich

		switch(month)
		{
			case 9:
			case 4: //Study Drill Stuff: these cases just follow the next case that the compiler thingy sees
					//if there is no break the swtich doesn't do anything until it sees a break.
			case 6:
			case 11: days = 30;
			break;
			case 2: days = 28;
			break;
			default: days = 31;	
		}//end switch2

		System.out.println(days + " days in " + monthName);
	}



}