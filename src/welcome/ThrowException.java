package welcome;

public class ThrowException {
	int age;
	void validate(int n)
	{
		this.age=n;
		if(age<18)
		{
			throw new ArithmeticException("invalid age");
			
		}
		else
		{
			System.out.println("age is vallid u can give vote as you wish");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThrowException obj=new ThrowException();
		obj.validate(19);
		

	}

}
