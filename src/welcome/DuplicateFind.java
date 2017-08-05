package welcome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicateFind {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter the string..");
String word=sc.nextLine();
char[] charvalue=word.toCharArray();

		Map<Character,Integer> map=new HashMap<Character, Integer>();
for(Character ch:charvalue)
{
if(map.containsKey(ch))
{
	map.put(ch, map.get(ch)+1);
	
}
else
{
	map.put(ch, 1);
}
}
 



Set<Map.Entry<Character, Integer>>  entrySet=map.entrySet();
System.out.println("duplicate element of in your string "+word);
for(Map.Entry<Character, Integer> entry:entrySet)
{
	if(entry.getValue()==1)
	{
		System.out.println(entry.getKey() +" "+entry.getValue());
	}
	
}

	}

}
