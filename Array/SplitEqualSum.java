package com.kasthuri.adapiveinsights;

import java.util.Scanner;

/**
 * Input  : {}
 * Output : false
 * 
 * Input  : {4,2,2,1,3,1,3}
 * Output : true
 * 
 * Input  : {4,2,2,1}
 * Output : false
 * 
 * Input  : {-1,-2,-3,-3,-2,-1}
 * Output : true
 * 
 * Input  : {0,0,0};
 * Output : true
 * 
 * Input  : {-2,4,1,1,1}
 * Output : false
 */

public class SplitEqualSum 
{
	static int array[];
	public static void main(String args[])
	{
		int[] array1 = {};
		int[] array2 = {4,2,2,1,3,1,3};
		int[] array3 = {4,2,2,1};
		int[] array4 = {-1,-2,-3,-3,-2,-1};
		int[] array5 = {0,0,0};
		int[] array6 = {-2,4,1,1,1};
		 
		System.out.println(splitEquals(array1));
		System.out.println(splitEquals(array2));
		System.out.println(splitEquals(array3));
		System.out.println(splitEquals(array4));
		System.out.println(splitEquals(array5));
		System.out.println(splitEquals(array6));
  	}
	
	/**
	 * This method checks if the array can be split into two with equal sum.
	 * @param array of integers
	 * @return true/false.
	 */
	public static boolean splitEquals(int array[])
	{
		if(array == null || array.length == 0)
			return false;
		 int totalSum = 0;
		 // Calculate the sum of the entire array.  
		    for (int i = 0; i < array.length; i++)
		    	totalSum += array[i];
		 // If the sum is odd the array cannot be divided.
		    if (totalSum%2 != 0)  
		       return false;
		    return isPartionable(array,array.length,totalSum/2);
	}
	/**
	 * This method checks recursively is there any subset which is equal to the given sum.
	 * 
	 * @param array of integers
	 * @param length of the array
	 * @param half sum of the array element
	 * @return true/false
	 */
	public static boolean isPartionable(int array[], int length, int sum)
	{
		if(sum == 0)
			return true;
		if(length == 0 && sum != 0)
			return false;
		/**
		 * Recursively check if the subset sum is equal to the given sum.
		 */
			
		if(sum > 0)
		{
			if(array[length-1] > sum)
				return isPartionable(array,length,sum);
			
		}
		else
		{
			if(array[length-1] < sum)
				return isPartionable(array,length,sum);
			
		}
		
		return isPartionable(array,length-1,sum) || isPartionable(array,length-1,sum - array[length-1]);
	}	
}
