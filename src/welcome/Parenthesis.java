package welcome;
import java.util.*;
public class Parenthesis {


	public boolean checkParen(String s1)
	{
		Stack<Character> st=new Stack<Character>();
		//char[] ch=s1.toCharArray();
		int len=s1.length();
		for(int i=0;i<len;i++)
		{
			char ch=s1.charAt(i);
			
			if(ch=='[' || ch=='{' || ch=='(')
			{
               			st.push(ch);
				
				
			}
		
			else if(ch==']')
			{
				if(st.isEmpty())
				{
					return false;
				}
				if(st.pop()!='[')
				{
					return false;
				}
			
			}
			else if(ch==')')
			{
				if(st.isEmpty())
				{
					return false;
				}
				if(st.pop()!='(')
				{
					return false;
				}
			
			}
			
			else if(ch=='}')
			{
				if(st.isEmpty())
				{
				return false;
				}
			if(st.pop()!='{')
			{
				return false;
			}
			}
			
			
		}
		
		
		return st.empty();
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		Parenthesis ob=new Parenthesis();
		String str="[]{s1(u)}]";
		System.out.println(ob.checkParen(str));
		
		
	}
}
