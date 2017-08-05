package welcome;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StringDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ArrayList li=new ArrayList();
li.add("one");
li.add("two");
li.add("one");
li.add("three");
li.add("three");

Set<String> uniqueSet=new HashSet(li);
for(String temp: uniqueSet)
{
	if(Collections.frequency(li, temp)>1)
	{
		System.out.println("Duplicate element "+temp);
	}
}







/*ArrayList list2=new ArrayList(new HashSet(li));

Iterator itr=list2.iterator();
{
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}*/
	}

}
