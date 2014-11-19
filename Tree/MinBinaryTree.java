
public class MinBinaryTree {
	
	public static void main(String args[])
	{
		Integer a[]={1,5,7,9,19,24,45};
		System.out.println(createMinTree(a,0,a.length-1).value);
	}
	
	static Node createMinTree(Integer a[],Integer start,Integer end)
	{
		if(start>end)
		{
			return null;
		}
		Integer mid=(start+end)/2;
		
		Node root=new Node();
		
		root.value=mid;
		root.leftNode=createMinTree(a,start,mid-1);
		root.rightNode=createMinTree(a,mid+1,end);
		return root;
		
		
		
		
	}

}