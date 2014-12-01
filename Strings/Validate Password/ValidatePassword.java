import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class ValidatePassword 
{
	
	public static void main(String args[])
	{
		checkValid("say.in.txt", "say.out.txt");
	}
	
	/** 
	 * Check the validity of each word in the input file with the following constraints
	 * 
	 * It must contain at least one vowel.
	 * It cannot contain three consecutive vowels or three consecutive consonants.
	 * It cannot contain two consecutive occurrences of the same letter, except for 'ee' or 'oo' */
	public static void checkValid(String inputFile, String outputFile)
	{
		try
		{			
			Character[] vowels = {'a','e','i','o','u'};
			Set<Character> vowelSet = new HashSet<Character>(Arrays.asList(vowels));
			Character[] consonants = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z' };
			Set<Character> consonantSet = new HashSet<Character>(Arrays.asList(consonants));
			
			BufferedReader br = new BufferedReader(new FileReader(inputFile));
			String currWord;
			
			PrintWriter output = new PrintWriter(outputFile);
			
			while ((currWord = br.readLine()) != null &&  !currWord.equals("end")) 
			{
				currWord = currWord.trim();
				int v_ct = 0;
				int c_ct = 0;
				boolean vowel_check = false;
				boolean ct_check = true;
				boolean prev_check = true;
				char prev = ' ';
				
				for(int i=0;i<currWord.length();i++)
				{		
					// Check if there is no more than two consecutive vowels
					if(vowelSet.contains(currWord.charAt(i))){
						c_ct = 0;
						// There is atleast one vowel in the word
						vowel_check = true;
						if(v_ct<2)
							v_ct++;
						else
							ct_check = false;
					}
					
					// Check if there is no more than two consecutive consonants
					if(consonantSet.contains(currWord.charAt(i))){
						v_ct = 0;
						if(c_ct<2)
							c_ct++;
						else
							ct_check = false;
					}
					
					// When i=0
					if(prev == ' ')
						prev = currWord.charAt(i);
					
					// Prev character is same the Current character
					else if(prev == currWord.charAt(i))
					{	
						//Skip if its 'e' or 'o'
						if(currWord.charAt(i) == 'e' || currWord.charAt(i) =='o')
							continue;
						else {
							prev_check  = false;
							break;
						}
					}
					// Update the prev 
					else 
						prev = currWord.charAt(i);
				}
				if(!vowel_check || !ct_check || !prev_check)
					output.println("<"+currWord+"> is not acceptable");
				else
					output.println("<"+currWord+"> is acceptable");
			}
			
			// We have reached the end of the input file
			output.close();
			br.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		} 
 
	}

}
