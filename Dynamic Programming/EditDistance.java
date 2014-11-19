
public class EditDistance 
{
	public static void main(String args[])
	{
		System.out.println(edt("man","woman"));
		System.out.println(edt("c","java"));
		System.out.println(edt("java","c"));
		System.out.println(edt("abcd","acd"));
	}
	
	static int edt(String s,String t)
	{
		int tmp[][] = new int[s.length()+1][t.length()+1];
		
		for(int i=0;i<=s.length();i++)
		{
			tmp[i][0] = i;
		}
		
		for(int j=0;j<=t.length();j++)
		{
			tmp[0][j] = j;
		}
		
		for(int i=0;i<s.length();i++)
		{
			char c1 = s.charAt(i);
			for(int j=0;j<t.length();j++)
			{
				char c2 = t.charAt(j);
				{
					if(c1 == c2)
					{
						tmp[i+1][j+1] = tmp[i][j];
					}
					else
					{
						int replace = tmp[i][j] + 1;
						int insert = tmp[i][j+1] + 1;
						int delete = tmp[i+1][j] + 1;
						
						int min = replace > insert ? insert:replace;
						
						min = min > delete ? delete:min;
						
						tmp[i+1][j+1] = min;
					}
				}
			}
		
			
		}
		
		return tmp[s.length()][t.length()];
		
	}

}
