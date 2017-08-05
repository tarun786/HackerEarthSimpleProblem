package welcome;

public class RecuFabo {
	private static int  index=0;
	private static int end=5;
	
	public static void fabo(int n1,int n2)
	{    index++;

		System.out.println(" \t index is "+index+" value is "+n2);
		if(index==end)
		{
		return;	
		}	
		fabo(n2,n1+n2);
			
		}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1=0,n2=1;
System.out.println("index is " +index+" value is "+n1);

	fabo(n1,n2);		
		
		
	}

}
