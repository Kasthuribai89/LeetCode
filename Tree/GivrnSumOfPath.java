package com.sukanya.TreeImp;

import java.util.ArrayList;
import java.util.List;

public class GivrnSumOfPath 
{
	public static  List<List<Integer>> res = new ArrayList<List<Integer>>();
	public static List<Integer> currentList = new ArrayList<Integer>();
	public static void main(String args[])
	{
		Tree t = new Tree();
		TreeNode rootNode = new TreeNode(5);
		TreeNode one = new TreeNode(4);
		TreeNode two = new TreeNode(8);
		TreeNode three = new TreeNode(11);
		TreeNode four = new TreeNode(13);
		TreeNode five = new TreeNode(4);
		TreeNode six = new TreeNode(7);
		TreeNode seven = new TreeNode(2);
		TreeNode eight = new TreeNode(5);
		TreeNode nine = new TreeNode(1);
		
		t.root = rootNode;
		rootNode.left = one ; rootNode.right = two;
		one.left = three ;
		two.left = four ; two.right = five;
		three.left = six ; three.right = seven;
		five.left = eight ; five.right = nine;
		
		System.out.println(equalToGivenSum(t.root,22));
	}
	
	public static List<List<Integer>> equalToGivenSum(TreeNode root,int sum)
	{
		
		if(root == null)
			return res;
		else
		{
			currentList.add(root.val);
			System.out.println(currentList);
			
			if(root.left == null && root.right == null)
			{
				if(sum - root.val == 0)
				{
					res.add(new ArrayList<Integer>(currentList));
				}
			}
			
			equalToGivenSum(root.left,sum - root.val);
			equalToGivenSum(root.right,sum - root.val);
			
			currentList.remove(new Integer(root.val));
			return res;
		}
	}

}
