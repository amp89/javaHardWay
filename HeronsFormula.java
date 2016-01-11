import static java.lang.System.*;

public class HeronsFormula
{
	public static void main(String[] args)
	{
		double a;

		a = triangleArea(3,3,3);
		out.println("A triangle with sides 3 3 3 has an area of " + a );

		a = triangleArea(3,4,5);
		out.println("A triangle with sides 3 4 5 has an area of " + a );

		a = triangleArea(7,8,9);
		out.println("A triangle with sides 7 8 9 has an area of " + a );

		out.println("A triangle with sides 5 12 13 has an area of " + triangleArea(5,12,13) );

		out.println("A triangle with sides 10 9 11 has an area of " + triangleArea(10,9,11) );

		out.println("A triangle with sides 8 15 17 has an area of " + triangleArea(8,15,17) );

		a = triangleArea(9,9,9);
		out.println("A triangle with sides 9 9 9 has an area of " + a);

	}


	public static double triangleArea(int a, int b, int c)
	{
		Double s,A;
		s = (a+b+c)/2.0;
		//this seemed to work for fixing it too: s = ((double)(a + b + c)/2);
		A = Math.sqrt(s*(s-a)*(s-b)*(s-c));

		return A;
	}
}