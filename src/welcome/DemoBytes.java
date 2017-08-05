package welcome;

public class DemoBytes {

	public static void main(String[] args) {

String s1="abcdef";
byte[] b1=s1.getBytes();
for(int i=0;i<b1.length;i++)
{
	
	System.out.println(b1[i]);
}

	}

}
