package welcome;


public class StackImp {
	int sizeMax;
	int top;
	String arr[];
	public StackImp(int n)
	{
		sizeMax=n;
		arr=new String[sizeMax];
		top=0;
		
	}
	
	public void push(String str)
	{
		
		if(top<sizeMax)
		{
			arr[top]=str;
			top++;
			System.out.println("element is pushed "+str);
		}
		else
		{
			System.out.println("Stack overflow..");
		}
		
	}
	public String peek()
	{
		if(top>0)
		return arr[top-1];
		else
			return null;
	}
	
	
	public boolean empty()
	{
	 if(top==0)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	}
	
	public String pop()
	{
		if(!this.empty())
		{
			String temp=this.peek();
			arr[top-1]=null;
			top--;
			return temp="elment is deleted";
		}
		else
		{
			return "stack is underflow..";
		}
	}
	public static void main(String args[])
	{
		StackImp ob=new StackImp(4);
		ob.push("1");
		ob.push("55");
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		System.out.println(ob.pop());
		
		//ob.push("2");
		
		//ob.push("3");
		
		//ob.push("4");
		
//System.out.println(ob.peek());
//System.out.println(ob.empty());
	}

}
