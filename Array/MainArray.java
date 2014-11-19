package com.sukanya.Array;

import java.util.Set;
import java.util.TreeSet;

public class MainArray 
{
	public static void main(String args[])
	{
		String word = "hit";
		
		WordLadder wl = new WordLadder();
		 Set<String> dict = new TreeSet();
		 dict.add("hot");
		 dict.add("dot");
		 dict.add("dog");
		 dict.add("lot");
		 dict.add("log");
		 
		
		System.out.println(wl.ladderLength("hit", "cog", dict));
		
	}

}
