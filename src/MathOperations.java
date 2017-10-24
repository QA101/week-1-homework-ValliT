import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		/*  Developed by ValliT
		 *  Write a program that will find sum, subtraction, multiplication and division
			and if one number bigger than other true or false for:
			1) x = 175 / y =255
			2) x = 25.75 / y = 17.34 
		*/

		Scanner inputConsole = new Scanner(System.in);
		
		//receiving numbers
		System.out.print("Enter int x ");
		int x = inputConsole.nextInt();
		
		System.out.print("Enter int y : ");
		int y = inputConsole.nextInt();

		System.out.print("Enter double x ");
		double a = inputConsole.nextDouble();
		
		System.out.print("Enter double y : ");
		double b = inputConsole.nextDouble();

		if (x > y )
		{
			System.out.println("x is bigger than other : True");
			division(x,y);
			subtraction(x,y);
		}
		else
		{
			System.out.println("y is bigger than other : True");
		    division(y,x);
		    subtraction(y,x); // always generates positive numbers
		    
		}
		if (a > b )
		{
			System.out.println("x is bigger than other : True");
			division(a,b);
			subtraction(a,b); 
		}
		else
		{
			System.out.println("y is bigger than other : True");
		    division(b,a);
		    subtraction(b,a); //always generates positive numbers
		}
		
		// Addition
        int intAdd = x + y;
		double doubleAdd = a + b;
		
		System.out.println("Integer addition : " + intAdd);
		System.out.println("Double addition : " + doubleAdd);

		// Multiplication
        int intMult = x * y;
		double doubleMult = a * b;
		
		System.out.println("Integer Multiplication : " + intMult);
		System.out.println("Double Multiplication : " + doubleMult);

	}
	

	public static void division(int x, int y) {
	    int intAnswer = 0;
		intAnswer = x / y;
		System.out.println(" Division answer for Integer "+intAnswer);
		return;
	}
	
	public static void division(double x, double y) {
		double doubleAnswer = 0;
		doubleAnswer = x / y;
		System.out.println(" Division answer for Double "+doubleAnswer);
		return;
	}
	
	public static void subtraction(int x, int y) {
		int intSubtract = 0;
		intSubtract = x - y;
		System.out.println(" Subtraction answer for Int "+intSubtract);
		return;
	}
	
	public static void subtraction(double x, double y) {
		double doubleSubtract = 0;
		doubleSubtract = x / y;
		System.out.println(" Subtraction answer for Double "+doubleSubtract);
		return;
	}
}
