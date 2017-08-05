package welcome;

public class ThreadName extends Thread {

	public void run()
	{
		for(int i=0;i<100;i++)
		{
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("value of i " +i);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadName t1=new ThreadName();
		ThreadName t2=new ThreadName();
		System.out.println("name of thread t1 "+t1.getName());
		System.out.println("name of thread t2 "+t2.getName());
		t1.start();
		t2.start();
		t1.setName("tarun jaiswal");
		System.out.println("name of thread t1 change "+t1.getName());
		//t1.setPriority(150);
		System.out.println("priority of thread "+t1.getPriority());
		System.out.println("id is "+t1.getId());
	}

}
