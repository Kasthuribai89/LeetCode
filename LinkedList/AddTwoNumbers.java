package com.sukanya.LinkedList;

public class AddTwoNumbers 
{
	
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		if(l1 == null || l2 == null)
			return null;
		else
		{
			int a = getNumbers(l1);
			int b = getNumbers(l2);
			
			int sum = a+b;
			print(getList(sum));
			return getList(sum);
			
		}
			
	}
	 
	 public ListNode getList(int number)
	 {
		 String s = Integer.toString(number);
		 char[] number_list= s.toCharArray();
		 ListNode node = null;
		 ListNode head = new ListNode(number_list[number_list.length-1]-'0');
		 node = head;
		 int y = node.val;
		// System.out.println("head is "+ y);
		 for(int i=number_list.length-2;i>=0;i--)
		 {
			 int x = number_list[i]-'0';
		//	 System.out.println("char is "+ x);
			 ListNode newNode = new ListNode(number_list[i]-'0');
			 node.next = newNode;
			 node=node.next;
			 
		 }
		 
		 return head;
	 }
	 
	 
	 public int getNumbers(ListNode head)
	 {
		 int number = 0;
		 
		 ListNode current = head;
		 
		 while(current != null)
		 {
			 number = (number * 10)  + current.val;
			 current = current.next;
		 }
		 
		 return number;
	 }
	 
	 public void print(ListNode head)
	 {
			if(head == null)
				System.out.println("No list");
			else
			{
				ListNode current = head;
				while(current != null)
				{
					System.out.print(current.val+" -> ");
					current = current.next;
				}
				System.out.print("null");
			}
		}

}
