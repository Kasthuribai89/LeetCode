import java.util.*;


public class SumOfPath {
	int buff[]=new int[100];
	
	//http://karmaandcoding.blogspot.com/2012/11/binary-search-tree-any-path-sum.html
	
	public void findSum(Node root,int sum,int level)
	{
		if (root == null) { return; }
		
		
		
		int temp=sum;
		buff[level]=root.value;
		
		for(int i=level;i>=0;i--)
		{
			temp=temp-buff[i];
			if(0==temp)
			{
				printPathSum(buff,i,level);
			}
		}
		findSum(root.leftNode,sum,level+1);
		findSum(root.rightNode,sum,level+1);
		
		
	}
	
	public void printPathSum(int [] buffer, int start, int end) {
		  int len = buffer.length;
		  for (int i=start; i<=end; i++) {
		   System.out.print(buffer[i] + " -> ");
		  }
		  System.out.println("null");
		 }
}
