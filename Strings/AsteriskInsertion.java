package com.kasthuri.adapiveinsights;

import java.util.Scanner;
/**
 * Input  : adaptive insights
 * Output : a*d*a*p*t*i*v*e i*n*s*i*g*h*t*s
 *
 * Input  : single
 * Output : s*i*n*g*l*e
 * 
 * Input  : a
 * Output : a
 * 
 * Input  : 1950
 * Output : 1*9*5*0
 * 
 * Input  : ^(#_#_+$
 * Output : ^*(*#*_*#*_*+*$
 * 
 */

public class AsteriskInsertion 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
			System.out.println(asteriskBetweenChar(input.nextLine()));
		input.close();
	}
	
	/**
	 * This method inserts asterisk recursively between every character excluding space
	 * and returns the new string
	 * 
	 * @param str the input string 
	 * @return the output string
	 */
	public static String asteriskBetweenChar(String str)
	{
		// If s is null or one character return s
		if(str==null ||str.length() <= 1)
			return str;
	
		StringBuilder sb = new StringBuilder();
		// Get each character and append it with asterisk recursively.
		char currentChar  = str.charAt(0);
		if(currentChar == ' ' || str.charAt(1) == ' ')
			return sb.append(currentChar).toString()+asteriskBetweenChar(str.substring(1));
		return sb.append(currentChar).append('*').toString()+asteriskBetweenChar(str.substring(1));
	}
}
