package welcome;

import java.util.Scanner;

public class ArrayDelete {

	public static void main(String[] args)
	{

int arr[]={2,3,4,6,34,63,53};
int size=arr.length;
Scanner sc=new Scanner(System.in);
System.out.println("enter the position you want to delete element");

int pos=sc.nextInt();

int i=0;

while(i!=pos-1)
{
	i++;
}
while(i<size-1)
{
	arr[i]=arr[i+1];
	i++;
	
	
}

		size--;
		for( i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
		
		
	}

}
