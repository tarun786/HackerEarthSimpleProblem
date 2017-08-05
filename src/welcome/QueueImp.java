package welcome;

public class QueueImp {

	private static final int capcity=3;
	int arrr[]=new int[capcity];
	int rear=0;
	int top=-1;
	int size=0;
	public void push(int pushElement)
	{
		if(top<capcity-1)
		{
			top++;
			arrr[top]=pushElement;
			System.out.println("element pushed in queue " +pushElement+ "here ");
	display();
		}
		else
		{
			System.out.println("queue is overflow");
		}
	}
	
	public void pop()
	{
		if(top>=rear)
		{
			rear++;
			System.out.println("pop operation done.");
			display();
		}
		else
		{
			System.out.println("underflow..");
		}
	}
	public void display()
	{
		if(top>=rear)
		{
			
			for(int i=rear;i<=top;i++)
			{
				System.out.println("queue is "+arrr[i]);
			}
		}
	}
	public static void main(String[] args) {


		QueueImp ob=new QueueImp();
		ob.push(10);
		ob.push(11);
		ob.push(12);
		//ob.push(13);
		//ob.push(14);
		
		
		ob.pop();
		ob.pop();
		ob.pop();
		ob.pop();
		
		
	}

}
