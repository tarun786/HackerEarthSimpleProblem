package welcome;




public class Reverse {



	
	
	public boolean isAlpha(char x)
	{
		return ( (x >= 'A' &&  x <= 'Z') ||
	             (x >= 'a' &&  x <= 'z') );
	}
	
	public void revStr(String str)
	{
		char[] ch=str.toCharArray();
		int right=ch.length-1;
		int left=0;
		while(left<right)
		{
			if(!isAlpha(ch[left]))
			{
				left++;
				
				
			}
			else if(!isAlpha(ch[right]))
			{			
				right--;
			}
			
			else
			{
				 char temp = ch[left];
				 ch[left]=ch[right];
				 ch[right]=temp;
		            left++;
		            right--;
				

			
			}
			
		}
		
		
		System.out.println(str.copyValueOf(ch));
		
		
	}
	
	
public static void main(String[] args) {
	
	String str="a,b$c";
	
	Reverse ob=new Reverse();
ob.revStr(str);

}


}
