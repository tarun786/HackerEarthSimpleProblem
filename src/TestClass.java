import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStreamWriter;
 
 
class TestClass {
    public static void main(String args[] ) throws Exception {
 
       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        long[] out;
        int t = Integer.parseInt(line);
        for (int i = 0; i < t; i++) {
        	String[] str = br.readLine().split(" ");
        	int x = Integer.parseInt(str[0]);
        	int y = Integer.parseInt(str[1]);
        	int n = Integer.parseInt(str[2]);
        	
        	out = new long[n];
        	
        	if (x >= n || y == 0) {
        		System.out.println(y);
        	} else {
        		for (int j = 0; j < x; j++) {
        			out[j] = y;
        		}
        		for (int k = x; k < n; k++) {
        			long num = 0;
        			for (int l = 1; l <= x; l++) {
        				num += out[k-l];
        			}
        			out[k] = num;
        			System.out.println(out[k]);
        		}
        		System.out.println(out[n-1]);
        	}
        	
        }
 
    }
}