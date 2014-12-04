package com.sukanya.TreeImp;

import java.util.ArrayList;
import java.util.List;

public class printMaxPath 
{
	
	
	public static void main(String args[])
	{
		Tree t = new Tree();
		TreeNode rootNode = new TreeNode(10);
		TreeNode one = new TreeNode(-2);
		TreeNode two = new TreeNode(7);
		TreeNode three = new TreeNode(8);
		TreeNode four = new TreeNode(15);
		
		t.root = rootNode;
		rootNode.left = one ; rootNode.right = two;
		one.left = three ; one.right = four;
		findMax max = new findMax();
		System.out.println(max.printpath(t.root,0));
		
	}
}
	class findMax
	{
		public List<Integer> current = new ArrayList();
		public List<Integer> result = new ArrayList();
		//public List<List<Integer>> result = new ArrayList();
		public int maxSum = Integer.MIN_VALUE;
		List<Integer> printpath(TreeNode root,int currentSum)
	{
		if(root == null)
			return result;
		else
		{
			
			current.add(root.val);
			
			currentSum = currentSum + root.val;
			
			if(root.left == null && root.right ==null)
			{
				System.out.println("current Sum is "+currentSum);
				System.out.println("Maximum Sum is "+maxSum);
				if(maxSum < currentSum)
				{
					maxSum = currentSum ;
					result = new ArrayList<Integer>(current);
				}
			}
			
			printpath(root.left, currentSum);
			printpath(root.right, currentSum);
			int val = root.val;
			System.out.println("current is "+current);
			System.out.println("val is "+val);
			current.remove(new Integer(root.val));
			System.out.println("current after is "+current);
			return result;
		}
		
	}
		
}


