package com.sukanya.dynamicProgram;

public class TicTacToe
{
	public static void main(String args[])
	{
		FindWinner winner = new FindWinner();
		System.out.println(winner.checkSuccess());
	}
	
	

}

class FindWinner
{
	   char[][] ticTacToe = 
		    {{'O','X',' '},
		     {'O',' ',' '},
		     {'O','X','X'},};
	   
	   Character winner = null;
	   
	   Character checkRow(int row)
	   {
		   System.out.println("I am in check row");
		   if(ticTacToe[row][0] == ' ')
		   {
			   return null;
		   }
		   if(ticTacToe[row][0] == ticTacToe[row][1] && ticTacToe[row][1] == ticTacToe[row][2])
		   {
			   System.out.println("I am in");
			  this.winner = ticTacToe[row][0]; 
			  System.out.println("I am in"+winner);
		   }
		   
		   return null;
	   }
	   
	   Character checkCol(int col)
	   {
		   if(ticTacToe[0][col] == ' ')
		   {
			   return null;
		   }
		   if(ticTacToe[0][col] == ticTacToe[1][col] && ticTacToe[1][col] == ticTacToe[2][col])
		   {
			  this.winner = ticTacToe[0][col]; 
		   }
		   return null;
	   }
	   
	  
	   
	   	public Character checkSuccess()
	   {
		   for(int i=0;i<3;i++)
		   {
			   if(checkRow(i) != null)
			   {
				   winner = checkRow(i);
				   
			   }
			   if(checkCol(i) != null)
			   {
				   winner = checkCol(i);
			   }
			   
			   if(ticTacToe[0][0] == ticTacToe[1][1] && ticTacToe[1][1] == ticTacToe[2][2])
			   {
				   return ticTacToe[0][0];
			   }
			   if(ticTacToe[0][2] == ticTacToe[1][1] && ticTacToe[1][1] == ticTacToe[2][0])
			   {
				   return ticTacToe[0][2];
			   }
		   }
		   
		   return winner;
	   }
}
