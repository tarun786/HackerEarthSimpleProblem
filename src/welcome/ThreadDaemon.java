package welcome;

public class ThreadDaemon extends Thread {
public void run()
{
	
	if(Thread.currentThread().isDaemon())
	{
		System.out.println("daemon thread is working...");
	}
	else
	{
		System.out.println("is user thread is working..");
		
	}
}
	
	public static void main(String[] args) {
ThreadDaemon t1=new ThreadDaemon();
ThreadDaemon t2=new ThreadDaemon();
t1.start();
t2.setDaemon(true);
t2.start();

	}

}
