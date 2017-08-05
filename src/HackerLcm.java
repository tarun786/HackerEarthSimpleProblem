import java.util.Scanner;


public class HackerLcm {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter the no");
int min=sc.nextInt();
int max=sc.nextInt();
int lcm=0;
int x=0;


	for(int i=1;i<=min;i++)
	{
		x=max*i;
		if(x%min==0)
		{
			lcm=x;
			break;
		}
	}
	System.out.println(lcm);
	
	}
	
}
