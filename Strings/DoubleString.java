package com.kasthuri.adapiveinsights;
/**
 * Input  : "xyz"
 * Output : "xxyyzz"
 * 
 * Input  : " ab"
 * Output : "aabb"
 * 
 * Input  : "89;"
 * Output : "8899;;"
 */
public class DoubleString 
{
	public static void main(String args[])
	{
		if(args.length < 1) {
			System.out.println("A minimum of one argument is necessary");
			return;
		}
		String s = args[0];
		System.out.println(doubleTheString(s));
	}
	
	/**
	 * This method repeats every character excluding space in the String twice 
	 * and returns the new string
	 * 
	 * @param str the input string 
	 * @return the output string
	 */
	public static String doubleTheString(String str)
	{
		if(str == null)
			return null;
		else
		{
			str = str.trim();
			// remove the extra space in a string
			StringBuilder sb = new StringBuilder();
			// append each letter/character in a string twice in the StringBulder object.
			for(int i=0;i<str.length();i++){
				char letter = str.charAt(i);
				sb.append(letter).append(letter);
			}
			
			return sb.toString();
		}
	}

}
