import java.util.*;
public class postOrder {
	
	public void postOrderItv(Node node)
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
				Node peakNode=s.peek();
				if(peakNode.rightNode!=null && lastVisitedNode!=peakNode.rightNode)
				{
					node=peakNode.rightNode;
				}
				else
				{
					 Node tmp=s.pop();
					System.out.print(tmp.value+" ");
					lastVisitedNode=tmp;
				}
				
			}
		}
		
	}

}
