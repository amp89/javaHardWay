public class ShallowGrandmotherSD{

	public static void main (String[] args)
	{
		int x = 3 | 5;
			//here is what's happening:
			// 3 = 1100
			// 5 = 1010
			//there is a one in at least one of the variables in the first 3 positions
			// 1100 or 1010 = 1110, whereas and 1 would only be 1000 because there is a one in only the first position for both variables
			// 1110 = 7 so x = 7

		int y = 3 & 5;
			//here is what's happening:
			// 3 = 1100
			// 5 = 1010
			// 1100 and 1010 = 1000
			//there is a one in only the first position of first variables
			// 1000 = 1 so y = 1

		System.out.println("X (3|5) : " + x + "\nY (3&5): " + y);
	}

}