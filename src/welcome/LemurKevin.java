package welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LemurKevin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader rd=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the value");
		String[] inputs=rd.readLine().split(" ");
		int bananas=Integer.parseInt(inputs[0]);
		int lumrs=Integer.parseInt(inputs[1]);
		
		if(bananas<=lumrs)
		{
			
			int totalmintus=Math.min(bananas, lumrs-bananas);
System.out.println(totalmintus);			
		}
		
		
		else{
			int bestMinutes=Integer.MAX_VALUE;
		
			

			for (int k = 1; k <= bananas; k++) {
	            int totalMinutes = (int)Math.abs(lumrs - k);
	            int multipleBefore = (bananas / k) * k;
	            int multipleAfter = multipleBefore + k;
	            totalMinutes += (int)(Math.min(bananas - multipleBefore, multipleAfter - bananas));

	            if (totalMinutes < bestMinutes) 
	                    bestMinutes = totalMinutes;

	        }

	        System.out.println(bestMinutes);
		
		
		}
	}

}
