package com.sukanya.StackImp;

public class MainStack 
{
	public static void main(String args[])
	{
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		
		stack.Display();
		
		System.out.print("The mid before poping");
		
		stack.mid();
		
		stack.pop();
		
		stack.Display();
		
		stack.mid();
		
		stack.deleteMid();
		
		stack.Display();
		
	}
}
