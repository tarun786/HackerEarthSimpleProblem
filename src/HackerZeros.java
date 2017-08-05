import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackerZeros {

	public static void main(String[] args) throws IOException
{
		// TODO Auto-generated method stub

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
int n=Integer.parseInt(bf.readLine());
int temp=n;
int newt=0;
while(temp!=0 || temp>=5)
{
	temp=temp/5;
	newt+=temp;
	
}
System.out.println(newt);
	
	}

}
