import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HackerRbf {

	public static void main(String[] args) throws Exception
	{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
while(t>0)
{
	t--;
	long count=0;
	//long j=0;
	long hcf;
	long N=Long.parseLong(bf.readLine());
	long n1;
	for( n1=1;n1<=N;n1++)
	{
		for(long j=n1;j>=1;j--)
		{hcf=0;
				if(N%j==0 && n1%j==0)
			{
				hcf=j;
				if(hcf==1)
				{
				count++;
				}
				break;
			}
			
		}
		
	}long c=0;
	for(long i=1;i<=count;i++)
	{
		if(count%i==0)
		{
			c++;
		}
		
	}
	if(c==2)
	{
		System.out.println("TRUE");
	}
	else
	{
		System.out.println("FALSE");
	}
	
	}

	}

}
