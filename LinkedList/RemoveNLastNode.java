package com.sukanya.LinkedList;

public class RemoveNLastNode 
{
	public ListNode removeNthFromEnd(ListNode head, int n) 
    {
		if(head == null || head.next == null)
			return null;
		else
		{
			ListNode runner = head;
			ListNode current = head;
			
			while(n > 0)
			{
				runner = runner.next;
				n--;
			}
			
			while(runner != null && runner.next != null)
			{
				current = current.next;
				runner = runner.next;
			}
			
			if(current == head && runner == null)
			{
				head = head.next;
				return head;
			}
			
			current.next = current.next.next;
			return head;
		}
    }

}
