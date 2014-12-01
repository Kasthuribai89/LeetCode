package com.kasthuri.adapiveinsights;
/**
 * Input  :  182, 0
 * Output :  182
 * 
 * Input  : -1002, 999
 * Output : 999
 * 
 * Input  : 0, 0
 * Output : 0
 */
public class CloseToThousand 
{
	public static void main(String args[])
	{
		if(args.length < 2) {
			System.out.println("A minimum of two arguments is necessary");
			return;
		}
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		System.out.println(findNearest(number1,number2));
	}
	
	/**
	 * Find the absolute values of both the numbers subtracting 1000 
	 * Return the number that has the smaller absolute number
	 * 
	 * @param numberOne the first number
	 * @param numberTwo the second number
	 * @return nearest number of the two inputs
	 */
	public static int findNearest(int numberOne , int numberTwo)
	{
		int nearest = numberOne;
		int num1Sub = Math.abs(1000 - numberOne);
		int num2Sub = Math.abs(1000 - numberTwo);
		if(num2Sub < num1Sub)
			nearest = numberTwo;
		
		return nearest;		
	}
}
