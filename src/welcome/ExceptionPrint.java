package welcome;

public class ExceptionPrint {

	public static void main(String args[]) {

String s1="abc";
try
{System.out.println(2);
int k=1/0;
	
int n=Integer.parseInt(s1);
	
		System.out.println(4);
		
	System.out.println(k);
}
catch(ArithmeticException ex)

{
	System.out.println(5);
//ex.printStackTrace();	
	System.out.println(ex);
System.out.println(6);
}
catch(NumberFormatException ex)
{
	//System.out.println(e.getMessage());
	System.out.println(7);
//	ex.printStackTrace();
	System.out.println(ex);
	System.out.println(8);
}
		
		
	}

}
