package welcome;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int smax;
int max = 0;
int j=0;
	int arr[]={2,2,31,41,65,17,9,1,94,15};
	
	for(int i=0;i<arr.length;i++)
	{
 //max=0;
		if(arr[i]>max)
		{
			max=arr[i];
		j=i;
		
		}
			}
	System.out.println(max);
	
	smax=arr[arr.length-1];
	
	for(int i=0;i<arr.length;i++)
	{
	if(smax<arr[i] && i!=j)
	{
		
smax=arr[i];		
		
	}
		

}
	System.out.println(smax);

	}
	
}
