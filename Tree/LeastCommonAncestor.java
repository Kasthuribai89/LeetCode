
import java.util.*;

public class LeastCommonAncestor 
{
	
	public Node findLCA(Node root,int x,int y)
	{
		System.out.println("The root value is "+root.value);
		if(root==null)
		{
			return null;
		}
		if(root.value==x || root.value==y)
			return root;
		if(root.value>x && root.value>y)
		{
			return findLCA(root.leftNode,x,y);
		}
		else if(root.value<x && root.value<y)
		{
			return findLCA(root.rightNode,x,y);
		}
		else
		{
			return root;
		}
		
	}
	
	public Node findFirstCommonAncestor(Node root, int p, int q) 
	{
		if(root==null)
			return null;
		if(root.value==p && root.value==q)
			return root;
		if(root.value>p && root.value>q)
			return findFirstCommonAncestor(root.leftNode,p,q);
		else if(root.value<p && root.value<q)
			return findFirstCommonAncestor(root.rightNode,p,q);
		else
			return root;
	    
	}
	
	public void inOrderTrv(Node node)
	{
		Stack<Node> s=new Stack<Node>();
		
		while(!s.isEmpty() || node !=null)
		{
			if(node!=null)
			{
				s.push(node);
				node=node.leftNode;
			}
			else
			{
				node=s.pop();
				System.out.println(node);
				node=node.rightNode;
			}
		}
	}
	
	public void postOrderTrv(Node node)
	{
		Stack<Node> s=new Stack<Node>();
		Node lastVisitedNode=null;
		
		while(!s.isEmpty() || node!=null)
		{
			if(node!=null)
			{
				s.push(node);
				node=node.leftNode;
			}
			else
			{
				Node peekNode=s.peek();
				if(peekNode!=node.rightNode && lastVisitedNode!=peekNode.rightNode)
				{
					node=peekNode.rightNode;
				}
				else
				{
					Node tmpNode=s.pop();
					System.out.println(tmpNode.value);
					lastVisitedNode=peekNode;
				}
			}
		}
	}

}
