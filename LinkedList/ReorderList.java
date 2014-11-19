package com.sukanya.LinkedList;

public class ReorderList 
{
	public static void main(String args[])
	{
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		LinkedList list2 = new LinkedList();
		list2.add(6);
	
		
		
		System.out.println();
		
		
		AddTwoNumbers ad = new AddTwoNumbers();
		
		
		ad.print(reOrder(list2.head));
		
	}
	public static ListNode reOrder(ListNode head)
	{
		//System.out.println("I am in");
		if(head == null)
			return null;
		ListNode fast = head ,slow =head;
		while(fast != null && fast.next != null && slow != null && slow.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode leftHead = head;
		ListNode newHead = slow.next;
		slow.next = null;
		ListNode rightHead = rev(newHead);
		
		
		ListNode fakeNode = new ListNode(0);
		ListNode pNew = fakeNode;
		
		while(leftHead != null && rightHead != null)
		{
			pNew.next = leftHead;
			leftHead = leftHead.next;
			pNew.next.next = rightHead;
			rightHead=rightHead.next;
			pNew = pNew.next.next;
		}
		
		while(leftHead != null)
		{
			pNew.next = leftHead;
			leftHead = leftHead.next;
			pNew = pNew.next;
		}
		return fakeNode.next;
	}
	
	public static ListNode rev(ListNode head)
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
