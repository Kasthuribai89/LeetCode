
public class LongestPalindromicSubsequence
{
	public static void main(String args[])
	{
		String s = "momhi";
		lps(s);
	}
	
	static void lps(String s)
	{
	
		int n= s.length();
		int start = 0;
		int maxval = 1;
		boolean temp[][] = new boolean[n][n];
		
		for(int i=0;i<n;i++)
		{
			temp[i][i] = true;
		}
		
		for(int i=0;i<n-1;i++)
		{
			if(s.charAt(i) == s.charAt(i+1))
			{
				temp[i][i+1] = true;
				start = i;
				maxval = 2;
			}
		}
		
		for(int k=3;k<=n;k++)
		{
			for(int i=0;i<n-k+1;i++)
			{
				int j = i+k-1;
				
				if(temp[i+1][j-1] && s.charAt(i) == s.charAt(j))
				{
					temp[i][j] = true;
					
						maxval = k;
						start = i;
					
				}
			}
		}
		System.out.println(maxval);
		System.out.println(start);
		
		System.out.println("Hi I am here :"+s.substring(start, start+maxval));
		
	}
	

}
