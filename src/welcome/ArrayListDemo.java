package welcome;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

ArrayList obj=new ArrayList();

obj.add("tarun");
obj.add(222);
obj.add("mintu");
obj.add(122);

Iterator itr=obj.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
	
}
		
		
	}

}
