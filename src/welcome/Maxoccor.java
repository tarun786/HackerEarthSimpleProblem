package welcome;

public class Maxoccor {

	
private static void replaceChar(char[] charArray,char oldChar,char newChar)
{
	
	for(char c:charArray)
	{
		System.out.print(c==oldChar?newChar:c);
		
	}
	
}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="java is easy and intersting";
		replaceChar(str.toCharArray(),'a','$');
		
	}

}
