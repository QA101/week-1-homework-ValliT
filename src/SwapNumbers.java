import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		/*  Developed by Valli T
		 *  Swapping using temp variables
		 *  Write a program that will change values of variables:
			x=10 and y=5 => swap to make x=5 and y=10
			x=2.5 and y=7.5 => swap to make x=7.5 and y=2.5
			x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5
		 */
		Scanner inputConsole = new Scanner(System.in);
		
		//receiving numbers
		System.out.print("Enter int x ");
		int x = inputConsole.nextInt();
		
		System.out.print("Enter int y : ");
		int y = inputConsole.nextInt();

		System.out.print("Enter int z : ");
		int z = inputConsole.nextInt();

		System.out.print("Enter double x ");
		double a = inputConsole.nextDouble();
		
		System.out.print("Enter double y : ");
		double b = inputConsole.nextDouble();
		
		//Swapping using Temp variables
		swap(x,y);
		swap(a,b);
		inttripleSwap(x,y,z);
	}

	public static void swap(int x, int y) 
	{
		int tempVar = x;
		x = y;
		y = tempVar;
		System.out.println("Swapped int x : " + x  +  " Swapped int y : " + y);
		return;
	}
	
	public static void swap(double x, double y) 
	{
		double tempVar = x;
		x = y;
		y = tempVar;
		System.out.println("Swapped double x : " + x  +  " Swapped double y : " + y);
		return;
	}
	
	public static void inttripleSwap (int x, int y, int z)
	{
		//x=10 / y=5 / z=12 => swap to make x=12 / y=10 /z=5
		int tempVar = x;
		x = z;
		z = y;
		y = tempVar;
		System.out.println("Swapped x : " + x  +  " Swapped y : " + y + " Swapped z : " + z);
		return;
	}

	
	
}
