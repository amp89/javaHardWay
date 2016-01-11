
public class YachtDice
{
	public static void main(String[] args)
	{
		int roll1, roll2, roll3, roll4, roll5, roll6;
		String tab = "\t";
		boolean allTheSame;

		do 
		{
			roll1 = 1 + (int)(Math.random()*6);
			roll2 = 1 + (int)(Math.random()*6);
			roll3 = 1 + (int)(Math.random()*6);
			roll4 = 1 + (int)(Math.random()*6);
			roll5 = 1 + (int)(Math.random()*6);
			roll6 = 1 + (int)(Math.random()*6);

			System.out.println("YOU ROLLED: " + tab + roll1 + tab + roll2
			+ tab + roll3 + tab + roll4 + tab + roll5 + tab + roll6);

			showDice(roll1);
			showDice(roll2);
			showDice(roll3);
			showDice(roll4);
			showDice(roll5);
			showDice(roll6);

			allTheSame = (roll1 == roll2 && roll2 == roll3 && roll3
			== roll4 && roll4 == roll5 && roll5 == roll6);

		} while(! allTheSame);
		System.out.println("YACHT!");
	}
	public static void showDice(int roll)
	{
		System.out.println("+---+");

		if (roll == 1)
		{
			System.out.println("|   |");
			System.out.println("| O |");
			System.out.println("|   |");

		}

		else if (roll == 2)
		{

			System.out.println("|O  |");
			System.out.println("|   |");
			System.out.println("|  O|");

		}

		else if (roll == 3)
		{

			System.out.println("|O  |");
			System.out.println("| O |");
			System.out.println("|  O|");

		}

		else if (roll == 4)
		{

			System.out.println("|O O|");
			System.out.println("|   |");
			System.out.println("|O O|");

		}

		else if (roll == 5)
		{

			System.out.println("|O O|");
			System.out.println("| O |");
			System.out.println("|O O|");

		}

		else if (roll == 6)
		{

			System.out.println("|OOO|");
			System.out.println("|OOO|");
			System.out.println("|OOO|");

		}

		System.out.println("+___+");


	}




	
	

}