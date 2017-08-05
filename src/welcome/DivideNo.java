package welcome;

import java.util.Scanner;

public class DivideNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the dividend no");
	int divd=sc.nextInt();
	System.out.println("enter the divisor no");
	int div=sc.nextInt();
	
	while(divd>=div)
	{
		i++;
		
		divd=divd-div;
		
		
	}
		
		System.out.print("quoint "+i);
		if(divd>=1)
		{
			System.out.print(" reminder is "+divd);
		}
	}

}
