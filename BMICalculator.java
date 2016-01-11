import java.util.Scanner;

public class BMICalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double m,kg,bmi,in,ft,lbs;

		// System.out.println("Height (m): ");
		// m = keyboard.nextDouble();

		// System.out.println("Weight (kg): ");
		// kg = keyboard.nextDouble();
		System.out.println("Height (ft only)? ");
		ft = keyboard.nextDouble();
		System.out.println("Height (in. only)? ");
		in = keyboard.nextDouble();

		System.out.println("Weight (lbs)? ");
		lbs = keyboard.nextDouble();

		//switch ft to inches, add inces, assign to original inch variable.
		in = (ft*12)+in;

		//convert
		//in to m
		//kg to lbs
		kg = lbs/2.20462;
		m = in/39.3701;


		//bmi
		bmi = kg/(m*m);

		//print
		System.out.println("BMI: " + bmi);


	}

}