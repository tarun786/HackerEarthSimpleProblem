import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HackerSeries {

	public static void main(String[] args) throws IOException {

BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value");
String num[]=bf.readLine().split(" ");
int x=Integer.parseInt(num[0]);
int y=Integer.parseInt(num[1]);
int n=Integer.parseInt(num[2]);

int next[]=new int[n];

int addnext=0;
for(int i=0;i<n;i++)
{
	if(i<y)
	{
		next[i]=x;
		addnext+=next[i];
	}
	if(i==y) 

	{
		next[i]=addnext;
		
	}
	int j;int k=0;
	
	if(i>y && i<n)
	{
		for (i = x; i < n; i++) {
			int val = 0;
			for (int l = 1; l <= x; l++) {
				val += next[i-l];
			}
			next[i] = val;	
		}
}
for( i=0;i<n;i++)
{
	System.out.println(next[i]);
}
		
		
		
		
		
	}

}}
