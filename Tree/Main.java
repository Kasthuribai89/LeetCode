
public class Main {
	
	public static void main(String args[])
	{
		
		Tree t=new Tree();
		t.insertNode(5);
		t.insertNode(8);
		t.insertNode(3);
		t.insertNode(4);
		t.insertNode(1);
		//t.insertNode(50);
		//t.insertNode(2);
		//t.insertNode(1);
		
		/*postOrder psto=new postOrder();
		System.out.print("The post order traversal ");
		psto.postOrderItv(t.root);*/
		
		//SumOfPath sop=new SumOfPath();
		
		//sop.findSum(t.root,8,0);
		
	//	levelOrder lo =new levelOrder();
		
	//	lo.levelOrderTrav(t.root);
		
		t.displayTree(t.root);
	
		
		
	}

}
