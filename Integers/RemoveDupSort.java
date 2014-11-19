package com.sukanya.Integer;

public class RemoveDupSort 
{
	public static void main(String args[])
	{
		int num[] = {1,1,2,3};
		remDup(num);
	}
	
	public static void remDup(int[] num)
	{
		if(num == null)
			return;
		else
		{
			int len = 0;
			int cur = 1;
			
			while(cur < num.length)
			{
				if(num[cur] != num[len])
				{
					num[len++] = num[cur++];
				}
				else
				{
					cur ++;
				}
			}
			
		//	System.out.println(len + 1);
			
			for(int i=0;i<num.length;i++)
			{
				System.out.println(num[i]);
			}
		}
	}

}
