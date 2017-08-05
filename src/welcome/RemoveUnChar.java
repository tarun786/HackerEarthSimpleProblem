package welcome;

public class RemoveUnChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="(123)-2332-234";
	String str1=str.replaceAll("[^a-zA-Z0-9]", "");	
	System.out.println(str1);	
	char[] ch=str.toCharArray();
		
	for(int i=0;i<ch.length;i++)
	{
		if(str.charAt(i)=='(' || str.charAt(i)==')' || str.charAt(i)=='-')
		{
			System.out.print("");
			//ch[i]=' ';
			
		}
		else
		{
			System.out.print(str.charAt(i));
		}
		

	}
	
	
}}
