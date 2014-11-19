package com.sukanya.Array;

public class FindMin 
{
	public int findMin(int num[])
	{
		if(num == null)
			return 0;
		else
		{
			int min = Integer.MAX_VALUE;
			
			for(int i=0;i<num.length;i++)
			{
				if(num[i] < min)
				{
					min = num[i];
				}
			}
			return min;
		}
			
	}

}
