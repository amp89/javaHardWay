import java.util.Scanner;

public class GenderTitles
{

	public static void main (String[]     args      )
	{

		Scanner keyboard =  new Scanner(System.in);

		String title = ""; //Display no title if there is an error

		System.out.print("First name: ");
		String first = keyboard.next();

		System.out.print("Last name: ");
		String last = keyboard.next();
		
		System.out.print("Gender: ");
		String gender = keyboard.next().toLowerCase();
		
		System.out.print("Age: ");
		int age = keyboard.nextInt();


		if (age < 20)
		{
			title = first;
		}
		else
		{
			if (gender.equals("f"))
			{
				System.out.print("Are you married, " + first + "? (y/n): ");
				String married = keyboard.next().toLowerCase();
				if (married.equals("y"))
				{
					title = "MRS. ";
				}
				else
				{
					title = "MS. ";
				}
			}
			else if(gender.equals("m")){
				title = "MR. ";
			}else{
				System.out.println("There was an error.");
			}
		}

		System.out.println("\n" + title + last + ", " + first);
	}
}