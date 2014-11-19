package com.sukanya.LinkedList;

public class MergeSortedLists 
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
		ListNode p1 = l1;
		ListNode p2 = l2;
		
		ListNode fakeNode = new ListNode(1);
		ListNode current = fakeNode;
		
		while(p1 != null || p2 != null)
		{
			if(p1 == null)
			{
				current.next = new ListNode(p2.val);
				p2 = p2.next;
				current = current.next;
			}
			else if(p2 == null)
			{
				current.next = new ListNode(p1.val);
				p1 = p1.next;
				current = current.next;
			}
			else
			{
				if(p1.val < p2.val)
				{
					current.next = new ListNode(p1.val);
					p1 = p1.next;
					current = current.next;
				}
				else if(p1.val > p2.val)
				{
					current.next = new ListNode(p2.val);
					p2 = p2.next;
					current = current.next;
				}
				else
				{
					current.next = new ListNode(p1.val);
					current.next.next = new ListNode(p1.val);
					p1 = p1.next;
					p2 = p2.next;
					current = current.next.next;
					
					
				}
			}
		}
		
		return fakeNode.next;
    }

}
