package welcome;

interface jaiswal
{
	String greet();
}


public class MyClass1 {

	void displayMsg(jaiswal j)
	{
		
		System.out.println(j.greet()+" how are you dear");
	}
	
	public static void main(String[] args) {
		
		MyClass1 myc=new MyClass1();
		// passing an annoanyms class as an argument
		myc.displayMsg(new jaiswal() {
			
	
			public String greet() {

			return "Hello";
			}
		});
		
	}
	
}
