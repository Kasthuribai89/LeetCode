package com.sukanya.Array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class WordLadder 
{
	
	 public int ladderLength(String start, String end, Set<String> dict) 
	 {
		 Queue<String> temp = new LinkedList();
		 
		 
	       if(start == null || end == null || dict == null || start.length() != end.length())
	    	   return 0;
	       else
	       {
	    	   int count = 0;
	    	   temp.add(start);
	    	   Set<String> visited = new TreeSet();
	    	   visited.add(start);
	    	   while(!temp.isEmpty())
	    	   {
	    		   String word = temp.poll();
	    		   for(String eachWord : findVal(word))
	    		   {
	    			   if(eachWord == end)
	    			   {
	    				   count ++;
	    			   
	    			   }
	    			   else if(dict.contains(eachWord) && !visited.contains(eachWord))
	    			   {
	    				   count ++;
	    				   temp.add(eachWord);
	    				   visited.add(eachWord);
	    			   }
	    		   }
	    	   }
	    	   
	    	   return count;
	       }
	 }
	 
	 public Set<String> findVal(String word)
	 {
		 Set<String> words = new TreeSet();
		 for(int i=0;i<word.length();i++)
		 {
			 char[] wordArray = word.toCharArray();
			 
			 for(char c='a';c <= 'z';c++)
			 {
				 wordArray[i] = c; 
				 words.add(new String(wordArray));
			 }
		 }
		 return words;
	 }

}
