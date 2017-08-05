package welcome;

public class SplitDemo {

	public static void main(String[] args) {

String s1="my name is tarun jaiswal";
String s2[]=s1.split(" ");

int len=s2.length;
for(int i=len-1;i>=0;i--)
{
	System.out.println(s2[i]);
	
}

		
		
		
	}

}
