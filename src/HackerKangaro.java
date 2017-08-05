import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackerKangaro {
public static void main(String args[]) throws Exception
{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	long count=0;
   long t=Long.parseLong(bf.readLine());
	while(t>0)
	{
	t--;	
	String inps[]=bf.readLine().split(" ");
    long A=Long.parseLong(inps[0]);
	long B=Long.parseLong(inps[1]);
	long M=Long.parseLong(inps[2]);
	for(long i=A;i<=B;i++)
	{
		if(i%M==0)
		{
			count++;
		}
	}
	System.out.println(count);
	count=0;	
	}
}
}
