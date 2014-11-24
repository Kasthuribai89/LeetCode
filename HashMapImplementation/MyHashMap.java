package com.map.hashMap;

public class MyHashMap 
{
	int capacity = 10;
	
	ListMap[] table = new ListMap[capacity];
	
	public void put(Integer key,Object value)
	{
		Integer hash = key % capacity;
		if(table[hash] == null)
		{
			table[hash] = new ListMap(key,value);
		}
		else
		{
			ListMap temp = table[hash];
			
			while(temp.next != null && temp.key != key)
			{
				temp = temp.next;
			}
			if(temp.key == key)
			{
				temp.value = value;
			}
			temp.next = new ListMap(key,value);
		}
	}
	
	public Object get(Integer key)
	{
		Integer hash = key % capacity;
		if(table[hash] == null)
		{
			return null;
		}
		else
		{
			ListMap temp = table[hash];
			
			while(temp.next != null && temp.key != key)
			{
				temp = temp.next;
			}
			if(temp == null)
				return null;
			if(temp.key == key)
			{
				return temp.value;
			}
		}
		return null;
	}
	
	public void remove(Integer key)
	{
        int hash = (key % capacity);
        if (table[hash] != null) 
        {
        	ListMap prevEntry = null;
        	ListMap entry = table[hash];
        	
              while (entry.next != null && entry.key != key) 
              {
                    prevEntry = entry;
                    entry = entry.next;
              }
              
              if (entry.key == key) 
              {
                    if (prevEntry == null)
                         table[hash] = entry.next;
                    else
                         prevEntry.next = entry.next;
              }
        }
	}

}
