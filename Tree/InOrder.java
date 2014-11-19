import java.util.*;

public class InOrder {
	
	public void inOrderItv(Node node)
	{
		Stack<Node> s=new Stack();
		
		
		while(!s.isEmpty() || node!=null)
		{
			if(node!=null)
			{
				s.push(node);
				node=node.leftNode;
			}
			else
			{
				node=s.pop();
				System.out.print(node.value+" ");
				node=node.rightNode;
			}
		}
	}
		
	
	
}
