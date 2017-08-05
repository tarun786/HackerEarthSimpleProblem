package welcome;



 class OuterDemo {

	private int data=10;
	 class InnerDemo
	{
void inDemo()
{
	System.out.println("the value of num is "+data);
}
		
		
	}

	void outTest()
	{
	//	InnerDemo in=new InnerDemo();
		//in.inDemo();
		
	}
	
}
	
public class Myclass{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
OuterDemo od=new OuterDemo();
	OuterDemo.InnerDemo ob=od.new InnerDemo();
	ob.inDemo();
	od.outTest();
		
	}


}