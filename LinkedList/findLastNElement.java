package com.sukanya.LinkedList;

public class findLastNElement
{
	public ListNode findNLast(ListNode head,int n)
	{
		if(head == null)
			return null;
		else
		{
			ListNode current = head;
			ListNode runner  = head;
			
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
			
			if(current == head && runner ==null)
			{
				ListNode tmp = head;
				return tmp;
			}
			
			return current.next;
		}
	}
	 public ListNode removeNthFromEnd(ListNode head, int n) 
	 {
	      if(head == null || head.next == null)
	    	  return null;
	      
	      else
	      {
	    	  ListNode current = head;
	    	  ListNode runner = head;
	    	  
	    	  while(n >  0)
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
