package welcome;

import java.io.IOException;

public class RunTime {

	void m1() throws IOException
	{
//throw new IOException("device error");		
	}
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		RunTime ob=new RunTime();
		ob.m1();
		System.out.println("rest of the code");
	}

}
