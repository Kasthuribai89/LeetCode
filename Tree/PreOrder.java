
import java.util.*;

public class PreOrder 
{
	
	
	static void traversal(Node root)
	{
		if(root==null)
			return;
		System.out.println(root.value);
		traversal(root.leftNode);
		traversal(root.rightNode);
		
		
	}
	
	static void traversalItv(Node root)
	{
		Stack<Node> s=new Stack<Node>();
		s.push(root);
		while(!s.isEmpty())
		{
			Node node=s.pop();
			System.out.print(node.value+" ");
			if(node.rightNode!=null)s.push(node.rightNode);
			if(node.leftNode!=null)s.push(node.leftNode);
		}
		
	}

}
