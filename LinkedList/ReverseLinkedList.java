package com.sukanya.LinkedList;

public class ReverseLinkedList 
{
	 ListNode reverse(ListNode head) 
	 {
		 if(head == null) 
			 return null;
		 else if(head.next == null)
			 return head;
		 else
		 {
			 ListNode prev,next,current;
			 prev = null;
			 next = null;
			 current = head;
			 
			 while(current != null)
			 {
				 next = current.next;
				 current.next = prev;
				 prev = current;
				 current = next;
			 }
			 return prev;
		 }
	 }

}
