package welcome;

public class RemoveSpace {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="jav a is good programmming language";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
		if(str.charAt(i)==' ')
		{
			System.out.print("");
		}
		else
		{
			System.out.print(str.charAt(i));
		}
		}
		
	}

}
