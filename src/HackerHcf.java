import java.util.Scanner;


public class HackerHcf {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
int minvalue=Math.min(n1, n2);
int hcf=0;
for(int i=minvalue;i>=1;i--)
{
	
	if(n1%i==0 && n2%i==0)
	{
		hcf=i;
		break;
		
		
	}
	
}
		System.out.println("value min="+n1+" value of max= "+n2+" hcf is "+hcf);
		
	}

}
