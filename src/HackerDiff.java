import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerDiff {

	public static void main(String[] args) throws Exception {
    BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
    
    int t=Integer.parseInt(bf.readLine());
    int diff=0,count=0;
    for(int k=0;k<t;k++)
    {     
    String inp[]=bf.readLine().split(" ");
    String val[]=bf.readLine().split(" ");
    int size=Integer.parseInt(inp[0]);
    int d=Integer.parseInt(inp[1]);
    int arr[]=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=Integer.parseInt(val[i]);
	}
	for( int i=0;i<size-1;i++)	
	{
		if(arr[i]>arr[i+1])
		{
			diff=arr[i]-arr[i+1];
		}
		else
		{
			diff=arr[i+1]-arr[i];
		}
		if(diff>d)
		{
			count++;
		}
		if(count==0)
		{
			System.out.println("YES");
			break;
		}
		else
		{
			System.out.println("NO");
			
		}
	}
	
	}	
}

}
