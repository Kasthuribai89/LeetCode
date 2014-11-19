
public class FindSubtree {
	
	public boolean resultFindSubtree(Node r1,Node r2)
	{
		if(r2==null)
			return true;
		else
			return subTree(r1,r2);
		
	}
	
	public boolean subTree(Node r1,Node r2)
	{
		if(r1==null)
			return false;
		if(r1.value==r2.value)
		{
			if(matchTree(r1,r2))return true;
		}
		return (subTree(r1.leftNode,r2) || subTree(r1.rightNode,r2));
	}
	
	public boolean matchTree(Node r1,Node r2)
	{
		if(r2==null && r1==null)
			return true;
		if(r1==null || r2==null)
			return false;
		if(r1.value!=r2.value)
			return false;
		return(matchTree(r1.leftNode,r2.leftNode) && matchTree(r1.rightNode,r2.rightNode));
	}
	
	

}
