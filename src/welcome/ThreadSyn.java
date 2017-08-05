package welcome;

class ThreadSyn1 {

	 synchronized void printTable(int n) throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			Thread.sleep(500);
		}
		
	}
}
	
	
	
	class Thread1 extends Thread
	{
		ThreadSyn1 ts;
	
	Thread1(ThreadSyn1 ts)
	{
		this.ts=ts;
	}
	
		public void run()
		{
			try {
				ts.printTable(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		}
		
		
	
	
	 class Thread2 extends Thread
	 {
		ThreadSyn1 ts;
		Thread2(ThreadSyn1 ts)
		{
			this.ts=ts;
		}
		 public void run()
		 {
try {
	ts.printTable(100);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

		 }
	 }	  
	class ThreadSyn
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSyn1 obj=new ThreadSyn1();
		Thread1 t1=new Thread1(obj);
	Thread2 t2=new Thread2(obj);
	t1.start();
	t2.start();
	}

	}
