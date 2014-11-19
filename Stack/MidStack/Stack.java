package com.sukanya.StackImp;

public class Stack
{
	int top;
	ListStack list;
	ListStack midNode;
	ListStack lastNode;
	boolean flag;
	
	public Stack()
	{
		list = null;
		top = 0;
		midNode = null;
		lastNode = null;
		flag = false;
	}


public void push(int x)
{
	ListStack newNode = new ListStack(x);
	
	if(list == null)
	{
		list = newNode;
		midNode = newNode;
		lastNode = newNode;
		flag = true;
	}
	else
	{
		lastNode.next = newNode;
		newNode.prev = lastNode;
		lastNode = newNode;
		flag = !flag;
		
		if(flag)
		{
			midNode = midNode.next;
		}
	}
	
	top++;
}

public void pop()
{
	ListStack temp = lastNode;
	lastNode = lastNode.prev;
	lastNode.next = null;
	flag = !flag;
	temp = null;
	
	if(!flag)
	{
		midNode = midNode.prev;
	}
	
	top--;
}

public void deleteMid()
{
	ListStack temp = midNode;
	
	midNode = midNode.prev;
	midNode.next = temp.next;
	temp.next.prev = midNode;
	temp = null;
	flag = !flag;
	if(flag)
	{
		midNode = midNode.next;
	}
	
	top--;
}

public void mid()
{
	System.out.println("The middle element is "+midNode.data);
}

public void Display()
{
	ListStack temp = list;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
}
}

