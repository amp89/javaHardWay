

public class RandomNumbers
{
	public static void main(String[] args)
	{
		int a,b,c;
		double x,y,z;

		x = Math.random();
		y = Math.random();
		z = Math.random();

		System.out.println("X = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);

		x = Math.random()*100;
		y = Math.random()*100;
		z = Math.random()*100;

		System.out.println("\nX = " + x);
		System.out.println("Y = " + y);
		System.out.println("Z = " + z);


		a = (int)x; //removing the cast will give an error because a is supposed to be an int, and it cannot hold a double value (x is a double)
		b  = (int) y;
		c = (int)z;

		System.out.println("\na is " + a);
		System.out.println("b is "+ b);
		System.out.println("c is " + c);

		x = 0.9999999999999;
		a = (int)(x*100);

		System.out.println("\nx is " + x);
		System.out.println("a is " + a);

		x = Math.random();
		a = 0 + (int)(x*100);
		b = 1 + (int)(x*100);
		c = 5 + (int)(x*100);


		System.out.println("\na is " + a);
		System.out.println("b is "+ b);
		System.out.println("c is " + c);

	}
}