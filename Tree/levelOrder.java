import java.util.Queue;
import java.util.List;
import java.util.LinkedList;


public class levelOrder {
	
	// Breadth first search,
	// To calculate the maximum height the last level value is the result.
	
	public void levelOrderTrav(Node node)
	{
		Queue<Node> q=new LinkedList<Node>();
		Queue<Integer> level=new LinkedList<Integer>();
		int level_val;
		 int lastLevel= 0;
		
		q.add(node);
		level.add(0);
		while(!q.isEmpty())
		{
			node=q.remove();
			level_val=level.remove();
			
			if(level_val!=lastLevel)
			{
				System.out.println();
				lastLevel=level_val;
			}
		//	System.out.print("level "+ level_val+" "+": ");
			System.out.print(node.value+" ");
			if(node.leftNode!=null)
			{
				q.add(node.leftNode);
				level.add(level_val+1);
			}
			if(node.rightNode!=null)
			{
				q.add(node.rightNode);
				level.add(level_val+1);
			}
			
			
		}
		System.out.println();
		
		System.out.println("The maximum height of tree is "+(lastLevel+1));
	}
	
	

}
