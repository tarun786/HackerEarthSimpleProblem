import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackerGirlFriend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name of item for demandind your girlfriend");
	    String item=bf.readLine();

	    System.out.println("enter the integer value you want pairs");

	    int Q=Integer.parseInt(bf.readLine());
		int len=item.length();
	//		long Q=bf.read();
		int a,b ;
        for(int i=1;i<=Q;i++)
        {String pairs[]=bf.readLine().split(" ");
	    
        	  a=Integer.parseInt(pairs[0]);
        	  b=Integer.parseInt(pairs[1]);
   a--;
   b--;
   a=a%len;
   b=b%len;
   if(item.charAt(a)== item.charAt(b))
   
{
	System.out.println("YES");
	
}
   else
   {
	   System.out.println("NO");
   }
        
        }

    
        
		
		
	}

}
