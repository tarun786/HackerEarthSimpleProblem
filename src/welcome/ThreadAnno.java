package welcome;

 class ThreadAnno {


	public static void main(String[] args) {

Runnable r1=new Runnable()

{
	public void run()
	{
	
	System.out.println("task is 1");
	}

	};

	
	Runnable r2=new Runnable() {
		
   public void run() {

System.out.println("task is 2");		
		}
	};
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	}



 }

