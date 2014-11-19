package com.sukanya.Array;

public class MaxSum 
{
	 public int maxSubArray(int[] A) 
	 {
	      if(A == null)
	    	  return 0;
	      else if(A.length == 1)
	    	  return A[0];
	      else
	      {
	    	  int sum = A[0];
	    	  int max = A[0];
	    	  
	    	  for(int i=1;i<A.length;i++)
	    	  {
	    		  max = Math.max(A[i],max + A[i]);
	    		  sum = Math.max(max,sum);
	    	  }
		      
		      return sum;
	      }

	 }
}
