
public class HackerPair {

	public static void main(String[] args)
	{
int arr[]={10, 12, 10, 15, -1, 7, 6, 
        5, 4, 2, 1, 1, 1};
int len=arr.length;int count=0;
for(int i=0;i<len;i++)
{
	for(int j=i+1;j<len;j++)
	{
		
		int sum=6;
		if((arr[i]+arr[j])==11)
		{
			count++;
		}
		
		
	}
	
}
System.out.println(count);	
		
		
	}
}
