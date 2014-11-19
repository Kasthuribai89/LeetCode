package com.sukanya.Integer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSumCloset
{
	public List threeSumCloset(int num[],int target)
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		LinkedList<LinkedList<Integer>> result = new LinkedList<LinkedList<Integer>>();
		
		if(num == null || num.length < 3)
		{
			return result;
		}
		else
		{
			Arrays.sort(num);
			for(int i=0;i<num.length;i++)
			{
				
				int temp = num[i];
				int start = i+1;
				int end = num.length - 1;
				System.out.println("temp "+temp+" start " + start + " end "+end);
				while(start <  end)
				{
					
					int sum = temp + num[start] + num[end];
					//System.out.print(" sum "+sum);
					if(sum  == target)
					{
						System.out.println("I am in");
						list = new LinkedList<Integer>();
						list.add(temp);
						list.add(num[start]);
						list.add(num[end]);
						result.add(list);
						
						start ++;
						end --;
						
						while(start < end && num[start] == num[start - 1])
						{
							start++;
						}
						while(start < end && num[end] == num[end + 1])
						{
							end --;
						}
					}
					
					else if(sum > target)
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
