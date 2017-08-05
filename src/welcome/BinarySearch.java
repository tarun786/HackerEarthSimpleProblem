package welcome;

import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {

		System.out.println("enter the size of arrya");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[];
		arr=new int[size];
		int n=arr.length;
		
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("you want to serarch element in array");
		int serch=sc.nextInt();
		
		int first=0,end=n-1;
		int middle=(first+end)/2;
	
		
		while(first<=end)
		{
			if(arr[middle]<serch)
			{
				first=middle+1;
				//middle=(first+end)/2;
				
				
			}
			
			else if(arr[middle]==serch)
				
			{
				System.out.println(serch +" element at location "+(middle+1));
				break;
				
			}
			
			
			else
			{
				end=middle-1;
				
			}
			 
			middle=(first+end)/2;
			
			
		}
		
		if(first > end)
		{
			System.out.println(serch + "element is not found \n");
			
		}
		
	}

}
