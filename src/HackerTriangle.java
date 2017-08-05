import java.io.BufferedReader;
import java.io.InputStreamReader;


public class HackerTriangle {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(bf.readLine());
		while(t>0)
		{
			t--;
			long N=Long.parseLong(bf.readLine());
			long noofTrai=14*N-6;
			System.out.println(noofTrai);
			
		}
		
	}

}
