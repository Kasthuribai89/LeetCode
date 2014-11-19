import java.util.Stack;
public class Tree
{
	Node root;
	
	public void insertNode(Integer val)
	{
		Node n=new Node();
		n.value=val;
		if(root==null)
		{
			root=n;
			//System.out.println(root);
		}
		else 
		{
			Node currentNode=root;
			Node parent;
			while(true)
			{
				parent=currentNode;
				if(val<currentNode.value)
				{
					currentNode=currentNode.leftNode;
					if(currentNode==null)
					{
						parent.leftNode=n;
						return;
					}
					
				}
				else
				{
						currentNode=currentNode.rightNode;
						if(currentNode==null)
						{
							parent.rightNode=n;
							return;
						}
				}
				
					
			}
			
			
			}
		System.out.println("The root of tree is: "+root.value);
		}
		
		
		
		
		
	
	public Node getLeftNode()
	{
		return root.leftNode;
	}
	
	public Node getrightNode()
	{
		return root.rightNode;
	}
	
	public void displayTree(Node root)
	{
		
		if(root==null)
			return;
		System.out.println(root.value);
		displayTree(root.leftNode);
		displayTree(root.rightNode);
		
	}
}