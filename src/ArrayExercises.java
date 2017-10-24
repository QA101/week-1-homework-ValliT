
import java.util.Scanner;


public class ArrayExercises {
	/*
	 * Developed by ValliT
	 * Program to complete Array exercises. Uses methods to complete different
	 * tasks
	 * 
	 */

	public static void main(String[] args) {

		Scanner inputConsole = new Scanner(System.in);
		
		//receiving arraysize
		System.out.print("Enter the number of integers you want to input : ");
		int number = inputConsole.nextInt();
		
		if (number <= 0) {
			 System.out.println("No array for input");
		 }
		else 
		{
			printIntArrayMethod(number);
			printDoubleArrayMethod(number);
		}
		
	}
	
	public static void printIntArrayMethod(int x ) {
		//Method to receive inputs and Print the integer array 
		int inputArray[] = new int[x];
		int productArray = 1;
		System.out.println("Enter your integer array numbers : ");
		for(int i = 0; i < inputArray.length ; i++)
		{
		Scanner inputConsoleInt = new Scanner(System.in);
		inputArray[i] = inputConsoleInt.nextInt();
		
		}
		  
		for(int i = 0; i < inputArray.length; i++) // forward printing integer array
		{
			productArray = productArray * inputArray[i];
			System.out.println("Integer Array a[" + i +"] = " +inputArray[i]);
		}
		
		for(int i = (inputArray.length - 1); i >= 0 ; i--) // reverse printing integer array
		{
			System.out.println("Reverse Integer Array a[" + i +"] = " +inputArray[i]);
		}
		//product of integer array printing
		System.out.println("Product of the Integer array = " + productArray);

	}

	public static void printDoubleArrayMethod(int x ) {
		//Method to receive inputs and Print the double array 
		double inputArray[] = new double[x];
		double productArray = 1.0;
		double AverageArray = 0.0;
		System.out.println("Enter your double array numbers : ");
		for(int i = 0; i < inputArray.length; i++)
		{
		Scanner inputConsoleDouble = new Scanner(System.in);
		inputArray[i] = inputConsoleDouble.nextDouble();
		
		}
		  
		for(int i = 0; i < inputArray.length; i++) // forward printing integer array
		{
			productArray = productArray * inputArray[i];
			AverageArray = AverageArray + inputArray[i];
			System.out.println("Double Array a[" + i +"] = " +inputArray[i]);
		}
		
		for(int i = (inputArray.length-1); i >= 0 ; i--) // reverse printing integer array
		{
			System.out.println("Reverse Double Array a[" + i +"] = " +inputArray[i]);
		}
		
		//computing average double array
		AverageArray = AverageArray / x;
		//product of integer array printing
		System.out.println("Product of the Double array = " + productArray);
		System.out.println("Average of the Double array = " + AverageArray);
	}

}
