package com.map.hashMap;

public class MainHashMap 
{
	public static void main(String args[])
	{
		MyHashMap map = new MyHashMap();
		map.put(1, "Rakesh");
		map.put(3, "kavin");
		
		map.put(3, "Mani");
		
		map.put(2, "sukanya");
		
		
		System.out.println(map.get(2));
		map.remove(1);
		System.out.println(map.get(1));
		map.remove(3);
	}

}
