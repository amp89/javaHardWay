

public class ThereAndBackAgain
{
	public static void main(String[] args)
	{
		System.out.println("HERE");
		erebor(); //Study Drill Question: Does not compile without perenthesis.
		System.out.println("Back once");
		erebor();  //If this is deleted it just doesn't call erebor a second time.
		System.out.println("Back again");
	}

	public static void erebor()
	{
		System.out.println("\tTHERE");
	}

}