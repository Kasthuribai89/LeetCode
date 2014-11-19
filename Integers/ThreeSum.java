package com.sukanya.Integer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum
{
	
	List threeSum(int num[])
	{
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		LinkedList<LinkedList<Integer>> result = new LinkedList<LinkedList<Integer>>();
		
		if(num == null || num.length < 3)
			return result;
		else
		{
			Arrays.sort(num);
			for(int i=0;i<num.length;i++)
			{
				int negate = -num[i];
				int start = i+1;
				int end = num.length - 1;
				
				while(start < end)
				{
					if(negate == num[start] + num[end])
					{
						list = new LinkedList<Integer>();
						list.add(num[i]);
						list.add(num[start]);
						list.add(num[end]);
						result.add(list);
						start ++;
						end --;
						
						while(start < end && num[start] == num[start - 1])
						{
							start ++;
						}
						while(start < end && num[end] == num[end + 1])
						{
							end --;
						}
						
					}
					else if(num[start] + num[end] > negate)
					{
						end --;
					}
					else
					{
						start ++;
					}
				}
			}
			
			return result;
		}
	}

}
