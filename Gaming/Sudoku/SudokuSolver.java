package com.sukanya.Sudoku;

import java.util.Arrays;

public class SudokuSolver 
{
	public void solveSudoku(char[][] board) 
	{
		tempSudoku(board);
	}
	
	// Function to fill the value in the sudoku board.
	public boolean tempSudoku(char[][] board)
	{
		
			for(int i=0;i<9;i++)
			{
				for(int j=0;j<9;j++)
				{
					// If the board cell is empty 
					if(board[i][j] == '.')
					{
						// place values from 0 to 9
						for(int num = 0; num < 9;num ++)
						{
							
							board[i][j] = (char)(num +'1');
							
							// check the board is valid and if false do backTracking
							if(isValid(board,i,j) && tempSudoku(board)) 
								return true;
							// not true make it "Empty".
							board[i][j] = '.';
						}
						
						return false;
					}
				}
			}
			return true;
		}
	
	
	// Function to check if the sudoku is valid with given "i" and "j"
	
	public boolean isValid(char[][] board,int row,int col)
	{
		boolean[] flag = new boolean[9];
		
		// Check the row is valid.
		
		for(int i=0;i<9;i++)
		{
			if(board[row][i] > '0' && board[row][i] <= '9')
			{
				int temp = board[row][i] - '1';
				if(flag[temp]) return false;
				flag[temp] = true;
			}
		}
		
		// Check the column in valid.
		
		Arrays.fill(flag, false);
		for(int i=0;i<9;i++)
		{
			if(board[i][col] > '0' && board[i][col] <= '9')
			{
				int temp = board[i][col] - '1';
				if(flag[temp]) return false;
				flag[temp] = true;
			}
		}
		
		// Check the Sub is valid.
		
		Arrays.fill(flag, false);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(board[row/3*3 + i][col/3*3 + j] > '0' && board[row/3*3 + i][col/3*3 + j] <= '9')
				{
					int temp = board[row/3*3 + i][col/3*3 + j] - '1';
					if(flag[temp]) return false;
					flag[temp] = true;
				}
			}
		}
		
		return true;
	}
}
