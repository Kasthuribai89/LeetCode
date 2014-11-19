/* 
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */
public class MaxSumOfContigiousArray 
{
	public static void main(String args[])
	{
		int [] a = { -11, -4, -13, -5, -2 };
		findMaxSum(a);
		
		int [] b = {-15, 29, -36, 3, -22, 11, 19, -5};
		findMaxSum(b);
	}
	
	static void findMaxSum(int a[])
	{
		int tempSum = a[0];
		int start = 0;
		int start_pos = 0,end_pos = 0;
		
		int max_val = a[0];
		if(a.length > 1)
		{
		for(int i=1;i<a.length;i++)
		{
			if(tempSum > tempSum+a[i] || a[i] > tempSum+a[i])
			{
				tempSum = a[i];
				start = i;
			}
			else
			{
				tempSum += a[i];
				
			}
			
			if(tempSum > max_val)
			{
				max_val = tempSum;
				start_pos = start;
				end_pos = i;
			}
		}
		}
		
		System.out.println("The start is "+start_pos+" and end is "+end_pos);
	}

}
