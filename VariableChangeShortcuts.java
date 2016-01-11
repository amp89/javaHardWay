public class VariableChangeShortcuts
{
	public static void main(String[] args)
	{

		int i,j,k;
		String seperator = "\t";

		i=5;
		j=5;
		k=5;

		System.out.println("i: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i = i+3;
		j = j-3;
		k = k*3;

		System.out.println("i: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i = 5;
		j = 5;
		k = 5;

		System.out.println("\ni: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i += 3;
		j -= 3;
		k *= 3;
		
		System.out.println("i: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i = j = k = 5;

		System.out.println("\ni: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i += 1;
		j -= 2;
		k *= 3;

		System.out.println("i: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i = j = k = 5;

		System.out.println("\ni: " + i + seperator + "j: " + j + seperator + "k: " + k);

		i =+1 ;
		j =-2 ;
		System.out.println("i: " + i + seperator + "j: " + j + seperator + "k: " + k);

		j = i = k = 5;

		System.out.println("\ni: " + i + seperator + "j: " + j + seperator + "k: " + k);
		i++;
		j--;
		System.out.println("i: " + i + seperator + "j: " + j + seperator + "k: " + k);



	}


}