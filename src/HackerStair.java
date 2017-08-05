import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackerStair {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String values[]=bf.readLine().split(" ");
        int days=0,dayupstair=0,nightdownstair=0,n;
        int i=0;
        dayupstair=Integer.parseInt(values[0]);
         nightdownstair=Integer.parseInt(values[1]);
         n=Integer.parseInt(values[2]);
        //int totals=0;
        while(i<n)
        { days++;
           i=i+dayupstair;        	
          if(i>=n)
        	  
          {
        	System.out.println(days);  
        	
          }
          else
          {
        	  i=i-nightdownstair;
          }

	}
}
}