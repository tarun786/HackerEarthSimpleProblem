import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class HackerArray {

	public static void main(String[] args) throws Exception
	{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int arrsize=Integer.parseInt(bf.readLine());
        String sta[]=bf.readLine().split(" ");
        int arrval[]=new int[arrsize];
        int q[]=new int[arrsize-1];
        int lensize=q.length;
    	int val=0;int j=0;
        for(int i=0;i<arrsize;i++)
        {
        	arrval[i]=Integer.parseInt(sta[i]);
        	
        }
        for( j=0;j<lensize;j++)
        {
        	 q[j]=Integer.parseInt(bf.readLine());
        
        	
        }
        for(int i=1;i<lensize;i++)
        {
        	for(int k=0;k<arrsize;k++)
        	{
        	arrval[k]=arrval[k]/q[i];
        	}


        }

       // for(int i=0;i<arrsize;i++)
       // {
        //	System.out.print(" "+arrval[i]);
       // }
        //System.out.print(Arrays.toString(arrval));
    }
}