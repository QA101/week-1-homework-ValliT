
public class BetweenProgram {

	/* Developed by : ValliT
	 * Write a program that determine if a number x is between 2 numbers y and z
	 * if x is between y and z, print TRUE otherwise print FALSE
	 * 
	 * example:
	 * x = 150
	 * y = 100
	 * z = 200
	 * should print TRUE
	 * 
	 */
	public static void main(String[] args) {
		
		int x = 150;
		int z = 200;
		int y = 100;
		
		if  (((x > y) && (x < z))  || ((x > z) && (x < y))) 
		{
			System.out.println("True");
			
		}
		else 
		{
			System.out.println("False");
		}
	}

}
