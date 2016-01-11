import java.util.Scanner;
import static java.lang.System.*;

public class ShapeArea
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int choice;
		double area = 0;

		System.out.println("Shape Area Calculator, Version 0.1 (c) 2015 Alexander Peterson, FUCKYOU.");


		do
		{
			out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			out.println("1: Triangle");
			out.println("2: Cirlce");
			out.println("3: Rectangle");
			out.println("4: Square");
			out.println("5: Quit");
			out.print("> ");
			choice = keyboard.nextInt();

			if (choice == 1)
			{
				out.print("\nBase: ");
				int b = keyboard.nextInt();
				out.print("\nHeight: ");
				int h = keyboard.nextInt();
				area = computeTriangleArea(b,h);
				System.out.println("The area is " + area ); //lets leave sys and see what happnes
			}

			else if (choice == 2)
			{
				out.print("\nRadius: ");
				int r = keyboard.nextInt();;; // what if i do this
				area = computeCircleArea(r);
				out.println("The area is " + area);
			} 
			else if (choice == 3)
			{
				out.print("\nLenth: "); //rect
				int lenth = keyboard.nextInt();
				out.print("\nWidth: ");
				int width = keyboard.nextInt();
				out.println("The area is " + computeRectangleArea(lenth,width));
				; // what if i put that here?


	
			}
			else if (choice == 4)
			{
				out.print("\nSide Lenth: ");
				int lenth = keyboard.nextInt();
				System.out.println("The area is " + computeSquareArea(lenth));
			}
			else if (choice != 5)
			{
				out.println("Error.");
			}

		} while(choice != 5);


	}

	public static double computeTriangleArea(int base, int height)
	{
		double A;
		A = (0.5)*(base*height);
		return A; 
	}

	public static double computeCircleArea(int radius)
	{
		double A;
		A = Math.PI*radius*radius;
		return A;
	}

	public static int computeRectangleArea(int length, int width)
	{
		return(length*width);
	}

	public static int computeSquareArea(int length)
	{
		return(length*length);
	}
}