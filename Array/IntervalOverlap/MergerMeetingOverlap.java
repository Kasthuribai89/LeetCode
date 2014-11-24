package leetcode.java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author sukanyamani
 * 
 * Problem Description
 * The orginal Input:  [ 1 , 3 ]  [ 2 , 6 ]  [ 8 , 10 ]  [ 15 , 18 ] 
 * The Merged Input:  [ 1 , 6 ]  [ 8 , 10 ]  [ 15 , 18 ] 
 *
 */

public class MergerMeetingOverlap 
{
	public static void main(String args[])
	{
		List<MeetingTimings> list= new ArrayList();
		MeetingTimings time1=new MeetingTimings(1,3);
		MeetingTimings time2=new MeetingTimings(2,6);
		MeetingTimings time3=new MeetingTimings(8,10);
		MeetingTimings time4=new MeetingTimings(15,18);
		
		list.add(time1);list.add(time2);list.add(time3);list.add(time4);
		List<MeetingTimings> result = new ArrayList();
		result = getMergerdList(list);
		System.out.print("The orginal Input: ");
		for(int i=0;i<list.size();i++)
		{
			System.out.print(" [ "+list.get(i).start + " , "+ list.get(i).end+" ] ");
		}
		System.out.println();
		System.out.print("The Merged Input: ");
		for(int i=0;i<result.size();i++)
		{
			System.out.print(" [ "+result.get(i).start + " , "+ result.get(i).end+" ] ");
		}
		
	}
	
	public static List<MeetingTimings> getMergerdList(List<MeetingTimings> list)
	{
		List<MeetingTimings> result = new ArrayList<MeetingTimings>();
		
		MeetingTimings[] array = list.toArray(new MeetingTimings[list.size()]);
		
		Arrays.sort(array,new Comparator<MeetingTimings>()
		{
			@Override
			public int compare(MeetingTimings time1, MeetingTimings time2) {
				return (time1.start > time2.start) ? 1:(time1.start == time2.start) ? 0:-1;
			}
		});
		
		MeetingTimings time1 = array[0];
		int i =1;
		
		while(i < array.length)
		{
			if(isOverlap(array[i],time1))
			{
				time1 = merge(array[i],time1);
				i++;
			}
			else
			{
				result.add(time1);
				time1 = array[i];
				i++;
			}
		}
		
		result.add(time1);
		return result;
		
	}
	
	public static boolean isOverlap(MeetingTimings time1, MeetingTimings time2)
	{
		return !((time1.start > time2.end || time2.start > time1.end));
	}
	
	public static MeetingTimings merge(MeetingTimings time1, MeetingTimings time2)
	{
		return new MeetingTimings(Math.min(time1.start, time2.start),Math.max(time1.end, time2.end));
	}

}
