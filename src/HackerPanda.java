import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerPanda {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int no=Integer.parseInt(bf.readLine());
		String arr[]=bf.readLine().split(" ");
		int val[]=new int[no];
		int arr1[]=new int[no*no];
		int len=arr1.length;
		for(int i=0;i<no;i++)
		{
			val[i]=Integer.parseInt((arr[i]));
			
		}
		for(int i=0;i<no;i++)
		{
			for(int j=i+1;j<no;j++)
			{
				 arr1[i]=(val[i]*val[j]);
				
			}
		}
				
		for(int i=0;i<len-1;i++)
		{
			for(int j=i;j<len-i-1;j++)
			{
			if(arr1[j]>arr1[j+1])
			{
				int temp;
				temp=arr1[j];
				arr1[j]=arr1[j+1];
				arr1[j+1]=temp;
			}
	      }
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(arr1[len-1]);
			break;
		}
	}

}

