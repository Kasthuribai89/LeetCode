/*

Complexity :

		Time Complexity : O(n^2)
		Space Complexity : O(n * m)

*/


public class Matrix0sand1s 
{
	public static void main(String args[])
	{
		int nRows = 4, nCols = 4;
        int[][] a = {
                {1,0,1,1},
                {0,1,1,1},
                {0,1,1,1},
                {0,1,1,1}
                
                
        };
        
        findIt(a,nRows,nCols);
	}
	
	static void findIt(int a[][],int row,int column)
	{
		int temp[][] = new int[row][column];
		
		for(int i=0;i<row;i++)
		{
			temp[i][0] = a[i][0];
		}
		
		for(int j=0;j<column;j++)
		{
			temp[0][j] = a[0][j];
		}
		
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<column;j++)
			{
				int minEntry = Math.min(temp[i][j-1], temp[i-1][j]);
				
				minEntry = Math.min(minEntry, temp[i-1][j-1]);
				
				if(a[i][j] == 1)
				{
					temp[i][j] = minEntry + 1;
				}
				else
				{
					temp[i][j] = 0;
				}
			}
		}
		
		int maxVal = 0;
		int r = -1;
		int c = -1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				
				
				if(maxVal < temp[i][j])
				{
					maxVal = temp[i][j];
					
					
					r = i;
					c = j;
				}
			}
		}
		System.out.println("Max value is "+maxVal);
		System.out.println("starts at "+ (r-maxVal+1) + " and " + (c-maxVal+1));
	}

}
