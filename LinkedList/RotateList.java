package com.sukanya.LinkedList;

public class RotateList 
{
	public ListNode rotateRight(ListNode head, int n) 
    {
		if(head == null || n==0)
			return head;
		else
		{
			ListNode current = head;
			
			while(n > 0)
			{
				if(current == null) current = head;
				current = current.next;
				n--;
			}
			if(current == null)
				return head;
			
			ListNode runner = head;
			
			while(current.next != null)
			{
				current = current.next;
				runner = runner.next;
			}
			
			current.next = head;
			ListNode newHead = runner.next;
			runner.next = null;
			return newHead;
		}
    }

}
