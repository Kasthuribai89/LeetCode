package com.sukanya.Integer;

public class ReverseInteger 
{
	public int reverse(int number)
	{
		if(number == 0)
			return 0;
		else
		{
			int rev = 0;
			while(number != 0)
			{
				int temp = number % 10;
				rev = rev * 10 + temp;
				number = number / 10;
			}
			return rev;
		}
	}

}
