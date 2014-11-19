package com.sukanya.Array;

public class MaxProduct 
{
	public int maxProduct(int[] A) 
	{
		if(A == null)
			return 0;
		else if(A.length == 1)
			return A[0];
		else
		{
			int max = A[0];
			int min = A[0];
			int product = A[0];
			
			for(int i=1;i<A.length ;i++)
			{
				int max_cpy = max;
				
				max = Math.max(Math.max(A[i] * max, A[i]), A[i] * min);
				
				min = Math.min(Math.min(A[i] * max_cpy, A[i]), A[i] * min);
				
				product = Math.max(max, product);
			}
			
			return product;
		}
	}

}
