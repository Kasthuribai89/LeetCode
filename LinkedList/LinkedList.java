package com.sukanya.LinkedList;

public class LinkedList 
{
	public ListNode head;
	
	public void add(int newVal)
	{
		ListNode newNode = new ListNode(newVal);
		
		if(head == null)
		{
			head = newNode;
			head.next = null;
		}
		else
		{
			ListNode current = head;
			while(current.next !=  null)
			{
				current = current.next;
				
			}
			
			current.next = newNode;
		}
	}
	
	public void remove(int value)
	{
		if(head == null)
			return;
		else if(head.val == value)
		{
			head = head.next;
		}
		else
		{
			ListNode prev = null;
			ListNode current = head;
			
			while(current != null && current.next != null)
			{
				current = current.next;
				
				if(current.val == value)
				{
					prev.next = current.next;
				}
				
				prev = current;
			}
		}
	}
	
	public void print()
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
