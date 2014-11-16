package leetcode.java.Array;

public class WordSearch 
{
	public static void main(String args[])
	{
		
	}
	
	public static boolean exist(char[][] board, String word) 
	{
		char[] words = word.toCharArray();
		
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				return exsistHelper(board,i,j,words,0);
			}
		}
		
		return false;
	}
	
	public static boolean exsistHelper(char[][] board,int i,int j,char[] words,int index)
	{
		if(index >= words.length)
			return true;
		if(board[i][j] ==  words[index])
		{
			char temp = board[i][j];
			board[i][j] = '$';
			
			if(i > 0 && exsistHelper(board,i-1,j,words,index+1))
				return true;
			if(i < board.length - 1 && exsistHelper(board,i + 1,j,words,index+1))
				return true;
			if(j > 0 && exsistHelper(board,i,j-1,words,index+1))
				return true;
			if(j < board[i].length - 1 && exsistHelper(board,i,j+1,words,index+1))
				return true;
			
			board[i][j] = temp;
			return index == words.length-1;
		
		}
		
		return false;
	}

}
