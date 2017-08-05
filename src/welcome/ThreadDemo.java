package welcome;

 class ThreadDemo extends Thread {

	public void run()
	{
		for(int i=1;i<1000;i++)
		{
			System.out.println("value of i " +i);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ThreadDemo t1=new ThreadDemo();
t1.start();
int i=10/0;
for( i=1000;i<2000;i++)
{
	//Thread.sleep(100);

	System.out.println(i);
}
	}

}
