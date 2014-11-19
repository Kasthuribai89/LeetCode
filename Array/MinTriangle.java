package com.sukanya.Array;

import java.util.ArrayList;
import java.util.List;

public class MinTriangle 
{
	public static void main(String args[])
	{
		List<List<Integer>> triangle = new ArrayList();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(2);
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(4);
		List<Integer> list3 = new ArrayList<Integer>();
		list3.add(6);
		list3.add(5);
		list3.add(7);
		List<Integer> list4 = new ArrayList<Integer>();
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(3);
		
		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);
		
		System.out.println(minimumTotal(triangle));
	}
	 public static  int minimumTotal(List<List<Integer>> triangle) 
	 {
		 if(triangle == null)
			 	return 0;
		 else
		 {
			 int temp[] = new int[triangle.size()];
			 
			 for(int i=0;i<triangle.size();i++)
			 {
				 List<Integer> list = new ArrayList();
				 list = triangle.get(i);
				 
				 for(int j=list.size()-1;j>=0;j--)
				 {
					 if(j == 0)
					 {
						 temp[j] = temp[j] + list.get(j);  
					 }
					 else if(j == list.size()-1)
					 {
						 temp[j] = temp[j-1] + list.get(j);
					 }
					 else
					 {
						 temp[j] = Math.min(temp[j], temp[j-1] ) + list.get(j);
					 }
				 }
			 }
		 
		 
		 int min = temp[0];
	        for (int i=1; i<temp.length; i++)
	            min = Math.min(min, temp[i]);
	        return min;
	 }
	 }
}
