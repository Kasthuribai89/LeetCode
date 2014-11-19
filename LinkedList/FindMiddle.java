package com.sukanya.LinkedList;

public class FindMiddle 
{
	
	public int findMiddle(ListNode head)
	{
		ListNode current = head;
		ListNode runner = head.next;
		if(head ==  null)
			return 0;
		else
		{
			
			
			while(current != null && runner!=null && runner.next!=null)
			{
				current = current.next;
				runner = runner.next.next;
			}
		}
		
		
		
		return current.val;
	}

}
