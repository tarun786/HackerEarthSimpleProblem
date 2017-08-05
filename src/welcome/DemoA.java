package welcome;

public class DemoA {

	public static void main(String[] args)
	{
		StringBuffer sb1=new StringBuffer();
		sb1.append("Rohit");
		System.out.println(sb1);

StringBuffer sb2=new StringBuffer("channai");
	System.out.println(sb2);
	
	System.out.println(sb1 + " " + sb2);
	System.out.println(sb1.reverse());
	
	StringBuffer sb3=sb2.reverse();
	System.out.println(sb3);
	
	System.out.println(sb1.length());
	
	StringBuffer sb4=new StringBuffer("javadeveloper");
	sb4.append("nonjavadeveloper");
	System.out.println(sb4.length());
	System.out.println(sb4.insert(4,"hahahhahah"));
	System.out.println(sb4.delete(3, 15));
	System.out.println(sb4.deleteCharAt(4));
	

	StringBuilder sb5=new StringBuilder("hitesj");
	
	System.out.println(sb5);
	
	StringBuilder sb11;
	System.out.println(sb11=sb5.insert(4,"hahah"));
	//System.out.println(sb11);
	System.out.println(sb11=sb5);
	System.out.println(sb11.equals(sb5));
	System.out.println(sb5.reverse());
	System.out.println(sb5.delete(6,8));
	
	
	

	}

}
