import java.lang.Math;
public class BalancedTree {
	
	
	
	public boolean isBalanace(Node node)
	{
		int result=maxDepth(node)-minDepth(node);
		
		//System.out.println(result);
		
		if(result<=1)
			return true;
		else
			return false;
	}
	
	public int maxDepth(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			return 1+Math.max(maxDepth(node.leftNode),maxDepth(node.rightNode));
		}
	}
	
	public int minDepth(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		else
		{
			return 1+Math.min(minDepth(node.leftNode),minDepth(node.rightNode));
		}
	}

}
