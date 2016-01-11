import java.util.Scanner;

public class BMICategories
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double bmi;

		System.out.print("Enter your BMI: ");
		bmi = keyboard.nextDouble();

		System.out.println("BMI Category");

		//<15 severe underwegiht
		if (bmi < 15 )
		{
			System.out.println("Very Severly Underweight");
		}
		//<16 severyly underweight
		else if (bmi < 16)
		{
			System.out.println("Severly Underweight");
		}
		//<18.5 underweight
		else if (bmi < 18.5)
		{
			System.out.println("Underweight");
		}
		//< 25 normal
		else if (bmi < 25)
		{
			System.out.println("Normal");
		}
		//< 30 overw
		else if (bmi < 30)
		{
			System.out.println("Overweight");
		}
		//< 35 mod ob
		else if (bmi < 35)
		{
			System.out.println("Moderately Obese");
		}
		//< 40 severely obese
		else if (bmi < 40)
		{
			System.out.println("Severly Obese");
		}
		//> 40 morbidly obese
		else{
		//if{		
			System.out.println("Very Severely/\"Morbidly\" Obese");
		}



	}


}