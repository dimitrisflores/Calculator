import java.util.Scanner;

public class calculator
{
public static int player;
public static double one;
public static double two;
public static void main(String[] args)
	{
		//calcSetUp();
	
	}
	public static void calcSetUp()
		{
		System.out.println();
		System.out.println("Hello what math would you like to do?");
		System.out.println("1) Add");
		System.out.println("2) Subtract");
		System.out.println("3) Multiply");
		System.out.println("4) Divide");
		Scanner userInput = new Scanner(System.in);
		player = userInput.nextLine();
		if(player == 1)
			{
				
			}
		else if (player == 2)
			{
				
			}
		else if (player == 3)
			{
			
			}
		else if (player == 4)
			{
				
			}
		}
		public static double add(double x, double y)
			{
			System.out.println("Ok what numbers would you like to add?");
			Scanner userInput = new Scanner(System.in);
			one = userInput.nextDouble();
			Scanner userInput1 = new Scanner(System.in);
			two = userInput1.nextDouble();
			System.out.println("Ok that equals " + add(one, two));
			return x + y;
			}
		public static double subtract(double x, double y)
			{
			System.out.println("Ok what numbers would you like to subtract?");
			Scanner userInput = new Scanner(System.in);
			one = userInput.nextDouble();
			Scanner userInput1 = new Scanner(System.in);
			two = userInput1.nextDouble();
			System.out.println("Ok that equals " + add(one, two));	
			return x - y;
			}
		public static double multiply(double x, double y)
			{
			System.out.println("Ok what numbers would you like to multiply?");
			Scanner userInput = new Scanner(System.in);
			one = userInput.nextDouble();
			Scanner userInput1 = new Scanner(System.in);
			two = userInput1.nextDouble();
			System.out.println("Ok that equals " + add(one, two));	
			return x * y;
			}
		public static double divide(double x, double y)
			{
			System.out.println("Ok what numbers would you like to divide?");
			Scanner userInput = new Scanner(System.in);
			one = userInput.nextDouble();
			Scanner userInput1 = new Scanner(System.in);
			two = userInput1.nextDouble();
			System.out.println("Ok that equals " + add(one, two));		
			return x/y;
			}
		public static double takeExponent(double x, double y)
		{
			return Math.pow(x,y);
		}
}
	
