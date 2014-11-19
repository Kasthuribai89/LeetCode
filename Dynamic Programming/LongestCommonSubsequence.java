
public class LongestCommonSubsequence 
{
	public static void main(String args[])
	{
		String a = "kavinkumarellsukji";
		String b = "kavinkumarlsukno";
		
		lcs(a,b);
	}
	
	static void lcs(String s, String t)
	{
		
		int n = s.length();
		int m = t.length();
		int maxval  = 0;
		int end = 0;
		
		int temp[][] = new int[n+1][m+1];
		
		for(int i=1;i<n+1;i++)
		{
			for(int j=1;j<m+1;j++)
			{
				if(s.charAt(i-1) == t.charAt(j-1))
				{
					temp[i][j] = temp[i-1][j-1] + 1;
					
					if(maxval < temp[i][j])
					{
						maxval = temp[i][j];
						end = i;
					}
				}
			}
		}
		
		System.out.println(maxval);
		System.out.println(s.substring(end-maxval,end));
		
		
	}

}
