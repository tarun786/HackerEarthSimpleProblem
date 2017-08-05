package welcome;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
 
public class OddDivisor {
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long upper,lower,count,div,t;
		t=Long.parseLong(br.readLine());
		//BigInteger t;
		//t=BigInteger.valueOf(Long.parseLong(br.readLine()));
		while (t-->0) {
			String s[]=br.readLine().split(" ");
			count=0;
			lower=Long.parseLong(s[0]);
			upper=Long.parseLong(s[1]);
			for(long i=lower;i<=upper;i++){
				div=0;
				for(long j=1;j<=i;j++){
					if(i%j==0){
						div++;
					}
				}
				if(div%2!=0){
					count++;
				}
			}
			System.out.println(count);
		}
	}
}