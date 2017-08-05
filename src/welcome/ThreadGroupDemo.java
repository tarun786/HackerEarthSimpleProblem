package welcome;

public class ThreadGroupDemo implements Runnable {

	public void run()
	{
		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().getThreadGroup().interrupt();
	}
	public static void main(String[] args) {

ThreadGroupDemo tgd=new ThreadGroupDemo();
ThreadGroup tg1=new ThreadGroup("Parent_jaiswal_demo");
		Thread t1=new Thread(tg1,tgd,"one");
		t1.start();
		Thread t2=new Thread(tg1,tgd,"two");
		t2.start();
		Thread t3=new Thread(tg1,tgd,"three");
		t3.start();
		System.out.println(tg1.getName());
		tg1.list();
		
	}

}
