package com.sukanya.matrix;

public class Search2DMatrix 
{
	public static void main(String args[])
	{
		int a[][] = {{1,   3,  5,  7},
				     {10, 11, 16, 20},
				     {23, 30, 34, 50},
				    
				     };
		System.out.println(search2DMatrix(a,11));
	}

	public static boolean search2DMatrix(int[][] matrix,int target)
	{
		if(matrix == null)
			return false;
		else
		{
			int i=0, j=matrix[0].length-1;
			
			while(i<matrix.length && j>=0)
			{
				if(matrix[i][j] > target) j--;
				else if(matrix[i][j] < target) i++;
				else return true;
			}
			
			return false;
		}
	}

}
