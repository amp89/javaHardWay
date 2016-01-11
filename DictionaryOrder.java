import java.util.Scanner;

public class DictionaryOrder
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name; 

		System.out.print("Random Name: ");
		name = keyboard.nextLine();
		name = name.toLowerCase();
		System.out.println(name);

		//c++
		if (name.toUpperCase().compareTo("C++") < 0 )
		{
			System.out.println(name + " is before C++");
		}

		if (name.toUpperCase().compareTo("C++") == 0)
		{
			System.out.println(name + " is C++");
		}

		if (name.toUpperCase().compareTo("C++") > 0 )
		{
			System.out.println(name + " is after C++");
		}


		//go
		if (name.compareTo("go") < 0 )
		{
			System.out.println(name + " is before go");
		}

		if (name.compareTo("go") == 0)
		{
			System.out.println(name + " is go");
		}

		if (name.compareTo("go") > 0 )
		{ 
			System.out.println(name + " is after go");
		}

		
		//java
		if (name.compareTo("java") < 0 )
		{
			System.out.println(name + " is before java");
		}

		if (name.compareTo("java") == 0)
		{
			System.out.println(name + " is java");
		}

		if (name.compareTo("java") > 0 )
		{
			System.out.println(name + " is after java");
		}

		

		//lisp

		if (name.compareTo("lisp") < 0 )
		{
			System.out.println(name + " is before lisp");
		}

		if (name.compareTo("lisp") == 0)
		{
			System.out.println(name + " is lisp");
		}

		if (name.compareTo("lisp") > 0 )
		{
			System.out.println(name + " is after lisp");
		}

		


		//python

		if (name.compareTo("python") < 0 )
		{
			System.out.println(name + " is before python");
		}

		if (name.compareTo("python") == 0)
		{
			System.out.println(name + " is python");
		}

		if (name.compareTo("python") > 0 )
		{
			System.out.println(name + " is after python");
		}

		

		//ruby

		if (name.compareTo("ruby") < 0 )
		{
			System.out.println(name + " is before ruby");
		}

		if (name.compareTo("ruby") == 0)
		{
			System.out.println(name + " is ruby");
		}

		if (name.compareTo("ruby") > 0 )
		{
			System.out.println(name + " is after ruby");
		}

		

		//visualbasic

		if (name.compareTo("visualbasic") < 0 )
		{
			System.out.println(name + " is before visualbasic");
		}

		if (name.compareTo("visualbasic") == 0)
		{
			System.out.println(name + " is visualbasic");
		}

		if (name.compareTo("visualbasic") > 0 )
		{
			System.out.println(name + " is after visualbasic");
		}

		


	}


}