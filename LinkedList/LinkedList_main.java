package com.sukanya.LinkedList;

public class LinkedList_main 
{
	public static void main(String args[])
	{
		findLastNElement last = new findLastNElement();
		
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.print();
		
		System.out.println();
		
		AddTwoNumbers ad = new AddTwoNumbers();
		
		System.out.println(last.findNLast(list1.head, 5).val);
		
		//ad.print(last.findNLast(list1.head, 1));
		
		
		
	}

}
